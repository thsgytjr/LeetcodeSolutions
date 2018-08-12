public class Child extends Parent {
    public Child() { count++; }
    public static void main(String [] args) {

        int[] arr = new int[]{1,2,3};

        for (int i=0; i<arr.length; i++){
            if (arr[i+1]==3){
                System.out.println("hi");
            }
        }



    }
}