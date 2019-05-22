package com.app.string;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String s="the java :programing";
		StringTokenizer s1=new StringTokenizer(s,":");
		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken());
		}
		System.out.println(s1);

	}

}
