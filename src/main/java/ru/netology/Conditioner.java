package ru.netology;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    //set perametrs
    public void setName(String name) {
        this.name = name;
    }

    //включение или отключение кондея
    public void setOn(boolean on) {
        this.on = on;
    }

    //максимальная устанавливаемая температурa
    public void setMaxTemperature ( int maxTemperature){
        this.maxTemperature = maxTemperature;
    }

    //максимальная устанавливаемая температура
    public void setMinTemperature ( int minTemperature){
        this.minTemperature = minTemperature;
    }
    //установка рабочей температуры
    public void setCurrentTemperature ( int currentTemperature){
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature--;
    }

    public int getCurrentTemperature () {
        return currentTemperature;
    }



}
