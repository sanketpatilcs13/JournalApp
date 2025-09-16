package net.engineeringdigest.journalApp.api.response;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse{

    private Current current;

    @Getter
    @Setter
    public class Current{
        @JsonProperty("observation_time")
        public String observationTime;

        public int temperature;
        @JsonProperty("weather_code")
        public int weatherCode;
        @JsonProperty("weather_icons")
        public List<String> weatherIcons;
        @JsonProperty("weather_descriptions")
        public List<String> weatherDescriptions;
        @JsonProperty("wind_degree")
        public int windDegree;
        @JsonProperty("wind_dir")
        public String windDir;
        public int pressure;
        public int precip;
        public int humidity;
        public int cloudcover;
        public int feelslike;
        @JsonProperty("uv_index")
        public int uvIndex;
        public int visibility;
        @JsonProperty("is_day")
        public String isDay;
    }


}




