<div id="top" align="center">
  <div id="badges">

   <a href="https://github.com/ahlem-phantom/microservice-project/graphs/contributors">
    <img src="https://img.shields.io/github/contributors/ahlem-phantom/microservice-project.svg?style=for-the-badge"/>
  </a>

  <a href="https://github.com/ahlem-phantom/microservice-project/issues">
    <img src="https://img.shields.io/github/issues/ahlem-phantom/microservice-project?style=for-the-badge"/>
  </a>

  <a href="https://github.com/ahlem-phantom/microservice-project/stargazers">
    <img src="https://img.shields.io/github/stars/ahlem-phantom/microservice-project.svg?style=for-the-badge"/>
  </a>
   <a href="https://github.com/ahlem-phantom/microservice-project/network/members">
      <img src="https://img.shields.io/github/forks/ahlem-phantom/microservice-project.svg?style=for-the-badge"/>
    </a>
  </div>
    <a href="https://github.com/ahlem-phantom/microservice-project">
    <img src="https://user-images.githubusercontent.com/78981558/195950071-ebd01929-9566-434c-b2cd-8363d5d5b680.gif" height="240" alt="HRMS">
  </a>
  

<h3 align="center">Humain Ressources Management System Microservices</h3>
  
<p align="center">
    <a href="#-about-the-project">About The Project</a> •
    <a href="#-project-technical-architecture">Project Architecture</a> •
    <a href="#-built-with">Built With</a> •
    <a href="#-usage">Usage</a> •
    <a href="#-contact">Contact</a> •
    <a href="https://github.com/ahlem-phantom/microservice-project/issues">Report Bug</a> •
    <a href="https://github.com/ahlem-phantom/microservice-project/issues">Request Feature</a>
  </p>
  <h4 align="center">Microservice Architecture Human Resource Management System application built with  
    <a href="https://www.java.com/" target="_blank">Spring Boot</a>
  and<a href="https://www.java.com/" target="_blank"> Node JS</a>.</h4>

 </div>
 </div>
 





<!-- ABOUT THE PROJECT -->
## 📃 About The Project

This is a **HRMS Backend** application that combines many `human resources functions`.It provides opportunities for the **HR agents of a company** to manage `employees`, `departments`, `jobs` and `job seekers`. The HR agent can view the list of all employees using filters, for example viewing a list of employees of a particular department. Create, delete or edit employee records in the system. Manage the company position, such as creating, updating, or deleting job offers. Manage payrolls of the employee.
<br><br>

 ### 📜 Project Main features
Our backend is powered by 5 microservices, all of which happen to be written in java using Spring Boot and JavaScript using NodeJS.
<br> 
 * **Employees Service**: Provides PIM (Personal information management for employees and candidates). Provides employees information like hiring date, email, role, date of birth etc.
 * **Recruitment Service**: Provides recruitment information like Job Postings, Job Applicants etc.
 * **Position Service**: Provides postion information like designation, department name, employees etc.
 * **Payroll Service**: Provides payroll information like salaries etc.
 * **Holiday/Leave Service**: Provides holiday or leave information. Managing leave and defining holidays.


### 📐 Project Technical Architecture 
Our sample microservices-based system consists of the following modules:
- **gateway-service** : a module for running Spring Boot application that acts as a proxy/gateway in our architecture.
- **config-service** : a module that uses Spring Cloud Config Server for running configuration server in the `native` mode. The configuration files are placed on the classpath.
- **discovery-service** : a module thats Spring Cloud Eureka as an embedded discovery server.
- **employee-service** : a module containing the 1st microservice that allows to perform CRUD operation on in-memory repository of employee.
- **payroll-service** : a module containing the 2nd microservice that allows to perform CRUD operation on in-memory repository of payrolls. It communicates with account-service. 
- **recruitement-service** : a module containing the 3rd microservices that allows to perform CRUD operation on in-memory repository of recruitements.
- **position-service** : a module containing the 4th microservices that allows to perform CRUD operation on in-memory repository of positions.
- **leave/holiday-service** : a module containing the 5th microservices that allows to perform CRUD operation on in-memory repository of leave and holidays.

The following picture illustrates the architecture described above.

<div align="center">
  <h1>
<img src="https://user-images.githubusercontent.com/78981558/195961417-86ac70be-68d5-4d6a-9bc2-83de49f23183.png" width="700" height="600">
</h1>
</div>

**Description:**
<br>
- Each service is a `separate` microservice.
- **Eureka:** is a discovery server, all the other microservices register to it.
- **Gateway:** entry point for other services. Protects other routes and validates tokens.
- **Auth:** authentication server, used for signing up and issuing tokens.
- So, you should register with Auth first, request a token, and use it for every request for which you need to be authenticated. Every request will hit the Gateway first, if need be, it will validate the token and grant you access to the service.

### 🚀 Built With

