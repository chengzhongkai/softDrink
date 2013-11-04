package com.cheng.softdrink;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;



public class MainActivity extends Activity implements OnClickListener, OnRatingBarChangeListener {
	TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         title = (TextView)this.findViewById(R.id.title);
        String s =getIMSI();
        title.setText(s);
      
        Button b1 = (Button)this.findViewById(R.id.button1);
        Button b2 = (Button)this.findViewById(R.id.button2);
        Button b3 = (Button)this.findViewById(R.id.button3);
        Button b4 = (Button)this.findViewById(R.id.button4);
        Button b5 = (Button)this.findViewById(R.id.button5);
        Button b6 = (Button)this.findViewById(R.id.button6);
        Button b7 = (Button)this.findViewById(R.id.button7);
        Button b8 = (Button)this.findViewById(R.id.button8);
        Button b9 = (Button)this.findViewById(R.id.button9);
        Button b10 = (Button)this.findViewById(R.id.button10);
        Button b11 = (Button)this.findViewById(R.id.button11);
        Button b12 = (Button)this.findViewById(R.id.button12);
        Button b13 = (Button)this.findViewById(R.id.button13);
        Button b14 = (Button)this.findViewById(R.id.button14);
        Button b15 = (Button)this.findViewById(R.id.button15);
        Button b16 = (Button)this.findViewById(R.id.button16);
       
        
        RatingBar r1= (RatingBar)this.findViewById(R.id.ratingBar1);
        RatingBar r2= (RatingBar)this.findViewById(R.id.ratingBar2);
        RatingBar r3= (RatingBar)this.findViewById(R.id.ratingBar3);
        RatingBar r4= (RatingBar)this.findViewById(R.id.ratingBar4);
        RatingBar r5= (RatingBar)this.findViewById(R.id.ratingBar5);
        RatingBar r6= (RatingBar)this.findViewById(R.id.ratingBar6);
        RatingBar r7= (RatingBar)this.findViewById(R.id.ratingBar7);
        RatingBar r8= (RatingBar)this.findViewById(R.id.ratingBar8);
        RatingBar r9= (RatingBar)this.findViewById(R.id.ratingBar9);
        RatingBar r10= (RatingBar)this.findViewById(R.id.ratingBar10);
        RatingBar r11= (RatingBar)this.findViewById(R.id.ratingBar11);
        RatingBar r12= (RatingBar)this.findViewById(R.id.ratingBar12);
        RatingBar r13= (RatingBar)this.findViewById(R.id.ratingBar13);
        RatingBar r14= (RatingBar)this.findViewById(R.id.ratingBar14);
        RatingBar r15= (RatingBar)this.findViewById(R.id.ratingBar15);
        RatingBar r16= (RatingBar)this.findViewById(R.id.ratingBar16);
        
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        
        r1.setOnRatingBarChangeListener(this);
        r2.setOnRatingBarChangeListener(this);
        r3.setOnRatingBarChangeListener(this);
        r4.setOnRatingBarChangeListener(this);
        r5.setOnRatingBarChangeListener(this);
        r6.setOnRatingBarChangeListener(this);
        r7.setOnRatingBarChangeListener(this);
        r8.setOnRatingBarChangeListener(this);
        r9.setOnRatingBarChangeListener(this);
        r10.setOnRatingBarChangeListener(this);
        r11.setOnRatingBarChangeListener(this);
        r12.setOnRatingBarChangeListener(this);
        r13.setOnRatingBarChangeListener(this);
        r14.setOnRatingBarChangeListener(this);
        r15.setOnRatingBarChangeListener(this);
        r16.setOnRatingBarChangeListener(this);
        
        
        SharedPreferences prefs = this.getSharedPreferences(
  		      "prefs",0);
        
