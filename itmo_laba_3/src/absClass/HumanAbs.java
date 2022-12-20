package absClass;
import interfaceAll.HumanInt;
import еnum.Gender;
public abstract class HumanAbs {
    private String name;
    private Gender gender;
    private int height;

    protected  HumanAbs( String name,Gender gender,int height){
        this.name = name;
        this.gender = gender;
        this.height = height;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

}
