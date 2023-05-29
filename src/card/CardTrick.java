*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Name: Ravneet Kaur
//Student ID: 991708968


package card;

import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner scan =new Scanner(System.in);
        
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]);
            
            magicHand[i]=c;
            System.out.println("Random card"+magicHand[i].getSuit()+""+magicHand[i].getValue());
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter the value of Choice");
        int userValue =scan.nextInt();
        
        System.out.println("Enter the suit of Choice");
        String userSuit=scan.next();
        
        
       
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            if(userValue==magicHand[i].getValue() ||userSuit.equals(magicHand[i].getSuit())){
                System.out.println("Card Matches");
            }
            else {
                System.out.println("Card does not match");
            }
        }
        
        //Then report the result here
    }
    
}