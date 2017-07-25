package com.java.Mediator;

public abstract class AbstractColleague {

	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator){
		this.mediator=mediator;
	}

	public AbstractMediator getMediator() {
		return mediator;
	}

	public void setMediator(AbstractMediator mediator) {
		this.mediator = mediator;
	}
	
}
