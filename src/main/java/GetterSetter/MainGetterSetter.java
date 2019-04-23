package GetterSetter;

public class MainGetterSetter {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setColor("Red");
        p1.setLength(10);
        Pencil p2 = new Pencil();
        p2.setColor("Black");
        p2.setLength(9);
        Pencil p3 = new Pencil();
        p3.setColor("Blue");
        p3.setLength(8);

        Pencil[] pencils = new Pencil[3];
        pencils[0] = p1;
        pencils[1] = p2;
        pencils[2] = p3;

        for (int i=0; i<pencils.length; i++) {
            System.out.println(pencils[i]);
        }

        People people1 = new People();
        people1.setId(001);
        people1.setName("Toms");
        people1.setHeight(1.55);
        people1.setWeight(87);

//        for (int j = 0; j <p; j++) {
//
//        }


    }
}
