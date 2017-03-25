package com.zhl.pattern;

import java.util.Scanner;

import com.zhl.pattern.abstractfactory.AFClient;
import com.zhl.pattern.adapter.AdapterClient;
import com.zhl.pattern.adapter.bridge.BridgeClient;
import com.zhl.pattern.builder.BuildClient;
import com.zhl.pattern.factorymothod.FMClient;
import com.zhl.pattern.prototype.prototypeClient;
import com.zhl.pattern.singleton.SingletonClient;

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
		case 4:
			return new prototypeClient();
		case 5:
			return new SingletonClient();
		case 6:
			return new AdapterClient();
		case 7:
			return new BridgeClient();
		default: return null;
		}
	}

	private static final String usage =
			"\n------\nPlease choose a number\n"
			+ "1. Abstract Factory\t\t"
			+ "2. Builder\t\t"
			+ "3. Factory Method\t\t"
			+ "4. ProtoType\n"
			+ "5. Singleton\t\t"
			+ "6. Adapter\t\t"
			+ "7. Brige\t\t"
			
			+ "0. exit";
}
