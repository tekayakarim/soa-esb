package com.example.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;



public class SoapProcessor implements Processor{
private String ch;
	public SoapProcessor(String ch) {this.ch=ch;}
	public SoapProcessor() {}
	
	public void process(Exchange exchange) throws Exception {
	
	
		exchange.getIn().setHeader("SOAPAction", "");
		for(int i=0;i<10;i++)
    	{
    		System.out.println("/////////////////");
    	}
		System.out.println(ch+":\n le contenu du fichier est :");
		System.out.println("/////////////////");
		 System.out.println(exchange.getIn().getBody(String.class));
		 
	
	}

}
