import re

text = str(input("Enter the string: "))

def find_sequences(text):
    pattern = r'[A-Z][a-z]+'
    sequences = re.findall(pattern, text)
    return sequences

found_sequences = find_sequences(text)
if found_sequences:
    for seq in found_sequences:
        print(seq)

else:
    print("No sequences found")