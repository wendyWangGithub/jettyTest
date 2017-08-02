package com.test.hessian;

import com.caucho.hessian.server.HessianServlet;

public class HessianMathService extends HessianServlet 
								implements MathService{
	
	public int add(int a, int b) {
		return a + b;
	}

}
