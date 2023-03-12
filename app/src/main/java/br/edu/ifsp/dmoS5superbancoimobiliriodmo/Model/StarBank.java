package br.edu.ifsp.dmoS5superbancoimobiliriodmo.Model;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class StarBank {

    private static StarBank instance = null;

    private StarBank(){}

    StarBank getInstance(){

        if(instance == null){
            instance = new StarBank();
        }

        return instance;
    }

    List<CreditCard> startCreditCard(){

        ArrayList<CreditCard> cards = new ArrayList<>();

        for (int i=0;i<6;i++){
            cards.set(0, new CreditCard(i,15000));
        }

        return cards;
    }

    void roundCompleted(CreditCard card, double value){

    }

    void transfer(CreditCard payer, CreditCard receiver,double value ){

        boolean payerActive = pay(payer, value);

        if(payerActive){
            receiver.creditValue(value);
        }
    }

    void receive(CreditCard card, double value){

        card.creditValue(value);
    }

    public boolean pay(CreditCard card,double value){

        return !(card.getBalance() < value);
    }
}
