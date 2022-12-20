package classAll;

import absClass.HumanAbs;
import interfaceAll.Interaction;
import еnum.Gender;
import java.util.Objects;
import exceptionsAll.AttackException;

public class Syrup extends HumanAbs implements Interaction {
   public Attack attack;
    public Syrup() {
        super("Сиропчик",Gender.MAN,185);
        this.attack = new Attack();
    }
    public Syrup(String name, Gender gender, int height) {
        super(name,gender,height);
    }
    public boolean generate() {
        return (Math.random() * 2 > 1);

    }
    public void action() throws AttackException {
        this.attack.atected(generate());
    }
    public class Attack { // не статический
        Attack(){};
        public int crush(){
            int count;
            System.out.print("Поломал палатку и разлил");
            return count = ((int) (Math. random() * 10) + 1);
        }
        public void atected(boolean a) throws AttackException {
            if (a) {
                System.out.print(" " + crush() + " стаканов газированной воды\n");
            } else {
                    throw new AttackException("Напал на газированную воду с сиропом");
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Syrup syrup = (Syrup) o;
        return (getGender().equals(syrup.getGender()) &&
                getHeight() == syrup.getHeight() &&
                getName().equals(syrup.getName()));
    }

    @Override
    public String toString() {
        return "\nName: " + this.getName() + "\nEnum.Gender: " + this.getGender() + "\nHeight: " + this.hashCode();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + this.getGender().hashCode() + this.getHeight();

    }

    @Override
    public void two() {
        System.out.print("отогнать от палаток\n");
    }
}