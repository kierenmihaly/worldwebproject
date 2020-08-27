using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


// static 

class Player
{
    public int AT = 10;
    public int HP = 100;

    public void Setting(int _AT, int _HP)
    {
        AT = _AT;
        HP = _HP;
    }

}
namespace _12StaticVar
{
    class Program
    {
        static void Main(string[] args)
        {
            Player NewPlayer1 = new Player();

        }
    }
}
