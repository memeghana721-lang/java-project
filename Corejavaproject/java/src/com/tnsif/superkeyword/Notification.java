package com.tnsif.superkeyword;

public class Notification {
	        String message="Default notification";
	}

	class Pushnotification extends Notification{
	        String message="push notification from whstp";
	        void notification() {
	                System.out.println("child message :"+message);
	                System.out.println("parent message :"+super.message);
	        }
	}

	

