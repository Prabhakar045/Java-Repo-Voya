package com.voya.interfaceProject.lamdaExpression;

public class MenuLamda {

    public static void main(String[] args) {

        IMenu iMenu = () -> System.out.println("Chinise menus: Noodles, snakes chops, , ");
        iMenu.showMenus();

        IMenu iMenu1 = () -> System.out.println("Indian menus: Rice daal , chicken, paneer, idli voda");
        iMenu1.showMenus();

        IMenu iMenu2 = () -> System.out.println("italian menus:italian pizaas");
        iMenu2.showMenus();
    }
}
