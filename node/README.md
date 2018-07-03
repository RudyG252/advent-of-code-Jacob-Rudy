Node template for Advent of Code algorithm puzzles

These files comprise a framework you can use to solve the problems
on the adventofcode.com website.

After you download the template you must open a terminal window and run <code>npm install</code>
to install the Node dependencies

Helpful tools in this repo:

readFile:  This function will read a file of text.  What you do 
with the text after you read it is up to you.  You include it in your
code by adding this line at the top of your javascript file:

<pre>
const {readData} = require('../utilities')
</pre>

Make sure the parameter in the <code>require</code> function points
to the utilities.js file in the root folder of this repo.

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

You can convert the lines of text into an array of strings like this:

<pre>
const {readData} = require('../utilities')
let data = readData('code.txt')
data = data.split("\n")
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

You can convert this data into an array of an array of numbers this way:

<pre>
const {readData} = require('../utilities')
let tsv = readData('code.txt')
rows = tsv.split("\n")
data = rows.map(row => row.split("\t")
</pre>

For <code>csv</code> data replace <code>"\t"</code> with <code>,</code>

__ramdajs functional library__

Functional programming is the new normal in programming circles.  The <code>map</code>
function listed in the last example is one such functional programming 
solution.  

You can incorporate the ramdajs library in your code by adding this to
your code

<pre>
const R = require('ramda')
</pre>

You access the ramdajs functions using <code>R.functionName</code>

Documentation is available at <https://ramdajs.com/docs> and we'll discuss
functional programming in class as you work on this unit.
