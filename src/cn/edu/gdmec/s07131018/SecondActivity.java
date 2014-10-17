package cn.edu.gdmec.s07131018;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		tv = (TextView) findViewById(R.id.stv);
		tv.setText(getIntent().getExtras().get("str").toString());
	}

}
