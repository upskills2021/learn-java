import com.learnjava.example.encapsulation.Country;

public class Application {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("India");
        country.setCurrency("INR");
        String countryInformation = country.toString();
        System.out.println("Country Information :: " + countryInformation);
    }
}
