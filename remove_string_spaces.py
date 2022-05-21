"""
Date : May 20, 2022
Title : Remove String Spaces
Instructions: Simply remove the space in given strings and return the resultant string.
"""

import re

def no_space(x):
    #your code here
    return re.sub('\s*', '', x)