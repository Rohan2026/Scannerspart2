import csv

# Create a dictionary to store the class section as keys and a list of test scores as values
class_scores = {}

# Read the CSV file
with open('TestScoresByClass.csv', 'r') as file:
    csv_reader = csv.reader(file)
    
    # Skip the header line
    next(csv_reader)
    
    # Process the data
    for row in csv_reader:
        class_section = row[0]
        scores = list(map(int, row[1:]))
        average_score = sum(scores) / len(scores)
        
        # Store the class section and its average score in the dictionary
        class_scores[class_section] = average_score

# Print the results
print("Class: Avg score")
for class_section, avg_score in class_scores.items():
    print(f"{class_section}: {int(avg_score)}")
