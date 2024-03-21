package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int newGear = 1;

        newSpeed = getCurrentSpeed()+rate;
//        System.out.println("the currentSpped is:"+getCurrentSpeed());
//        System.out.println("The NewSpeed is:"+newSpeed);

        if(newSpeed <= 0) {
            //Stop the car, set gear as 1
            stop();
            setCurrentGear(newGear);
        }
        //for all other cases, change the gear accordingly
        else if(newSpeed>=1 && newSpeed<=50){
            newGear=1;
            setCurrentGear(newGear);
        }else if(newSpeed>=51 && newSpeed<=100){
            newGear=2;
            setCurrentGear(newGear);
        }else if(newSpeed>=101 && newSpeed<=150){
            newGear=3;
            setCurrentGear(newGear);
        }else if(newSpeed>=151 && newSpeed<=200){
            newGear=4;
            setCurrentGear(newGear);
        } else if(newSpeed>=201 && newSpeed<=250) {
            newGear=5;
            setCurrentGear(newGear);
        }else if(newSpeed>250){
            newGear=6;
            setCurrentGear(newGear);
        }

        changeGear(newGear);

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

