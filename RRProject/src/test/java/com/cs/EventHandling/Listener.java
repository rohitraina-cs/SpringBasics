package com.cs.EventHandling;

import org.springframework.context.ApplicationListener;

public class Listener implements ApplicationListener<Event>{

	@Override
	public void onApplicationEvent(Event event) {
		System.out.println("Event Occured");
	}

}
