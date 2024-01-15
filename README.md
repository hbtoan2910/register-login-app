# Login Registration Backend
  Complete login registration backend system using Spring Boot + Email Verification.
# What we use in our application:
   - Spring Boot
   - Spring Security
   - Java Mail
   - Email verification with expiry
   - Thymeleaf - to demonstrate loading some pages (homepage - no authorization needed / productpage - authorization needed)

#  Application flow:
![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/56d5f169-db92-47d0-a510-b14e52465f0f)

# Explanation:

Basically, user can see homepage (/home, /index, /) but for other pages, user has to login.

Fresh start of application:

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/eb7ed116-6551-4f22-ba24-49a8f15b8ae8)

Access pages:

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/63cabc62-dfec-4c05-9d33-f664827f2e25)

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/b4962e5b-7e8d-4281-b987-39d737da884e)

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/daa7a29c-83f6-4de1-bd9e-c4de92490760)

![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/5879abd6-f63a-42c7-9176-7fd4b5857c41)

Ahead of that, user has to do the registration. (use Postman to send POST request for appuser & token creation)

  1. appuser data is saved into app_user table, token is saved into confirmation_token table. Relation between appuser & token is OneToMany. (a user can have multiple tokens)
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/8a55a38d-5511-444c-8be9-ee1ed6e39d0c)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/2bb355cf-2608-4ada-acaa-0d7eed1483fd)
  
  3. appuser is created with enable field = 'false' by default. In order for this user to be able to log in, must change this field to 'true'
     
  4. after registration, an email will be sent to user, user has to click on link to activate his/her account (including change from enable=false to enable=true)
     
  5. we need SMTP server + web interface for testing, to do that, let's use 'maildev' library in simple nodejs project.
     
     ('maildev' : SMTP Server + Web Interface for viewing and testing emails during development)
     
     if we access 'http://0.0.0.0:1080/' error will show up. let's update to 'http://localhost:1080' then it works.
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/135a987a-cc05-4462-bece-5c953b590ce9)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/ce990850-0775-4130-aa1e-44f1584d382d)
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/2f24ea95-c12c-4fb0-b163-cca632ae8ddb)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/10b59502-9675-4d86-abe6-bb5ec07f010c)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/0911ede0-2e4a-467a-adee-37b6bcd011cb)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/60df5a89-ada3-4a4b-8a02-97ae5264f5ee)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/640f8f80-22cf-45df-a79c-c8272d283b70)

     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/3b27386b-8d68-4d15-910b-63f32bce1146)

     Finally, user Alice can access /product page.
     
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/bfa15edf-2d3c-4a5b-ae29-4d8741958d31)

# Generate a cURL from a request in Postman:
     ![image](https://github.com/hbtoan2910/register-login-app/assets/59778636/9ed3bdeb-0673-4a45-abe3-632cb3e32ebb)




    




