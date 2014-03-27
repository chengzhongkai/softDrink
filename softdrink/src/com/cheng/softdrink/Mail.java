package com.cheng.softdrink;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mail extends Activity implements OnClickListener {
	TextView title;

	String from = "softdrink001@gmail.com";
	String pass = "softdrink";
	String to = "";
	String body = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mail);

		// if (android.os.Build.VERSION.SDK_INT > 9) {
		// StrictMode.ThreadPolicy policy = new
		// StrictMode.ThreadPolicy.Builder()
		// .permitAll().build();
		// StrictMode.setThreadPolicy(policy);
		// }

		SharedPreferences prefs = this.getSharedPreferences("prefs", 0);
		from = prefs.getString("mail", "");
		((TextView) findViewById(R.id.from)).setText("From:" + from);

		Intent intent = getIntent();
		if (intent.getType().equals("text/plain")) {
			body = intent.getStringExtra(Intent.EXTRA_TEXT);
			if (body != null) {
				((TextView) findViewById(R.id.mailText)).setText("Content:"
						+ body);
			}
			String[] addr = intent.getStringArrayExtra(Intent.EXTRA_EMAIL);
			if (addr != null) {
				to = addr[0];
				((TextView) findViewById(R.id.to)).setText("To:" + to);
			}
		}

		Button send = (Button) findViewById(R.id.send);
		send.setOnClickListener(this);
		onClick(send);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View view) {
		view.setEnabled(false);
		MailSender mailSender = new MailSender(this);
		mailSender.execute(from, pass, to, "", body);
		// sendMail(from, pass, to, "", body);
		// Toast.makeText(this, "mail has sent", Toast.LENGTH_SHORT).show();
		// this.finish();
	}

}

class MailSender extends AsyncTask<String, Integer, Boolean> {

	private Activity uiActivity_;

	public MailSender(Activity activity) {
		super();
		uiActivity_ = activity;
	}

	@Override
	protected Boolean doInBackground(String... contents) {
		String from = contents[0];
		String pass = contents[1];
		String to = contents[2];
		String title = contents[3];
		String body = contents[4];

		return sendMail(from, pass, to, title, body);
	}

	@Override
	protected void onPostExecute(Boolean result) {
		String msg = "";
		if (result.booleanValue()) {
			msg = "mail has sent";
			Toast.makeText(uiActivity_, msg, Toast.LENGTH_SHORT).show();
			
			Intent i;
			PackageManager manager = uiActivity_.getPackageManager();
			try {
			    i = manager.getLaunchIntentForPackage("jp.co.unisys.android.yamadamobile");
			    if (i == null)
			        throw new PackageManager.NameNotFoundException();
			    i.addCategory(Intent.CATEGORY_LAUNCHER);
			    uiActivity_.startActivity(i);
			} catch (PackageManager.NameNotFoundException e) {

			}
			
			uiActivity_.finish();
			
		} else {
			msg = "can not send mail";
			Toast.makeText(uiActivity_, msg, Toast.LENGTH_SHORT).show();
			((Button)uiActivity_.findViewById(R.id.send)).setEnabled(true);
		}

	}

	boolean sendMail(String from, String pass, String to, String title,
			String body) {
		boolean re = true;
		try {
			GMailSender sender = new GMailSender(from, pass);
			sender.sendMail(title, body, from, to);
		} catch (Exception e) {
			re = false;
			Log.e("SendMail", e.getMessage(), e);
		}
		return re;
	}

}