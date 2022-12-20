package classAll;
import absClass.HumanAbs;
import interfaceAll.HumanInt;
import еnum.Gender;

public class Working extends HumanAbs implements HumanInt {
    public Working() {
        super("Работавшие",Gender.MAN,185);
    }

    public Working(String name, Gender gender, int height) {
        super(name,gender,height);
    }

    @Override
    public void action( boolean see) {
        if (see){
            System.out.print("увидели в конце улицы");
        }
        else{
            System.out.print("услышали в конце улицы");
        }
    }
}
