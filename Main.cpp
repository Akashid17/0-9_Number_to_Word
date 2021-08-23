
#include<iostream>

using namespace std;

class ArithmeticX
{
    public:
        void DisplayNumber(int);
};

void ArithmeticX::DisplayNumber(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    switch (iNo)
    {
        case 0:
            cout<<"Zero\n";
        break;
        case 1:
            cout<<"One\n";
        break;
        case 2:
            cout<<"Two\n";
        break;
        case 3:
            cout<<"Three\n";
        break;
        case 4:
            cout<<"Four\n";
        break;
        case 5:
            cout<<"Five\n";
        break;
        case 6:
            cout<<"Six\n";
        break;
        case 7:
            cout<<"Seven\n";
        break;
        case 8:
            cout<<"Eight\n";
        break;
        case 9:
            cout<<"Nine\n";
        break;
        default:
            cout<<"Invalid Number\n";
        break;
    }
}

int main()
{
    int iValue = 0;

    cout<<"Enter Number\n";
    cin>>iValue;

    ArithmeticX aobj;
    aobj.DisplayNumber(iValue);

    return 0;
}