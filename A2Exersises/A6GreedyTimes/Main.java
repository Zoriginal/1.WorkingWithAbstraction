
package A1WorkingWithAbstraction.A2Exersises.A6GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());

        String[] sequence = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < sequence.length; i += 2) {
            String name = sequence[i];
            long amount = Long.parseLong(sequence[i + 1]);

            String treasureName = "";

            if (name.length() == 3) {
                treasureName = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                treasureName = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                treasureName = "Gold";
            }

            long sumBagCapacity = bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + amount;

            if (treasureName.equals("")) {
                continue;
            } else if (bagCapacity < sumBagCapacity) {
                continue;
            }

            switch (treasureName) {
                case "Gem":
                    if (!bag.containsKey(treasureName)) {
                        if (bag.containsKey("Gold")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get("Gem").values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(treasureName)) {
                        if (bag.containsKey("Gem")) {
                            if (amount > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get("Cash").values().stream().mapToLong(e -> e).sum() + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(treasureName)) {
                bag.put((treasureName), new LinkedHashMap<>());
            }

            if (!bag.get(treasureName).containsKey(name)) {
                bag.get(treasureName).put(name, 0L);
            }


            bag.get(treasureName).put(name, bag.get(treasureName).get(name) + amount);
        }

        for (Map.Entry<String, LinkedHashMap<String, Long>> entry : bag.entrySet()) {
            Long sumValues = entry.getValue().values().stream().mapToLong(v->v).sum();
            System.out.printf("<%s> $%s%n", entry.getKey(), sumValues);
            entry.getValue().entrySet().stream().sorted((e1,e2)->e2.getKey().compareTo(e1.getKey())).forEach(i->System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}