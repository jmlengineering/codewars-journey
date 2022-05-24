"""
Date: May 24, 2022
Title: Sum of Differences in an Array
Instructions: Sum the differences between consecutive pairs in the array in descending order

My thought process:

1. Put elements in array in descending order
2. Sum pairs in descending order and finding the difference between each pair
3. Add each difference together to get the total sum
4. Set a count variable for the sum
5. Use a for loop to go through the array and conduct 2-3
6. Return the sum

"""

def sum_of_differences(arr):
    #Found the sort funnction is useful to eliminate the use of multiple loops
    arr.sort(reverse = True)
    sum = 0
    for i in range(len(arr) - 1):
        sum += arr[i] - arr[i + 1]
    return sum