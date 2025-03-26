def solution(my_string):
    answer = ''
    for i in my_string:
        if i in "aeiou":
            pass
        else:
            answer += i
    return answer