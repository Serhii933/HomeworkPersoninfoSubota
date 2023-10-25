public class person {
    String name;
    String surname;
    String city;
    String phone;
    public person (String name,String surname,String city,String phone){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }
    public String personInfo(){
        return "Зателефонувати громадянинові " + name + " " + surname + " з міста " + city + " можна за номером " + phone + ".";
    }

}
