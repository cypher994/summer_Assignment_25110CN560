#include <stdio.h>

int main() {
    int x;
    scanf("%d", &x);

    long long factorial = 1;

    if (x < 0) {
        printf("Error\n");
    } else {
        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        printf("%lld\n", factorial);
    }

    return 0;
}