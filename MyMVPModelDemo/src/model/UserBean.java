package model;

public class UserBean {
	
	private String userName;
	private String passWord;
	
	public UserBean(){
		
	}
	
	public UserBean(String userName,String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}
	
	public String getPassWord(){
		return this.passWord;
	}

}
