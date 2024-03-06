class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (!fighter.isVulnerable()) {
            return 6;
        } else {
            return 10;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter {

    boolean spellPrepared;

    @Override
    boolean isVulnerable() {
        if (this.spellPrepared) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (this.spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }
}