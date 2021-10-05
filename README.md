# songr
#### Code Fellows - Code 401 Week 3 labs
**Author:** Haustin Kimbrough
**Version**: 1.0.0

## Overview
<!-- Provide a high level overview of what this application is and why you are building it, beyond the fact that it's an assignment for this class. (i.e. What's your problem domain?) -->

This is the Songr application. It currently has four @GET paths. One is a sign of life check, one displays three hard-coded made up albums, one displays an introductory splash page, and a page that capitalizes the user's input.

## Architecture
<!-- Provide a detailed description of the application design. What technologies (languages, libraries, etc) you're using, and any other relevant design information. -->
The application takes a [Spring Initializr](https://start.spring.io/) project initialization, ties it to a GitHub repository and uses Spring mechanics to display its content. The code creates an Album class/model and uses several controllers to render the different @GET requests. The application has a `/hello` path that is a sign of life check, a `/capitalize` path that takes whatever text is input after the last `/` in the URL field and capitalizes it in the rendered HTML, and a `/albums` path that displays three hard-coded made-up albums. The home `/` path shows a title, greeting, and image for the Songr application.

## Credit and Collaborations
<!-- Give credit (and a link) to other people or resources that helped you build this application. -->
- [Code Fellows Code 401 Class Repo](https://github.com/codefellows/seattle-java-401d11) for general guidance.
- [Songr Icon PNG](https://www.pngegg.com/en/png-zonqx)