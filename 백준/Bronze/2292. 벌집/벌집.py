def find_honeycomb_distance(n):
    if n == 1:
        return 1  # 중앙 방은 1칸
    layer = 1  # 현재 몇 번째 레이어인지 (칸 수)
    range_end = 1  # 현재 레이어의 마지막 번호
    while n > range_end:
        range_end += 6 * layer  # 다음 레이어의 마지막 번호
        layer += 1  # 레이어를 1 증가
    return layer

n = int(input())
print(find_honeycomb_distance(n))
