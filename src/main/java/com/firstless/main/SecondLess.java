package com.firstless.main;

import cn.lesswork.context.anno.Less;
import cn.lesswork.context.anno.Work;

@Less("/second")
public class SecondLess {
	
	@Work("/index")
	public String index() {
		return "<h1>SecondLess index work</h1>";
	}
	
}
