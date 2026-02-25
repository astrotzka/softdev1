ppl = int(input())
names = []
for i in range(ppl):
    names.append(input())
counts = {}
emails = []
for name in names:
    name = name.lower()
    clean = ""
    for ch in name:
        if ch.isalpha() or ch.isdigit() or ch == " ":
            clean += ch
    email = clean.replace(" ", ".")
    if email not in counts:
        counts[email] = 0
        emails.append(email + "@ucc.ie")
    else:
        counts[email] += 1
        emails.append(email + str(counts[email]))
for e in emails:
    print(e)