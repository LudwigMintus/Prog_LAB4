package classAll;
import absClass.HumanAbs;
import interfaceAll.CharacterState;
import еnum.Gender;
public class ServiceStaff extends HumanAbs{
    public ServiceStaff() {
        super("Обcлуживающий персонал ", Gender.MAN,185);
    }

    public ServiceStaff(String name, Gender gender, int height) {
        super(name, gender,height);
    }
    public void chase(){
        System.out.print("больницы гнался за ним ");

    }
    public void chapter(boolean head){
        if (head) {
            System.out.print("во главе с Медуницей.\n");
        }else{
            System.out.print("во главе с воздухом.\n");
        }
    }


}
