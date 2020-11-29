# Original array
A = [64, 34, 25, 44, 25, 12, 22, 11, 25,25 , 11]
def stabilized_selection_sort(A):
    for i in range(len(A)): # For loop for scan all elements
    # Find the minimum in unsorted array
        min_index = i
        for j in range(i + 1, len(A)): #compare value in index i with in larger indexes
         if A[min_index] > A[j]:
            min_index = j # Replace the min index with j
            # Place the minimum and move others one forward
            temp_val = A[min_index] # Hold the min value in temporary variable
            while min_index > i: # When the index of the min value is larger than the index i
                 A[min_index] = A[min_index - 1] #Replace the values
                 min_index -= 1 #Update the new min index
            A[i] = temp_val #Set value in index i as temporary value

# Print the result
print(stabilized_selection_sort(A))
for i in range(len(A)):
    print("%d" % A[i]),

