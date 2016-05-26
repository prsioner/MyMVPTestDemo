package presenter;

import model.IUserModel;
import model.UserBean;
import model.UserModel;

import android.util.Log;

import com.example.mymvpmodeldemo.IUserView;

public class LoginPresenter {
	
	private IUserView iUserView;
	private IUserModel iUserModel;
	
	public LoginPresenter(IUserView iUserView){
		this.iUserView  = iUserView;
		iUserModel = new UserModel();
	}
		
	public void loadUserInfo(){
		UserBean user = iUserModel.user();
		iUserView.setUserName(user.getUserName());
		iUserView.setPassWord(user.getPassWord());
		Log.e("Presenter","loadUserInfo user.getUserName() ="+user.getUserName()+"user.getPassWord() ="+user.getPassWord());
	}

	
	public void setUserInfo(String userName,String passWord){
		Log.e("Presenter","setUserInfo username ="+userName+"password ="+passWord);
		iUserModel.setUserName(userName);
		iUserModel.setPassWord(passWord);
	}
}
