package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private String brand;
	
	private String model;
	
	private int series;
	
	public Car() {
	}
	
	public Car(String brand, String model, int series) {
		this.brand = brand;
		this.model = model;
		this.series = series;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSeries() {
		return series;
	}
	
	public void setSeries(int series) {
		this.series = series;
	}
	
	@Override
	public String toString() {
		return  """
                
                Car   [ Brand =     %s,
                        Model =     %s,
                        Series =    %s ]
                """
				.formatted(brand, model, series);
	}
}
