# springboot-cloud-config-client

### 의존성 관리
* `implementation 'org.springframework.boot:spring-boot-starter-actuator'`
* `implementation 'org.springframework.cloud:spring-cloud-starter-config'`
* `implementation 'org.springframework.cloud:spring-cloud-starter-web'`

세 개만 최소한으로 일단 구성되어 있으면 작동하는데 큰 문제는 없음. web 어 없을 시, 임베디드 톰캣이 없기 때문에 실행하자마자 프로세스가 종료된다.