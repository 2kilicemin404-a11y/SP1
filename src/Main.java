
    void main () {
        String navn = "Ragnar";

        int healthPoints = 85;

        int maxHealth = 100;

        int level = 5;

        int experience = 2300;

        double gold = 156.50;

        boolean alive = true;

        String klasse = "Warrior";

        System.out.println("****Character****");
        System.out.println("Navn: " + navn);
        System.out.println("klasse: " + klasse);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("experience: " + experience);
        System.out.println("lvl: " + level);
        System.out.println("gold: " + gold);
        System.out.println("alive: " + alive);

        String[] characterItems = {"-Sword", "-Dagger", "-Shield"};

        String inventoryText = " ";

        for (int i = 0; i < characterItems.length; i++) {
            inventoryText = inventoryText + characterItems[i];
            inventoryText = inventoryText + "\n";

            System.out.println("Ragnars invetory:");
            System.out.println(inventoryText);

        }


        if (healthPoints <= 0.25 * maxHealth) {
            System.out.println("WARNING: Health critical!");
        } else if (healthPoints <= 0){

            alive = false;
            System.out.println("Alive: " + alive);
        }

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
                System.out.println("Classes: " );
        }
        if (experience >= 1000 * level){
            System.out.println("Ready to level up!");
        }else {
            System.out.println("Not ready to level up!");

        }
        int numberOfItems = characterItems.length;
        System.out.println("Invetory (items): = " + numberOfItems);

        for (String item : characterItems){
            System.out.println( item);
        }

        int incomingDamage = 30;

        healthPoints = healthPoints - incomingDamage;
        System.out.println("Ragnar took damage! new health: " + healthPoints);

        if (healthPoints >0) {
            System.out.println("Ragnar is still alive!");
        }else{
            System.out.println("Ragnar is dead! " + "Game over");
        }


    }








    //metoder begynder

    String navn = "Ragnar";

    int healthPoints = 85;

    int maxHealth = 100;

    int level = 5;

    int experience = 2300;

    double gold = 156.50;

    boolean alive = true;

    String klasse = "Warrior";

    void printCharacterSheet() {
        System.out.println("****Character****");
        System.out.println("Navn: " + navn);
        System.out.println("klasse: " + klasse);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("experience: " + experience);
        System.out.println("lvl: " + level);
        System.out.println("gold: " + gold);
        System.out.println("alive: " + alive);
    }


    void takeDamage(int amount){
        int incomingDamage = 30;

        healthPoints = healthPoints - incomingDamage;
        System.out.println("Ragnar took damage! new health: " + healthPoints);

        if (healthPoints >0) {
            System.out.println("Ragnar is still alive!");
        }else{
            System.out.println("Ragnar is dead! " + "Game over");
        }

    }

    void heal(int amount){
        healthPoints= healthPoints + amount;

        if (healthPoints > maxHealth);{
            healthPoints=maxHealth;
        }
        System.out.println(navn + " healed for " + amount + " HP.");
        System.out.println("Current health: " + healthPoints + "/" + maxHealth);

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


}