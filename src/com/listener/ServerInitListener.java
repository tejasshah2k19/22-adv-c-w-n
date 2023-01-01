package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerInitListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("AWS connected...");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("AWS disconnected....");
	}
}
