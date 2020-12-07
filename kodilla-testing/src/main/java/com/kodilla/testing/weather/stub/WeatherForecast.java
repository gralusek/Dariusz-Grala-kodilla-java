package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            //adding 1 celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemp() {

        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }
        double averageTemp = sum/temperatures.getTemperatures().size();

        return averageTemp;
    }

    public double calculateMedianTemp() {

        Map<String, Double> resultMap = temperatures.getTemperatures();
        Collection<Double> values = resultMap.values();
        ArrayList<Double> valuesList = new ArrayList<>(values);
        double mediana = 0.0;
        double average = 0.0;

        Collections.sort(valuesList);

        if (valuesList.size() % 2 == 0) {

            average = valuesList.get(valuesList.size()/2) + valuesList.get((valuesList.size()/2) -1);
            mediana = average/2.0;
        } else {
            mediana = valuesList.get(valuesList.size() /2);
        }

        return mediana;

    }
}
