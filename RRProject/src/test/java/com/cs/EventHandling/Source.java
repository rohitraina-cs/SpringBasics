package com.cs.EventHandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Source implements ApplicationEventPublisherAware{

	ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void throwEvent() {
		applicationEventPublisher.publishEvent(new Event(this));
		System.out.println("EventHandled");
	}

}
