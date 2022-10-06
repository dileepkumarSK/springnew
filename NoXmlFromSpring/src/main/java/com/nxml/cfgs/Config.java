package com.nxml.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nxml.beans.Amazon;
import com.nxml.beans.Bluedart;
import com.nxml.beans.Courier;
import com.nxml.beans.Dtdc;
import com.nxml.beans.Grocery;
import com.nxml.beans.Moblies;

@Configuration
@ComponentScan("com.nxml")
@PropertySource("classpath:com/nxml/properties/NameDetails.properties")
public class Config {
	/*
	 * @Bean public Amazon mbl() { return new Moblies(dtdc()); }
	 * 
	 * @Bean public Amazon grc() { return new Grocery(bldt()); }
	 * 
	 * @Bean public Courier dtdc() { return new Dtdc(); }
	 * 
	 * @Bean public Courier bldt() { return new Bluedart(); }
	 */
}
