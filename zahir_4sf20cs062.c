#include <stdio.h>
#include <stdlib.h>
#include <string.h>

double yenRate = 0.0091;
double poundRate = 1.3755;
double rupeeRate = 0.013;

double convertToDollars(char* code, double amount) {
    if (strcmp(code, "JPY") == 0) {
        return amount * yenRate;
    } else if (strcmp(code, "GBP") == 0) {
        return amount * poundRate;
    } else if (strcmp(code, "INR") == 0) {
        return amount * rupeeRate;
    } else {
        return 0;
    }
}

double calculateTotalDollars(char* s) {
    char* currencyValues[10];
    char* token = strtok(s, " ");
    int i = 0;
    while (token != NULL) {
        currencyValues[i++] = token;
        token = strtok(NULL, " ");
    }
    double totalDollars = 0;
    for (int j = 0; j < i; j++) {
        char* code = currencyValues[j];
        double amount = atof(currencyValues[j] + 3);
        double dollarAmount = convertToDollars(code, amount);
        totalDollars += dollarAmount;
    }
    return totalDollars;
}

int main() {
    char s[100];
    printf("Enter the currency values and conversion rates: ");
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = 0;
    double totalDollars = calculateTotalDollars(s);
    printf("The total amount in dollars is %.2f.\n", totalDollars);
    return 0;
}
