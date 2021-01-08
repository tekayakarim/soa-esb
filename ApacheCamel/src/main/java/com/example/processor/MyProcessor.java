package com.example.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {
private String ch;
	public MyProcessor(String ch) {this.ch=ch;}
	public MyProcessor() {}
    public void process(Exchange exchange) throws Exception {
    	
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("/////////////////");
    	}
    	exchange.getIn().setBody(ch+": \n THIS FILE IS NOT A SOAP ENVELOP");
   	 System.out.println(exchange.getIn().getBody(String.class));
    }
}