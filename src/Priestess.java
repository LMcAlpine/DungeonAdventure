/**
 * @author Lucas Dahl - LDahl
 * @version 1.0
 *
 *
 */
public class Priestess extends Hero {

    // **************************** Fields ****************************

    private final String MY_SPECIAL_SKILL;
    private final double MY_HEAL_RANGE;

    // ************************** Constructors ************************

    /**
     *  This is the default constructor
     */
    public Priestess() {
        super("Priestess", 75, 5, 0.7, 25, 45, 0.3, 1);
        MY_SPECIAL_SKILL = "Heal";
        MY_HEAL_RANGE = 1;
    }

    // **************************** Methods ***************************

    /**
     *  This method will heal the Priestess
     *  with a random value from 1 - 100;
     */
    public void heal() {
        super.setHealth(super.getHealth() + healPoints());
    }

    //========
    // Getters
    //========

    /**
     *  This method will return the special skill.
     *
     * @return the name of the special skill
     */
    public String getMySpecialSkill() {
        return MY_SPECIAL_SKILL;
    }

    // The amount of heal points the Priestess will heal
    private double healPoints() {
        return getMyRandomRange(1, 100);
    }

    //=================
    // Override Methods
    //=================

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void attackBehavior(final DungeonCharacter theOther) {
        super.attackBehavior(theOther);
    }
}
