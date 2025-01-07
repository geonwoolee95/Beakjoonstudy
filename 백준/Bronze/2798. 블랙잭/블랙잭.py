from itertools import combinations

def blackjack(N, M, cards):
    max_sum = 0
    for combo in combinations(cards, 3):
        current_sum = sum(combo)
        if current_sum <= M:
            max_sum = max(max_sum, current_sum)
    return max_sum

if __name__ == "__main__":
    N, M = map(int, input().split())
    cards = list(map(int, input().split()))  
    
    print(blackjack(N, M, cards))