public class WeatherModel {

	private String name;
	private Double temp;
	private Double humidity;
	private String icon;
	private String description;

	public WeatherModel() {
	}

	public String getName() {
		return name;
	}

	public Double getTemp() {
		return temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public String getIcon() {
		return icon;
	}

	public String getDescription() {
		return description;
	}

	public WeatherModel(String name, Double temp, Double humidity, String icon, String description) {
		this.name = name;
		this.temp = temp;
		this.humidity = humidity;
		this.icon = icon;
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
