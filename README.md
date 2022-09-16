# How to make changes to the codebase (Under maintenance, please do not proceed)

Before you proceed, you must first install Git and GitKraken

Git : https://git-scm.com/download/win
  
    Installation video : https://youtu.be/cJTXh7g-uCM?t=86
  
GitKraken : https://www.gitkraken.com/download
      
    Create a GitKraken account after you finished installing.

---

* Fork this repository

![image](https://user-images.githubusercontent.com/82688509/190138027-32fc3abd-209a-43ba-9fda-21a61dc27ede.png)

* Click `+ Create a new fork`
---
![image](https://user-images.githubusercontent.com/82688509/190167990-863888ec-f8cf-485d-8ed2-f7e600543fd0.png)

* Click `Create fork` button
---
* Open GitKraken
* Go to `File > Clone Repo`
* Click `Github.com`
* Click the dropdown menu from `Repository to Clone` and select `IMS`. **NOTE: It should be under your GitHub username.**

![image](https://user-images.githubusercontent.com/82688509/190160163-3d2e84f6-37c4-4306-b372-a2b580c9e4e1.png)

* Click `Clone the Repo!` button

> If you can see "Create submodules....". Click 'No'.

---

* Open Netbeans IDE.
* Go to `File > Open Project`
 
![image](https://user-images.githubusercontent.com/82688509/190169040-a1aca245-da97-468a-9047-cb7db4f51da4.png)

* Locate where you put the clone repository
* `Open Project`
* Go to `Source Packages > com.mycompany.ims.java > IMSJava.java`
* Comment your name below the number.

![image](https://user-images.githubusercontent.com/82688509/190145195-73c9d8f3-32a8-4240-b020-436d1dc8a96f.png)

* Save the file.
* Open GitKraken again.
* Stage all changes.

![image](https://user-images.githubusercontent.com/82688509/190144114-9fe27c02-5bb0-4d82-b99e-6d5179216c0b.png)

* Down below, type `Add (insert name here)`.

![image](https://user-images.githubusercontent.com/82688509/190144445-1a54b3a2-c223-4b8f-b33a-78d853bd31b7.png)

* Then click `Commit changes to 1 file` button.
* Click `push`
* Go back to GitHub then to the forked repository. 
* Click `Compare & pull request`
* In your title, type `Add name (insert name here)`
* Finally, click `Create pull request`

### Congratulations, you made it! Now you know how to :

1. Fork a repository
2. Clone a repository
3. Make changes to the codebase
4. Staging all changes
5. Commiting the changes
6. Creating a pull request

### Why is this helpful ?

After you graduate and get a job at a software company, the first thing that you'll encounter is the version control system. Git is the most commonly used as a version control system. But there are other alternatives such as Mercurial, SVN and Helix core. 

Now, GitHub is a platform that provides hosting for software development version control using Git. In other words, this is where you store your Git repositories.

If you want to know more about Git & Github, check out this video : https://www.youtube.com/watch?v=SWYqp7iY_Tc
