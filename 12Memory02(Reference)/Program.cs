using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


class Player
{
    public int AT = 10;
    public int HP = 100;

    //함수추가설명 
    //Monster _Monster 클래스가 객체화된 친구를 받다 
    public void ATT(Monster _Monster)
    {
        _Monster.HP -= AT;
    }

    public void TEST(int _Test)
    {
        _Test = 1000;
    }
}


class Monster
{
    public int AT = 10;
    public int HP = 100;

    //함수추가설명 
    public void ATT(Monster _Monster)
    {
        
    }
}

namespace _12Memory02_Reference_
{
    class Program
    {
        public static void Main(string[] args)
        {

            //클래스가 객체화된 친구는
            //레퍼런스 형이라고 하는 자료형이 되고 
            //우리가 계속 바왔던 
            //int bool 이런 친구는 값형이라고 함 
            //값형과 레퍼런스형은 메모리의 위치와 사용법이 다르기 때문에 
            //다르게 동작한다 

            Monster NewMonster = new Monster();
            //몬스터만들고


            // HP 100 AT10
            Player NewPlayer = new Player();
            //플레이어 만들고 


            //우리가 전강의에서 배웠던 대로라면
            //플레이어가 자신의 공격력으로 
            //몬스터를 떄린거죠
            //하지만 적용될일없음
            //잘못 이해할수 있음 
            NewMonster.ATT(NewPlayer);
            NewPlayer.ATT(NewMonster);

            //int Value = 100; 

            //NewPlayer.TEST(Value);
        }
    }
}
