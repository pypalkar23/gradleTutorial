def string1="This is a String" // double quotes
println string1

def string2='This is also a string' // single quotes
println string2

def mulLineString="""A 
multiline String
in groovy"""

println mulLineString

//String interpolation
def a=16;
println "This is a $a"

def name="Mandar"
println "Another example of String interpolation ${name.toUpperCase()}" // can run functions on them

def name1="SomeOtherGuy"
println 'Interpolation does\'nt work in single quoted strings $name1'
