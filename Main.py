
def DisplayNumber(iNo):

    if(iNo < 0):
        iNo = -iNo
    
    if iNo == 0:
        print("Zero")
    elif iNo == 1:
        print("One")
    elif iNo == 2:
        print("Two")
    elif iNo == 3:
        print("Three")
    elif iNo == 4:
        print("Four")
    elif iNo == 5:
        print("Five")
    elif iNo == 6:
        print("Six")
    elif iNo == 7:
        print("Seven")
    elif iNo == 8:
        print("Eight")
    elif iNo == 9:
        print("Nine")
    else:
        print("Invalid Number")

def main():
    iValue = int(input("Enter Number\n"))

    DisplayNumber(iValue)

if __name__ == "__main__":

    main()

