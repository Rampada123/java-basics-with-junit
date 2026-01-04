package com.rampada.Interface;

interface Remote{
	public void on();
	public void off();
	
	default void unknown() {
		}
}

