package models;

import java.util.Scanner;

public class Menu {
    private static Menu singleInstance = null;

    private Menu()
    {
    }

    public static Menu Menu()
    {
        if (singleInstance == null) {
            singleInstance = new Menu();
        }
        return singleInstance;
    }

    public void menu(){
        BoardGame bg = new BoardGame("Betrayal", "Betrayal", "Horror", 278f,5,2004,"Avalon Hill", "English", 3, 6, 60,12);
        ComicBook cb = new ComicBook("Flash", 140f, 5, 2015, "DC Comics", "english", 50, "Flash", "DC", "DC");
        ComicBook cb1= new ComicBook("Batman", 190.5f, 2, 2005, "DC Comics", "english", 13, "Flash", "DC", "DC");
        Admin admin = new Admin();
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        admin.addToBgs(bg);
        admin.addToCbs(cb);
        admin.addToCbs(cb1);

        int ok, iesire = 1;

        while(iesire == 1){
            System.out.println("Bine ati venit!");
            ok = 1;
            while(ok == 1){
                System.out.println("1. Afisare Board Games");
                System.out.println("2. Afisare Comic Books");
                System.out.println("3. Afisare Cos");
                System.out.println("4. Finalizare Comanda");
                System.out.println("5. Stop");
                System.out.println("Introduceti optiunea: ");

                int comanda = Integer.parseInt(scanner.nextLine());
                switch(comanda){
                    case 1:{
                        int ct = 1;
                        System.out.println("==============BOARD GAMES==============");
                        if (admin.getBgsSize() > 0) {
                            for (int i = 0; i < admin.getBgsSize(); i++) {
                                System.out.println("\n" + (i + 1) + "." + admin.getBgsById(i));
                                System.out.println("============================");
                            }
                            int k = 1;
                            while (k == 1) {
                                System.out.println("Doriti sa adaugati un produs in cos?(1/0)");
                                int c = Integer.parseInt(scanner.nextLine());
                                switch (c) {
                                    case 1: {
                                        System.out.println("Introduceti nr produsului pe care doriti sa-l introduceti in cos.");
                                        int c1 = Integer.parseInt(scanner.nextLine());
                                        if (admin.getBgsById(c1 - 1).getStock() > 0) {
                                            cart.addToCart(admin.getBgsById(c1 - 1));
                                            System.out.println(admin.getBgsById(c1 - 1));
                                            cart.setTotal(admin.getBgsById(c1-1).getPrice());
                                            cart.setNrProducts(cart.getNrProducts() + 1);
                                        }
                                        else
                                            System.out.println("\nProdusul nu mai este in stoc!");
                                    }
                                    case 0: {
                                        k = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("\nNu avem produse in acest moment!\n");
                        }
                        break;
                    }
                    case 2:{
                        int ct = 1;
                        System.out.println("==============COMIC BOOKS==============");
                        if (admin.getCbsSize() > 0) {
                            for (int i = 0; i < admin.getCbsSize(); i++) {
                                System.out.println("\n" + (i + 1) + " " + admin.getCbsById(i) + "\n");
                                System.out.println("============================");
                            }
                            int k = 1;
                            while (k == 1) {
                                System.out.println("Doriti sa adaugati un produs in cos?(1/0)");
                                int c = Integer.parseInt(scanner.nextLine());
                                switch (c) {
                                    case 1: {
                                        System.out.println("Introduceti nr produsului pe care doriti sa-l introduceti in cos.");
                                        int c1 = Integer.parseInt(scanner.nextLine());
                                        if (admin.getCbsById(c1 - 1).getStock() > 0){
                                            cart.addToCart(admin.getCbsById(c1 - 1));
                                            cart.setTotal(admin.getCbsById(c1-1).getPrice());
                                        }
                                        else{
                                            System.out.println("\nProdusul nu mai este in stoc!");
                                            System.out.println("============================");
                                        }
                                    }
                                    case 0: {
                                        k = 0;
                                        break;
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("Nu avem produse in acest moment!");
                            System.out.println("============================");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("==============COS CUMPARATURI==============");
                        if (cart.getNrProducts() == 0) {
                            System.out.println("Nu aveti produse in cos!");
                            System.out.println("============================");
                        } else {
//                            for (int i = 0; i < cart.getCartSize(); i++){
//                                Product p = cart.getShoppingCartById(i);
//                                System.out.println((i+1) + "." + p);
//                            }
                            int pos = 1;
                            while (pos == 1) {
                                if (cart.getCartSize() > 0) {
                                    for (int i = 0; i < cart.getCartSize(); i++) {
                                        Product p = cart.getShoppingCartById(i);
                                        System.out.println((i + 1) + "." + p);
                                    }
                                    System.out.println("1. Stergeti un produs din cos.");
                                    System.out.println("2. Inapoi.");
                                    int opt = Integer.parseInt(scanner.nextLine());
                                    switch (opt) {
                                        case 1: {
                                            System.out.println("Introduceti numarul produsului pe care doriti sa-l stergeti : ");
                                            int nr = Integer.parseInt(scanner.nextLine());
                                            cart.deleteFromCartById(nr - 1);
                                            cart.setNrProducts(cart.getNrProducts() - 1);
                                            break;
                                        }
                                        case 2: {
                                            pos = 0;
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Nu aveti produse in cos!");
                                    System.out.println("============================");
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 4:{
                        System.out.println("==============FINALIZARE COMANDA==============");
                        for (int i = 0; i < cart.getCartSize(); i++){
                            Product p = cart.getShoppingCartById(i);
                            System.out.println(p);
                        }
                        System.out.println("Finalizati comanda?(y/n)");
                        String finalizare = scanner.nextLine();
                        if (finalizare == "y"){
                            System.out.println("Aveti de platit " + cart.getTotal());
                            System.out.println("Va multumim!");
                            admin.setSalesTotal(cart.getTotal());
                            System.out.println("Doriti sa continuati cumparaturile?(y/n)");
                            String rasp = scanner.nextLine();
//                            for (int i = 0; i < cart.getCartSize(); i++){
//                                string mod = cos.getCosElem(i);
//                                if (prodStoc[mod] < AP.size()){
//                                    AP[prodStoc[mod]].setStoc(AP[prodStoc[mod]].getStoc() - 1);
//                                }
//                                else{
//                                    D[prodStoc[mod] - AP.size() ].setStoc(D[prodStoc[mod] - AP.size() ].getStoc() - 1);
//                                }
//                            }
                            if (rasp == "y"){
                                cart.setTotal(0);
                                for (int i = 0; i < cart.getCartSize(); i++){
                                    cart.deleteFromCart(cart.getShoppingCartById(i));
                                }
                                break;
                            }
                            else{
                                ok = 0;
                                break;
                            }
                        }
                        else{
                            break;
                        }

                    }
                    case 5:{
                        ok = 0;
                        iesire = 0;
                        break;
                    }
                }
            }
        }
    }

}
