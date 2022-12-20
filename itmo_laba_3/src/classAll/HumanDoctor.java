package classAll;

import absClass.HumanAbs;
import interfaceAll.CharacterState;
import еnum.Gender;
import еnum.Incident;
import interfaceAll.Heard;
import interfaceAll.Incidentes;
import exceptionsAll.AccidentException;

import java.util.Objects;

public class HumanDoctor extends HumanAbs implements Heard, CharacterState {
    private Incident incident;

    public HumanDoctor() {
        super("Пилюлькин", Gender.MAN, 185);
    }

    public HumanDoctor(String name, Gender gender, int height) {
        super(name, gender, height);
    }


    public void climbedUp(boolean fellBoolean) {
        class RunUp { //локальный класс

            public boolean getChance() {
                return Math.random() * 2 > 1;
            }

            public String runs() {
                if (getChance()) {
                    return "Подбежав к дереву ";
                }
                return "Стоя у дерева ";
            }

            public String climbed() {
                if (getChance()) {
                    return "быстро вскарабкался вверх ";
                }
                return "медленно лез вверх ";
            }

            public String fell(boolean a) {
                if (a) {
                    return " но упал" ;
                }
                return "и остался там на долго";
            }
        }
        RunUp run = new RunUp();
        System.out.println(run.runs() + run.climbed() + run.fell(fellBoolean));
    }

    public void dressedUp(boolean nu) {
        if (nu) {
            System.out.print("был совсем почти голый,");
        } else {
            System.out.print("был совсем голый,");
        }
    }

    public void pinceNez(boolean no) {
        if (no) {
            System.out.print("на нем были только пенсне ");
        } else {
            System.out.print("были только презервативы ");
        }
    }

    public void inShorts(boolean nu) {
        if (nu) {
            System.out.println("и короткие трусики ");
        } else {
            System.out.println("и трусики на голове ");
        }
    }

    public void incident() throws AccidentException { //ананим
        Incidentes inciden = new Incidentes() {
            @Override
            public void incidentDoctor() throws AccidentException {
                if (Math.random() * 3 > 1.3) {
                    System.out.println("Произошло " + Incident.HAPPENED);
                } else {
                    throw new AccidentException("Произошел "+Incident.FUROR);
                }
            }
        };
        inciden.incidentDoctor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanDoctor human = (HumanDoctor) o;
        return (getGender().equals(human.getGender()) &&
                getHeight() == human.getHeight() &&
                getName().equals(human.getName()));
    }

    @Override
    public String toString() {
        return "\nName: " + this.getName() + "\nEnum.Gender: " + this.getGender() + "\nHeight: " + this.hashCode();
    }

    @Override
    public int hashCode() {
       // return Objects.hashCode(this.getHeight() );
        return this.getName().hashCode() + this.getGender().hashCode() + this.getHeight();
    }

    @Override
    public void heard(boolean scream) {
        if (scream) {

            System.out.println("Послышались пронзительные крики ");
        } else {
            System.out.println("Пронзительные крики было слышно");
        }
    }

    @Override
    public void character(boolean condition) {
        if(condition) {
            System.out.print(" бегущего доктора ");
        }else{
            System.out.print(" идущего доктора ");
        }
    }
}




