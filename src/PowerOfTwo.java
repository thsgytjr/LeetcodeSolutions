public class PowerOfTwo {

    boolean isPowerOfTwo(int n){
        for (int i=0; i<n; i++){
            if (Math.pow(2,i)<=n){
                if (n==Math.pow(3,i)){
                    return true;
                }
            }else{
                break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     PowerOfTwo pt = new PowerOfTwo();
     pt.isPowerOfTwo(45);
    }
}
