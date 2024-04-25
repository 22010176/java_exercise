package Chuong3;

public class DateTime {
    private int year;
    private Months month;
    private int date;

    DateTime(int year, int month, int date) {
        this.year = year;
        setMonth(month);
        this.date = date;
    }

    DateTime(String date) {
        String[] temp = date.split(" ");
        this.year = Integer.parseInt(temp[0]);
        setMonth(temp[1]);
        this.date = Integer.parseInt(temp[2]);
    }

    public void setMonth(Months month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        switch (this.month) {
            case JANUARY:
                return 1;
            case FEBRUARY:
                return 2;
            case MARCH:
                return 3;
            case APRIL:
                return 4;
            case MAY:
                return 5;
            case JUNE:
                return 6;
            case JULY:
                return 7;
            case AUGUST:
                return 8;
            case SEPTEMBER:
                return 9;
            case OCTOBER:
                return 10;
            case NOVEMBER:
                return 11;
            case DECEMBER:
                return 12;
            default:
                return 0;
        }
    }

    public void setMonth(String month) {
        switch (month.toUpperCase()) {
            case "JANUARY":
            case "JAN":
                setMonth(Months.JANUARY);
                break;
            case "FEBRUARY":
            case "FEB":
                setMonth(Months.FEBRUARY);
                break;
            case "MARCH":
            case "MAR":
                setMonth(Months.MARCH);
                break;
            case "APRIL":
            case "APR":
                setMonth(Months.APRIL);
                break;
            case "MAY":
                setMonth(Months.MAY);
            case "JUNE":
            case "JUN":
                setMonth(Months.JUNE);
            case "JULY":
            case "JUL":
                setMonth(Months.JULY);
                break;
            case "AUGUST":
            case "AUG":
                setMonth(Months.AUGUST);
                break;
            case "SEPTEMBER":
            case "SEP":
                setMonth(Months.SEPTEMBER);
                break;
            case "OCTOBER":
            case "OCT":
                setMonth(Months.OCTOBER);
                break;
            case "NOVEMBER":
            case "NOV":
                setMonth(Months.NOVEMBER);
                break;
            case "DECEMBER":
            case "DEC":
                setMonth(Months.DECEMBER);
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

    public void setMonth(int month) {
        switch (month) {
            case 1:
                setMonth(Months.JANUARY);
                break;
            case 2:
                setMonth(Months.FEBRUARY);
                break;
            case 3:
                setMonth(Months.MARCH);
                break;
            case 4:
                setMonth(Months.APRIL);
                break;
            case 5:
                setMonth(Months.MAY);
            case 6:
                setMonth(Months.JUNE);
            case 7:
                setMonth(Months.JULY);
                break;
            case 8:
                setMonth(Months.AUGUST);
                break;
            case 9:
                setMonth(Months.SEPTEMBER);
                break;
            case 10:
                setMonth(Months.OCTOBER);
                break;
            case 11:
                setMonth(Months.NOVEMBER);
                break;
            case 12:
                setMonth(Months.DECEMBER);
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

    public void print() {
        System.out.printf("%d/%d/%d", this.date, getMonth(), this.year);
    }

}
