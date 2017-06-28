package WeatherStation;

public class CurrentConditionsDisplay implements DisplayElement, Observer {	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this); //current weather data register it
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
		}
	
}

 
