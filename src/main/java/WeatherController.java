import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;


public class WeatherController {

	// c85618dc5b17396d9d21bd42ac42ea6b

	public static String getWeather(String message, WeatherModel model) throws IOException {
		URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + message
								  + "&units=metric&lang=ru&appid=c85618dc5b17396d9d21bd42ac42ea6b");

		Scanner in = new Scanner((InputStream) url.getContent());
		String result = "";
		while (in.hasNext()) {
			result += in.nextLine();
		}

		JSONObject object = new JSONObject(result);
		model.setName(object.getString("name"));

		JSONObject main = object.getJSONObject("main");
		model.setTemp(main.getDouble("temp"));
		model.setHumidity(main.getDouble("humidity"));

		JSONArray jsonArray = object.getJSONArray("weather");
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject obj = jsonArray.getJSONObject(i);
			model.setIcon((String) obj.get("icon"));
			model.setDescription((String) obj.get("description"));
		}


		return
				"Город: " + model.getName() + "\n" +
				"Описание погоды: " + model.getDescription() + "\n" +
				"Температура: " + model.getTemp() + "C" + "\n" +
				"Влажность: " + model.getHumidity() + "%" + "\n" +
				"https://openweathermap.org/img/wn/" + model.getIcon() + "@4x" + ".png";

	}
}
