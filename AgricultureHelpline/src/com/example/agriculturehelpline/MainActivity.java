package com.example.agriculturehelpline;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button a = (Button)findViewById(R.id.a);
		Button b = (Button)findViewById(R.id.b);
		Button c = (Button)findViewById(R.id.c);

	 a.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             Intent a = new Intent("android.intent.action.A");
             startActivity(a);
            
         }
     });
	 
	 b.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             Intent b = new Intent("android.intent.action.B");
             startActivity(b);
         }
     });
	 
	 c.setOnClickListener(new View.OnClickListener() {
         public void onClick(View v) {
             Intent c = new Intent("android.intent.action.C");
             startActivity(c);
         }
     });
 }


}
