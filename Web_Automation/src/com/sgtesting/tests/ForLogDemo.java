package com.sgtesting.tests;

import org.apache.log4j.Logger;

public class ForLogDemo {
	public static Logger log=Logger.getLogger("Loop Output");
	public static void main(String[] args) {
		log.info("For loop starts here...");
		for(int i=0;i<=40;i++)
		{
			if(i%2==0)
			{
				log.info("Even nums: "+i);
			}
		}
		log.info("For loop output ends here...");
	}

}
