 package hw0;

 /**
 * An Alien object extends the SpaceAlien class, implements the ZapsWithSlime interface
 * and stores additional information aliens.
 *  
 * @author Anastasiia Halchenko
 * @author Dickinson College
 * @version September 2024
 */

public class Alien extends SpaceAlien implements ZapsWithSlime {

    private String name;
    private String slimeColor;

    public Alien(String homePlanet, double distanceFromEarth, String initName, String initSlimeColor){
       super(homePlanet, distanceFromEarth);
       name = initName;   
       slimeColor = initSlimeColor;

    }

    public String doSlimeZap(int numHumans){
        if (numHumans == 1) {
            return "Zap!";
        } else {
            return "Zap Zap!";
        }
    }

    @Override
     public void doGreeting() {
        System.out.println("Hey form planet " + getHomePlanet() + ", " + getDistanceFromEarth() + " light years away. My name is "
        		+ name + " and my slime color is " + slimeColor);
    } 

    @Override
    public String slimeWholeEarth() {
        return "SLIME!";
    }

     public String getSlimeColor() {
        return slimeColor;
    }

    public void setSlimeColor(String newSlimeColor) {
        slimeColor = newSlimeColor;
    }
    
    
}