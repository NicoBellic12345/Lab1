def snake_to_camel(snake_case):
    words = snake_case.split('_')
    
    camel_case = words[0] + ''.join(word.capitalize() for word in words[1:])
    
    return camel_case

snake_case_input = input("Enter the snake case string: ")
camel_case_output = snake_to_camel(snake_case_input)
print("Camel case string:", camel_case_output)