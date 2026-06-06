#include <stdio.h>

int main() {
    int n, a , b ,c,i;
    printf("Enter the index number");
    scanf("%d", &n);
    a=0; b=1; c=0;
    for(i=0;i<n;i++){
        a=b;
        b=c;
        c=a+b;
    }
    printf("%d",b);
    return 0;
}
