# springboot-cloud-config-server

### Could not fetch remote for master remote: {git url}
* yml 파일 내 skip-ssl-validation: true 설정
* username, password 설정

### {label} 및 {name} 값에 '/' 가 포함된 경우
* Environment Controller 에서 `@RequestMapping` 을 수행
* `feature/test` 브랜치로 repo 에 application-dev.yml 이 존재하는 경우
    * http://localhost:8888/feature/test/application-dev.yml 로 호출 X
    * http://localhost:8888/feature(_)test/appliation-dev.yml 로 호출 O 
        * 해당 부분은 spring mvc 때문에 `(_)` 로 '/' 를 대신한다.
        * 해당 부분은 `org.springframework.cloud.config.environment.Environment normalize()` 참고
* `feature/test` 브랜치로 repo 내에 `sample` 이란 디렉토리 생성 이후 내부에 feature-test.yml 이 존재하는 경우
    * http://localhost:8888/feature(_)test/sample(_)feature-test.yml 로 호출 O
    * 해당 부분은 `org.springframework.cloud.config.environment.Environment normalize()` 참고    
        