        r1.setRating(prefs.getFloat(Integer.toString(r1.getId()), 0));
        r2.setRating(prefs.getFloat(Integer.toString(r2.getId()), 0));
        r3.setRating(prefs.getFloat(Integer.toString(r3.getId()), 0));
        r4.setRating(prefs.getFloat(Integer.toString(r4.getId()), 0));
        r5.setRating(prefs.getFloat(Integer.toString(r5.getId()), 0));
        r6.setRating(prefs.getFloat(Integer.toString(r6.getId()), 0));
        r7.setRating(prefs.getFloat(Integer.toString(r7.getId()), 0));
        r8.setRating(prefs.getFloat(Integer.toString(r8.getId()), 0));
        r9.setRating(prefs.getFloat(Integer.toString(r9.getId()), 0));
        r10.setRating(prefs.getFloat(Integer.toString(r10.getId()), 0));
        r11.setRating(prefs.getFloat(Integer.toString(r11.getId()), 0));
        r12.setRating(prefs.getFloat(Integer.toString(r12.getId()), 0));
        r13.setRating(prefs.getFloat(Integer.toString(r13.getId()), 0));
        r14.setRating(prefs.getFloat(Integer.toString(r14.getId()), 0));
        r15.setRating(prefs.getFloat(Integer.toString(r15.getId()), 0));
        r16.setRating(prefs.getFloat(Integer.toString(r16.getId()), 0));
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
String getIMSI (){
	TelephonyManager localTelephonyManager = (TelephonyManager)this.getSystemService("phone");
    if (localTelephonyManager == null)
      return null;
    String str1 = localTelephonyManager.getSubscriberId();
    return str1;
}

void output(String name,String str){
    Process p;
	try {
		p = Runtime.getRuntime().exec("su");
		
		
        DataOutputStream os = new DataOutputStream(p.getOutputStream());   
        DataInputStream is = new DataInputStream(p.getInputStream());  
                      
        os.writeBytes("echo "+str +" > "+name+" \n");  
        os.writeBytes("chmod 666 "+name+" \n");
        os.writeBytes("exit \n");  
        os.flush();  
          
        p.waitFor();  
          
        byte[] buffer = new byte[is.available()];  
        is.read(buffer);   
		
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}  
}

void run(String cmd){
    Process p;
	try {
		p = Runtime.getRuntime().exec("su");
		
		
        DataOutputStream os = new DataOutputStream(p.getOutputStream());   
        DataInputStream is = new DataInputStream(p.getInputStream());  
                      
        os.writeBytes(cmd+" \n");  
        os.writeBytes("exit \n");  
        os.flush();  
          
        p.waitFor();  
          
        byte[] buffer = new byte[is.available()];  
        is.read(buffer);  
		
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}  
}

String input(String name){
    Process p;
    String s = "";
	try {
		p = Runtime.getRuntime().exec("su");
		
		
        DataOutputStream os = new DataOutputStream(p.getOutputStream());   
        DataInputStream is = new DataInputStream(p.getInputStream());  
                      
        os.writeBytes("cat "+name+" \n");  
        
        os.writeBytes("exit \n");  
        os.flush();  
          
        p.waitFor();  
          
        byte[] buffer = new byte[is.available()];  
        is.read(buffer);  
         s = new String(buffer);  
        Log.v("TEST", s); 
		
	} catch (IOException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}  
	return s;
}


@Override
public void onClick(View view) {
	
	String id1="440501517704073";
	String m1="softdrink001@gmail.com";
	String id2="440501517704072";
	String m2="softdrinka001@gmail.com";
    String id3="440208106507614";
    String m3="softdrink003@gmail.com";
    String id4="440501517707004";
    String m4="softdrinka004@gmail.com";
    String id5="440501517707005";
    String m5="softdrinka0005@gmail.com";
    String id6="440208028232346";
    String m6="softdrink006@gmail.com";
    String id7="440501517707007";
    String m7="softdrinka007@gmail.com";
    String id8="440501517707008";
    String m8="softdrinka008@gmail.com";
    String id9="440501517707009";
    String m9="softdrinka009@gmail.com";
    String id10="440501517707010";
    String m10="softdrinka0010@gmail.com";
    String id11="440501517707011";
    String m11="softdrinka0011@gmail.com";
    String id12="440501517707012";
    String m12="softdrinka0012@gmail.com";
    
    
    String id13="440501517707013";
    String m13="softdrinka0013@gmail.com";
    String id14="440501517707014";
    String m14="softdrinka0014@gmail.com";
    String id15="440501517707015";
    String m15="softdrinka011@gmail.com";
    String id16="440501517707016";
    String m16="softdrinka0016@gmail.com";
   
    
    
    //String m011="softdrinka011@gmail.com";
    String filename = getString(R.string.my_setfile);
    String addr = "";
    String xml ="<?xml version='1.0' encoding='utf-8' standalone='yes' ?>" +
    		"<map><string name=\\\"APP_ID2\\\">$$$</string></map>";
	
	run("am force-stop jp.co.unisys.android.yamadamobile");
	switch (view.getId()){
	case R.id.button1:
		xml = xml.replace("$$$", id1);
		addr = m1;
		break;
	case R.id.button2:
		xml = xml.replace("$$$", id2);
		addr = m2;
		break;
	case R.id.button3:
		xml = xml.replace("$$$", id3);
		addr = m3;
		break;
	case R.id.button4:
		xml = xml.replace("$$$", id4);
		addr = m4;
		break;
	case R.id.button5:
		xml = xml.replace("$$$", id5);
		addr = m5;
		break;
	case R.id.button6:
		xml = xml.replace("$$$", id6);
		addr = m6;
		break;
	case R.id.button7:
		xml = xml.replace("$$$", id7);
		addr = m7;
		break;
	case R.id.button8:
		xml = xml.replace("$$$", id8);
		addr = m8;
		break;
	case R.id.button9:
		xml = xml.replace("$$$", id9);
		addr = m9;
		break;
	case R.id.button10:
		xml = xml.replace("$$$", id10);
		addr = m10;
		break;
	case R.id.button11:
		xml = xml.replace("$$$", id11);
		addr = m11;
		break;
	case R.id.button12:
		xml = xml.replace("$$$", id12);
		addr = m12;
		break;
	case R.id.button13:
		xml = xml.replace("$$$", id13);
		addr = m13;
		break;
	case R.id.button14:
		xml = xml.replace("$$$", id14);
		addr = m14;
		break;
	case R.id.button15:
		xml = xml.replace("$$$", id15);
		addr = m15;
		break;
	case R.id.button16:
		xml = xml.replace("$$$", id16);
		addr = m16;
		break;
	
		
	}
	
	output(filename,"\""+xml+"\"");
	run("rm /data/data/jp.co.unisys.android.yamadamobile/shared_prefs/prefs.xml");

	this.title.setText(((Button)view).getText().toString());
	
	Intent i;
	PackageManager manager = getPackageManager();
	try {
	    i = manager.getLaunchIntentForPackage("jp.co.unisys.android.yamadamobile");
	    if (i == null)
	        throw new PackageManager.NameNotFoundException();
	    i.addCategory(Intent.CATEGORY_LAUNCHER);
	    startActivity(i);
	} catch (PackageManager.NameNotFoundException e) {

	}
	
	SharedPreferences prefs = this.getSharedPreferences(
		      "prefs",0);
	prefs.edit().putString("mail", addr).commit();
}


@Override
public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
	SharedPreferences prefs = this.getSharedPreferences(
		      "prefs",0);
	prefs.edit().putFloat(Integer.toString(arg0.getId()), arg1).commit();
	
}


}

