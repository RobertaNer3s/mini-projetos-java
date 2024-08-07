import java.util.HashMap;
import java.util.Map;

public class ConversorDeMoedas {
    private Map<String, Double> exchangeRates;

    public ConversorDeMoedas() {
        exchangeRates = new HashMap<>();
        // Definindo algumas taxas de câmbio
        exchangeRates.put("USD_TO_EUR", 0.85);
        exchangeRates.put("EUR_TO_USD", 1.18);
        exchangeRates.put("USD_TO_BRL", 5.10);
        exchangeRates.put("BRL_TO_USD", 0.20);
        exchangeRates.put("EUR_TO_BRL", 6.00);
        exchangeRates.put("BRL_TO_EUR", 0.17);
    }

    public double convert(String from, String to, double amount) {
        String key = from + "_TO_" + to;
        if (exchangeRates.containsKey(key)) {
            return amount * exchangeRates.get(key);
        } else {
            throw new IllegalArgumentException("Conversão de moeda não suportada.");
        }
    }
}
