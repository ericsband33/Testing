package My_Package;

import java.util.Scanner;

public class basic {
    String[] p_all = new String[10];
    int[] gr_all = new int[10];
    String[] surname_all = new String[10];
    int x = 0; //датчик массива

    void begin() {
        Scanner input = new Scanner(System.in);
        String p;
        int gr;
        int in;//для ввода
        String surname;
        System.out.println("Выберите пол: 1 - М, 2 - Ж ");
        in = input.nextInt();
        if (in == 1) p = "Муж";
        else p = "Жен";
        System.out.println("Введите год рождения ");
        gr = input.nextInt();
        System.out.println("Введите фамилию ");
        surname = input.next();
        registation(p, gr, surname);
    }

    //создать обработку исключения при превышении размерности массива
        void registation (String p, int gr, String surname) {
            try {
                p_all[x] = p;
                gr_all[x] = gr;
                surname_all[x] = surname;
                x++;
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Картотека заполнена.");
            }
        }

    void delete(int x_del){
        String y;
        int z;
        p_all[--x_del] = null;
        gr_all[x_del] = 0;
        surname_all[x_del] = null;
        for (int x = (x_del+1); x<p_all.length; x++){
            y = p_all[x];
            p_all[x] = null;
            p_all[(x-1)] = y;
            z = gr_all[x];
            gr_all[x] = 0;
            gr_all[(x-1)] = z;
            y = surname_all[x];
            surname_all[x] = null;
            surname_all[(x - 1)] = y;
        }

        x--;
    }
    void show(){
        for(int i = 0; i<10; i++){
            System.out.print((i+1) + "  ");
            System.out.print(p_all[i] + "  ");
            System.out.print(gr_all[i] + "  ");
            System.out.println(surname_all[i]);


        }
        System.out.println();
    }

}
