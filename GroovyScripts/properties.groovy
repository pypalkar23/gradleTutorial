class Person{
    String name
    Integer age

    Person(name,age){
        this.name = name
        this.age = age
    }
    //there aren't any getters and setters because groovy implements them for us
}


def p1 = new Person("Fred",35)
println p1.age 
/*Looks like we are directly accessing the instance variable but under the hood it's being accessed via
getter setters hence making them properties rather than instance variable*/

//Conventional notation
Map m = new HashMap();
m.put("foo","Fred")
println m.get("foo")


//property syntax
//for setting
m.foo ="bill"
m.bar ="Jane"
m.baz ="Dave"

//for getting
println m.foo
println m.bar
println m.baz