# Login Registration Backend
  Complete login registration backend system using Spring Boot + Email Verification.
# What we use:
   Spring Boot
   Spring Security
   Java Mail
   Email verification with expiry
   Thymeleaf - to demonstrate loading some pages (homepage - no authorization needed / productpage - authorization needed)

#  Application flow:
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/56d5f169-db92-47d0-a510-b14e52465f0f)

# Explanation:

Basically, user can see homepage (/home, /index, /) but for other pages, user has to login
Fresh start of application:

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/eb7ed116-6551-4f22-ba24-49a8f15b8ae8)

Access pages:

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/63cabc62-dfec-4c05-9d33-f664827f2e25)
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/b4962e5b-7e8d-4281-b987-39d737da884e)
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/daa7a29c-83f6-4de1-bd9e-c4de92490760)
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/5879abd6-f63a-42c7-9176-7fd4b5857c41)

Ahead of that, user has to do the registration. (use Postman to send POST request for appuser & token creation)
  1. appuser data is saved into app_user table, token is saved into confirmation_token table. Relation between appuser & token is OneToMany. (a user can have multiple tokens)
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/b919ac5d-28e9-42a4-8a0e-0317ab3f4176)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/52743d32-6a6b-43bc-86ec-95bf37ff3a90)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/7ccbf91d-f4be-48b4-bd6d-53474a214b29)
  
  2. appuser is created with enable field = 'false' by default. In order for this user to be able to log in, must change this field to 'true'
  3. after registration, an email will be sent to user, user has to click on link to activate his/her account (including change from enable=false to enable=true)
     
  4. we need an Email server for testing, to do that, let's use maildev library in simple nodejs project
     if we access 'http://0.0.0.0:1080/' error will show up. let's update to 'http://localhost:1080' then it works
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/ce990850-0775-4130-aa1e-44f1584d382d)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/2f24ea95-c12c-4fb0-b163-cca632ae8ddb)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/377c720e-e744-4d7e-8673-905e425d62d7)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/c77b941f-9137-4580-a7e3-9ec15fd5f450)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/28d18f8d-3ee6-470d-91e5-aad489ba7b99)
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/18dca4a1-e5d6-4952-81d7-323a549e0b09)

# Generate a cURL from a request in Postman:
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/4e2f433a-dae8-4a37-9d56-b83e2957636f)



    




