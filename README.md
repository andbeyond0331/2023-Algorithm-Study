# 2023-Algorithm-Study

> 알고리즘 스터디입니다.

- 기간: 2023년 1월 26일~
- 정기 회의: 매주 목요일 8시
- 참고 사이트: [SWEA](https://swexpertacademy.com/main/main.do), [백준](https://www.acmicpc.net/)
- 언어: Java, ~~C++~~

## 스터디 규칙

#### 문제 풀이

1. 주마다 3문제씩 선정해서 문제 풀이를 진행함. 회의 시간에는 각자 1문제 풀이 설명.
   1. 개념+알고리즘+풀이 방식 자세하게 설명하기.
   2. 만약 상대가 이해 못하면 이해할 때까지 설명해야 함.
2. 깃허브 활용해서 Pull Request로 코드 리뷰 진행함.
   1. 서로에 대한 코드 리뷰는 토요일까지 완료하기.
   2. 반드시 코드 리뷰 후에 main branch로 merge.
   3. 기본적으로 올릴 때는 각자 이름으로 된 branch에 올림.
3. 코드 리뷰 받은 것에 대해서는 다음 회의 전까지 수정해서 다시 깃허브에 올리기.

#### 설명 방식

1. 적용 알고리즘 개념 간단하게 설명하기
2. 문제 풀이를 위한 접근 방식(or 개념) 설명
3. 기본 코드에 대한 설명
4. 추가적으로 개선한 코드에 대한 설명
5. 시간 복잡도, 공간 복잡도 계산 => 어려우면 실행 시간 캡처로 대체
6. 사용 라이브러리 정리
7. 기타(문제 풀이에 어려웠던 점, 구현하고자 했는데 실패한 방식)

#### 진행 방식

- 만약 주차에 해당하는 문제 풀이가 미완료 시, 회의 당일에 직접 문제 풀이 진행해야 함.
- 끝날 때까지 회의는 끝나지 않음..(열심히 하자..다른 사람을 생각하며)

## PR 규칙 및 Commit Message 규칙

#### Pull Request

- [SWEA-폴더명] 이름

- [Baekjoon-폴더명] 이름

#### Commit Message (폴더명으로도 가능)

- [SWEA-문제번호] 문제명

- [Baekjoon-문제번호] 문제명

## 파일 및 폴더 구조

#### SWEA

- SWEA/hw/폴더명/p문제번호_문제명.java
- ~~SWEA/hw/폴더명/p문제번호_문제명.cpp~~
- SWEA/mj/폴더명/p문제번호_문제명.java
- ~~SWEA/mj/폴더명/p문제번호_문제명.cpp~~

#### 백준

- Baekjoon/hw/폴더명/p문제번호_문제명.java
- ~~Baekjoon/hw/폴더명/p문제번호_문제명.cpp~~
- Baekjoon/mj/폴더명/p문제번호_문제명.java
- ~~Baekjoon/mj/폴더명/p문제번호_문제명.cpp~~

## 일정표

#### 1차 : D1, D2 맛보기 (SWEA + 백준)

| **주차** | **폴더명** | **문제 1**                                                                                                                                                                                                                                                          | **문제 2**                                                                                                                                                                                                                                                          | **문제 3**                                                                                                                                                                                                                                                             | **문제 4**                                               | **문제 5**                                              | **문제 6**                                               | **문제 7**                                                    | **진행 현황** |
|--------|--------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------|-------------------------------------------------------|--------------------------------------------------------|-------------------------------------------------------------|-----------|
| 1주차    | first_step | [홀수만 더하기](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QSEhaA5sDFAUq&categoryId=AV5QSEhaA5sDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1) | [평균값 구하기](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=1&contestProbId=AV5QRnJqA5cDFAUq&categoryId=AV5QRnJqA5cDFAUq&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=1&pageSize=10&pageIndex=1) | [백만 장자 프로젝트](https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=2&contestProbId=AV5LrsUaDxcDFAXc&categoryId=AV5LrsUaDxcDFAXc&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=2&pageSize=10&pageIndex=1) |                                                        |                                                       |                                                        |                                                             | `진행 완료`   |
| 2주차    | second_step | [스도쿠 검증](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Psz16AYEDFAUq)                                                                                                                                                           | [파리퇴치](https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AXuARWAqDkQDFARa)                                                                                                                                                     | [진기의 최고급 붕어빵](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LsaaqDzYDFAXc)                                                                                                                                                         | [영식이와친구들](https://www.acmicpc.net/problem/1592)        | [벌집](https://www.acmicpc.net/problem/2292)            ||                                                        |                                                             |     |
| 3주차    | third_step | [6485.삼성시의 버스 노선](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWczm7QaACgDFAWn)                                                                                                                                                  | [4789.성공적인 공연 기획](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWS2dSgKA8MDFAVT)                                                                                                                                                  | [1979.어디에 단어가 들어갈 수 있을까](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PuPq6AaQDFAUq)                                                                                                                                              | [BOJ-2798.블랙잭](https://www.acmicpc.net/problem/2798)   | [BOJ-2810.컵홀더](https://www.acmicpc.net/problem/2810)  | [BOJ-2851.슈퍼마리오](https://www.acmicpc.net/problem/2851) | [BOJ-2941.크로아티아 알파벳](https://www.acmicpc.net/problem/2941)  |           |
| 4주차    | fourth_step | [1220.[S/W 문제해결 기본] 5일차 - Magnetic Problem]( https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14hwZqABsCFAYD)                                                                                                                       | [5432.쇠막대기 자르기](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWVl47b6DGMDFAXm)                                                                                                                                                    | [1961.숫자 배열 회전](https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5Pq-OKAVYDFAUq)                                                                                                                                                       | [BOJ-2999.비밀이메일](https://www.acmicpc.net/problem/2999) | [BOJ-3985.롤케이크](https://www.acmicpc.net/problem/3985) | [BOJ-3052.나머지](https://www.acmicpc.net/problem/3052)   | [BOJ-8320.직사각형을만드는방법](https://www.acmicpc.net/problem/8320) |           |                                                                                                                                                                                                                                                                  | [타겟 넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)                                                                                                                                                                                                    |                                                      |                                                      |                                                        |                                                            |           |

#### 2차 :  A형 대비 (코드트리, SWEA, BOJ)

| **주차** | **폴더명**  | **문제 1**                                                                                                                                                                                                    | **문제 2**                                                                                                                                                                                             | **문제 3**                                                                                                                                                                                                                                                    | **문제 4**                                                                                                                                                                                    | **문제 5**                                                                                                                                                                                                  | **문제 6**                                                                                                                                                                                                           | **문제 7**                                                                                                                                                                                                                                             | **문제 8**                                                                                                                                                                                                               | **진행 현황** |
|--------|----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------|
| 5주차    | BOJ01    | [구슬 탈출2](https://www.acmicpc.net/problem/13460)                                                                                                                                                             | [2048](https://www.acmicpc.net/problem/12100)                                                                                                                                                        | [뱀](https://www.acmicpc.net/problem/3190)                                                                                                                                                                                                                   | [시험감독](https://www.acmicpc.net/problem/13458)                                                                                                                                               | [주사위 굴리기](https://www.acmicpc.net/problem/14499)                                                                                                                                                          | [테트리미노](https://www.acmicpc.net/problem/14500)                                                                                                                                                                     | [퇴사](12501)                                                                                                                                                                                                                                          | [연구소](https://www.acmicpc.net/problem/14502)                                                                                                                                                                           |           |
| 6주차    | codetree | [술래잡기](https://www.codetree.ai/training-field/frequent-problems/hide-and-seek/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%2588%25A0%25EB%259E%2598)                 | [예술성](https://www.codetree.ai/training-field/frequent-problems/artistry/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%2598%2588%25EC%2588%25A0%25EC%2584%25B1) | [꼬리잡기놀이](https://www.codetree.ai/training-field/frequent-problems/tail-catch-play/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EA%25BC%25AC%25EB%25A6%25AC%25EC%259E%25A1%25EA%25B8%25B0%25EB%2586%2580%25EC%259D%25B4) | [나무박멸](https://www.codetree.ai/training-field/frequent-problems/tree-kill-all/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EB%2582%2598%25EB%25AC%25B4) | [싸움땅](https://www.codetree.ai/training-field/frequent-problems/battle-ground/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%258B%25B8%25EC%259B%2580%25EB%2595%2585) | [산타의선물공장](https://www.codetree.ai/training-field/frequent-problems/santa-gift-factory/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%2582%25B0%25ED%2583%2580%25EC%259D%2598) | [코드트리 빵](https://www.codetree.ai/training-field/frequent-problems/codetree-mon-bread/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%25BD%2594%25EB%2593%259C%25ED%258A%25B8%25EB%25A6%25AC%2520%25EB%25B9%25B5) | [산타의 선물공장2](https://www.codetree.ai/training-field/frequent-problems/santa-gift-factory-2/description?page=1&pageSize=20&username=mjpark1329&tier=&tags=&statuses=&name=%25EC%2582%25B0%25ED%2583%2580%25EC%259D%2598) |           |

#### 3차: 자율 문제집 (백준)

| **주차** | **폴더명** | **문제1**                                                | **문제2**                                                    | **문제3**                                          | **진행 현황** |
| -------- | ---------- | -------------------------------------------------------- | ------------------------------------------------------------ | -------------------------------------------------- | ------------- |
| 15주차   | 15_week    | [부등호](https://www.acmicpc.net/problem/2529)           | [최솟값](https://www.acmicpc.net/problem/10868)              | [빗물](https://www.acmicpc.net/problem/14719)      | `진행 완료`   |
| 16주차   | 16_week    | [구간 곱 구하기](https://www.acmicpc.net/problem/11505)  | [스타트와 링크](https://www.acmicpc.net/problem/14889)       |                                                    | `진행 완료`   |
| 17주차   | 17_week    | [최소 스패닝 트리](https://www.acmicpc.net/problem/1197) | [퇴사](https://www.acmicpc.net/problem/14501)                |                                                    | `진행 완료`   |
| 18주차   | 18_week    | [행복 유치원](https://www.acmicpc.net/problem/13164)     | [극장 좌석](https://www.acmicpc.net/problem/2302)            |                                                    | `진행 완료`   |
| 19주차   | 19_week    | [지구 온난화](https://www.acmicpc.net/problem/5212)      |                                                              |                                                    | `진행 완료`   |
| 20주차   | 20_week    | [2xn 타일링 2](https://www.acmicpc.net/problem/11727)    | [LCS](https://www.acmicpc.net/problem/9251)                  | [소형기관차](https://www.acmicpc.net/problem/2616) | `진행 완료`   |
| 21주차   | 21_week    | [치킨 배달](https://www.acmicpc.net/problem/15686)       | [철벽 보안 알고리즘](https://www.acmicpc.net/problem/9322)   |                                                    | `진행 완료`   |
| 22주차   | 22_week    | [빙고](https://www.acmicpc.net/problem/2578)             | [마법사 상어와 토네이도](https://www.acmicpc.net/problem/20057) |                                                    | `진행 완료`   |
| 23주차   | 23_week    | [연구소](https://www.acmicpc.net/problem/14502)          | [바이러스](https://www.acmicpc.net/problem/2606)             |                                                    | `진행 완료`   |

#### 4차: 타임 어택 문제 풀이 (프로그래머스) & 자율 문제집 (백준)

| **주차** | **폴더명** | **타임어택 문제1**                                           | **자율 문제1**                                               | **진행 현황** |
| -------- | ---------- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------- |
| 24주차   | 24_week    | [숫자 문자열과 영단어](https://programmers.co.kr/learn/courses/30/lessons/81301?language=python3) |                                                              | `진행 완료`   |
| 25주차   | 25_week    | [거리두기 확인하기](https://programmers.co.kr/learn/courses/30/lessons/81302?language=python3) | [단어수학](https://www.acmicpc.net/problem/1339)             | `진행 완료`   |
| 26주차   | 26_week    | [수식 최대화](https://programmers.co.kr/learn/courses/30/lessons/67257?language=python3) |                                                              | `진행 완료`   |
| 27주차   | 27_week    | [튜플](https://programmers.co.kr/learn/courses/30/lessons/64065?language=python3) |                                                              | `진행 완료`   |
| 28주차   | 28_week    | [파일명 정렬](https://programmers.co.kr/learn/courses/30/lessons/17686?language=python3) |                                                              | `진행 완료`   |
| 29주차   | 29_week    | [n진수 게임](https://programmers.co.kr/learn/courses/30/lessons/17687) |                                                              | `진행 완료`   |
| 30주차   | 30_week    | [주차 요금 계산](https://programmers.co.kr/learn/courses/30/lessons/92341?language=python3) |                                                              | `진행 완료`   |
| 31주차   | 31_week    | [k진수에서 소수 개수 구하기](https://programmers.co.kr/learn/courses/30/lessons/92335) |                                                              | `진행 완료`   |
| 32주차   | 32_week    | [멀쩡한 사각형](https://programmers.co.kr/learn/courses/30/lessons/62048) |                                                              | `진행 완료`   |
| 33주차   | 33_week    | [불량 사용자](https://programmers.co.kr/learn/courses/30/lessons/64064?language=python3) |                                                              | `진행 완료`   |
| 34주차   | 34_week    | [방금그곡](https://programmers.co.kr/learn/courses/30/lessons/17683?language=python3) |                                                              | `진행 완료`   |
| 35주차   | 35_week    | [모음사전](https://programmers.co.kr/learn/courses/30/lessons/84512) |                                                              | `진행 완료`   |
| 36주차   | 36_week    | [n^2 배열 자르기](https://programmers.co.kr/learn/courses/30/lessons/87390) |                                                              | `진행 완료`   |
| 37주차   | 37_week    | [피로도](https://programmers.co.kr/learn/courses/30/lessons/87946) |                                                              | `진행 완료`   |
| 38주차   | 38_week    | [교점에 별 만들기](https://programmers.co.kr/learn/courses/30/lessons/87377) |                                                              | `진행 완료`   |
| 39주차   | 39_week    | [삼각달팽이](https://programmers.co.kr/learn/courses/30/lessons/68645) | [토마토](https://www.acmicpc.net/problem/7569)               | `진행 완료`   |
| 40주차   | 40_week    | [빛의 경로 사이클](https://programmers.co.kr/learn/courses/30/lessons/86052) | [진우의 민트초코우유](https://www.acmicpc.net/problem/20208) | `진행 완료`   |
| 41주차   | 41_week    |                                                              | [그림](https://www.acmicpc.net/problem/1926)                 | `진행 완료`   |
| 42주차   | 42_week    | [점프와 순간이동](https://programmers.co.kr/learn/courses/30/lessons/12980) | [네트워크 연결](https://www.acmicpc.net/problem/1922)        | `진행 완료`   |
| 43주차   | 43_week    | [스킬트리](https://programmers.co.kr/learn/courses/30/lessons/49993) | [로봇청소기](https://www.acmicpc.net/problem/14503)          | `진행 완료`   |
| 44주차   | 44_week    | [양과 늑대](https://school.programmers.co.kr/learn/courses/30/lessons/92343) | [벽 부수고 이동하기](https://www.acmicpc.net/problem/2206)   | `진행 완료`   |
| 45주차   | 45_week    | [카드 짝 맞추기](https://school.programmers.co.kr/learn/courses/30/lessons/72415) | [일루미네이션](https://www.acmicpc.net/problem/5547)         | `진행 완료`   |
| 46주차   | 46_week    | [2개 이하로 다른 비트](https://school.programmers.co.kr/learn/courses/30/lessons/77885) | [탈출](https://www.acmicpc.net/problem/3055)                 | `진행 완료`   |
| 47주차   | 47_week    | [110 옮기기](https://school.programmers.co.kr/learn/courses/30/lessons/77886) | [평범한 배낭](https://www.acmicpc.net/problem/12865)         | `진행 완료`   |
| 48주차   | 48_week    | [배달](https://school.programmers.co.kr/learn/courses/30/lessons/12978) | [상자 배달](https://www.acmicpc.net/problem/14947)           | `진행 완료`   |
| 49주차   | 49_week    | [퇴사 2](https://www.acmicpc.net/problem/15486)              | [드래곤 커브](https://www.acmicpc.net/problem/15685)         | `진행 완료`   |
| 50주차   | 50_week    | [기능 개발](https://school.programmers.co.kr/learn/courses/30/lessons/42586) |                                                              | `진행 완료`   |
| 51주차   | 51_week    | [두 큐 합 같게 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/118667) | [숨바꼭질 2](https://www.acmicpc.net/problem/12851)          | `진행 완료`   |
| 52주차   | 52_week    | [전력망을 둘로 나누기](https://school.programmers.co.kr/learn/courses/30/lessons/86971) | [N번째 큰 수](https://www.acmicpc.net/problem/2075)          | `진행 완료`   |
| 53주차   | 53_week    | [뱀](https://www.acmicpc.net/problem/3190)                   | [JadenCase 문자열 만들기](https://school.programmers.co.kr/learn/courses/30/lessons/12951) | `진행 완료`   |
| 54주차   | 54_week    | [트리의 독립집합](https://www.acmicpc.net/problem/2213)      | [124 나라의 숫자](https://school.programmers.co.kr/learn/courses/30/lessons/12899) | `진행 완료`   |
| 55주차   | 55_week    |                                                              | [양궁대회](https://school.programmers.co.kr/learn/courses/30/lessons/92342) | `진행 완료`   |
