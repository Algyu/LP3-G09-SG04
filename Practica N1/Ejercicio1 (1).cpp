#include <iostream>
#include <vector>
#include <string>

using namespace std;

int sumar_arreglo(const vector<int>& arr) {
    int suma = 0;
    for (int elemento : arr) {
        suma += elemento;
    }
    return suma;
}

int main() {
    vector<int> mi_arreglo = {1, 2, 3, 4, 5};
    cout << "La suma del arreglo es: " << sumar_arreglo(mi_arreglo) << endl;
    return 0;
}