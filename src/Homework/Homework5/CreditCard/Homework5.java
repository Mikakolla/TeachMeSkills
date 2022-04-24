package Homework.Homework5.CreditCard;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        testMethod();

    }

    public static void addMoneyOnCard(CreditCard card) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите сумму, которую хотите добавить на карту: ");

        Integer addMoney = console.nextInt();

        card.setCurrentAccount((card.getCurrentAccount() != null ? card.getCurrentAccount() : 0) + addMoney);

        System.out.println("Текущий счет на карте: " + card.getCurrentAccount());

    }

    public static void withdrawMoneyOnCard(CreditCard card) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите сумму, которую хотите снять с карты: ");

        Integer withdrawMoney = console.nextInt();

        card.setCurrentAccount((card.getCurrentAccount() != null ? card.getCurrentAccount() : 0) - withdrawMoney);

        System.out.println("Текущий счет на карте: " + card.getCurrentAccount());
    }

    public static void infAboutCard(CreditCard card){

        System.out.printf("Номер карты: %s %nТекущий счет: %s %n", card.getCardNumber(), card.getCurrentAccount());
    }

    public static void testMethod(){

        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        addCardNumberAndCurrentAccount(card1);
        addCardNumberAndCurrentAccount(card2);
        addCardNumberAndCurrentAccount(card3);

        addMoneyOnCard(card1);
        addMoneyOnCard(card2);
        withdrawMoneyOnCard(card3);

        infAboutCard(card1);
        infAboutCard(card2);
        infAboutCard(card3);

    }

    public static void addCardNumberAndCurrentAccount(CreditCard card){

        Scanner console = new Scanner(System.in);

        System.out.println("Введите номер карты");

        Integer numberCard = console.nextInt();

        System.out.println("Введите текущий счет карты");

        Integer currentAccount = console.nextInt();

        card.setCardNumber(numberCard);
        card.setCurrentAccount(currentAccount);

    }

}