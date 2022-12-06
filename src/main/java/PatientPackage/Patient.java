import java.io.Serializable;

public class Patient implements Serializable {
    String name;
    String id;
    int phoneNumber;
    public Patient(String name, String id, int phoneNumber){ // The constructor
        name=name;	// Initialize the fields of the object
        id=id;
        phoneNumber=phoneNumber;
    }

}

