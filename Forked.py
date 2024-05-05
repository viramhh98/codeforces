test = int(input())

for i in range(test):
    knightOne, knightSec = map(int, input().split())
    kingOne, kingSec = map(int, input().split())
    queenOne, queenSec = map(int, input().split())

    king_knight = set([(kingOne + knightOne, kingSec + knightSec),
                       (kingOne + knightOne, kingSec - knightSec),
                       (kingOne - knightOne, kingSec + knightSec),
                       (kingOne - knightOne, kingSec - knightSec),
                       (kingOne + knightSec, kingSec + knightOne),
                       (kingOne + knightSec, kingSec - knightOne),
                       (kingOne - knightSec, kingSec + knightOne),
                       (kingOne - knightSec, kingSec - knightOne),
                       ])
    queen_knight = set([(queenOne + knightOne, queenSec + knightSec),
                        (queenOne + knightOne, queenSec - knightSec),
                        (queenOne - knightOne, queenSec + knightSec),
                        (queenOne - knightOne, queenSec - knightSec),
                        (queenOne + knightSec, queenSec + knightOne),
                        (queenOne + knightSec, queenSec - knightOne),
                        (queenOne - knightSec, queenSec + knightOne),
                        (queenOne - knightSec, queenSec - knightOne),
                        ])

    answer = 0
    for king_pos in king_knight:
        if king_pos in queen_knight:
            answer += 1
    print(answer)
