package d;

import app.core.utils.Converter;

public class Demo {

	public static void main(String[] args) {
		
		Converter converter = new Converter();
		double celsiusTemp = 23;
		double fahrenheitTemp = converter.celciustoFahrenheit(celsiusTemp);
		
		System.out.println(celsiusTemp);
		System.out.println(fahrenheitTemp); 

	}

}
