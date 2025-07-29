package collection_framework_code.generic;

/*
    What is Generics ?
        -> Generics in java are a powerful feature that allows you to define classes, interfaces, and methods with a placeholder for types.

--> What is Generic ? -> its Depending on the data I give tha datatype should become fixed.
    and after that no other type of data, other than that datatype value should be accepted.
--> Object is the Super most class in Java.
--> if we create a variable of the type object any kind of data can store into it (this is not type safe)
--> it is not strictly typed
--> so always the dynamic type are problem creations because
    strictly typed datatypes are more preferable one because of mistakes will not happen while storing the data.
--> right data only it will take that's why this is not "type safe".
--> we want type safe which means once I create object name of type String then it should take only String type of data.
--> Generics are applicable in interface and class both.

Example :
        public interface xyz<E> --> Here we have just created this xyz interface, but we have not deciding what is <E> here
        It is when we are writing the code at that point of time during compiling of the code (not during the running) we are deciding
        what this Gereric should access (<E>).
        So this <E> will take the data-type input during the compilation time of the program.

        Example : List<E> (here also E is a Generic)
        --> List<String> list = ArrayList<>(); -> now the E replaced with now with a String.
        --> What is basically happen in this case, This particular list is basically taking a String value only.
        --> In List<E> value of E was Generic but now E there happens to be a String now.(This is only type safe)
        --> if we romove E from List<E> to List then it is now type safe because it will store any kind of data.(Then is not type safe)
            Then it will act like Object class which can hold any kind of data.

 Example :
            addAll(Collection<? extends E>): boolean -> What is question mark here ?
            --> "?" question mark is Wild card in Generic.
            Example :
                    List<?> arr = new ArrayList<>();
                    -> when we use ? mark here which means it can take any kind of data-type.

                    Let's suppose :
                    we have a method like :
                            public List<String> getList() {
                                    List<String> arr = new ArrayList<>();
                                    return arr;
                            }
                    -> This method will return list of type String but many of time we don't know what kind of data it might return.
                    -> But what if now i have the same method but it returns an integer type List<Integer> like :
                            public List<String> getList() {
                                    List<Integer> arr = new ArrayList<>();
                                    return arr;
                            }
                      -> then we should go for ? mark in generic like this : public List<?> getList() {...}
                      -> here the ? mark internally automatically will be replced by the data-type based on the value we are returning.


                      Example :
                             1. public List<?> getList() { --> here the ? mark will be replaced by String type.
                                    List<String> arr = new ArrayList<>();
                                    return arr;
                               }

                             2. public List<?> getList() { --> here the ? mark will be replaced by Integer type.
                                    List<Integer> arr = new ArrayList<>();
                                    return arr;
                               }
                 --> Advantages of Generics :
                                    -> it makes the code reUsable.
                                    -> and it makes the concept type safe.
 */
public class Generic_Code1<T,U> {
    public T name;
    public U id;

    public Generic_Code1(T name, U id) {
        this.name = name;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public U getId() {
        return id;
    }
}
