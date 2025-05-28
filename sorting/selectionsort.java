public class selectionsort{
    public static void main(String args[]){
        int arr[]={3,5,1,23,16,9};
        int temp,temp2;
        for(int i=0;i<6;i++){
            temp=i;
            int min=arr[i];
            for(int j=i;j<6;j++){
                if(min>arr[j]){
                    min=arr[j];
                    temp=j;
                }
            }
            temp2=arr[i];
            arr[i]=arr[temp];
            arr[temp]=temp2;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}