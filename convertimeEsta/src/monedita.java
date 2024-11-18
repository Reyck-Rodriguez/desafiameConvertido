import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public record monedita(
        @SerializedName("base_code") String moneda,
        @SerializedName("conversion_rates") Map<String, Double> conversiones) {


    public Double getConversion(String monedaDestino) {
        return conversiones.get(monedaDestino);
    }
}





