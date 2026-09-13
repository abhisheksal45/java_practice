package Lec04_class_obj;

public class IdPass {
    private String username;
    private String password;

    IdPass(String username,String password){
        this.username=username;
        this.password=password;

    }
        public String Validateid_pass(String user,String pass){
    if(username.equals(user)&&password.equals(pass)){
        System.out.println("password and username matched");
    }
    else {
        System.out.println("Please enter valid id and password");
    }
    return user+pass;
    }
}