You may find below the list of the frameworks/libraries that we used to build this demo project :
<br/>

 <div align="center">
	
   <a href="https://spring.io/projects/spring-boot">
   <img src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original-wordmark.svg" title="Spring" alt="Srping" width="150" height="150"/>
  </a>
  
   <a href="https://nodejs.org/en/">
   <img src="https://github.com/devicons/devicon/blob/master/icons/nodejs/nodejs-original-wordmark.svg" title="NodeJS" alt="NodeJS" width="150" height="150"/>
   </a>
  
   <a href="https://www.docker.com">
   <img src="https://github.com/devicons/devicon/blob/master/icons/docker/docker-original-wordmark.svg" title="Docker" alt="Docker" width="150" height="150"/>
   </a>
  
   <a href="https://www.mongodb.com/">
    <img src="https://github.com/devicons/devicon/blob/master/icons/mongodb/mongodb-original-wordmark.svg" title="MongoDB" alt="MongoDB" width="150" height="150"/>
   </a>
  
   <a href="https://www.mysql.com/fr">
   <img src="https://github.com/devicons/devicon/blob/master/icons/mysql/mysql-original-wordmark.svg" title="MySQL" alt="MySQL" width="150" height="150"/>
   </a>
   <br>
    <a href="https://www.h2database.com/html/main.html">
   <img src="https://user-images.githubusercontent.com/78981558/195962905-d2a557cf-979e-4a07-808b-a7cb45b2a3c9.png" title="MySQL" alt="MySQL" width="150" height="150"/>
   </a>
  </div>



<!-- GETTING STARTED -->
## ✨ Getting Started
To get a local copy up and running follow these simple example steps.

### 🚧 Prerequisites

You may find below the list of things you need to use this project :
* You need to have Maven, JDK8+.
* You will need to install docker in order to use the `docker-compose`.

### 🛠 Installation

_In order to install the app you need to follow the instructions below :_

1. Clone the repo
   ```sh
   git clone https://github.com/ahlem-phantom/microservice-project.git
   ```
2. Build and run the docker containers of the application :
   ```sh
   docker-compose up 
   ```

4. Open localhost:8761 in the browser and that's it you can use our application's microservices 🎉!
 




<!-- USAGE EXAMPLES -->
## ⚡ Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.





<!-- ROADMAP -->
## 🚩 Roadmap

- [x] Phase 1 : Implementation of Discovery and Gateway services
	 - Implementation of Eureka as a discovery server
	 - Implementation of Zull as a gateway or proxy server
	 - Implementation of config server
	 
- [ ] Phase 2 : Implementation of the main application microservices
	- Employees Service
	- Recruitment Service
	- Position Service
	- Payroll Service
	- Leave/Holiday Service


- [ ] Phase 3 : Deployement of microservices using Docker





<!-- CONTRIBUTING -->
## 😎 Contributing

If you have a suggestion that would make this project better, please fork the repo and create a pull request. Any contributions you make are **greatly appreciated**.
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b Yourbranch`)
3. Commit your Changes (`git commit -m 'Add some features to project'`)
4. Push to the Branch (`git push origin Yourbranch`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- CONTACT -->
## 💌 Contact

<b>Project Members :</b> 
| <img src="https://user-images.githubusercontent.com/78981558/157719496-9aec4730-512f-4188-87ca-8dbe6271ebfc.jpg" width="150" height="150"/>  <br> **Ahlem Laajili**| <img src="https://user-images.githubusercontent.com/78981558/157719539-f2829a38-c204-40fc-881d-21b9f407aa84.jpg" width="150" height="150"/>  <br>**Skander Turki**| <img src="https://user-images.githubusercontent.com/78981558/157719519-36d5e110-659c-4c29-80fc-64e78d53e669.jpg" width="150" height="150"/> <br>**Syrine Zahras**| <img src="https://user-images.githubusercontent.com/78981558/157719578-6479fcf3-e4f1-4db0-83d4-158b640552c1.jpg" width="150" height="150"/> <br>**Hichem Ben Zammal**| <img src="https://user-images.githubusercontent.com/78981558/157719597-23028a28-1095-4472-af25-ec631c6c1307.jpg" width="150" height="150"/> <br>**Nesrine Ben Mahmoud**|
| ------------- | ------------- | ------------- | ------------- | ------------- |
|<div align="center"><a href="mailto:ahlem.laajili@esprit.tn"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail Badge"/></a><a href="https://github.com/ahlem-phantom"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a></div> |<div align="center"><a href="mailto:skander.turki@esprit.tn"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail Badge"/></a><a href="https://github.com/skander-turki"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a></div> |<div align="center"><a href="mailto:syrine.zahras@esprit.tn"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail Badge"/></a><a href="https://github.com/SyrineZahras"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a></div> | <div align="center"><a href="mailto:hichem.bemzammal@esprit.tn"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail Badge"/></a><a href="https://github.com/hichembenzammel"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a></div>  | <div align="center"><a href="mailto:nesrine.benmahmoud@esprit.tn"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail Badge"/></a><a href="https://github.com/nesrine1999"><img title="Follow on GitHub" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white"/></a></div>  |

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## 🙌 Acknowledgments

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->

Developed with 💕 by **AlphaCoders**.





