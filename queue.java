class queue{

    String name;
    int age;

    queue(String name, int age){

        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "PATIENT NAME: " + name + " | PATIENT AGE: " + age;
    }
}