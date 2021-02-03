/**
 * @author Tawfik Yasser
 * @since 2021
 * */
#include <iostream>

using namespace std;


class Enemy {

public:
    virtual void fire() = 0;
    virtual void fill_tank() = 0;
};

class Tank : public Enemy{

public:
    void fire(){
        cout<<"Tank: fire()"<<endl;
    }
    void fill_tank(){
        cout<<"Tank: fill_tank()"<<endl;
    }

};

class Plane : public Enemy{

public:
    void fire(){
        cout<<"Plane: fire()"<<endl;
    }
    void fill_tank(){
        cout<<"Plane: fill_tank()"<<endl;
    }

};

class Go{

public:
    void Go1(){
        cout<<"Go1"<<endl;
    }
    void Go2(){
        cout<<"Go2"<<endl;
    }

};

class GoAdapter : public Enemy, public Go{

public:
    void fire(){
        Go1();
    }
    void fill_tank(){
        Go2();
    }

};


int main()
{
    const int SIZE = 3;
    Enemy* enemies[SIZE];
    //1.
    enemies[0] = new Tank();
    enemies[1] = new Plane();

    //2.
    enemies[2] = new GoAdapter();

    for(int i =0 ; i < SIZE ; i++)
    {

        enemies[i]->fire();
        enemies[i]->fill_tank();

    }
    return 0;
}
