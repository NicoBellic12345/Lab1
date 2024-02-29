import re

text = str(input("Enter the string: "))

def match_pattern(text):
    pattern = r'ab{2,3}'
    if re.match(pattern, text):
        return True
    else:
        return False
    
if match_pattern(text):
    print(f"'{text}' matches the pattern")
else:
    print(f"'{text}' does not match the pattern")