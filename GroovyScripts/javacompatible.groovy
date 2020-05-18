import java.text.*

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
sdf.setTimeZone(TimeZone.getTimeZone("IST"))

println "Hello World now: " + sdf.format(new Date())

//gradle analyses the script fully before executing so it's 
//okay to call the function before declaring 
sayHelloWorld()

void sayHelloWorld(){
    println "Hello World!"
}

int doubleIt(int i)// can also be declared as def doubleIt() or Integer doubleIt to introduce typesafety{
    //return statement is missing so last statement is returned
    i*3
    def y=i //this y will get returned even if it is a assignment
}


println doubleIt(2)