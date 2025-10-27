코테 풀이과정 정리

코테 단계별로 천천히 한 단계 뿌셔보겠습니다.

---
## 배열 VS 리스트

| 항목               | 배열 (Array)                                                  | 리스트 (List)                                                 |
|--------------------|---------------------------------------------------------------|----------------------------------------------------------------|
| **구조**           | 연속된 메모리 공간에 요소 저장                                | 포인터를 통해 노드들이 연결된 구조 (연결 리스트)             |
| **크기 지정**      | 선언 시 고정된 크기                                            | 크기 제한 없음, 동적으로 변함                                 |
| **접근 속도**      | 인덱스를 통해 O(1)로 빠르게 접근 가능                         | 순차 접근이 필요하므로 O(n), 느림                              |
| **삽입/삭제 성능** | 중간에 삽입/삭제 시 뒤 요소를 이동시켜야 하므로 느림 (O(n))  | 포인터만 바꾸면 되므로 빠름 (O(1) 또는 O(n), 위치에 따라 다름) |
| **메모리 구조**    | 데이터만 저장                                                  | 데이터 + 포인터 저장                                           |
| **메모리 사용량**  | 포인터가 없으므로 상대적으로 적음                             | 포인터 저장 공간 때문에 메모리 사용량 많음                     |
| **활용에 적합한 상황** | 요소 수가 고정되어 있고 빠른 접근이 필요한 경우            | 요소 수가 자주 바뀌고 삽입/삭제가 빈번한 경우                  |
| **대표적인 구현체**| `int[]`, `String[]` 등 기본 배열                               | `LinkedList`, `ArrayList` (`ArrayList`는 내부적으로 배열 사용) |


## Scanner VS BufferedReader
| 항목                | Scanner                                        | BufferedReader                                 |
|---------------------|-----------------------------------------------|------------------------------------------------|
| **패키지**          | `java.util`                                   | `java.io`                                      |
| **입력 소스**       | 키보드, 파일 등 (`System.in`, `File`)         | 문자 기반 입력 스트림 (`InputStreamReader`)    |
| **속도**            | 상대적으로 느림 (내부적으로 파싱 포함)         | 빠름 (버퍼를 사용해 블록 단위로 처리)          |
| **사용 편의성**     | 쉬움 (정수, 문자열 등 다양한 타입 직접 파싱)   | 조금 복잡 (직접 파싱 필요, 기본은 문자열 입력) |
| **입력 메서드 예시**| `next()`, `nextLine()`, `nextInt()` 등         | `readLine()`                                   |
| **예외 처리**       | `NoSuchElementException`, `InputMismatchException` 등 | `IOException` 발생, 직접 처리 필요           |
| **버퍼링 여부**     | 기본 버퍼 크기 작음 (성능 한계 있음)           | 8192자 크기 기본 버퍼로 빠른 처리 가능         |
| **사용 예시**       | 간단한 콘솔 입력, 학습용                      | 대용량 파일 입력, 속도 중요할 때               |


# 커밋 메시지 & GitHub Flow 가이드

> 📌 **커밋 메시지 컨벤션 (Conventional Commits)**

| Type      | 의미 / 사용 시기                                       | 예시 메시지                        |
|-----------|--------------------------------------------------------|----------------------------------|
| feat      | 새로운 기능 추가                                      | feat: add login API               |
| fix       | 버그 수정                                             | fix: resolve null pointer error   |
| docs      | 문서 수정                                             | docs: update README               |
| style     | 코드 포맷, 세미콜론 누락, 공백 등 스타일 변경         | style: format code with prettier  |
| refactor  | 코드 리팩토링, 기능 변경 없음                          | refactor: improve service layer   |
| perf      | 성능 개선                                             | perf: optimize query speed        |
| test      | 테스트 코드 추가/수정                                  | test: add unit test for service  |
| chore     | 빌드, 패키지 관리, 기타 잡일                            | chore: update npm dependencies    |
| ci        | CI 설정 관련                                         | ci: add GitHub Actions workflow  |
| revert    | 이전 커밋 되돌리기                                    | revert: revert "feat: add login" |

---

## 🔹 GitHub Actions: Commitlint 설정

```yaml
# .github/workflows/commitlint.yml
name: Commit Message Lint

on:
  push:
    branches: [ "*" ]  # 모든 브랜치에 push 시 실행
  pull_request:       # PR 생성/업데이트 시 실행

jobs:
  commitlint:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Commitlint
        uses: wagoid/commitlint-github-action@v6
        with:
          configFile: .commitlintrc.json    
```

