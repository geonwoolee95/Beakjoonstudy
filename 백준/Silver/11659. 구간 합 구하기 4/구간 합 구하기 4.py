import sys

input = sys.stdin.readline

N, M = map(int, input().split())

arr = list(map(int, input().split()))

S = [0] * (N + 1)  

for i in range(1, N + 1):
    S[i] = S[i - 1] + arr[i - 1] 

for _ in range(M):
    start, end = map(int, input().split()) 
    print(S[end] - S[start - 1])  
