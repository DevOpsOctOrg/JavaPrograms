package com.training.threads;

import java.io.IOException;

public class RuntimeDemo {
	
	public static void main(String args[]) throws IOException{
		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
	}
}
