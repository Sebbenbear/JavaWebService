package example;

import javax.jws.WebService;

@WebService
public interface WebServiceInterface {
	//your own function signature goes here;
	public void print();

	public double getConversion(String one, String two, double amt);
}