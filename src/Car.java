//A class is a blueprint for an object we will be creating.

//So far we've only used local variables (Variables local to a method or code block).

//Classes allow the creation of variables that are accessible by any code block within that class.

//But you can also allow access from outside the class itself.

//When designing a class, there are some things we want the public to know, and there are some things that aren't necessary
//for the public to know. We can have a public interface- or information the outside world needs to know to use our class.

//But we'll also have a non-public interface. This is information we may need to share but not always, and not with everyone.

//We may need to share some information within our own company and other departments, while other data might need to be
//shared with our manufacturers and dealers, but not with the public.

//Java gives us the ability to have this kind of control, by specifying different access modifiers for each member in a class.
//**************************************************
//An access modifier at the member level allows granular control over class members.

//The keywords are public, protected, (omitted), and private.

//The public access keyword means any other class in any package can access this class.
//The protected access keyword allows classes in the same package, and any subclasses in other packages, to have access
//to this member.
//The private access modifier means that no other class can access this member.

//As a general rule, all your fields should be private, and class should be public.

//Keeping all the fields on a class private is called Encapsulation.

//Encapsulation in Object-Oriented Programming usually has two meanings:

//One is the bundling of behavior and attributes on a single object.

//The other is the practice of hiding fields, and some methods, from public access.

//In general, encapsulation means information hiding, or hiding information on the internal workings of a specific object.

//When we make our attributes private, we can then create methods to access the data, each with different degrees of access allowed.

//FIELDS = ATTRIBUTES, which look like variables, defined in the class, and not in a method.

//When we create an object from this class, the values we assign to these fields represent the state of the object.

//We will create a method to access instance fields on the class. The method won't be static, because it's accessing
//instance fields on the class.

//Methods, unlike fields, are often public, because we want to give users a way to interact with the object.
public class Car {

    private String make = "Tesla";              //Assigning values here will mean every object instantiated will get
    private String model = "Model X";           //assigned these values, instead of Java's implicit values.
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible;

    //When writing methods that use non-static fields, your method can't be declared static.
    //The getter will usually return the type that the field is (String in this case).
    //Then we just return the field name, make.
    //Even though make is declared on the class, we can refer to it from code in our method as shown below.

    //Intellij can create getter methods for you:

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    //"is" is a standard prefix for a getter for a boolean.
    public boolean isConvertible() {
        return convertible;
    }


    //Below is a setter method. Setter methods set data, and don't retrieve it.
    //Our setter method is void because it doesn't return any data.
    //The parameter is String because that's what we're setting.
    //To use this setter method, we will use the new keyword called "this"
    //What it refers to is the instance field that was created when the object was instantiated.
    //"this" is a special reference name for the object or instance, which it can use to describe itself.
    //And we can use "this" to access fields on a class.
    public void setMake(String myString){                           //To the left is an example of validation using a
        if(myString == null) myString = "Unknown";                  //setter method to determine what is valid and not valid.
        String lowercaseMake = myString.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = myString;
            default -> {this.make = "Unsupported";
            }                                      //What "this.make" is doing is updating the variable, private
        }                                          //String make (field), with the contents of parameter myString that
       // this.make = myString;                    //was passed to us (From the main class, once called).
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){

        System.out.println(doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                        (convertible ? "Convertible" : ""));

    }

}
