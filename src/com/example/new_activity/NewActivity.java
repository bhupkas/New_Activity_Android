package com.example.new_activity;

import com.example.new_activity.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
 
public class NewActivity extends Activity {
 
	Button button;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newact);
	}
 
}