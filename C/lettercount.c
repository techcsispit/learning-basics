#include <stdio.h>
#include <string.h>

int main() {
  char sent[100];
  printf("Enter the Sentence: ");
  scanf("%[^\n]s", sent);

  int vowels = 0, consonants = 0, special = 0, spaces = 0, words = 0;
  int is_vowel = 0;
  int is_space = 0;

  for (int i = 0; i < strlen(sent); i++) {
    is_vowel = (sent[i] == 'a' || sent[i] == 'e' || sent[i] == 'i' || sent[i] == 'o' || sent[i] == 'u' || sent[i] == 'A' || sent[i] == 'E' || sent[i] == 'I' || sent[i] == 'O' || sent[i] == 'U');

    is_space = (sent[i] == ' ');

    if (is_vowel) {
      vowels++;
    } else if (is_space) {
      spaces++;
    } else if (sent[i] >= 'a' && sent[i] <= 'z' || sent[i] >= 'A' && sent[i] <= 'Z') {
      consonants++;
    } else {
      special++;
    }

    if (is_vowel || sent[i] >= 'a' && sent[i] <= 'z' || sent[i] >= 'A' && sent[i] <= 'Z') {
      if (!is_space && !is_vowel) {
        words++;
      }
    } else {
      is_space = 0;
    }
  }

  printf("Vowels: %d\nConsonants: %d\nSpecials: %d\nSpaces: %d\nWords: %d\n", vowels, consonants, special, spaces, words);

  return 0;
}
