//null is a special keyword in Java, meaning the variable or attribute has a type, but no reference to an object.
//This means that no instance, or object, is assigned to the variable or field.
//Fields with primitive data types are never null.

//A field with a primitive data type will get assigned a default value by Java.
//Java will set any numeric data type to a 0 and a boolean to false.
public class Main {

    //Notes on initializing an object:
    //When setting the variable car, we are initializing it when we use the "new" keyword.
    //"new" keyword is creating (and initializing) a new object from the Car template, called instantiation.
    public static void main(String[] args) {

        Car car = new Car();            //Creating the object car from class Car.

//        car.make = "Porsche";         We can't use the dot notation when calling the fields in the car class, because
//        car.model = "Carrera";        they were defined as private in the Car class.
//        car.color = "Red";

        car.setMake("5");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor(" black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("5");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor(" red");

        targa.describeCar();
    }

    //We allow access to the data (Private fields) in Car, and get it or set it, through getter or setter methods in this class.

    //A getter is a method on a class, that retrieves the value of a private field, and returns it.
    //A setter is a method on a class, that sets the value of a private field.
    //The purpose of these methods is to control, and protect, access to private fields.

    //Another important aspect is that the getter and setter method signatures are part of car's public interface,
    //but the attribute names and types aren't.

    //This means that we can change things internally, like the name or type of an attribute, but as long as we use the
    //same getter and setter, these changes should have no effect on code that uses our class. Our internal changes are
    //hidden from our users.
    //A getter method usually just returns the value of a private attribute.
    //It's usual to name a getter method with the get prefix, followed by the field name in lower camel case, but it's not required.
    //You could have getter methods that are not really declared on your class, but are derived in some way.

    //A setter method may simply just assign the argument passed to the attribute, but it often contains code to validate
    //data, check additional security requirements, ensure immutability the field value, or any other code required to
    //protect and validate an object's state.
    //It's usual to name a setter method with the set prefix, followed by the field name in lower camel case, but is a matter of form.

    //There may be many cases where we won't have any setter methods, for some of our private fields.
    //Maybe this is data needed only within the class itself, and doesn't need to be exposed to the outside world.
}

