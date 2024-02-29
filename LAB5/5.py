import re

def match_pattern(string):
    pattern = r'a.*b$'
    if re.match(pattern, string):
        return True
    else:
        return False

string = input("Enter the string: ")

if match_pattern(string):
    print(f"'{string}' matches the pattern.")
else:
    print(f"'{string}' does not match the pattern.")