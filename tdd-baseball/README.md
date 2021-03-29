# TDD Baseball Game

## 세 자리 숫자를 맞추는 야구 게임

- 세 자리 수를 입력 받아 결과를 반환한다

## 결과에 대한 반환 값은 다음의 속성을 가지는 객체로 한다

- Boolean solved
- int strikes
- int balls

## 다음의 경우 예외처리 후 게임을 종료한다

- 입력 값이 없을 경우
- 자리 수가 세 자리가 아닐 경우
- 숫자 외의 문자가 입력될 경우
- 중복된 숫자가 입력될 경우

# TDD 법칙

1. 가장 쉽게 구현할 수 있는 테스트부터 시작한다
2. 실패하는 테스트 케이스를 만든다 (Red)
3. 실패하는 테스트 케이스를 성공하도록 최소한의 소스를 수정한다 (Green)
    - 필요하면 하드코딩한다.
4. 리팩토링이 필요하면 수행한다 (Refactoring)
    - 중복을 제거한다 / 비슷한 중복을 완전한 중복으로 변경한다
    - Extract method / Extract to local variable / Inline local variable 등 활용
5. 새로운 실패하는 테스트 케이스를 만든다
6. 1 ~ 5의 반복을 통해 구체화되는 테스트 케이스로 일반화된 소스 코듣를 작성한다

# Baseball Game 테스트 케이스 예시

1. 입력 값이 없을 경우
2. 입력 값의 자리 수가 세 자리가 아닐 경우
3. 입력 값에 숫자 외의 문자가 입력될 경우
4. 입력 값에 중복된 숫자가 입력될 경우
5. 숫자 세 개가 전부 일치하는 경우
6. 숫자 세 개가 전부 일치하지 않을 경우
7. 스트라이크만 있는 경우
8. 볼만 있는 경우
9. 볼과 스트라이크가 함께 있는 경우