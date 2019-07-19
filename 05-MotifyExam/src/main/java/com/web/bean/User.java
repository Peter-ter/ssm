package com.web.bean;

public class User {
    private Integer userId;

    private String userCode;

    private String userName;

    private String password;

    private String email;

    private String tel;

    private Integer flag;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
    

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userId, String userCode, String userName, String password, String email, String tel) {
		super();
		this.userId = userId;
		this.userCode = userCode;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.tel = tel;
	}

	public User(String userCode, String userName, String password, String email, String tel, Integer flag) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.tel = tel;
		this.flag = flag;
	}
	

}