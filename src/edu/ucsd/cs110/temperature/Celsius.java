package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit f = new Fahrenheit((((this.getValue()*9)/5)) +32);
        return f;
    }

    public String toString()
    {
        // TODO: Complete this method
        return String.valueOf(this.getValue()) + " C";
    }
}