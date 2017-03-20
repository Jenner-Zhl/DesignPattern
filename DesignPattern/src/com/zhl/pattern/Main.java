package com.zhl.pattern;

import java.util.Scanner;

import com.zhl.pattern.abstractfactory.AFClient;
import com.zhl.pattern.builder.BuildClient;
import com.zhl.pattern.factorymothod.FMClient;

public class Main {

	private static Client sClient;
	public static void main(String[] args) {
		System.out.println(usage);
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while (i > 0 && i<= 23) {
			sClient = getClient(i);
			if (sClient != null) {
				sClient.run();
			}
			System.out.println(usage);
			i = sc.nextInt();
		}
		
		sc.close();
		
	}

	private static Client getClient(int i) {
		switch (i) {
		case 1:
			return new AFClient();
		case 2:
			return new BuildClient();
		case 3:
			return new FMClient();

		default: return null;
		}
	}

	private static final String usage =
			"\n------\nPlease choose a number\n"
			+ "1. Abstract Factory\n"
			+ "2. Builder\n"
			+ "3. Factory Method\n"
			+ "0. exit";
}
