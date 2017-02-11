﻿package com.github.hed.designpatterns.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteComponent extends Component {

	//具体实现
	@Override
	public void operate() {
		System.out.println("do Something");
	}

}
