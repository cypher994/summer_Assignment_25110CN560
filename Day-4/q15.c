#include <stdio.h>
#include <math.h>

int main() {
    int n, r,sum=0,digits=0,temp;
  
   printf("enter the number");
    scanf("%d", &n);
    int original_num = n;
    temp = n;
    while (temp != 0) {
        digits++;
        temp = temp / 10;
    }
    while(n!=0){
        r= n%10;
        sum = sum+pow(r,digits);
        n=n/10;
    }
    if(sum==original_num) printf("armstrong number");
    else printf("not");
    return 0;
}