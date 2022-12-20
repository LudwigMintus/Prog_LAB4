package classAll;

import absClass.HumanAbs;
import еnum.Gender;
import еnum.Eat;
import interfaceAll.Interaction;
import java.util.Objects;

public class Donut extends HumanAbs implements Interaction{
    private Food eats;

    public Donut() {
        super("Пончик",Gender.MAN,185);
        this.eats = new Food();
    }

    public Donut(String name, Gender gender, int height) {
        super("name",gender,height);
    }

    public boolean generate() {
        return (Math.random() * 2 > 1);
    }

    public void besiege(boolean a) {
        if (a) {
            System.out.print("осаждал палатку с пирогами и конфетами \n");
        } else {
            this.eats.generateEat();
            System.out.print("осаждал палатку с пирогами и конфетами " + eats.getEat() + "\n");
        }
    }


    public static class Food { // СТАТИЧЕСКИЙ
        private Eat eat;
        public Eat getEat() {
            return eat;
        }
        public void generateEat() {
            if (Math.random() * 2 > 1) {
                eat = Eat.EAT;
            } else eat = Eat.SPOIL;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donut donut = (Donut) o;
        return (getGender().equals(donut.getGender()) &&
                getHeight() == donut.getHeight() &&
                getName().equals(donut.getName()));
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
        System.out.print("Обоих невозможно было ");
    }

}
