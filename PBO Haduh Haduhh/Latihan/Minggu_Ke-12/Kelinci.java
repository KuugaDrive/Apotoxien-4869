public class Kelinci extends Hewan {
    public void setName(){
        System.out.println("Nama Hewan Adalah\"Kelinci\"");
    }public void setMakanan(){
        System.out.println("Makanan Kelinci Adalah\"Wortel\"");
    }public void setWarna(){
        System.out.println("Warna kelinci\"Putih\"");
    }
    public static void main(String[]args){
        Kelinci k= new Kelinci();
        k.setName();
        k.setMakanan();
        k.setWarna();
    }
}