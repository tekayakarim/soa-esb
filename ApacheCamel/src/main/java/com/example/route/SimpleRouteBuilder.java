package com.example.route;

import java.awt.PageAttributes.MediaType;

import javax.xml.namespace.QName;
import javax.xml.soap.MimeHeaders;

import org.apache.camel.CamelException;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;

import com.example.processor.MyProcessor;
import com.example.processor.SoapProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

	
	

	@Override
	public void configure() throws Exception {
	
			//route for creatUser
			from("file:C:/pixela/user/createUser")
			.doTry()
			.process(new SoapProcessor("createUser"))
			.setHeader(Exchange.HTTP_METHOD, simple("POST"))
			.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
			.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
			.doCatch(CamelException.class)
			.process(new MyProcessor("createUser"))
			.end();
			
			
			//route for updateUser
			from("file:C:/pixela/user/updateUser")
			.doTry()
			.process(new SoapProcessor("updateUser"))
			.setHeader(Exchange.HTTP_METHOD, simple("POST"))
			.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
			.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
			.doCatch(CamelException.class)
			.process(new MyProcessor("updateUser"))
			.end();
					
			
		//route for deleteUser
				from("file:C:/pixela/user/deleteUser")
				.doTry()
				.process(new SoapProcessor("deleteUser"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("deleteUser"))
				.end();
				
		
		// route for ShowUserProfil
				from("file:C:/pixela/user/showUserProfil")
				.doTry()
				.process(new SoapProcessor("showUserProfil"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("showUserProfil"))
				.end();
			
				
				// route for creatGraph
				from("file:C:/pixela/graph/creatGraph")
				.doTry()
				.process(new SoapProcessor("creatGraph"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("creatGraph"))
				.end();
				
				
				// route for getAllGraph
				from("file:C:/pixela/graph/getAllGraph")
				.doTry()
				.process(new SoapProcessor("getAllGraph"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("getAllGraph"))
				.end();
				
				
				// route for updateGraph
				from("file:C:/pixela/graph/updateGraph")
				.doTry()
				.process(new SoapProcessor("updateGraph"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("updateGraph"))
				.end();
				
				
				// route for deletGraph
				from("file:C:/pixela/graph/deletGraph")
				.doTry()
				.process(new SoapProcessor("deletGraph"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("deletGraph"))
				.end();
				
				
				// route for creatPixel
				from("file:C:/pixela/pixel/creatPixel")
				.doTry()
				.process(new SoapProcessor("creatPixel"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("creatPixel"))
				.end();
				
				
				// route for getPixelsGraph
				from("file:C:/pixela/pixel/getPixelsGraph")
				.doTry()
				.process(new SoapProcessor("getPixelsGraph"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("getPixelsGraph"))
				.end();
				
				
				// route for getPixel
				from("file:C:/pixela/pixel/getPixel")
				.doTry()
				.process(new SoapProcessor("getPixel"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("getPixel"))
				.end();
				
				
				// route for deletpixel
				from("file:C:/pixela/pixel/deletpixel")
				.doTry()
				.process(new SoapProcessor("deletpixel"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("deletpixel"))
				.end();
				
				
				// route for updatePixel
				from("file:C:/pixela/pixel/updatePixel")
				.doTry()
				.process(new SoapProcessor("updatePixel"))
				.setHeader(Exchange.HTTP_METHOD, simple("POST"))
				.setHeader(Exchange.CONTENT_TYPE, constant("text/xml"))
				.to("http://localhost:8080/PixelaSoap/services/ConsomationApi")
				.doCatch(CamelException.class)
				.process(new MyProcessor("updatePixel"))
				.end();
	}

}