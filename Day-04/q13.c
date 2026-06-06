#include <stdio.h>

int main() {
    int n, a , b ,c,i;
    printf("Enter upto which term the series should be printed");
    scanf("%d", &n);
    a=0; b=1; c=0;
    for(i=0;i<=n;i++){
        printf("%d",a);
        c=a+b;
        a=b;
        b=c;
    }
    return 0;
}