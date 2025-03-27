def solution(numbers):
    answer = 0
    num = 0
    sumnum = sum(numbers)
    
    for i in range(10):
        num += i
    
    if num > sumnum:
        answer = num - sumnum
    return answer