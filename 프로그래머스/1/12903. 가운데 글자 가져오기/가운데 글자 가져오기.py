def solution(s):
    i = len(s)
    mid = i // 2

    if i % 2 == 0:
        return s[mid - 1:mid + 1]
    else:
        return s[mid] 
