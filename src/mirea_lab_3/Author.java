package mirea_lab_3;

public class Author {
    private String name = " ";
    private String email = "";
    private char gender = 'U';
    public Author(String n, String e, char g){
        this.name = n;
        this.email = e;
        this.gender = g;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public String toString() {
        String male;
        if (this.gender=='M'){
            male = " (m) ";
        }
        else if (this.gender=='F') {
            male = " (ms) ";
        }
        else{
            male = " ";
        }
        return this.name+male+"at "+this.email;
    }
}

