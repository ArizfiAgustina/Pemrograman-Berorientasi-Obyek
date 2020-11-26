package pbo_3_inherite;

public class Trainee extends Member {
    private int lamaTraining;
    
    //konstruktor 3 parameter
    public Trainee(String nama, int umur, int lamaTraining) {
        super(nama, umur); //super : mengambil nilai dari parent
        this.lamaTraining = lamaTraining;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Lama Training (tahun) : " + lamaTraining);
    }
}
