package com.amway.common.interview.stream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDatalnputstream {

	public static void main(String[] args) throws IOException {
		try {
			DataInputStream din=new DataInputStream(new BufferedInputStream(new FileInputStream("F:\\EXT_D\\books\\projects\\git_projects\\zjw_pro\\git_domain\\resources\\employee.dat")));
			byte[] b=new byte[1024];
			while(din.read(b)>0){
				System.out.println(din.read(b));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
