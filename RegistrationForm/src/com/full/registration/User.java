package com.full.registration;

public class User {
	String firstName;
	String lastName;
	int age;
	String mail;
	String address;
	String phnno;
	User(String fname,String lname,int age ,String mail,String address,String phnNo)
	{
		this.firstName=fname;

		this.lastName=lname;
		this.age=age;
		this.mail=mail;
		this.address=address;
		this.phnno=phnNo;
	}
	public String getAddr()
	{
		return address;
		
	}
	public String getFname()
	{
		return firstName;
	}
	public String getMail()
	{
		return  mail;
		
	}
	public String getLname()
	{
		return lastName;
	}
	public String getPhnno()
	{
		return phnno;
		
	}
	public int getAge()
	{
		return age;
	}
	
	

}
