package edu.escuelaing.arep;

public class HelloService implements RestService{

    @Override
    public String response(String request) {
        return "{\"nombre\":\"Sebas\"}";
    }
    
}
