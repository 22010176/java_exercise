package Chuong3;

enum FormatType {
    _12, _24
};

public class Time {
    private int hour;
    private int minute;
    private int second;
    private FormatType type = FormatType._24;

    Time() {
        this(0, 0, 0, FormatType._12);
    }

    Time(int hour, int minute, int second, FormatType format) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.type = format;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour % 24;
    }

    public void setMinute(int minute) {
        if (minute > 60)
            setHour(minute / 60);
        this.minute = minute % 60;
    }

    public void setSecond(int second) {
        if (second > 60)
            setMinute(second / 60);
        this.second = second % 60;
    }

    public void setType(FormatType type) {
        this.type = type;
    }

    public void print() {
        boolean type = this.type == FormatType._12;
        System.out.printf("%2d:%2d:%2d %s\n", type ? this.hour % 12 : this.hour, this.minute, this.second,
                type ? (this.hour >= 12 ? "PM" : "AM") : "");
    }
}
