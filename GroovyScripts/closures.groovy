//declared using curly brackets
def echoIt = {}

//if no param passed it has an unnamed param names 'it'
def echoItNoParam={
    it //returns the unnamed parameter it
}

println echoItNoParam("Hello World");

def echoItWithParam={x->
    println x
}

echoItWithParam("With Param call") // Just executes the function

println echoItWithParam("With param call as well printing returning value")
//prints string as well as return value which is null in this case

//can be defined explicitly Closure types using Closure keyword
Closure echoWithMultiParam={x,y,z->
    println x
    println y
    println z
    4
}

println echoWithMultiParam("a","b","c")
//prints strings as well as returns value 4

def fibonacciPrint(){
    Integer prev=1
    Integer current=1

    def inner={
        Integer temp=prev
        prev = current
        current = current + temp
        temp
    }

}

printFib= fibonacciPrint()
println printFib()
println printFib()
println printFib()
def temp = 5
println printFib()

class Person{
    String theName
    Integer theAge

    Person(theName,theAge){
        this.theName = theName
        this.theAge = theAge
    }

    def executeInside(Closure c){
        c.delegate = this
        c()
    }
}

def p1= new Person("Mandar",26)
def a=p1. executeInside({
    println theName
})
def theName="dipesh"
a()
theName="sfSf"
a()