class SpaceAge {
    double seconds;
    final double earthSeconds = 31557600;
    final double mercurySeconds = 0.2408467;
    final double venusSeconds = 0.61519726 ;
    final double marsSeconds = 1.8808158;
    final double jupiterSeconds = 11.862615;
    final double saturnSeconds = 29.447498;
    final double uranusSeconds = 84.016846;
    final double neptuneSeconds = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        double output = this.seconds / this.earthSeconds;
        return output;
    }

    double onMercury() {
        double output = this.seconds / ( this.earthSeconds * this.mercurySeconds);
        return output;
    }

    double onVenus() {
        double output = this.seconds / ( this.earthSeconds * this.venusSeconds);
        return output;
    }

    double onMars() {
        double output = this.seconds / ( this.earthSeconds * this.marsSeconds);
        return output;
    }

    double onJupiter() {
        double output = this.seconds / ( this.earthSeconds * this.jupiterSeconds);
        return output;
    }

    double onSaturn() {
        double output = this.seconds / ( this.earthSeconds * this.saturnSeconds);
        return output;
    }

    double onUranus() {
        double output = this.seconds / ( this.earthSeconds * this.uranusSeconds);
        return output;
    }

    double onNeptune() {
        double output = this.seconds / ( this.earthSeconds * this.neptuneSeconds);
        return output;
    }

}
