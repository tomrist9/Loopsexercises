public class Person {

    public String name;
    public String surname;
    public int age;
    public String gender;

    public int IQ;

    public String getName() {


        return name;
    }

    public void setName(String name) {
        if(name.length()>3||name.length()<32)
        this.name = name;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {

//        CharSequence female;
//        CharSequence male;
//        if(gender.contains(female, male)) {
//            this.gender = gender;
//        } else
//            System.out.println("not valid");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        for (int i=4;i<32;i++)
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age>0||age<250)

        this.age = age;
        else
            System.out.println("not valid");
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
}