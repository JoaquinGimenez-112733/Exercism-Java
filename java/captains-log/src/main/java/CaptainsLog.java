import java.util.Random;



class CaptainsLog {
    public enum PlanetaryClasses{
        D('D'), H('H'), J('J'), K('K'),
        L('L'), M('M'), N('N'),
        R('R'), T('T'), Y('Y');

        private final char index;

        PlanetaryClasses(char idx){
            this.index = idx;
        }

        public char getIndex(){
            return this.index;
        }

    }

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {

        PlanetaryClasses[] pc = PlanetaryClasses.values();
        int idx = random.nextInt(pc.length);
        return pc[idx].getIndex();
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d",1000 + random.nextInt(9000));
    }

    double randomStardate() {
        return 41000.0 + 1000 * random.nextDouble();
    }
}
