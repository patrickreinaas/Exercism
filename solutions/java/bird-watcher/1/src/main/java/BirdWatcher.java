
class BirdWatcher {

    private final int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    // returns last week's count of birds (the whole array, arranged from oldest to newest day)
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    // returns today's count of birds (7th element in the array's value)
    public int getToday() {
        return birdsPerDay[6];
    }

    // increments today's count of birds by one (7th element in the array)
    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    // returns true if there was a day without birds in the last week
    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    // returns the total number of birds, in the range of 0 and the number of days passed as a parameter
    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;

        if (numberOfDays > 7) {
            numberOfDays = 7;
        }

        for (int i = 0; i <= (numberOfDays-1); i++) {
            totalBirds += birdsPerDay[i];
        }
        return totalBirds;
    }

    // returns the number of busy days (days when 5 or more birds are seen)
    public int getBusyDays() {
        int busyDays = 0;

        for (int i : birdsPerDay) {
            if (i >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}