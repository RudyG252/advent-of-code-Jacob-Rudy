Python template for Advent of Code algorithm puzzles

These files comprise a framework you can use to solve the problems
on the adventofcode.com website.

You can run Python using the Run button on top, or you can run your code
with iPython.  

To use the python debugger with Cloud 9 open a terminal window and run:
<pre>
sudo apt-get update
sudo apt-get install python-dev
sudo pip install ikpdb
</pre>

Then click the Run button at the top of the page when your Python file
is open.  This will run the file and a run window will appear at the
bottom of the page.  Click the bug icon so it turns green -- this enables
the debugger.  Then use the Run button on the run window to re-run your
python file.

Helpful tools in this repo:

readFile:  This function will read a file of text.  What you do 
with the text after you read it is up to you.  You include it in your
code by adding this line at the top of your javascript file:

* You must place a copy of utilities.py in the same folder as your code file
in order for Python to find it

* Make sure to add <code>from utilities import readFile</code> at the top of your code

__Example 1__

You can use the <code>split</code> String function to convert your 
lines of text into arrays.  For example, suppose your text file is
called <code>data.txt</code> and contains:

<pre>
Alpha
Bravo
Charlie
Delta
Echo
</pre>

You can convert the lines of text into an array of strings using the python <code>string</code> package:

<pre>
from utilities import readFile
from string import split

data = readFile('data.txt')
array = split(data, ',')
print (array)
</pre>

__Example 2__

Suppose your data file <code>data.csv</code> contains csv or tsv data (comma-separated- or 
tab-separated-values).  This example is <code>tsv</code> data

<pre>
104	240	147	246	123	175	372	71
116	230	260	118	202	270	277	292
740	755	135	205	429	822	844	90
828	115	440	805	526	91	519	373
</pre>

You can convert this data into an array of an array of numbers using the <code>csv</code> package:

<pre>
from utilities import readFile
from string import split

data = readFile('data2.csv')
lines = split(data, '\n')

\# Function that splits the line up into an array of items
\# separated by tabs
def csvParse(line):
    return split(line, '\t')
    
\# Apply the csvParse function to all the elements of the 
\# lines array
linesOfTokens = map(csvParse, lines)
print (linesOfTokens)
</pre>

For <code>csv</code> data replace <code>"\t"</code> with <code>,</code>
