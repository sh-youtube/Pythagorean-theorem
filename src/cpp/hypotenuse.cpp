#include <iostream>
#include <cmath>

using namespace std;

void pass()
{}

int main()
{
    int a,b;
    while (a != 0 || b != 0 )
    {
        // get side a
        cout << "First side[0 to exit]: ";
        cin >> a;
        a == 0 ? exit(0) : pass();
        
        // get side b
        cout << "Second side[0 to exit]: ";
        cin >> b;
        b == 0 ? exit(0) : pass();
        
        // arithmetic
        cout << sqrt(pow(a,2)+pow(b,2)) << "\n";
    }   
}