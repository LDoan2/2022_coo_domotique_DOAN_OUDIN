import thermos.Thermostat;

public class ThermostatAdaptater implements Appareil{

    Thermostat thermostat;

    public ThermostatAdaptater(Thermostat t){
        this.thermostat = t;
    }

    @Override
    public void allumer() {
        thermostat.baisserTemperature();
    }

    @Override
    public void eteindre() {
        thermostat.baisserTemperature();
    }


}
