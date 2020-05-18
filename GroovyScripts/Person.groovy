class Person{
    String name
    Integer age

    Person(name,age){
        this.name = name
        this.age = age
    }

    def increaseAge(Integer years){
        this.age += years
    }

    static void main(String[] args){
        Person p= new Person("Mandar",10)
        p.increaseAge 16

        println p.name+" "+p.age
    }
}
