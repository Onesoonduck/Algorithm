def solution(a, b):
    A = int(str(a) + str(b))
    c = 2 * a * b
    
    if A > c:
        answer = A
    elif A < c:
        answer = c
    else :
        answer = A
    
    return answer