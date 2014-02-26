package co.sdslabs.mdg.justsay;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CreateBlog extends Activity implements OnClickListener{
	Button bSubmit;
	EditText etTitle,etDiscription,etTag;

	
	public void OnCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_blog);
		bSubmit=(Button)findViewById(R.id.b1);
		etTitle=(EditText)findViewById(R.id.et1);
		etDiscription=(EditText)findViewById(R.id.et2);
		etTag=(EditText)findViewById(R.id.et3);
		bSubmit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

		nameValuePairs.add(new BasicNameValuePair("Title",etTitle.getText().toString()));
		nameValuePairs.add(new BasicNameValuePair("Discription",etDiscription.getText().toString()));
		        nameValuePairs.add(new BasicNameValuePair("Tag",etTag.getText().toString()));
		         InternetData data=new InternetData();
		        String out= data.postData("http://bloggy.comeze.com/create_blogposts_backend.php", nameValuePairs);
		// TODO Auto-generated method stub
		
	}
	
	
}
