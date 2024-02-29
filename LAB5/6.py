def replace_with_colon(text):
    new_string = text.replace(' ', ':').replace(',', ':').replace('.', ':')
    return new_string

text = input("Enter the string: ")
result = replace_with_colon(text)
print("Modified string:", result)