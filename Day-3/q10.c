#include <stdio.h>

int main() {
    int start, end;
    scanf("%d %d", &start, &end);

    for (int i = start; i <= end; i++) {
        if (i <= 1) {
            continue;
        }
        
        int is_prime = 1;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                is_prime = 0;
                break;
            }
        }
        
        if (is_prime == 1) {
            printf("%d ", i);
        }
    }
    printf("\n");

    return 0;
}