package com.firstless.main;

import cn.lesswork.context.anno.Less;
import cn.lesswork.context.anno.Param;
import cn.lesswork.context.anno.View;
import cn.lesswork.context.anno.Work;

@Less
public class FirstLess {
	
	@Work("/index")
	public String index() {
		return "<h1>Hello LessWork!</h1>";
	}
	
	@Work("/index1")
	public String index1(@Param("name")String name) {
		return "<h1>Hello "+ name +"</h1>";
	}
	
	@Work("/index2")
	public String index2() {
		return "<h1>Hello LessWork!2</h1>";
	}
	
	@Work("/index3")
	public User index3() {
		return new User("jack", "男", 22, "111111");
	}
	
	@Work("/index4")
	@View
	public String index4() {
		return "index";
	}
}
