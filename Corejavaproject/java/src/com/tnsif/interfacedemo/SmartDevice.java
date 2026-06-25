package com.tnsif.interfacedemo;

public interface SmartDevice {
	
	        void TurnOn();
	        void TurnOff();
	        void Getstatus();
	}
	// class implementing the interface

	class Smartlight implements SmartDevice{

	        @Override
	        public void TurnOn() {
	        System.out.println("smart light is on");        
	        }

	        @Override
	        public void TurnOff() {
	        System.out.println("smart light is off");        
	                
	        }

	        @Override
	        public void Getstatus() {
	                
	                System.out.println("smart light is standly mode");
	        }
	        
	}

	


