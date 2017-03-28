package com.zhl.pattern;

import java.util.Scanner;

import com.zhl.pattern.abstractfactory.AFClient;
import com.zhl.pattern.adapter.AdapterClient;
import com.zhl.pattern.adapter.bridge.BridgeClient;
import com.zhl.pattern.builder.BuildClient;
import com.zhl.pattern.chainofresponsibility.ChainClient;
import com.zhl.pattern.command.CommandClient;
import com.zhl.pattern.composite.CompositeClient;
import com.zhl.pattern.decorator.DecoratorClient;
import com.zhl.pattern.facade.FacadeClient;
import com.zhl.pattern.factorymothod.FMClient;
import com.zhl.pattern.flyweight.FlyClient;
import com.zhl.pattern.mediator.MediatorClient;
import com.zhl.pattern.prototype.prototypeClient;
import com.zhl.pattern.proxy.ProxyClient;
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
		case 8:
			return new CompositeClient();
		case 9:
			return new DecoratorClient();
		case 10:
			return new FacadeClient();
		case 11:
			return new FlyClient();
		case 12:
			return new ProxyClient();
		case 13:
			return new ChainClient();
		case 14:
			return new CommandClient();
		case 17:
			return new MediatorClient();
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
			+ "8. Composite\t\t"
			+ "9. Decorator\n"
			+ "10. Facade\t\t"
			+ "11. Flyweight\t\t"
			+ "12. Proxy\t\t"
			+ "13. Chain of Responsibility\n"
			+ "14. Command\t\t"
			+ "15. 解释器模式，没有编码，例如正则表达式\t\t"
			+ "16. Iterator, 没有编码，参考java的Iterator\n"
			+ "17. Mediator\t\t"
			
			+ "0. exit";
}
