package com.dilipit.DI;

public class College {
private String clg_name;
private int count;
public String getClg_name() {
	return clg_name;
}
public void setClg_name(String clg_name) {
	this.clg_name = clg_name;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "College [clg_name=" + clg_name + ", count=" + count + "]";
}

}
