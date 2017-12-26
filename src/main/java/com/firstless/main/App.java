package com.firstless.main;

import cn.lesswork.context.boot.LessWorkApp;

public final class App {

	public static void main(String[] args) {
		new LessWorkApp()
			.port(8080).go(args);
	}
	
}
