package com.exeption.assignment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("c:\\users\\manjula\\desktop\\xyz.txt");
		FileOutputStream fos = new FileOutputStream("c:\\users\\manjula\\desktop\\output.txt");	
		int data = file.read();
		while (data!=-1){
			fos.write(data);
			data = file.read();
		}
		file.close();
		fos.close();
		System.out.println("Succefully written...");
		
	}

}
