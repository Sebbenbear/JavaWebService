package example;

import javax.jws.WebService;

@WebService(
		endpointInterface = "example.WebServiceInterface",
		portName = "webservicePort",
		serviceName = "WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		// your own function implementation goes here
		System.out.print("Hello, WebService!");
	}

	/**
	 * Gets the conversion
	 */
	public double getConversion(String one, String two, double amt){
		return amt*.23;
	}
}