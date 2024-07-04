def solution(priorities, location):
    answer = 0
    queue = []
    
    while True:
        for i in range(len(priorities)):
            if max(priorities) == priorities[i]:
                queue.append(i)
                priorities[i] = 0

                if len(queue) == len(priorities):
                    break

        if len(queue) == len(priorities):
            break
            
    answer = queue.index(location) + 1
    
    return answer