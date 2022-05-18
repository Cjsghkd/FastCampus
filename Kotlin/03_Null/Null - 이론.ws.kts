NULL
- 상태를 모름, 존재하지 않음
- 0과는 다르다
-> 0 : 두루마리휴지에서 심지만 남은 상태, Null : 두루마리휴지가 없음
- Null을 대상으로는 연산을 할 수 없다 (+,-,*,/)
    - Null + 3  = Null
    - 비교연산은 가능하다

코드 1줄
코드 2줄
코드 3줄
코드 4줄  c = a + b
발생할 수 있는 문제
- a or b 가 Null인 경우 에러 발생
해결 방법
- 더하기 연산을 하기 전에, 코드 3줄에서 a or b가 Null인지 확인

NullSafety (Null로 부터 안전해지자)
- 코틀린의 가장 큰 특징중 하나

Null의 필요성?
- 변수에 값 + 상태도 표현할 수 있다면 좋은거 아닌가?


Null을 표현 하는 방법
val/var 변수명 : 자료형 = 값
- Null은 값 자리에 들어 올수 있다.
    val/var 변수명 : 자료형 = null

- val/var 변수명 : 자료형? = 값
    - val number : Int? = null -> null 가능
    - val number : Int = 10 -> null 불가능