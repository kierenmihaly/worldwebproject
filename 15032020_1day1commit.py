# 조건문 파트3 - if else 
# if 조건문에서 조건이 맞지 않는 경우!! 
# 조건이 맞지 않을 때 쓰는 코드 = else 

# else 는 반드시 이프뒤에만 따라나와야하고 혼자서 쓸 수 없다 
# syntax라는 것은 문법이라 부르는것과 비슷한것이다 

SCISSOR = 'scissor'
ROCK = 'rock'
PAPER = 'paper'

WIN = 'win'
DRAW = 'draw'
LOSE = 'lose'

mine = 'scissor'
yours = 'rock'

if mine == yours:
    result = DRAW 

else:
    if mine == SCISSOR:
        if yours == ROCK:
            result = LOSE
        else:
            result = WIN
    else:
        if mine == ROCK:
            if yours == PAPER:
                result = LOSE
            else:
                result = WIN
        else:
            if mine == PAPER:
                if yours == SCISSOR:
                    result = LOSE
                else:
                    result = WIN
            else:
                print('weird')

print(result)

# else ; 조건이 맞지 않을 경우 항상 실행 
# elif ; 조건이 맞지않으면 다른조건을 검사하게 해주는 코드 

