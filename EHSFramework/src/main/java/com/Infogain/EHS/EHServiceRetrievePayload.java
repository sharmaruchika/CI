package com.Infogain.EHS;

 
	
import javax.xml.ws.Holder;
import org.mule.api.annotations.param.Payload;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

import org.mule.RequestContext;
import org.mule.api.MuleEventContext;
//import javax.xml.bind.Unmarshaller;
import org.mule.api.MuleMessage;

import errorhandler.services.xmlns.faultschema.FaultSchema;
	 
	public class EHServiceRetrievePayload{
		MuleMessage msg;
		MuleEventContext MuleContext;
		  public EHServiceRetrievePayload() {
		    	System.out.println("Inconstructor ");
		    	
		  
		  }
		  
			
		  
		    	 public void doProcess(@Payload Holder<FaultSchema> payload) {
		    		 StringWriter writer = new StringWriter(); 
		    		
		    		 try {
		    	            JAXBContext context = JAXBContext.newInstance(FaultSchema.class);
		    	            Marshaller m = context.createMarshaller();
		    	            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		    	            m.marshal(payload.value, writer);
		    	            String MsgPayload=writer.getBuffer().toString();
		    	            MuleEventContext MuleContext = RequestContext.getEventContext();
		    	            try {
		    	            		System.out.println("payload Str before check MuleContext: "+ MuleContext);
		    	            		MuleContext.getMessage().setPayload(MsgPayload);
					System.out.println("MsgPayload: After setting "+MsgPayload);
		    	            	} catch (Exception e) {
		    	            		// TODO Auto-generated catch block
		    	            		e.printStackTrace();
		    	            	}
		    	
		    	        } catch (JAXBException e) {
		    	            e.printStackTrace();
		    	        }
		    	    }

			
				    }
				  
		    	
		    
		 
		
		
	   
	