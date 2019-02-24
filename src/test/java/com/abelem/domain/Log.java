package com.abelem.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log {
	
	public static void main(String... args) {
	    log.error("Something else is wrong here");
	    log.error("Calling the 'CounterLog' with a message");
	    log.info("Info");
	    log.debug("Debug");
	    log.warn("Warning");
	  }
}

/* sysout: 
15:41:40.880 [main] ERROR com.abelem.domain.Log - Something else is wrong here
15:41:40.883 [main] ERROR com.abelem.domain.Log - Calling the 'CounterLog' with a message
15:41:40.883 [main] INFO com.abelem.domain.Log - Info
15:41:40.883 [main] DEBUG com.abelem.domain.Log - Debug
15:41:40.883 [main] WARN com.abelem.domain.Log - Warning
*/