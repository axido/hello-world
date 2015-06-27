# Just a small programming exercise. Checks if the given word or sentence is a palindrome.

print("Tämä ohjelma kertoo, onko annettu sana tai lause palindromi.")
print("Voit poistua ohjelmasta komennolla \"quit\".")

while True:
    # Kysytään käyttäjältä sanaa tai lausetta, sitten
    # Poistetaan yleisimmät välimerkit, muutetaan pienaakkosiksi vertailun helpottamiseksi.
    i = input("Anna palaa: ")
    k = i.lower().replace(" ", "").replace(",", "").replace("!", "").replace(":", "").replace(";", "").replace(".", "")
    if k == "quit":
        break
    if any(char.isdigit() for char in k) == True:  # Tarkistetaan onko mukana numeroita tai onko arvo tyhjä.
        print("Numerot eivät ole sallittuja.")
    elif not k:
        print("Et kirjoittanut mitään!")
    elif k[::-1] == k:  # Tarkistaa, onko käännetty arvo ja alkuperänen samat. Niiden täsmätessä lause on palindromi.
        print("Antamasi sana tai lause on ehta palindromi!")
    else:
        print("Valitettavasti ", i, " ei ole palindromi.", sep='"')