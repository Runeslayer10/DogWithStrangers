/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dogwithstrangers;

/**
 *
 * @author blhad3491
 */
public class DogWithStrangers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Dog dog1 = new Dog("Bowser", "German Shepherd");
    //some data for the dog
    System.out.println(dog1.getName() + ": ");
    System.out.println("Aggression: " + dog1.getAggression());
    System.out.println("Hunger: " + dog1.getHunger());
    //dog meets stranger
    System.out.println("Hey there doggie. Nice doggie...");

    //dog responds to stranger
    if (dog1.getAggression() > 5) {
      //dog1 is aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkAngry();
      System.out.println("Slowly back away...");
      //what if dog is cranky from hunger?
      if (dog1.getHunger() > 7) {
        System.out.println("Hungry dog bares teeth...");
        dog1.barkAngry();
        System.out.println("Time to run!");
      }
    } else {
      //dog is friendly... so is the meeting
      System.out.print(dog1.getName() + ": ");
      dog1.barkFriendly();
      System.out.println("Good doggie... *you pet dog*");
    }
  }
}
