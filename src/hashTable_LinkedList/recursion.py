# fibonacci sequence:
# series of numbers where the next number is the addition of the last two numbers

# base case : 0 + 1 = 1

def main():
    n = 0
    prevnum = 0
    counter = 0
    end = 32
    fullseq = []
    returnarr = fibonacci(n, end, counter, fullseq, prevnum)
    print(returnarr)



def fibonacci(n, end, counter, fullseq, prevnum):
    if (n == 0):
        n = 1

    if (counter == end):
        return fullseq
    
    n = prevnum + n
    counter += 1
    fullseq.append(n)
    prevnum = n
    return fibonacci(n, end, counter, fullseq, prevnum)
    

main()
