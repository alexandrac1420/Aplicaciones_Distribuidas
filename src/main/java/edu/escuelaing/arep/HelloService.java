package edu.escuelaing.arep;

import java.util.HashMap;
import java.util.Map;

public class HelloService implements RestService {

    @Override
    public String response(String request) {
        // Asumiendo que la solicitud tiene el formato: "name=<input_name>"
        String[] requestParams = request.split("=");
        return "{\"nombre\": \"" + requestParams[1] + "\"}";
    }
}
