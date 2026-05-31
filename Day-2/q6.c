#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int reverse = 0;

    while (n != 0) {
        int rev = n % 10;
        reverse = reverse * 10 + rev;
        n = n / 10;
    }

    printf("%d\n", reverse);

    return 0;
}