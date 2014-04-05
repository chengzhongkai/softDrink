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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener, OnItemSelectedListener {
	TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cnt, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        
        ArrayAdapter<CharSequence> adapterP = ArrayAdapter.createFromResource(this,
                R.array.points, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       
        
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
       
        
        Spinner r1= (Spinner)this.findViewById(R.id.Spinner1);
        Spinner r2= (Spinner)this.findViewById(R.id.Spinner2);
        Spinner r3= (Spinner)this.findViewById(R.id.Spinner3);
        Spinner r4= (Spinner)this.findViewById(R.id.Spinner4);
        Spinner r5= (Spinner)this.findViewById(R.id.Spinner5);
        Spinner r6= (Spinner)this.findViewById(R.id.Spinner6);
        Spinner r7= (Spinner)this.findViewById(R.id.Spinner7);
        Spinner r8= (Spinner)this.findViewById(R.id.Spinner8);
        Spinner r9= (Spinner)this.findViewById(R.id.Spinner9);
        Spinner r10= (Spinner)this.findViewById(R.id.Spinner10);
        Spinner r11= (Spinner)this.findViewById(R.id.Spinner11);
        Spinner r12= (Spinner)this.findViewById(R.id.Spinner12);
        Spinner r13= (Spinner)this.findViewById(R.id.Spinner13);
        Spinner r14= (Spinner)this.findViewById(R.id.Spinner14);
        Spinner r15= (Spinner)this.findViewById(R.id.Spinner15);
        Spinner r16= (Spinner)this.findViewById(R.id.Spinner16);
    
        Spinner rp1= (Spinner)this.findViewById(R.id.SpinnerP1);
        Spinner rp2= (Spinner)this.findViewById(R.id.SpinnerP2);
        Spinner rp3= (Spinner)this.findViewById(R.id.SpinnerP3);
        Spinner rp4= (Spinner)this.findViewById(R.id.SpinnerP4);
        Spinner rp5= (Spinner)this.findViewById(R.id.SpinnerP5);
        Spinner rp6= (Spinner)this.findViewById(R.id.SpinnerP6);
        Spinner rp7= (Spinner)this.findViewById(R.id.SpinnerP7);
        Spinner rp8= (Spinner)this.findViewById(R.id.SpinnerP8);
        Spinner rp9= (Spinner)this.findViewById(R.id.SpinnerP9);
        Spinner rp10= (Spinner)this.findViewById(R.id.SpinnerP10);
        Spinner rp11= (Spinner)this.findViewById(R.id.SpinnerP11);
        Spinner rp12= (Spinner)this.findViewById(R.id.SpinnerP12);
        Spinner rp13= (Spinner)this.findViewById(R.id.SpinnerP13);
        Spinner rp14= (Spinner)this.findViewById(R.id.SpinnerP14);
        Spinner rp15= (Spinner)this.findViewById(R.id.SpinnerP15);
        Spinner rp16= (Spinner)this.findViewById(R.id.SpinnerP16);
        
        
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
        
        
        r1.setAdapter(adapter);
        r2.setAdapter(adapter);
        r3.setAdapter(adapter);
        r4.setAdapter(adapter);
        r5.setAdapter(adapter);
        r6.setAdapter(adapter);
        r7.setAdapter(adapter);
        r8.setAdapter(adapter);
        r9.setAdapter(adapter);
        r10.setAdapter(adapter);
        r11.setAdapter(adapter);
        r12.setAdapter(adapter);
        r13.setAdapter(adapter);
        r14.setAdapter(adapter);
        r15.setAdapter(adapter);
        r16.setAdapter(adapter);
        
        rp1.setAdapter(adapterP);
        rp2.setAdapter(adapterP);
        rp3.setAdapter(adapterP);
        rp4.setAdapter(adapterP);
        rp5.setAdapter(adapterP);
        rp6.setAdapter(adapterP);
        rp7.setAdapter(adapterP);
        rp8.setAdapter(adapterP);
        rp9.setAdapter(adapterP);
        rp10.setAdapter(adapterP);
        rp11.setAdapter(adapterP);
        rp12.setAdapter(adapterP);
        rp13.setAdapter(adapterP);
        rp14.setAdapter(adapterP);
        rp15.setAdapter(adapterP);
        rp16.setAdapter(adapterP);
        
        r1.setOnItemSelectedListener(this);
        r1.setOnItemSelectedListener(this);
        r2.setOnItemSelectedListener(this);
        r3.setOnItemSelectedListener(this);
        r4.setOnItemSelectedListener(this);
        r5.setOnItemSelectedListener(this);
        r6.setOnItemSelectedListener(this);
        r7.setOnItemSelectedListener(this);
        r8.setOnItemSelectedListener(this);
        r9.setOnItemSelectedListener(this);
        r10.setOnItemSelectedListener(this);
        r11.setOnItemSelectedListener(this);
        r12.setOnItemSelectedListener(this);
        r13.setOnItemSelectedListener(this);
        r14.setOnItemSelectedListener(this);
        r15.setOnItemSelectedListener(this);
        r16.setOnItemSelectedListener(this);
        
        rp1.setOnItemSelectedListener(this);
        rp1.setOnItemSelectedListener(this);
        rp2.setOnItemSelectedListener(this);
        rp3.setOnItemSelectedListener(this);
        rp4.setOnItemSelectedListener(this);
        rp5.setOnItemSelectedListener(this);
        rp6.setOnItemSelectedListener(this);
        rp7.setOnItemSelectedListener(this);
        rp8.setOnItemSelectedListener(this);
        rp9.setOnItemSelectedListener(this);
        rp10.setOnItemSelectedListener(this);
        rp11.setOnItemSelectedListener(this);
        rp12.setOnItemSelectedListener(this);
        rp13.setOnItemSelectedListener(this);
        rp14.setOnItemSelectedListener(this);
        rp15.setOnItemSelectedListener(this);
        rp16.setOnItemSelectedListener(this);
        
        SharedPreferences prefs = this.getSharedPreferences(
  		      "prefs",0);

        r1.setSelection(prefs.getInt(Integer.toString(r1.getId()), 0));
        r2.setSelection(prefs.getInt(Integer.toString(r2.getId()), 0));
        r3.setSelection(prefs.getInt(Integer.toString(r3.getId()), 0));
        r4.setSelection(prefs.getInt(Integer.toString(r4.getId()), 0));
        r5.setSelection(prefs.getInt(Integer.toString(r5.getId()), 0));
        r6.setSelection(prefs.getInt(Integer.toString(r6.getId()), 0));
        r7.setSelection(prefs.getInt(Integer.toString(r7.getId()), 0));
        r8.setSelection(prefs.getInt(Integer.toString(r8.getId()), 0));
        r9.setSelection(prefs.getInt(Integer.toString(r9.getId()), 0));
        r10.setSelection(prefs.getInt(Integer.toString(r10.getId()), 0));
        r11.setSelection(prefs.getInt(Integer.toString(r11.getId()), 0));
        r12.setSelection(prefs.getInt(Integer.toString(r12.getId()), 0));
        r13.setSelection(prefs.getInt(Integer.toString(r13.getId()), 0));
        r14.setSelection(prefs.getInt(Integer.toString(r14.getId()), 0));
        r15.setSelection(prefs.getInt(Integer.toString(r15.getId()), 0));
        r16.setSelection(prefs.getInt(Integer.toString(r16.getId()), 0));
        
        rp1.setSelection(prefs.getInt(Integer.toString(rp1.getId()), 0));
        rp2.setSelection(prefs.getInt(Integer.toString(rp2.getId()), 0));
        rp3.setSelection(prefs.getInt(Integer.toString(rp3.getId()), 0));
        rp4.setSelection(prefs.getInt(Integer.toString(rp4.getId()), 0));
        rp5.setSelection(prefs.getInt(Integer.toString(rp5.getId()), 0));
        rp6.setSelection(prefs.getInt(Integer.toString(rp6.getId()), 0));
        rp7.setSelection(prefs.getInt(Integer.toString(rp7.getId()), 0));
        rp8.setSelection(prefs.getInt(Integer.toString(rp8.getId()), 0));
        rp9.setSelection(prefs.getInt(Integer.toString(rp9.getId()), 0));
        rp10.setSelection(prefs.getInt(Integer.toString(rp10.getId()), 0));
        rp11.setSelection(prefs.getInt(Integer.toString(rp11.getId()), 0));
        rp12.setSelection(prefs.getInt(Integer.toString(rp12.getId()), 0));
        rp13.setSelection(prefs.getInt(Integer.toString(rp13.getId()), 0));
        rp14.setSelection(prefs.getInt(Integer.toString(rp14.getId()), 0));
        rp15.setSelection(prefs.getInt(Integer.toString(rp15.getId()), 0));
        rp16.setSelection(prefs.getInt(Integer.toString(rp16.getId()), 0));
        
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
public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long id) {
	SharedPreferences prefs = this.getSharedPreferences(
		      "prefs",0);
	prefs.edit().putInt(Integer.toString(arg0.getId()), pos).commit();
	
}


@Override
public void onNothingSelected(AdapterView<?> arg0) {
	// TODO Auto-generated method stub
	
}


}

