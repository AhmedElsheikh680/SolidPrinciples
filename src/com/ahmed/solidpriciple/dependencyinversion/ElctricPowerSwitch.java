/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.solidpriciple.dependencyinversion;

/**
 *
 * @author SMARTCS
 */
public class ElctricPowerSwitch implements Swithchable{
public Swithchable switchable;
public boolean on;

    public ElctricPowerSwitch(Swithchable switchable) {
        this.switchable = switchable;
        this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
     public void press(){
        boolean checkOn = isOn();
        if(checkOn) {
            switchable.turnOff();
            this.on=false;
        } else {
            switchable.turnOn();
            this.on=true;
        }
    }
    @Override
    public void turnOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void turnOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
