#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    int num = n;
    int reverse = 0;

    while (n != 0) {
        int rev = n % 10;
        reverse = reverse * 10 + rev;
        n = n / 10;
    }

    if (num == reverse) {
        printf("the number is a palindrome\n");
    } else {
        printf("the number is not a palindrome\n");
    }

    return 0;
}