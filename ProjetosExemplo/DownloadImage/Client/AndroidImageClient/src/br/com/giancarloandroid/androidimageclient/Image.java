package br.com.giancarloandroid.androidimageclient;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import br.com.giancarlo.androidimageclient.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;

public class Image extends Activity {
	
	private ImageView img;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_image);
		this.img = (ImageView) findViewById(R.id.img);
		new LoadImageFromServer(){
			@Override
			protected void onPostExecute(Bitmap result) {
				img.setImageBitmap(result);
			};
		}.execute("http://10.0.0.103/Server/img/lion.jpg");
	}
	
}

class LoadImageFromServer extends AsyncTask<String, Integer, Bitmap>{

	@Override
	protected Bitmap doInBackground(String... arg0) {
		Bitmap b = null;
		try{
			b = BitmapFactory.decodeStream((InputStream) new URL(arg0[0]).getContent());
		} catch (MalformedURLException e){
			e.printStackTrace();
			return null;
		} catch (IOException e){
			e.printStackTrace();
			return null;
		}
		return b;
	}	
	
}
