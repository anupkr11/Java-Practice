// public class sansu {
//     public static void main(String [] args)
//     {
//         int a[] = {1,2,3,4,5,6,7,8};
//         for(int i= 0; i<8; i++){
//             int j = 2;
//             for(int j; j<i; j++){
//                 if(a[i]%j==0){
//                     continue;
//                 }
//                 if(a[i]%j!=0){
//                     System.out.println(a[i]);
//                 }
//             }
//         }
//     }
// }
int count=0,j=1,i=1,n=1;
while (n<10){
    count=0;
    for(j=1;j<=n;j++){
        count++;
        if(count==2){
            System.out.println(i);
            n++;
        }
        i++;
    }

}
