#include <stdio.h>
#include <math.h>

int main() {
    int start, end;
    scanf("%d %d", &start, &end);

    for (int i = start; i <= end; i++) {
        if (i < 0) {
            continue;
        }

        int original_num = i;
        int temp = i;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = i;
        int sum = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            sum = sum + round(pow(remainder, digits));
            temp = temp / 10;
        }

        if (sum == original_num) {
            printf("%d ", original_num);
        }
    }
    printf("\n");

    return 0;
}