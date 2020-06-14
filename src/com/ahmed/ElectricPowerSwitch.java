/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed;

/**
 *
 * @author SMARTCS
 */
public class ElectricPowerSwitch {
    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb, boolean on) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
    public void press(){
        boolean checkOn = isOn();
        if(checkOn) {
            lightBulb.turnOff();
            this.on=false;
        } else {
            lightBulb.trunOn();
            this.on=true;
        }
    }
    
}
