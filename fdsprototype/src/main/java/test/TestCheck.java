package test;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class TestCheck implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(eventContext.getMessage());
		return eventContext;
	}

}
