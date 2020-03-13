# 13032020 1day 1commit 

# 3. 조건문 - 조건식 python 

# 다양한 조건 표현법을 배워보자!
# if와 같이 조건문에 들어가는 조건식은  참이나 거짓으로 
# 판명되어 실행할지 실행하지 않을지 판단하게 된다
# 부등호를 비롯해 익숙한 비교와 boolean 연산이 있다 

# 파이썬에서 == 는 같다 , != 는 틀리다 

#boolean은 참이나 거짓값만을 가지고 특별한 연산 
#여러조건을 합쳐서 새로운조건을 만들때 쓰임 

#and, or, not 
#and ; 두 조건중 하나라도 참 이면 참 
#or ; 둘중 하나만 참이면 참 
#not ; true는 false, false는 true 로 




#파트3 조건문 - 블럭 

#if를 쓸 때 콜론기호와 들여쓰기에 관한 것 

if True:
    print('블럭에 속한 코드')

#콜론 다음에 들여쓴 코드는 블럭이라고 함 
#블럭은 여러줄을 쓸 수 있는데 모든 줄이 들여쓰기가 일치해야한다
#덜 들여쓰든, 더 들여쓰든 둘 다 문법오류가 남 
#블럭을 마치고 싶을때는 내어쓰면 된다. 한번 끝난 블럭은 다시 열거 
#할 수 없다 


#블럭 안에는 다른 블럭이 들어갈 수 있음 
#ex;

if True:
    print('블럭에 속한 코드')

    if False:
        print('한 줄 더')
    
    if True:
        print('블럭의 끝 코드')

        if True:
            print('블럭 하나 더')

        print('블럭의 끝 코드')

print('블럭 끝')




# 조건이 맞지않아 실행되지 않는 블럭 예 
#ex;

if False:
    print('조건이 맞지 않는 코드')
    
    if True:
        print('조건이 맞지 않는 코드')

    print('어쨋든 실행되지 않는 코드')

print('다시 바깥에 있는 코드')




#블럭의 구조 !! 

#블럭은 함께실행되는 코드 덩어리 
#if조건문에서는 조건에따라 블럭전체가 실행되거나 실행되지 않는다 
#블럭안에는 다른 블럭이 들어갈 수 있다
#안에 있는 블럭은 밖의 블럭의 종속절이고 밖에 블럭이 실행되어야
#안에 있는 블럭이 실행될 수 있다 