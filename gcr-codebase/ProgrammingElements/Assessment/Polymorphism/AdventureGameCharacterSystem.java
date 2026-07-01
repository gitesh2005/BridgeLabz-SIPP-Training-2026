package ProgrammingElements.Assessment.Polymorphism;

class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " performs a basic attack.");
    }
}

class Warrior extends GameCharacter {

    Warrior(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with a sword.");
    }
}

class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts a fireball spell.");
    }
}

class Archer extends GameCharacter {

    Archer(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots an arrow.");
    }
}

public class AdventureGameCharacterSystem {

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle Started!");
        System.out.println();

        for (GameCharacter character : characters) {
            character.performAttack();

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println();
        System.out.println("Battle Summary:");
        System.out.println("Warriors participated: " + warriorCount);
        System.out.println("Mages participated: " + mageCount);
        System.out.println("Archers participated: " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[5];

        characters[0] = new Warrior("Arthur");
        characters[1] = new Mage("Merlin");
        characters[2] = new Archer("Robin");
        characters[3] = new Warrior("Leon");
        characters[4] = new Mage("Gandalf");

        startBattle(characters);
    }
}