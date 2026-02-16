// opgave 1
//            String navn = "Ragnar";
//            int healthPoints = 85;
//
//            int maxHealth = 100;
//
//            int level = 5;
//
//            int experience = 2300;
//
//            double gold = 156.50;
//
//            boolean alive = true;
//
//            String klasse = "Warrior";
//
//            System.out.println("****Character****");
//            System.out.println("Navn: " + navn);
//            System.out.println("klasse: " + klasse);
//            System.out.println("Health: " + healthPoints + "/" + maxHealth);
//            System.out.println("experience: " + experience);
//            System.out.println("lvl: " + level);
//            System.out.println("gold: " + gold);
//            System.out.println("alive: " + alive);

//            String[] characterItems = {"-Sword", "-Dagger", "-Shield"};

//            String inventoryText = " ";
//
//            for (int i = 0; i < characterItems.length; i++) {
//                inventoryText = inventoryText + characterItems[i];
//                inventoryText = inventoryText + "\n";
//
//                System.out.println("Ragnars invetory:");
//                System.out.println(inventoryText);
//
//            }

// opgave 2
//            if (healthPoints <= 0.25 * maxHealth) {
//                System.out.println("WARNING: Health critical!");
//            } else if (healthPoints <= 0){
//
//                alive = false;
//                System.out.println("Alive: " + alive);
//            }

//            switch (klasse) {
//                case "Warrior":
//                    System.out.println("Ragnar has a sword!");
//                    break;
//                case "Mage":
//                    System.out.println("Ragnar has a wand!");
//                    break;
//                case "Rogue":
//                    System.out.println("Ragnar has a dagger!");
//                    break;
//
//                default:
//                    System.out.println("Classes: ");
//            }
//            if (experience >= 1000 * level){
//                System.out.println("Ready to level up!");
//            }else {
//                System.out.println("Not ready to level up!");

//            }
//            int numberOfItems = characterItems.length;
//            System.out.println("Invetory (items): = " + numberOfItems);
//
//            for (String item : characterItems){
//                System.out.println( item);
//            }
//
//            int incomingDamage = 30;
//
//            healthPoints = healthPoints - incomingDamage;
//            System.out.println("Ragnar took damage! new health: " + healthPoints);
//
//            if (healthPoints >0) {
//                System.out.println("Ragnar is still alive!");
//            }else{
//                System.out.println("Ragnar is dead! " + "Game over");
//            }
//
//
//        }



//nu er alt oppe over, fjernet og // og metoderne er sat ind i main istedet.
//lavet opgave 1, 2 blive oppe over så du kan se hvad jeg har lavet evt.
void main () {
    printCharacterSheet();
    classSpeech();
    takeDamage(30);
    heal(20);
    addGold(1000);
    removeGold(0);
    addXP(500);
    isHealthCritical();
    isAlive();
    getHealthPercentage();
    printInventory();


    if(removeGold(100.00)){
        System.out.println("Bought a potion!");
    } else {
        System.out.println("Not enough gold!");
    }


    if(isHealthCritical()){
        System.out.println("WARNING: Health critical!");

    }
    System.out.println("Health: " + getHealthPercentage() + "%");
}

    //opgave 3 metoder begynder

    String navn = "Ragnar";

    int healthPoints = 85;

    int maxHealth = 100;

    int level = 5;

    int experience = 2300;

    double gold = 156.50;

    boolean alive = true;

    String klasse = "Warrior";

        String[] characterItems = {"-Sword", "-Dagger", "-Shield"};



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



