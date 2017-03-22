package com.zhl.pattern.singleton;

public class Singleton {

/*	 private static Singleton instance = new Singleton();  
	    private Singleton (){}  
	    public static Singleton getInstance() {  
	    return instance;  
	    }  */
	
	
/*	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}*/
	
	
	
	private Singleton() {};
	
	private static Singleton sInstance;
	
	public static Singleton getInstance() {
		
		if (sInstance == null) {
			synchronized (Singleton.class) {
				if (sInstance == null) {
					sInstance = new Singleton();
				}
			}
		}
		
		return sInstance;
	}
}
