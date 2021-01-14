package classes.competicoes;

public class Schedule {
    private int day, month, year;
    private String currentDate, dayText, monthText;

    public Schedule() {
        this.day = 10;
        this.month = 1;
        this.year = 2021;           
        this.check();
        this.currentDate = String.format("%s/%s/%d", dayText, monthText, year);
    }
    private void check() {
        if (day < 10) {
          this.dayText = "0" + this.day;          
        } else {
            this.dayText = "" + day;
        }
        if (month < 10) {
            this.monthText = "0" + this.month;
        }else {
            this.monthText = "" + month;
        }
        
    }

    public String getCurrentDate(){
        return currentDate;
    }
    
    public String getNextDate() {
        day += 7;
        if (day > 28) {
            month+= 1;
            this.day = 1;
        }
        check();
        currentDate = String.format("%s/%s/%d", dayText, monthText, year);
        return currentDate;
    }
}
