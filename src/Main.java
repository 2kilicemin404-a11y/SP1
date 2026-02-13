
    void main () {
//Opgave 1
// Karakterens stats
        String navn = "Ragnar";

        int healthPoints = 85;

        int maxHealth = 100;

        int level = 5;

        int experience = 2300;

        double gold = 156.50;

        boolean alive = true;

        String klasse = "Warrior";

//Items i karakterens inventory
        String[] characterItems = {"Sword", "Dagger", "Shield"};


        System.out.println("****Character****");
        System.out.println("Navn: " + navn);
        System.out.println("klasse: " + klasse);
        System.out.println("Health: " + healthPoints + "/" + maxHealth);
        System.out.println("experience: " + experience);
        System.out.println("lvl: " + level);
        System.out.println("gold: " + gold);
        System.out.println("alive: " + alive);


        String inventoryText = "- ";


        for (int i = 0; i < characterItems.length; i++) {
            inventoryText = inventoryText + characterItems[i];
            inventoryText = inventoryText + "\n";

            System.out.println("Items");
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
                System.out.println("I got a sword");
                break;
            case "Mage":
                System.out.println("i got a wand");
                break;
            case "Rogue":
                System.out.println("I got a dagger");
                break;

            default:
                System.out.println("Classes: " );


        }
        if (experience >= 1000 * level){
            System.out.println("Ready to level up!");
        }else {
            System.out.println("Not ready to level up!");


        }
















    }







