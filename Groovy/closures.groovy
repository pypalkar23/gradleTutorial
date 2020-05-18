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
