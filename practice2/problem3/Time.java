package problem3;
public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }
    public String toUniversal() {
        StringBuilder sb = new StringBuilder();

        if (hour < 10) sb.append("0" + hour + ":");
        else sb.append(hour + ":");

        if (minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");

        if (second < 10) sb.append("0" + second);
        else sb.append(second);

        return sb.toString();
    }
    public String toStandard() {
        int h=hour;
        boolean isPM=false;
        if(h>=12){
            isPM=true;
            if(h>12) h-=12;
        }
        if(h==0) h=12;
        StringBuilder sb = new StringBuilder();
        if(h < 10) sb.append("0" + h + ":");
        else sb.append(h + ":");

        if(minute < 10) sb.append("0" + minute + ":");
        else sb.append(minute + ":");

        if(second < 10) sb.append("0" + second);
        else sb.append(second);

        sb.append(isPM ? " PM" : " AM");
        return sb.toString();
    }
    public Time add(Time other) {
        int newHour = this.hour + other.hour;
        int newMinute = this.minute + other.minute;
        int newSecond = this.second + other.second;

        if (newSecond >= 60) {
            newSecond -= 60;
            newMinute++;
        }
        if (newMinute >= 60) {
            newMinute -= 60;
            newHour++;
        }
        if (newHour >= 24) {
            newHour -= 24;
        }
        return new Time(newHour, newMinute, newSecond);
    }
}