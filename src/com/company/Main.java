package com.company;

public class Main {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.BELARUS) {
                hen = new BelarusianHen();
            }
            if (country == Country.RUSSIA) {
                hen = new RussianHen();
            }
            if (country == Country.UKRAINE) {
                hen = new UkrainianHen();
            }
            if (country == Country.MOLDOVA) {
                hen = new MoldovanHen();
            }
            return hen;
        }
    }
}