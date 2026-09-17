class Temperature{
    public static void main(String[] args){
        String city = "Chennai";
        double celsius = 35.0;
        double fahrenheit = (celsius * 9 / 5) + 32;
        String weatherCondition = "Sunny";
        int humidity = 70;
        double windSpeed = 12.0;
        System.out.println("====================================");
        System.out.println(" WEATHER REPORT");
        System.out.println("====================================");
        System.out.println("\nCity : " + city);
        System.out.println("\nTemperature");
        System.out.println("------------------------------------");
        System.out.println("Celsius : " + celsius + "°C");
        System.out.println("Fahrenheit : " + fahrenheit + "°F");
        System.out.println("\nWeather Condition : " + weatherCondition);
        System.out.println("Humidity : " + humidity + "%");
        System.out.println("Wind Speed : " + windSpeed + " km/h");
        System.out.println("\n ====================================");
    }
}