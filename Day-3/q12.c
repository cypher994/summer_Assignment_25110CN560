#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    int num1 = a;
    int num2 = b;

    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }

    int gcd = a;
    int lcm = (num1 * num2) / gcd;

    printf("%d\n", lcm);

    return 0;
}