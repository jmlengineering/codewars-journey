"""

Date : May 20, 2022
Title : Simple Array Sum
Insturction : Given an arrray of integers, fiind the sum of its elements.

My thought process:

1. Initialize a variable to 0 for the sum
2. Step through the array, adding the values and adding to the sum variable
3. Return sum of values in the array

"""

def simpleArraySum(ar):
	sum = 0
	for i in range(len(ar)):
		sum+=ar[i]
	return sum