package com.anita.daily.adapter2;

public class MobilePhoneCharger implements Target{

    private ElectricSocket electricSocket = new ElectricSocket();
    @Override
    public Volt getVolt() {
        Volt volt = electricSocket.getVolt();
        Volt convertedVolt = convertVoltage(volt,34);
        return convertedVolt;
    }

    private Volt convertVoltage(Volt volt,int i){

        return new Volt(volt.getVolts()/i);

    }
}
