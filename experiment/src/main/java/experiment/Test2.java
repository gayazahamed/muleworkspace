package experiment;
 
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class Test2 implements Callable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public String testMethod11111(){
		return "Hello Bean 11111";
	}

	public String testMethod2(){
		return "Hello Bean 22222";
	}
	@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {

        eventContext.getMessage().setInvocationProperty("myProperty", "Hello World!");
        return eventContext.getMessage().getPayload();
    }

}
