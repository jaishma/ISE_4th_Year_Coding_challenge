#1) Python3 program to check for balanced parenthesis. 

def areParanthesisBalanced(expr) : 
	stack = [] 
	for char in expr: 
		if char in ["(", "{", "["]: 
			stack.append(char) 
		else: 

			# IF current character is not opening 
			# bracket, then it must be closing. 
			# So stack cannot be empty at this point. 
			if not stack: 
				return False
			current_char = stack.pop() 
			if current_char == '(': 
				if char != ")": 
					return False
			if current_char == '{': 
				if char != "}": 
					return False
			if current_char == '[': 
				if char != "]": 
					return False

	if stack: 
		return False
	return True

if __name__ == "__main__" : 
	expr = "{()}[]"; 
	if areParanthesisBalanced(expr) : 
		print("Balanced"); 
	else : 
		print("Not Balanced"); 