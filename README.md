<div align="center">
    <img src="https://img.shields.io/badge/Ubuntu-20.04.3 LTS-E95420?style=flat&logo=Ubuntu&logoColor=white"/><img src="https://img.shields.io/badge/MySQL-8.0.28-4479A1?style=flat&logo=MySQL&logoColor=white"/><img src="https://img.shields.io/badge/NGINX-1.18.0(ubuntu)-009639?style=flat&logo=NGINX&logoColor=white"/><br/><img src="https://img.shields.io/badge/Vue.js-3.2.31-4FC08D?style=flat&logo=Vue.js&logoColor=white"/><img src="https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=HTML5&logoColor=white"/><img src="https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=CSS3&logoColor=white"/><img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=white"/><br/><img src="https://img.shields.io/badge/GitLab-FCA121?style=flat&logo=GitLab&logoColor=white"/><img src="https://img.shields.io/badge/Jira-0052CC?style=flat&logo=Jira Software&logoColor=white"/><img src="https://img.shields.io/badge/Notion-000000?style=flat&logo=Notion&logoColor=white"/><img src="https://img.shields.io/badge/Mattermost-0058CC?style=flat&logo=Mattermost&logoColor=white"/></div>


![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)![Jenkins](https://img.shields.io/badge/jenkins-%232C5263.svg?style=for-the-badge&logo=jenkins&logoColor=white)![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white)![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)![Bootstrap](https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
# 🌐 Today News Topic
<img src="https://user-images.githubusercontent.com/71022555/163238278-ef226ea8-8388-4a9c-ad60-ed3288128266.png" width="400" height="400">  

## 당일 뉴스들의 주요 키워드 및 통계를 보여주고 오늘의 뉴스의 전반적인 기사경향을 한 눈에 알아볼 수 있도록 기사를 가공하여 정보를 제공하는 서비스

# ❔ 기획 배경
### - 뉴스 기사를 수집하고 한눈에 뉴스 동향을 파악할 수 있도록
### - 카테고리 순위, 키워드 순위를 제공하여 현재 중요한 뉴스가 무엇인지 알 수 있게 하려고

# 🟪 요구사항 명세서
![image](https://user-images.githubusercontent.com/71022555/163241793-b22017cf-50f5-422e-9f69-4d6f5b8fb25d.png)
# 📢 역할 분담
## Frontend
- 김승수 : 메인 페이지 워드 클라우드
- 이소영 : 공지사항 및 차트, 뉴스 검색 페이지
- 정희연 : 회원관리, 메인페이지 ,인기 키워드
- 전영서 : 프론트 구조
## Backend
- 권영현 : 인기 키워드 REST API, 뉴스 크롤링, 뉴스 REST API, 배포
- 이소영 : 공지사항 게시판
- 정희연 : 회원 REST API
- 김승수 : 뉴스 크롤링, HDFS 테스트


# ⚙ 기술 스택 및 아키텍쳐 (하둡 부분은 현재 미구현)
![image](https://user-images.githubusercontent.com/71022555/163239776-13f5b05d-fcb3-4781-b1a1-53963817e806.png)
  
## 기본 개발 환경 💾 


1. ### JAVA 11
2. ### Front-end
    - Vue3
    - Vuex4    
    - Bootstrap 5
3. ### Back-end
    - SpringBoot
    - JPA
4. ### DB
    - MariaDB
    - Redis
5. ### 기타 기술
    - Jenkins
    - AWS
    - Docker
    

# 🎐 Git 규칙
## Git branch 구조 ( ⛔철저히 규칙 준수)

- master
- develop (default branch)
    - front
        - feature/A
        - feature/B
        - feature/C
    - back
        - feature/A
        - feature/B
        - feature/C

### EX) Fix:  Fix User Bug function [#S06P11B201-9](https://meeting.ssafy.com/s06p11b2/channels/gitlab-jira-mm----2-1#)       Feat: “추가 get data api 함수 [#S06P11B201-9](https://meeting.ssafy.com/s06p11b2/channels/gitlab-jira-mm----2-1#)

### README 작성 예시 - `Docs: 220113 이상백 README 작성`

1️⃣ **태그**

태그 뒤에는 ": "를 붙여 제목과 구별할 수 있도록 합니다.

**기능**

Feat, Fix, Design, !BREAKING CHANGE 태그가 기능 태그의 종류입니다.  추가적인 문맥 정보를 제공하기 위한 목적으로 괄호 안에 적을 수도 있습니다. ex) **"Feat(navigation): ""Fix(database): "**

**개선**

Style, Refactor, Comment 태그가 개선 태그의 종류입니다.  Style의 경우 오타 수정, 탭 사이즈 변경, 변수명 변경 등에 해당하고, Refactor의 경우 코드를 리팩토링 하는 경우에 적용할 수 있습니다.

**그 외**

Docs의 경우 README.md 수정 등에 해당하고, Test는 test 폴더 내부의 변경이 일어난 경우에만 해당합니다. Chore의 경우 package.json의 변경이나 dotenv의 요소 변경 등, 모듈의 변경에 해당됩니다.

2️⃣ **제목 규칙**

1. 제목의 처음은 동사 원형으로 시작합니다.

2. 총 글자 수는 50자 이내로 작성합니다.

3. 마지막에 특수문자는 삽입하지 않습니다. 예) 마침표(.), 느낌표(!), 물음표(?)

4. 제목은 **개조식 구문**으로 작성합니다.

**영어로 작성하는 경우 다음의 규칙을 따릅니다**.

1. 첫 글자는 **대문자**로 작성합니다.

2. "Fix", "Add", "Change"의 명령어로 시작합니다.

한글**로 작성하는 경우 다음의 규칙을 따릅니다**.

1. "고침", "추가", "변경"의 명령어로 시작합니다.

**예시)**

Fix:  Fix User Bug function

Feat: "추가 get data api 함수"
  
---

# 🕐 실행 화면
![메인1](https://user-images.githubusercontent.com/71022555/163242299-5653657e-a2cf-42a1-a1c5-dee627658933.png)
![메인2](https://user-images.githubusercontent.com/71022555/163242311-ebffeba0-c464-4be5-bd7d-5e4ff52a46c4.png)

