#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int product = 1;

    if (n == 0) {
        product = 0;
    }

    while (n != 0) {
        int rev = n % 10;
        product = product * rev;
        n = n / 10;
    }

    printf("%d\n", product);

    return 0;
}