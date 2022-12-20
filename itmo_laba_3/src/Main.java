import classAll.Syrup;
import exceptionsAll.AccidentException;
import exceptionsAll.AttackException;
import classAll.Donut;
import classAll.HumanDoctor;
import classAll.ServiceStaff;
import еnum.Incident;
import classAll.Working;
public class Main {

    public static void main(String[] args){
        Donut dount = new Donut();
        System.out.printf(dount.getName() + " ");
        dount.besiege(dount.generate());
        Syrup syrup = new Syrup();
        System.out.printf(syrup.getName() + " ");
        try {
            syrup.action();
        } catch (AttackException e) {
            System.out.println(e.getMessage());
        }
           dount.two();
           syrup.two();

        HumanDoctor humanDoctor = new HumanDoctor();
        try {
            humanDoctor.incident();
        }catch (AccidentException a){
            System.out.println(a.getMessage());
            System.exit(-1);
        }

        humanDoctor.heard(dount.generate());
        Working working = new Working();
        System.out.print(working.getName() + " ");
        working.action(dount.generate());
        humanDoctor.character(dount.generate());
        System.out.print(" " + humanDoctor.getName() + "a \n");
        ServiceStaff serviceStaff = new ServiceStaff();
        System.out.print(serviceStaff.getName());
        serviceStaff.chase();
        serviceStaff.chapter(dount.generate());
        System.out.print(humanDoctor.getName() + " ");
        humanDoctor.dressedUp(dount.generate());
        humanDoctor.pinceNez(dount.generate());
        humanDoctor.inShorts(dount.generate());
        humanDoctor.climbedUp(dount.generate());
        /*
        System.out.println(humanDoctor.toString());
        System.out.println(dount.toString());

         */
    }
}