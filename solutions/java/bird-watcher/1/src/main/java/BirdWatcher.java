
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastweek = {0,2,5,3,7,8,4};
        return lastweek;
    }

    public int getToday() {
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
      birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i] ==0){
                return true;
            
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit;
         if(numberOfDays > birdsPerDay.length){
            limit = 7;
        }else{
            limit = numberOfDays;
        }
        
        for(int i=0;i<limit;i++){
           sum += birdsPerDay[i];
      }
       
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i] >=5){
                busyDays++;
            }
        }
        return busyDays;
    }
}
