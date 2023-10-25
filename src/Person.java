public class Person {
    String name;
    String surname;
    String city;
    String phone;
    public Person (String name,String surname,String city,String phone){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }
    public String personInfo(){
        return "Зателефонувати громадянинові " + name + " " + surname + " з міста " + city + " можна за номером " + phone + ".";
    }

}
