public class Test{
    static class myList{

        private int a_min;
        private int b_max;
        
        public int get_Least(){
            return a_min;
}
public void set_Least_value(int value){
            this.a_min = value;
        }
        public int get_Highest(){
            return b_max;
        }
public void set_Highest_value(int value){
            this.b_max = value;
        }
    }

static myList Highest_and_Least_Values(int arr[], int length) {
        myList obj1 = new myList();
        int i;

        if (length == 1) {
            obj1.set_Highest_value(arr[0]);
            obj1.set_Least_value(arr[0]);
            return obj1;
        }

        if (arr[0] > arr[1]) {
            obj1.set_Highest_value(arr[0]);
            obj1.set_Least_value(arr[1]);
        }
        else {
            obj1.set_Highest_value(arr[1]);
            obj1.set_Least_value(arr[0]);
        }   
        for (i = 2; i < length; i++) {
            if (arr[i] > obj1.get_Highest()) {
                obj1.set_Highest_value(arr[i]);
            }
            else if (arr[i] < obj1.get_Least()) {
                obj1.set_Least_value(arr[i]);
            }
        }
        return obj1;
}
    public static void main(String args[]) {
        int distance[] = {2000, 21, 600, 7, 200, 45000};
        int length = 6;
        myList Obj1 = Highest_and_Least_Values(distance, length);
        System.out.printf("\n Least Value is %d", Obj1.get_Least());
        System.out.printf("\n Highest Value is %d", Obj1.get_Highest());
    }
}
