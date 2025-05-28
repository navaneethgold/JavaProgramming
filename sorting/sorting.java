public class sorting{
    public static void main(String args[]){
        int arr[]={3,2,1,43,17};
        int temp;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}