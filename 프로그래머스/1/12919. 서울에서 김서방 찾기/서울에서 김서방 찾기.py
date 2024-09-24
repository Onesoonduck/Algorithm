def solution(seoul):
    num = 0
    
    for i in seoul:
        if i == "Kim":
            break
        num += 1
    return "김서방은 " + str(num) + "에 있다"
    