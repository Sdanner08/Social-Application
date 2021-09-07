# Social-Application
Social Application to connect with your friends



### Members:

1. David Burton
2. Angel Walker
3. Trevor Drury
4. Shane Danner



## Project Parameters

### Users Can :

* Register
* Login/Logout.
* Reset their password.
  * Email feature.
* Modify their information.
* Upload a profile picture (using AWS: S3).
* Search other people.
* Create a post.
  *  Image(s) can be added to these posts (using AWS: S3).
* View his own profile.
  *  Including posts.
* View others’ profile.
  *  Including posts.
* See their feed.
  *  Posts of everyone should show here.
  *  Pagination should be implemented (only fetching 20 posts at a
     time).
* Like someone’s post.
  *  Old school Facebook, only one type of like.



### Roles:

**Backend**

1) David
2) Shane

**Frontend**

3) Angel
4) Trevor



### Programs/Libraries used:

**BackEnd :**

1) Spring MVC
2) Hibernate or SpringORM or SpringData
3) Java
4) Postgres
5) AWS EC2
6) AWS S3
7) Junit/Mockito/H2?
8) Log4J
9) Javadoc

**FrontEnd :**

1) Angular
2) TypeScript
3) JavaScript
4) Jasmine

**Deployment :**

1) AWS or Docker?
2) Deploying the FrontEnd is it the same?



## Backend Requirements

----Link to Diagram of Backend end result

**Tests :**
What are we testing?

* Testing Tools?

**Hibernate :**

* Models
* Database
  ????

**Register, Models and database**

* Sessions 
* register- email password
* forgot password will email them their temp pass
* Modify info

- Dummy email
- Google interface for handling email
- AWS S3 upload a picture- handle saving URL to database



### Backend endpoints (Need to finalize this list)

|         Action          |           Endpoint            |
| :---------------------: | :---------------------------: |
|        **Login**        |    `POST /api/getOneUser`     |
|       **Logout**        |      `POST /api/Logout`       |
|       **Session**       |   `POST /api/CheckSession`    |
|       **Sign Up**       |    `POST /api/CreateUser`     |
|       **Forgot**        | `POST /api/getUserByUsername` |
|   **Submit Profile**    |   `POST /api/CreateProfile`   |
|   **Update Profile**    |  `PATCH /api/UpdateProfile`   |
|    **Show Profile**     |    `GET /api/getUserById`     |
|      **Add Post**       |    `POST /api/CreatePost`     |
|     **Delete Post**     |    `POST /api/DeletePost`     |
|     **Add Comment**     |    `POST /api/PostComment`    |
|  **Add YouTube Video**  |                               |
|   **Show All Posts**    |                               |
| **Show Filtered Posts** |                               |



### Models (Need to finalize this list)

**User Model**

* Integer Id: serial
* String name not null
* String username Unique not null
* String password not null
* String email Unique not null
* String aboutMe char(250) not null
* Date Birthday int 
* String picUrl not null

**Post Model**

* Integer Id: serial
* String picUrl not null
* String PostText char(250) not null
* Integer UserFK reference User id
* YouTube link??????

**Comment Model**

* Integer Id: serial
* String CommText char(250) not null
* Integer PostIdFK:
* Integer UserIdFK:			
  	

**Like Composite Model**?????

* Shane 



## Frontend Requirements

----Link to Diagram of Frontend end result

### Angular (component = comp)

**Views to Display :**

- **Login**
  - Nav Bar comp
  - Login Form comp
  - Forgot Password comp
  - Sign up - directs them to CreateProfile page

- **Profile/Create Profile/update**
  - Nav Bar comp
  - Update Info	
  - Add picture
- **Feed**
  - Nav Bar comp
  - Filter by person
  - (Reuse Create Post Comp to display post?)
  - main Feed (Shows everyone's post)
    - Only show 20 post and load more as needed
- **Create Post**
  - Nav Bar comp??
  - Add image
   - Text- when we create the post
  - Like it
  - comment on (Optional)



## Delivery Day

* 9/4)	(weekend - Optional Day off)
  	(Design flow)
  	(set up repo - branches)
  	(set up communication paths we want to talk to each other)
  	(Jenkins --Are we using it? this would need groovy??)
   	1) David - Discord Server set up
  	2) Shane - Repo set up
  	3) Angel -
  	4) Trevor -

* 9/5) (weekend - Optional Day off)
  	(Coding start)
  1. David - 
  2. Shane -
  3. Angel -
  4. Trevor -

* 9/6)	(Models, Database, Dao, DaoImpl, ???? delivery)
  	(Rough idea of Frontend look)
   	1) David - AWS Setup (Dao, DaoImp depending on spring)
  	2) Shane - Models, Database, H2
  	3) Angel - We will need to deploy Angular as well...
  	4) Trevor -

* 9/7)	(Rough set up of front end)
  	(Connection endpoints delivered)
   	1) David - 
  	2) Shane - endpoints??
  	3) Angel -
  	4) Trevor -

* 9/8)
  	1) David - 
    	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/9)
  	1) David - 
    	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/10)
  	1) David - 
    	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/11)
  	1) David - 
    	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/12)
  	1) David - 
    	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/13)
  1. David - 
  2. Shane -
  3. Angel -
  4. Trevor -

* 9/14)(debugging)
  	1) David -
  	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/15)(deployment)
  	1) David - 
  	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/16)(presentation coordination)
  	1) David - 
  	2) Shane -
  	3) Angel -
  	4) Trevor -

* 9/17) This is Presentation Day
  1. David - 
  2. Shane -
  3. Angel -
  4. Trevor -
