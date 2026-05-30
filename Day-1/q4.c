#include <stdio.h>

int main() {
    long long n;
    int count = 0;

    scanf("%lld", &n);

    if (n == 0) {
        count = 1;
    }

    while (n != 0) {
        n = n / 10;
        count++;
    }

    printf("%d\n", count);

    return 0;
}