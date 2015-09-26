package br.com.giancarloandroid.appcompat;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialog;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnCompatDialog = (Button) findViewById(R.id.btnCompatDialog);
		btnCompatDialog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
				builder.setTitle("Eu sou um AppCompatDialog");
				builder.setMessage("Eu sou um AppCompatDialog");
				builder.setPositiveButton("OK", null);
				builder.setNegativeButton("Fechar", null);
				AppCompatDialog appCompatDialog = builder.create();
				appCompatDialog.show();
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {	
		MenuInflater inflater = getMenuInflater();	
		inflater.inflate(R.menu.main, menu);
		return true;
	}

}
