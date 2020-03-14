#14032020

#파트3 조건문 - 파이썬 if else


SCISSOR = '가위'
ROCK = '바위'
PAPER = '보'

WIN = "win"
DRAW = 'draw'
LOSE = 'lose...'

mine = '가위'
yours = '바위'

if mine == yours:
        result = DRAW

        #짧은 if 와 else를 많이 쓰는방법 ))
else:
    if mine == SICSSOR: #내가 낸게 가위
        if yours == ROCK:
            result = LOSE
        else: #아니라면 이겼다
            result = WIN
    else: #가위가 아닌경우
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


#elif
#else 와 if 블럭두개를 파이썬에서는 한개로 합칠 수 있다

#else 와 elif
#if의 조건이 맞지 않을 때 실행하는 코드
# else는 조건이 맞지 않을 경우 항상 실행되는 경우
#elif 는 조건이 맞지 않을 경우 다른조건을 검사하게 해주는 코드
