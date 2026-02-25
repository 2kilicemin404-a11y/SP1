public class Character {

  private String navn;
   private int healthPoints;
   private int maxHealth;
   private int level;
  private  int experience;
   private double gold;
   private boolean alive;
   private String klasse;
   private String[] characterItems;



   Character(String navn, int healthPoints, int maxHealth, int level, int experience, double gold, boolean alive, String klasse, String[]characterItems){
       this.healthPoints = healthPoints;
       this.maxHealth = maxHealth;
       this.level = level;
       this.experience = experience;
       this.gold = gold;
       this.alive = alive;
       this.klasse = klasse;
       this.characterItems = characterItems;
   }


    void printCharacterSheet() {
        System.out.println("===== CHARACTER SHEET ====");
        System.out.println("Navn: " + navn);
        System.out.println("klasse: " + klasse);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("experience: " + experience);
        System.out.println("lvl: " + level);
        System.out.println("gold: " + gold);
        System.out.println("alive: " + isAlive());


    }
    void classSpeech(){
        switch (klasse) {
            case "Warrior":
                System.out.println("Ragnar has a sword!");
                break;
            case "Mage":
                System.out.println("Ragnar has a wand!");
                break;
            case "Rogue":
                System.out.println("Ragnar has a dagger!");
                break;

            default:
                System.out.println("Classes: ");
        }
        System.out.println("====================");
    }


    void takeDamage(int amount){


        healthPoints = healthPoints - amount;
        System.out.println("Ragnar took damage! new health: " + healthPoints);

        if (healthPoints >0) {
            alive = true;
            System.out.println("Ragnar is still alive!");
        }else{
            alive = false;
            System.out.println("Ragnar is dead! " + "Game over");

        }

    }

    void heal(int amount){
        healthPoints= healthPoints + amount;

        if (healthPoints > maxHealth){
            healthPoints=maxHealth;
        }
        System.out.println(navn + " healed for " + amount + " HP.");
        System.out.println("Current health: " + healthPoints + "/" + maxHealth);
        System.out.println("====================");

    }


    void addGold(double amount){
        gold =  gold + amount;
        System.out.println("new gold earned!: " + gold);
    }
    boolean removeGold(double amount){
        if(gold >= amount) {
            gold = gold - amount;
            return true;

        }else {
            return false;

        }
    }
    void addXP(int amount){
        experience = experience + amount;
        if (experience >= 1000 * level){
            System.out.println("Ready to level up!");
            levelUp();
        }else {
            System.out.println("Not ready to level up!");
        }

    }

    void levelUp(){
        level++;
        experience = 0;
        maxHealth = maxHealth +20;
        System.out.println("Level increased!");
        System.out.println("Next level: " + level);
        System.out.println("New max health: " + maxHealth);
    }

    boolean isHealthCritical() {
        if (healthPoints <= 0.25 * maxHealth) {
            return true;

        } else {
            return false;

        }
    }

    boolean isAlive(){
        if (healthPoints > 0) {
            return true;
        }else {
            return false;
        }
    }


    double getHealthPercentage(){
        return (healthPoints * 100.0)/ maxHealth;


    }

    void printInventory(){
        int numberOfItems = characterItems.length;
        System.out.println("Invetory (items): = " + numberOfItems);

        for (String item : characterItems) {
            System.out.println(item);

        }
    }

}




