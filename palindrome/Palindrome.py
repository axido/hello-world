# Just a small programming exercise. Checks if the given word or sentence is a palindrome.
import re

print("Tämä ohjelma kertoo, onko annettu sana tai lause palindromi.")
print("Voit poistua ohjelmasta komennolla \"exit\".")

while True:
    # Kysytään käyttäjältä sanaa tai lausetta, sitten
    # Poistetaan yleisimmät välimerkit, muutetaan pienaakkosiksi vertailun helpottamiseksi.
    i = input("Anna palaa: ")
    k = re.sub(r'[,!:;.]|\s', '', i).lower()
    if i == "exit":
        break
    if any(char.isdigit() for char in k) == True:  # Tarkistetaan onko mukana numeroita tai onko arvo tyhjä.
        print("Numerot eivät ole sallittuja.")
    elif not k or k == '':
        print("Et kirjoittanut mitään!")
    elif k[::-1] == k:  # Tarkistaa, onko käännetty arvo ja alkuperänen samat. Niiden täsmätessä lause on palindromi.
        print("", i, " on palindromi!", sep='"')
    else:
        print("Valitettavasti ", i, " ei ole palindromi.", sep='"')
