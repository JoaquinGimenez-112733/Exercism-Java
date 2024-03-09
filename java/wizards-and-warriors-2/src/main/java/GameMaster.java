public class GameMaster {


    public String describe(Character ch) {
        return String.format("You're a level %d %s with %d hit points.", ch.getLevel(), ch.getCharacterClass(), ch.getHitPoints());

    }


    public String describe(Destination d) {
        return String.format("You've arrived at %s, which has %d inhabitants.", d.getName(), d.getInhabitants());
    }

    public String describe(TravelMethod tm) {
        if (tm.toString().equals("HORSEBACK")) {
            return String.format("You're traveling to your destination on horseback.");
        } else {
            return String.format("You're traveling to your destination by walking.");
        }

    }

    public String describe(Character ch, Destination d, TravelMethod tm) {
        return String.format("%s %s %s", this.describe(ch), this.describe(tm), this.describe(d));
    }

    public String describe(Character ch, Destination d) {
        return String.format("%s %s %s", this.describe(ch), this.describe(TravelMethod.WALKING), this.describe(d));
    }
}
