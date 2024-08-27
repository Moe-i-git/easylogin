package jp.co.internous.easylogin.model.domain;

public class MstUser {
	//フィールドを作成
	private int id;
	private String userName;
	private String password;
	private String fullName;

	//各フィールドのsetterとgetterを設定する
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return fullName;
	}

}

