package model;

import android.util.Log;

public class UserModel implements IUserModel {

	private UserBean userbean;

	public UserModel() {
		userbean = new UserBean();
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		userbean.setUserName(userName);
		Log.e("UserModel", "setUserName()....username =" + userName);
	}

	@Override
	public void setPassWord(String passWord) {
		// TODO Auto-generated method stub
		userbean.setPassWord(passWord);
		Log.e("UserModel", "setPassWord()....passWord =" + passWord);
	}

	public UserBean user() {
		return userbean;

	}

}
