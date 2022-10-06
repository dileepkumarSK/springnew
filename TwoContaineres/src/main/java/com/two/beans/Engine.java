package com.two.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Engine {
  int x=0;
	public Engine() {
	super();
	System.out.println("Engine.Engine()"+x++);
	// TODO Auto-generated constructor stub
}

	public void start() {
		System.out.println("Vehicle.start()");
	}

	public void Stop() {
		System.out.println("Vehicle.Stop()");
	}
}
