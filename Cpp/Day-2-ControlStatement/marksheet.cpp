#include <iostream>

using namespace std;

int main()
{
    int rollNo;
    string name;
    float sub1, sub2, sub3, total, avg;

    cout << "Enter Roll No :";
    cin >> rollNo;
    cout << "Enter Name :";
    cin >> name;
    cout << "Enter Subject 1 Mark :";
    cin >> sub1;
    cout << "Enter Subject 2 Mark :";
    cin >> sub2;
    cout << "Enter Subject 3 Mark :";
    cin >> sub3;

    total = sub1 + sub2 + sub3;
    avg = total / 3;

    if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35)
    {
        if (avg >= 80)
        {
            cout << "You Got A grade !";
        }
        else if (avg >= 60)
        {
            cout << "You Got B grade !";
        }
        else if (avg >= 40)
        {
            cout << "You Got C grade";
        }
    }
    else
    {
        cout << "You Failed In Exam !";
    }
}