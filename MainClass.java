package com.pioneers.$02conditions.ifcondition;

import java.util.Scanner;

public class Main {
    static final String ABDELHALIM_HAFEZ = "ABDELHALIM HAFEZ";
    static final String WARDA = "WARDA";
    static final String HAMADA_HILAL = "HAMADA HILAL";

    static final String GABAR = "GABAR";
    static final String BTLOMONY_LEH = "BTLOMONY_LEH";
    static final String ISM3ONY = "LW_ELAYAM_BTTKLM";
    static final String HATO_ELFLOS_2LY_3LEKO = "HATO ELFLOS 2LY 3LEKO";

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the song name: ");
        final String songName = scanner.nextLine().trim().toUpperCase();
        System.out.print("Please enter the singer name: ");
        final String singerName = scanner.nextLine().trim().toUpperCase();

        /*if (!songName.equalsIgnoreCase("Gabar")) {
            System.err.println("Sorry, I don't know this song 😭");
            return;
        }

        System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");*/


        /*if (GABAR.equals(songName) && ABDELHALIM_HAFEZ.equals(singerName)) {
            System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");
        } else if (BTLOMONY_LEH.equals(songName) && ABDELHALIM_HAFEZ.equals(singerName)) {
            System.out.println("Btlomony leh, lw 4oftom 3neh 7lweeeen ad 2eh ht2olo 2n43'ali w sohd el lyaly 7lween "
                    + "ad 2eh 💁🏾");
        } else if (ISM3ONY.equals(songName) && WARDA.equals(singerName)) {
            System.out.println("Lw el ayam bttklm kanet 2alet 3mlna a w aaaaaaaah w aaaaaah 🎤💃💃💃🏻");
        } else if (HATO_ELFLOS_2LY_3LEKO.equals(songName) && HAMADA_HILAL.equals(singerName)) {
            System.out.println("Hato el flos 2ly 3leki, ah yama aaah ah yaba de 3ela watya w nasaba 🕺🕺🕺🕺🕺🕺🕺🏼");
        } else {
            System.err.println("Sorry, I don't know the singer with the song 😭");
        }*/

        /*if (songName.equals("GABAR")) {
            System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");
            return;
        }

        if (songName.equals("BTLOMONY_LEH")) {
            System.out.println("Btlomony leh, lw 4oftom 3neh 7lweeeen ad 2eh ht2olo 2n43'ali w sohd el lyaly 7lween "
                    + "ad 2eh 💁🏾");
            return;
        }

        if (songName.equals("LW_ELAYAM_BTTKLM")) {
            System.out.println("Lw el ayam bttklm kanet 2alet 3mlna a w aaaaaaaah w aaaaaah 🎤💃💃💃🏻");
            return;
        }

        if (songName.equals("HATO ELFLOS 2LY 3LEKO")) {
            System.out.println("Hato el flos 2ly 3leki, ah yama aaah ah yaba de 3ela watya w nasaba 🕺🕺🕺🕺🕺🕺🕺🏼");
            return;
        }

        System.err.println("Sorry, I don't know this song 😭");*/

        /*if (GABAR.equals(songName)) {
            System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");
        } else if (BTLOMONY_LEH.equals(songName)) {
            System.out.println("Btlomony leh, lw 4oftom 3neh 7lweeeen ad 2eh ht2olo 2n43'ali w sohd el lyaly 7lween "
                    + "ad 2eh 💁🏾");
        } else if (ISM3ONY.equals(songName)) {
            System.out.println("Lw el ayam bttklm kanet 2alet 3mlna a w aaaaaaaah w aaaaaah 🎤💃💃💃🏻");
        } else if (HATO_ELFLOS_2LY_3LEKO.equals(songName)) {
            System.out.println("Hato el flos 2ly 3leki, ah yama aaah ah yaba de 3ela watya w nasaba 🕺🕺🕺🕺🕺🕺🕺🏼");
        } else {
            System.err.println("Sorry, I don't know the singer with the song 😭");
        }*/

        /*switch (songName) {
            case GABAR -> System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");
            case BTLOMONY_LEH -> {
                System.out.println("Btlomony leh, lw 4oftom 3neh 7lweeeen ad 2eh ht2olo 2n43'ali w " +
                        "sohd el lyaly 7lween ad 2eh 💁🏾");
                System.out.println("Fe moget 3ber wl 43r el 7rer 3l 5dod yhfhf w yrg3 yteeeer");
            }
            case ISM3ONY -> System.out.println("Lw el ayam bttklm kanet 2alet 3mlna a w aaaaaaaah w aaaaaah 🎤💃💃💃🏻");
            case HATO_ELFLOS_2LY_3LEKO -> System.out.println("Hato el flos 2ly 3leki, ah yama aaah ah yaba de " +
                    "3ela watya w nasaba🕺🕺🕺🕺🕺🕺🕺🏼");
            default -> System.err.println("Sorry, I don't know the singer with the song 😭");
        }*/


        final String salute = switch (songName) {
            case GABAR -> {
                System.out.println("Gbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaar Gbaaaaaar 🎤🎶");
                yield "🥸";
            }
            case BTLOMONY_LEH -> {
                System.out.println("Btlomony leh, lw 4oftom 3neh 7lweeeen ad 2eh ht2olo 2n43'ali w " +
                        "sohd el lyaly 7lween ad 2eh 💁🏾");
                System.out.println("Fe moget 3ber wl 43r el 7rer 3l 5dod yhfhf w yrg3 yteeeer");
                yield "🤭";
            }
            case ISM3ONY -> {
                System.out.println("Lw el ayam bttklm kanet 2alet 3mlna a w aaaaaaaah w aaaaaah 🎤💃💃💃🏻");
                yield "🙍🏻‍♀️";
            }
            case HATO_ELFLOS_2LY_3LEKO -> {
                System.out.println("Hato el flos 2ly 3leki, ah yama aaah ah yaba de " +
                        "3ela watya w nasaba🕺🕺🕺🕺🕺🕺🕺🏼");
                yield "🤡";
            }
            default -> {
                System.err.println("Sorry, I don't know the singer with the song 😭");
                yield "❌";
            }
        };

        System.out.println(salute);
    }
}
