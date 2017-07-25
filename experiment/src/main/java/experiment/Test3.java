package experiment;
 
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class Test3  {
	
	
	public void testMethod1(){
		System.out.println("11111111111111");
		
	}

	public String testMethod2(){
		System.out.println("22222222222222");
		return "Hello Bean 22222";
	}
	
	
	public String testMethod3(String str1, String str2){
		System.out.println("33333333333333333"+str1+str2);
		return "Hello Bean 3"+str1+str2;
	}
	 

}
