def readFile(filename):
    file = open(filename, 'r')
    text = file.read()
    return text