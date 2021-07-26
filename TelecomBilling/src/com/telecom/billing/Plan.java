package com.telecom.billing;

//Java Bean Class
public class Plan {

	private String time;
	private int durationInSeconds;
	private String flag;
	private String telephoneNo;
	private String date;

	public Plan(String telephoneNo, String date, String time, int duration, String flag) {
		this.telephoneNo = telephoneNo;
		this.setDate(date);
		this.setTime(time);
		this.durationInSeconds = duration;
		this.setFlag(flag);
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	public int getDuration() {
		return durationInSeconds;
	}

	public void setDuration(int duration) {
		this.durationInSeconds = duration;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "[ telephoneNo=" + telephoneNo + ", date=" + date + ",time=" + time + ",duration=" + durationInSeconds
				+ ",flag=" + flag + " ]";
	}
}
