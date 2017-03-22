package com.zhl.pattern.prototype;

public class FileDetail implements Cloneable {
	
	String fileName;
	long filesize;
	Integer pages;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		FileDetail fd = (FileDetail) super.clone();
		
		fd.pages = new Integer(pages);
		
		return fd;
	}

	
}
