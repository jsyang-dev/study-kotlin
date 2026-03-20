# 게시판 CRUD API 구현 — Code Quest

> Kotlin/Spring Boot를 실전 코딩과 AI 코드 리뷰로 학습하는 프로젝트입니다.

## 학습 목표

게시판 CRUD API 구현

## Tech Stack

- Language: Kotlin
- Framework: Spring Boot

## 진행 방법

1. Issue 목록에서 Level 1부터 시작하세요
2. 새 브랜치를 생성하세요: `git checkout -b feature/level-1-project-setup`
3. 코드를 직접 작성하세요 (AI가 대신 짜주지 않습니다!)
4. PR을 생성하고 본문에 `Closes #1`을 포함하세요
5. AI 코드 리뷰를 확인하고, 필요하면 수정 후 다시 push하세요
6. APPROVE를 받으면 merge하고 다음 Level로 이동하세요

```
Issue → Branch → Implement → PR (Closes #N) → AI Review → Fix → Re-review → Merge → Next
```

## Feature List

| Level | Title | Issue |
|-------|-------|-------|
| 1 | 프로젝트 초기 설정 및 Health Check API | #TBD |
| 2 | 게시글 도메인 모델 및 JPA 엔티티 설정 | #TBD |
| 3 | 게시글 생성 API (POST) | #TBD |
| 4 | 게시글 조회 API (GET 목록 + 단건) | #TBD |
| 5 | 게시글 수정 API (PUT) | #TBD |
| 6 | 게시글 삭제 API (DELETE) 및 Soft Delete 구현 | #TBD |
| 7 | 유효성 검사, 페이지네이션 및 검색 | #TBD |

## 비용 안내

| 프로바이더 | 기본 모델 | PR당 예상 비용 |
|----------|--------------|-----------------|
| Anthropic (권장) | claude-sonnet-4-20250514 | ~$0.01-0.05 |
| OpenAI | gpt-4o | ~$0.01-0.05 |
| Google Gemini | gemini-2.0-flash | ~$0.005-0.02 |

- 월 예상 비용 (하루 2-3 PR 기준): ~$1-5
- 모델 변경: `Settings > Variables > Actions` → `REVIEW_MODEL` 설정
- 리뷰 언어 변경: `REVIEW_LANG` 변수 설정 (기본값: `Korean`)

## 설정

### 필수 (프로바이더 중 하나 선택)

1. GitHub repo → `Settings > Secrets and variables > Actions > Secrets`
2. `New repository secret` → 다음 중 **하나** 추가:
   - `ANTHROPIC_API_KEY` — [Anthropic Claude](https://console.anthropic.com) (권장)
   - `OPENAI_API_KEY` — [OpenAI GPT](https://platform.openai.com/api-keys)
   - `GEMINI_API_KEY` — [Google Gemini](https://aistudio.google.com/apikey)

설정된 키를 자동으로 감지하여 프로바이더를 선택합니다.

### 선택 변수 (Variables)

- `AI_PROVIDER`: 프로바이더 강제 지정 (`anthropic`, `openai`, `gemini`). 생략 시 자동 감지.
- `REVIEW_MODEL`: 모델 오버라이드 (기본값은 프로바이더에 따라 다름)
- `REVIEW_LANG`: 리뷰 응답 언어 (기본값: `Korean`)

## 제한 사항

- **Fork PR 미지원**: 보안 제한으로 같은 레포지토리의 브랜치 PR만 리뷰됩니다
- **Diff 크기 제한**: 50KB 초과 시 잘림 (커밋을 작게 유지하세요)
- **비공개 레포**: GitHub Actions 무료 플랜은 월 2,000분 제한
