package play;

import java.util.Random;

public class Truck {
    
    // constants
    final int NUMBER_OF_WHEELS = 4;
    final int INITIAL_VOLUME = 5;
    final int MAX_SPEED = 120;

    // attributes
    private String color = "";
    private int numOfSpeakers = 0;

    // declare and size array
    private double[] airPressure = new double[NUMBER_OF_WHEELS];

    // declare but dont size array yet (will size it when we set number of speakers)
    private int[] speakerVolume;

    // default (no-arg) constructor 
    public Truck() {

    }

    // setters
    public void setColor(String borrowedColor) {
        color = borrowedColor;
    }

    public void setnumberOfSpeakers(int borrowedNumOfSpeakers) {
        numOfSpeakers = borrowedNumOfSpeakers;

        // we can size the array now that we know how many we have
        speakerVolume = new int[numOfSpeakers];

        //intialize each speaker volume
        int localCounter = 0;
        while (localCounter < speakerVolume.length) {
            speakerVolume[localCounter] = INITIAL_VOLUME;
            localCounter++;
        }
    }

    // getters
    public String getColor() {
        return color;
    }

    public int getRandomSpeed(int borrowedMaxSpeed) {
        Random randomSpeed = new Random();
        return randomSpeed.nextInt(borrowedMaxSpeed);
    }





}