# Data-structure-project
Hello World
🍕
requirments
● Building a GUI in which the user can specify the location of an input XML file.
● Checking the XML consistency: The input XML may have inconsistencies like missing any
of the closing and opening tags or not matching tags.
● The program should be able to detect and visually show any errors in consistency.
● The program will also be able to solve the errors.
● Formatting (Prettifying) the XML: the XML file should be well formatted by keeping the
indentation for each level.
● Converting XML to JSON: JSON (Javascript Object Notation) is another format that is used
to represent data. It’s helpful to convert the XML into JSON, especially when using
javascript as there’s tons of libraries and tools that use json notation.
● Minifying the XML file: Since spaces and newlines (\n) are actually characters that can
increase the size of an XML document. This feature should aim at decreasing the size of
an XML file (compressing it) by deleting the whitespaces and indentations.
● Compressing the data in the XML/JSON file: You should come-up with a way to reduce the
size of the file using a data compression technique. You can invent your own ad-hoc
method for such compression. On the other hand, you can check how JSONH works and
try to distill ideas from it. Finally, you can use a data compression technique such as byte
pair encoding (https://en.wikipedia.org/wiki/Byte_pair_encoding).
The smaller the output file is, the more efficient your algorithm is.
● Decompressing the compressed data to return to its original format.
● representing the users data using the graph data structure: the XML file will represent the
users data in a social network (their posts, followers, ...etc).
The user data is his id (unique across the network), name, list of his posts and followers.
So you should represent the relation between the followers using the graph data
structure as it will be very helpful for the network analysis.
If the input file was like this (the dots mean that there are additional tags inside the user
tag) :
Then you should build a graph relation between the user that looks like the graph
beneath.
● Network analysis: by representing the network using the graph data structure, we can
extract some important data:
- who is the most influencer user (has the most followers)
- who is the most active user (connected to lots of users)
- the mutual followers between 2 users
- for each user, suggest a list of users to follow (the followers of his followers)
● Post search: given a specific word or topic, get the posts where this word or topic was
mentioned.



Bonus
● Graph visualization: you’re free to use any tool or 3rd party library to help you visualize the
graph of the network showing how the user is connected to each other.
● Additional operations: you’re free to implement additional operations to help you analyze
the network better.
