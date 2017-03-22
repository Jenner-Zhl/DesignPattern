package com.zhl.pattern.prototype;

import com.zhl.pattern.Client;

public class prototypeClient extends Client {

	@Override
	public void run() {
		FileDetail fd1 = new FileDetail();
		fd1.fileName = "fd1";
		fd1.filesize = 1000;
		fd1.pages = 3;
		
		try {
			FileDetail fd2 = (FileDetail) fd1.clone();
			System.out.println("fd2: " + fd2.fileName + " size:"
					+ fd2.filesize + " pages:" + fd2.pages);
			System.out.println("fd1 == fd2 is " + (fd1 == fd2));
			System.out.println("fd1.pages == fd2.pages is " + (fd1.pages == fd2.pages));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
