package com.cs.EventHandling;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public Event(Object source) {
		super(source);
	}

}
