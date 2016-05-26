package com.example.mymvpmodeldemo;

import presenter.LoginPresenter;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements IUserView{

    private EditText name_edt,password_edt;
    private Button save_btn,show_btn;
    private String userName,passWord;
    private LoginPresenter loginPresenter;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        name_edt = (EditText) findViewById(R.id.username_et);
        password_edt = (EditText) findViewById(R.id.password_et);
        
        save_btn = (Button) findViewById(R.id.save_input_btn);
        show_btn = (Button) findViewById(R.id.show_input_btn);
        
        loginPresenter = new LoginPresenter(this);
        
        //Log.e("MainActivity","userName="+userName+"passWord ="+passWord);
        save_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
		        
				loginPresenter.setUserInfo(getUserName(), getPassWord());
				name_edt.setText("");
				password_edt.setText("");
			}			
		});
        show_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				loginPresenter.loadUserInfo();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public String getUserName() {
		
		userName = name_edt.getText().toString();
		return userName;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPassWord() {
		
		passWord = password_edt.getText().toString();
		return passWord;
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		name_edt.setText(userName);
	}

	@Override
	public void setPassWord(String passWord) {
		// TODO Auto-generated method stub
		password_edt.setText(passWord);
	}
}
