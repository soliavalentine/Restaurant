public class Runner {
    public static void main(String[] args) {
        Ingredient c = new Ingredient("cheese", 3.50);
        Ingredient p = new Ingredient("pasta", 2);
        Ingredient ch = new Ingredient("chicken", 5.25);
        Ingredient pp = new Ingredient("peppers", 1.50);
        Ingredient[] spe = {c,p,ch};
        Ingredient[] ve = {c,p,pp};
        Ingredient[] pl = {p,pp};
    Menuitem special = new Menuitem("Special",spe,20);
    Menuitem veg = new Menuitem("Veggie",ve,15);
    Menuitem plain = new Menuitem("Plain",pl,12);
    Menuitem[] t1 = {special, special, veg};
        Menuitem[] t2 = {plain,plain,veg,veg,veg};
    Table z = new Table("1",t1);
    Table y = new Table("2",t2);
    z.getTotalPrice();
    y.getTotalPrice();
    z.determinePrepTime();
    y.determinePrepTime();
    System.out.println(z.toString());
    System.out.println(y.toString());
    }
}
