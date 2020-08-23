package be.intecbrussel.hashMap;

import java.util.HashMap;

public class HashClass
{
    public static void main(String[] args)
    {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        for (String i: capitalCities.keySet())
        {
            System.out.println(i);
        }
        for (String i: capitalCities.values())
        {
            System.out.println(i);
        }
        capitalCities.clear();
        System.out.println(capitalCities);

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Eddy", 32);
        people.put("Gerard", 30);
        people.put("Norman", 33);
        System.out.println(people);
    }
}
