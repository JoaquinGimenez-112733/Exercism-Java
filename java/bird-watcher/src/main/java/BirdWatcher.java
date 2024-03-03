
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] count = {0, 2, 5, 3, 7, 8, 4};
        return count;
    }

    public int getToday() {
        int lastIndex = this.birdsPerDay.length - 1;
        return this.birdsPerDay[lastIndex];
    }

    public void incrementTodaysCount() {
        int lastIndex = this.birdsPerDay.length - 1;
        this.birdsPerDay[lastIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean noBirds = false;
        for(int c : this.birdsPerDay){
            if(c == 0){
                noBirds = true;
            }
        }
        return noBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int index = 0;
        for(int c : this.birdsPerDay){
            if(index == numberOfDays){
                break;
            }
            count += c;
            index++;
        }

        return count;
    }

    public int getBusyDays() {
        int count = 0;

        for(int c: this.birdsPerDay){
            if(c >= 5) {
                count++;
            }

        }
        return count;
    }
}
