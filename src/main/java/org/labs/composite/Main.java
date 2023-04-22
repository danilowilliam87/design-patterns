package org.labs.composite;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("mapa mundi");
        Node root = tree.getRoot();

        Node china = new Node("China");
        Node america = new Node("America");
        Node sanfrancisco = new Node("San Francisco");
        Node california = new Node("California");

        root.add(china);
        root.add(america);

        Node beijing = new Node("Bei Jing");
        Node shangai = new Node("Shangai");

        china.add(beijing);
        china.add(shangai);

        america.add(california);
        america.add(sanfrancisco);

        root.getChildNodes()
                .forEach(node -> {
                    System.out.println("Nation : " + node.name);
                    node.getChildNodes().forEach(node1->{
                        System.out.println("    city : " + node1.name);
                    });
                });
    }
}
