package collection_framework_code.generic;

/*
--> What is Generic ? -> its Depending on the data I give tha datatype should become fixed.
    and after that no other type of data, other than that datatype value should be accepted.
--> Object is the Super most class in Java.
--> if we create a variable of the type object any kind of data can store into it (this is not type safe)
--> it is not strictly typed
--> so always the dynamic type are problem creations because
    strictly typed datatypes are more preferable one because of mistakes will not happen while storing the data.
--> right data only it will take that's why this is not 'type safe".
--> we want type safe which means once I create object name of type String then it should take only String type of data.
 --> Generics are applicable in interface and class both.
 */
public class Generic_Code {
    public Object name;
    public Object id;

    public Generic_Code(Object name, Object id) {
        this.name = name;
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public Object getId() {
        return id;
    }
}
