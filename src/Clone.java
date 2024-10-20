public class Clone {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4,5 };
        int [] ray = {8, 8,7,6};

        ray = arr.clone();
        for(int i = 0; i<ray.length; i++)
        {
            System.out.print(ray[i]);
        }
    }
}
