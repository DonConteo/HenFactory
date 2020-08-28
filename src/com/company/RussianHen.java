package com.company;

public class RussianHen extends Hen implements Country {

    public int getCountOfEggsPerMonth() {
        return 150;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
