package co.sdslabs.mdg.justsay;

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
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		bSubmit=(Button)findViewById(R.id.b1);
		etTitle=(EditText)findViewById(R.id.et1);
		etDiscription=(EditText)findViewById(R.id.et2);
		etTag=(EditText)findViewById(R.id.et3);
		bSubmit.setOnClickListener(this);
	}
	
}
