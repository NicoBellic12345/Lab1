import re

def split_at_uppercase(string):
    parts = re.findall('[A-Z][^A-Z]*', string)
    return parts

input_string = input("Enter the string: ")
result = split_at_uppercase(input_string)
print("Splitted parts:", result)