# Installations
1. Node JS
2. NVM
3. Yarn
4. Angular CLI (npm install -g @angular/cli)
5. set angular CLI to use yarn by using this command 
ng set --global packageManager=yarn

To create the project open command prompt type 
ng new project-name -routing
then navigate to project cd projectname
then start the project by npm start
Default Angular server
http://localhost:4200/

Next we need to set the proxy in ANgular project

To generate Services in angular  command:
ng g service services/bike

### server.js file added to angular project
to build the project for production use following command
ng build pro
To run the Project for deployment(Production Environment)
node server.js 
