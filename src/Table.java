public class Table {
    private String name;
    int y=0;
    int l =0;
    private Menuitem[] order = new Menuitem[10];
    private int itemCount=0;
    public Table(String name, Menuitem[] order){
    this.order=order;
    this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void addItem(Menuitem i){
        order[itemCount]=i;
        itemCount++;
    }

    public Menuitem[] getItem() {
        return order;
    }
    public double getTotalPrice(){
        for(int i =0; i<order.length;i++){
            l+=order[i].getItemPrice();
        }
        return l;
    }
    public int determinePrepTime(){
        for(int i=0;i<order.length;i++){
            if(order[i].getPrepTime()>y){
                y=order[i].getPrepTime();
            }
        }
        return y;
    }
    public String toString(){
        String n = "";
        String spe="";
        for(int i = 0; i<order.length;i++) {
            if (order[i] != null) {
                n = n + " " + order[i].getName();
            }
        }
        String x = "Table " + name + " ordered:" + n + "." + "It will take " + y + " minutes. The total cost will be: "
                + l + " dollars.";
        return x;
    }
}
