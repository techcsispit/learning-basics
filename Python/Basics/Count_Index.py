def find_positions(list1, x):
  """Finds the positions of an element in a list.

  Args:
    list1: A list of elements.
    x: The element to search for.

  Returns:
    A list of the positions of x in list1, or an empty list if x is not in list1.
  """

  positions = []
  while x in list1:
    positions.append(list1.index(x))
    list1.remove(x)
  return positions

list1 = list(eval(input('Enter a list: ')))
x = eval(input('Enter an element to know its position in the entered list: '))

positions = find_positions(list1, x)

if positions:
  print(f'Yes, This number is in the list at {len(positions)} places')
  print(f'This Number is present at {positions} place(s)---[index given]')
else:
  print('Sorry, This number is not in the list')

