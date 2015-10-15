package example;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WebServiceClient {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL(
				"http://localhost:8080/MyWebService/WebServiceInterface?wsdl");
		QName qname = new QName("http://example/", "WebServiceInterface");
		Service service = Service.create(url, qname);
		WebServiceInterface callWebService =
				service.getPort(WebServiceInterface.class);
		System.out.println("Service output: \n");
		callWebService.print();

		System.out.println(callWebService.getConversion("NZD", "AUD", 10.00));
	}
}