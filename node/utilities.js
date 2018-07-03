/**
 * Collection of library functions used with adventofcode.com problems
 */
const fs = require('fs')

/**
 * Reads data from a file
 * Note that this is synchronous and will block until file read is complete
 * @parm filename    (str) Filename to read
 * @return Data read from file
 */
const readData = filename => fs.readFileSync(filename, 'utf8');

/**
 * Export all the functions here. 
 * Functions can be imported using this syntax:
 *   const {function} = require('../utilities')
 */
module.exports.readData = readData