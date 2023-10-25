public class numberPhone {
    public static void main(String[]args){
        person person1 = new person("Will", "Smith", "New York", "2936729462846");
        person person2 = new person("Jackie", "Chan", "Shanghai", "12312412412");
        person person3 = new person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
}


}
