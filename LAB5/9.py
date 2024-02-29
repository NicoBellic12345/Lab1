import re

def insert_spaces(string):
    modified_string = re.sub(r'\B([A-Z])', r' \1', string)
    return modified_string

input_string = input("Enter the string: ")
result = insert_spaces(input_string)
print("Modified string:", result)