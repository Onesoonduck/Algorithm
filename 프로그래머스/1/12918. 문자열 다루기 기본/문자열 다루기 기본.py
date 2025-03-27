def solution(s):
    if len(s) == 4 or len(s) == 6:
        for i in s:
            if i not in '0123456789':
                return False
        return True
    return False