package com.wang7liang.dto;

import java.util.Date;

/**
 * Created by wangqiliang on 17/4/11.
 */
public class Clock {
    // 时钟速度
    public static final int SPEED_1 = 1;
    public static final int SPEED_2 = 2;
    public static final int SPEED_4 = 4;

    private int hour;
    private int minute;
    private int second;

    private int speed;

    public Clock(){
        Date date = new Date();
        this.setHour(date.getHours());
        this.setMinute(date.getMinutes());
        this.setSecond(date.getSeconds());
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", speed=" + speed +
                '}';
    }
}
