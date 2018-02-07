package sorrawich.week2;

public class Month {
    private String[] monthNames;
    private int[] days;

    public Month() {
        this.monthNames = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        this.days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public Month(String[] monthNames) {
        this.monthNames = monthNames;
    }

    public Month(String[] monthNames, int[] days) {
        this.monthNames = monthNames;
        this.days = days;
    }

    public static void main(String[] args) {
        Month month = new Month();
        System.out.println(month.toString());
    }

    public int findDaysOfMonth(int month) {
        return (month > 0 && month <= 12)
                ? days[month-1]
                : -1;
    }
    
    public String findNameOfMonth(int month) {
        return (month > 0 && month <= 12)
                ? this.monthNames[month-1]
                : null;
    }

    public String[] reverseMonthName() {
        String[] reversedMonthName = new String[monthNames.length];

        for(int i = 1; i < monthNames.length+1; i++) {
            reversedMonthName[i-1] = monthNames[monthNames.length-i];
        }
        return reversedMonthName;
    }

    @Override
    public String toString() {
        String response = "";
        for(int i = 0; i < monthNames.length; i++) {
            response += String.format("%s %d days\n", monthNames[i], days[i]);
        }
        return response;
    }
}
