import com.google.gson.Gson;

public class transformerOtimonedas {


    public monedita trasnformar(String metido) {
        Gson geyson = new Gson();
        //Transforma el json a una moneda de java

        return geyson.fromJson(metido, monedita.class);



    }


}
