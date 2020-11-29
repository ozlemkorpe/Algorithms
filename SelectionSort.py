# Original array
A = [64, 34, 25, 44, 25, 12, 22, 11, 25,25 , 11]
def stabilized_selection_sort(A):
    for i in range(len(A)): # For loop for scan all elements
    # Find the minimum in unsorted array
        min_index = i
        for j in range(i + 1, len(A)): #compare value in index i with in larger indexes
         if A[min_index] > A[j]:
            min_index = j # Replace the min index with j
            # Swap the found minimum element with the first element
            A[i], A[min_index] = A[min_index], A[i]

# Print the result
print(stabilized_selection_sort(A))
for i in range(len(A)):
    print("%d" % A[i]),
