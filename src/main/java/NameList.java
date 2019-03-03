import java.util.*;

public class NameList {


    public void list() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("Marek");
        nameList.add("Aleksandra");
        nameList.add("Marta");
        nameList.add("Jakub");
        nameList.add("Bartosz");

        System.out.println("Elementy listy to: " + nameList);

        System.out.println("Lista składa się z " + nameList.size() + " elementów");

        nameList.add("Paulina");

        System.out.println("Trzeci element listy to: " + nameList.get(2));

        String[] first = nameList.get(0).split("");
        System.out.println(Arrays.toString(first));

        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
        }
        System.out.println("");
        System.out.println("Jakub jest pod indeksem: " + nameList.indexOf("Jakub"));

        System.out.println("Czy lista zawiera imię Sylwia? " + nameList.contains("Sylwia"));

        System.out.println("Czy lista zawiera imię Marta? " + nameList.contains("Marta"));

        System.out.println("Dwa pierwsze elementy listy to: " + nameList.subList(0, 2));

        nameList.set(0, "Sebastian");

        System.out.println("Dwa ostatnie elementy listy to: " + nameList.subList(nameList.size() - 2, nameList.size()));
//        czemu akurat 2? przy 1 nie działa.

//        System.out.println(nameList.get(0)+nameList.get(1)+nameList.get(2)+nameList.get(3)+nameList.get(4)+nameList.get(5));
        String allNames = "";
        System.out.println();
        for (String s : nameList) {
            allNames = allNames + s;
        }
        System.out.println(allNames);

        String nameWithS = "";
        for (String s : nameList) {
            if (s.contains("s")) {
                nameWithS = nameWithS + s;
            }
        }
        System.out.println(nameWithS);

        for (String s : nameList) {
            System.out.println(s.substring(1, 3));
        }

        System.out.println(nameList);
        Collections.reverse(nameList);
        System.out.println(nameList);

        System.out.println();
        System.out.println("Osoby zaczynające się na literę \"J\" lub kończące się na literę \"a\":");
        for (String s : nameList) {
            if (s.substring(0, 1).equals("J") || s.substring(s.lastIndexOf("a")).equals("a")) {
                System.out.println(s);
            }
        }

        for (String s : nameList) {
            System.out.println(s + " " + s.length());
        }

        List<String> newList = new ArrayList<String>();
        newList.add("Anna");
        newList.add("Maciej");

        nameList.addAll(newList);
        System.out.println(nameList);

        if (nameList.contains("Aleksandra") && nameList.contains("Marta") && nameList.contains("Jakub")) {
            System.out.println("Lista zawiera imiona: Aleksandra, Marta, Jakub");
        }

        for (String s : nameList) {
            System.out.println(nameList.indexOf(s) + ": " + s);
        }
        String removedIndex = nameList.remove(0);
        System.out.println("Usunięto pierwszy element z listy: " + removedIndex);

        nameList.remove("Jakub");

        if (nameList.isEmpty()) {
            System.out.println("Lista jest pusta");
        } else {
            System.out.println("Lista nie jest pusta");
        }

        if (nameList.isEmpty()) {

        }
        System.out.println("Na pewno nie jest pusta :) ");


        Set<String> setName = new TreeSet<String>();
        setName.add("Marek");
        setName.add("Aleksandra");
        setName.add("Marta");
        setName.add("Jakub");
        setName.add("Bartosz");

        System.out.println(setName.size());
        System.out.println(setName);

        setName.add("Marek");
        System.out.println(setName);

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Niebieski");
        map.put(2, "Zielony");
        map.put(3, "Czerwony");

        System.out.println("Wszystkie kolory:" + map.values());
        System.out.println("Indeksy kolorów: " + map.keySet());

        map.put(map.size() + 1, "Fieletowy");
        System.out.println(map);

        System.out.println("Pod indeksem 2 kryje się kolor: " + map.get(2));


        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            if (integerStringEntry.getValue().equals("Niebieski")) {
                System.out.println(integerStringEntry.getKey());
            }
        }

        System.out.println(map.values());
        System.out.println(map.keySet());

        map.remove(2);
        System.out.println(map);

        int id = 0;
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            if (integerStringEntry.getValue().equals("Czerwony")) {
                id = integerStringEntry.getKey();
            }
        }

        map.remove(id);
        System.out.println();
        System.out.println(map);
    }
}



