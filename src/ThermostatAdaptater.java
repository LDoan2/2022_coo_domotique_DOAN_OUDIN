import thermos.Thermostat;

public class ThermostatAdaptater implements Appareil{

    Thermostat t;

    @Override
    public void allumer() {
        this.t.baisserTemperature();
    }

    @Override
    public void eteindre() {
        this.t.baisserTemperature();
    }


}
