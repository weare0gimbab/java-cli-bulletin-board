# ✅ CLI 자바 서비스 만들기 (콘솔 기반)

## 🎯 개요

**Java 콘솔 프로그램**으로 간단한 텍스트 게시판을 구현하는 프로젝트입니다.

Java 기본 문법, 클래스 및 객체지향 설계, 사용자 입력 처리, 그리고 데이터 저장 구조(ArrayList 등)를 연습합니다.

---

## 🧩 전체 기능
| 기능 | 설명 |
| --- | --- |
| 게시글 작성 | `write` 명령어 입력 시 제목/내용을 받아 새 게시글 생성 |
| 게시글 목록 | `list` 명령어 입력 시 모든 게시글을 번호순으로 출력 |
| 게시글 상세보기 | `detail [id]` 명령어로 특정 게시글 내용을 전체 확인 |
| 게시글 수정 | `update [id]` 명령어로 제목/내용을 수정 |
| 게시글 삭제 | `delete [id]` 명령어로 해당 글 삭제 |
| 종료 | `exit` 명령어로 프로그램 종료 |

## ⚙️ 주요 클래스 및 파일 구조 
```
src
├── main
│   └── java
│       └── com.ll
│           ├── domain.article
│           │   ├── controller
│           │   │   └── ArticleController.java     // 사용자 요청을 처리하는 컨트롤러
│           │   ├── repository
│           │   │   └── ArticleRepository.java     // 데이터 저장/조회 로직 
│           │   └── service
│           │       └── ArticleService.java        // 비즈니스 로직 
│           ├── global.rq
│           │   └── Rq.java                        // 요청 관련 공통 처리
│           ├── standard.util
│           │   ├── App.java                       // 프로그램 실행 진입점
│           │   ├── Article.java                   // 게시글 도메인 모델
└           └   └── Main.java                      // 메인 실행 클래스
...
```
