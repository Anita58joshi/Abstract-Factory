package com.anita.daily.facade.v2.FacadeDemo;

import com.anita.daily.facade.JobDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.text.StringEscapeUtils;

public class DemoFacade {

    public static void main(String[] args) {


        String encoded = "\"[{&quot;id&quot;:120688,&quot;title&quot;:&quot;Software Engineer (JavaScript)&quot;,&quot;created_at&quot;:&quot;1 week ago&quot;,&quot;job_details&quot;:&quot;&lt;div class=\\&quot;card-body p-2\\&quot; style=\\&quot;color:rgb(33,37,41);\\&quot;&gt;&lt;span style=\\&quot;font-weight:bolder;\\&quot;&gt;Job Description:&lt;\\/span&gt;&lt;\\/div&gt;&lt;div class=\\&quot;card-text p-2\\&quot; style=\\&quot;color:rgb(33,37,41);\\&quot;&gt;&lt;ul&gt;&lt;li&gt;Develop, implement and test features that satisfy requirements of product, monitor and maintain existing products and report progress to concerned personnel&lt;\\/li&gt;&lt;li&gt;Experience with creating RESTful API with Nodejs, MongoDB&lt;\\/li&gt;&lt;li&gt;Ensure the technical feasibility of UI\\/UX designs&lt;\\/li&gt;&lt;li&gt;Build reusable components and libraries that can be reused in the future&lt;\\/li&gt;&lt;li&gt;Optimize applications for maximum speed and scalability&lt;\\/li&gt;&lt;li&gt;Collaborate with other team members and stakeholders&lt;\\/li&gt;&lt;li&gt;Ensure quality frontend application and API implementations&lt;\\/li&gt;&lt;li&gt;Good understanding of browser rendering behavior and performance&lt;\\/li&gt;&lt;li&gt;Understanding Mobx, Redux, React hooks, Typescript is a plus&lt;\\/li&gt;&lt;li&gt;Provide proper guidance and supervision of subordinate engineers and their work&lt;\\/li&gt;&lt;li&gt;Work on refactoring, debugging, testing, and implementing changes to existing applications to meet project requirements&lt;\\/li&gt;&lt;\\/ul&gt;&lt;\\/div&gt;&lt;p&gt;&lt;b&gt;Competencies Required:&lt;\\/b&gt;&lt;\\/p&gt;&lt;div class=\\&quot;card-group\\&quot; style=\\&quot;color:rgb(33,37,41);\\&quot;&gt;&lt;div class=\\&quot;card border-0\\&quot;&gt;&lt;div class=\\&quot;card-body p-0 table-responsive\\&quot;&gt;&lt;div class=\\&quot;card-group\\&quot;&gt;&lt;div class=\\&quot;card border-0\\&quot;&gt;&lt;div class=\\&quot;card-text p-2\\&quot;&gt;&lt;ul&gt;&lt;li&gt;Strong javascript knowledge, its quirks, and workaround&lt;\\/li&gt;&lt;li&gt;Strong understanding of frontend frameworks and have knowledge of at least one\\/two top frontend frameworks (like Reactjs, nextjs, Emberjs, Vue JS)&lt;\\/li&gt;&lt;li&gt;Strong understanding and knowledge of back-end technologies&lt;\\/li&gt;&lt;li&gt;Experience working with CICD implementation of Microservices architecture&lt;\\/li&gt;&lt;li&gt;Experience with HTML, CSS, DOM events, CSS pre-processing frameworks (Sass, Less, Stylus), Data Visualization Frameworks (D3), DraftJS, and other industry standards&lt;\\/li&gt;&lt;li&gt;Solid understanding of Data Structure and Algorithms and Object-Oriented Programming concepts&lt;\\/li&gt;&lt;li&gt;Familiarity with Version control tools, deployment process, AWS, and various services.&lt;\\/li&gt;&lt;li&gt;Good debugging skills and user interactivity skills&lt;\\/li&gt;&lt;li&gt;Proficient understanding of cross-browser compatibility issues and ways to work around such issues&lt;\\/li&gt;&lt;li&gt;Experience with common front-end development tools such as Webpack, npm, yarn, gulp, etc.&lt;\\/li&gt;&lt;li&gt;Proficient knowledge on Promises, AJAX, Restful APIs, and API Communications Optimized JSON Structure&lt;\\/li&gt;&lt;li&gt;Follow agile principles and processes including (but not limited to) standup meetings, sprints, and retrospectives&lt;\\/li&gt;&lt;li&gt;Experience with leading the team in at least one project&lt;\\/li&gt;&lt;li&gt;Ability to design, build and work with RESTful Web Services in JSON and XML formats&lt;\\/li&gt;&lt;li&gt;Ability to work independently or in a collaborative environment with a proactive attitude&lt;\\/li&gt;&lt;li&gt;Strong problem solving and written and verbal communication skills in English.&lt;\\/li&gt;&lt;\\/ul&gt;&lt;\\/div&gt;&lt;\\/div&gt;&lt;\\/div&gt;&lt;\\/div&gt;&lt;\\/div&gt;&lt;\\/div&gt;&quot;,&quot;apply&quot;:{\u200B&quot;status&quot;:true}\u200B,&quot;apply_button_option&quot;:&quot;Show&quot;,&quot;company&quot;:{\u200B&quot;id&quot;:8796,&quot;name&quot;:&quot;Fusemachines Nepal Pvt. Ltd.&quot;,&quot;url&quot;:&quot;https:\\/\\/www.jobsnepal.com\\/employer\\/fusemachines-nepal-pvt-ltd\\/8796&quot;,&quot;profile_picture&quot;:&quot;https:\\/\\/img.jobsnepal.com\\/small\\/Fm1u35H50SbuQrZfhr140NtjuAbesi7XtUtKyFWl.jpeg&quot;,&quot;cover_picture&quot;:&quot;https:\\/\\/img.jobsnepal.com\\/banner\\/8796_580_8796_580_fn banner.jpg&quot;}\u200B}\u200B,{\u200B&quot;id&quot;:120635,&quot;title&quot;:&quot;Senior Software Engineer - JAVA&quot;,&quot;created_at&quot;:&quot;2 weeks ago&quot;,&quot;job_details&quot;:&quot;&lt;p&gt;&lt;span&gt;\\ufeff&lt;\\/span&gt;&lt;span&gt;\\ufeff&lt;\\/span&gt;&lt;br \\/&gt;&lt;\\/p&gt;&lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;text-align:justify;\\&quot;&gt;&lt;b&gt;&lt;span&gt;Job Description:&lt;\\/span&gt;&lt;\\/b&gt;&lt;span&gt;&lt;\\/span&gt;&lt;\\/p&gt; &lt;ul&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Design, develop, enhance, debug, and implement software\\n     components. Troubleshoots production problems related to software\\n     applications.\\u00a0&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;&lt;span&gt;Consults with end users to identify application\\n     requirements.&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Resolve problems and respond to suggestions for\\n     improvements and enhancements.\\u00a0&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Instruct, assign, direct, and check the work of other\\n     developers.\\u00a0&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Participates in development of user manuals.&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt; &lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;text-align:justify;\\&quot;&gt;&lt;b&gt;&lt;span&gt;Key Technical Skills:&lt;\\/span&gt;&lt;\\/b&gt;&lt;span&gt;&lt;\\/span&gt;&lt;\\/p&gt; &lt;ul&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;&lt;span&gt;Experience in Node.JS, jQuery, Java Script, JSP, Web\\n     Services, Servlets etc.&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Good understanding of data structures, Design patterns,\\n     object oriented programming algorithms.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;&lt;span&gt;&lt;span&gt;&lt;span&gt;Hands on experience with JSON\\/Rest and Rest security is\\n     a plus.&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Familiar with XML, X12, EDI, Excel, CSV, and other\\n     plain text file types&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Hands on experience on version controls like SVN, CVS,\\n     GITHUB.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Must be able to help the team to develop the\\n     programming code from scratch or by adapting existing website graphics\\n     packages and software to meet business requirements after discussion\\n     sessions with the project management team.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Conduct technical reviews, project reviews and audits\\n     code review and QC of codes.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Provides functional and\\/or technical guidance in\\n     evaluating applications systems. Coordinates changes and influences and\\n     prioritizes tasks with business or technical departments.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Must be proactive in driving complex design discussions\\n     and resolving issues in a timely manner.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Knowledge of eCommerce programs&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt; &lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;text-align:justify;\\&quot;&gt;&lt;b&gt;&lt;span&gt;General Requirements:&lt;\\/span&gt;&lt;\\/b&gt;&lt;span&gt;&lt;\\/span&gt;&lt;\\/p&gt; &lt;ul&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Bachelor\\u2019s Degree in Computer Science or a related\\n     discipline.&lt;br \\/&gt;&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;3+ Years of Hands-on Experience in Java\\/J2ee\\n     Technologies.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Proven experience in leading concurrent projects and\\n     task by managing a team of technical staffs.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Excellent communication skill and proven ability to\\n     carry on a business conversation at all levels.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span&gt;Strong Leadership, Decision Making and Problem Solving\\n     skill.&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt; &lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;text-align:justify;\\&quot;&gt;&lt;b&gt;&lt;span&gt;Company&lt;\\/span&gt;&lt;\\/b&gt;&lt;span&gt;:&lt;span&gt;\\u00a0 &lt;\\/span&gt;Prime Vendor Nepal has approximately 35 staff\\nmembers covering Java, PHP,\\u00a0 Python and Data Staffs. Our work covers clerical\\nduties, market research, and maintenance of eCommerce programs. We develop for\\nour benefit internal programs for various eCommerce platforms, and cross\\ncommunication with outside platforms. We engage other Nepal IT firms with\\nspecialized skills for product development. We have a long term partner with a\\nU.S. based IT company for more than 10 years. &lt;\\/span&gt;&lt;\\/p&gt; &lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Currently with COVID-19 our staff are working remotely. Interested\\ncandidates are requested to send in their cover letter and resume clarifying\\ntheir work experience and expected salary to&lt;b&gt;\\u00a0hr@nepaldatacenter.com&lt;\\/b&gt;\\u00a0by&lt;b&gt;\\u00a030th June, 2021&lt;\\/b&gt;.&lt;\\/span&gt;&lt;\\/p&gt;&quot;,&quot;apply&quot;:{\u200B&quot;status&quot;:true}\u200B,&quot;apply_button_option&quot;:&quot;Show&quot;,&quot;company&quot;:{\u200B&quot;id&quot;:386647,&quot;name&quot;:&quot;Prime Vendor Nepal&quot;,&quot;url&quot;:&quot;https:\\/\\/www.jobsnepal.com\\/employer\\/prime-vendor-nepal\\/386647&quot;,&quot;profile_picture&quot;:null,&quot;cover_picture&quot;:null}\u200B}\u200B,{\u200B&quot;id&quot;:120633,&quot;title&quot;:&quot;Senior Software Engineer (Java)&quot;,&quot;created_at&quot;:&quot;2 weeks ago&quot;,&quot;job_details&quot;:&quot;&lt;p&gt;&lt;span&gt;\\ufeff&lt;\\/span&gt;&lt;span style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;We are looking for self-driven, motivated and result oriented professional to be part of our dynamic team as \\u201c&lt;\\/span&gt;&lt;span style=\\&quot;color:rgb(85,85,85);font-weight:bolder;\\&quot;&gt;Senior Software Engineer (Java)&lt;\\/span&gt;&lt;span style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;\\u201d. Details of the same have been highlighted below;&lt;\\/span&gt;&lt;br \\/&gt;&lt;\\/p&gt;&lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span style=\\&quot;font-weight:bolder;\\&quot;&gt;&lt;span&gt;Job Description:&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;\\/p&gt;&lt;ul style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Perform software\\/application development and technical product assistance and tuning to meet customer performance and functional requirements.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Participate in project discussion\\/analysis to assess business requirements, gather information and recommend optimal business solutions.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Identify bugs, performance issues by testing software in functional and non-functional level.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Timely monitor\\/review team member\\u2019s performance and guide\\/train where required. Also, provide project status report to Project Manager and stakeholders.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Contribute to knowledge capital via project documentation, best practice solutions and consult with Project manager for process\\/product improvements.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Research and develop knowledge of IT industry, new products\\/models and platforms, its functionality and technical platforms.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span style=\\&quot;font-weight:bolder;\\&quot;&gt;&lt;span&gt;Job Specification:&lt;\\/span&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;span style=\\&quot;font-weight:bolder;\\&quot;&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;span style=\\&quot;font-weight:bolder;color:rgb(85,85,85);\\&quot;&gt;&lt;\\/span&gt;&lt;span style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;\\/span&gt;&lt;ul style=\\&quot;color:rgb(85,85,85);\\&quot;&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Bachelor\\u2019s degree, with a technical major, such as engineering or computer science.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;3+ years of work experience; along with strong interest in Software Development and Programming.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience and understanding of J2EE application development, Spring framework, Hibernate, JSF, JSP.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Knowledge of HTML, CSS, JavaScript libraries and frameworks such as ReactJS, AngularJS, VueJS etc.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience in Python frameworks like Django, Flask.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Ability to think creatively and come up with innovative solution.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Excellent communication skills and proven ability to carry on a business conversation at all levels. \\u00a0 \\u00a0&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Ability to work well independently and in a team environment.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Ability to learn and apply new trends and technology in IT.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Willingness to travel outside country as per need.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience of DevOps culture will be an added advantage.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;International exposure\\/experience will be an added advantage.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience of interacting with senior management both in a technical and functional role.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Prior knowledge in GIT, SVN, Redmine, JIRA, Mantis, Basecamp and Agile\\/Scrum project management will be an advantage.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience and understanding of software development cycle and implementation.&lt;p&gt;&lt;\\/p&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;Experience of interactions with senior management both in a technical and functional role.\\u00a0&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p class=\\&quot;MsoNormal\\&quot; style=\\&quot;color:rgb(85,85,85);text-align:justify;\\&quot;&gt;Interested candidates are requested to send in their cover letter and resume clarifying their work experience and expected salary to\\u00a0&lt;span class=\\&quot;MsoHyperlink\\&quot;&gt;&lt;a href=\\&quot;mailto:hrd@lisnepal.com.np\\&quot;&gt;hrd@lisnepal.com.np&lt;\\/a&gt;&lt;\\/span&gt;\\u00a0 by\\u00a017th July, 2021.&lt;\\/p&gt;&quot;,&quot;apply&quot;:{\u200B&quot;status&quot;:true}\u200B,&quot;apply_button_option&quot;:&quot;Show&quot;,&quot;company&quot;:{\u200B&quot;id&quot;:8922,&quot;name&quot;:&quot;LIS Nepal Pvt. Ltd. (Sister Concern of Yomari Group of Companies)&quot;,&quot;url&quot;:&quot;https:\\/\\/www.jobsnepal.com\\/employer\\/lis-nepal-pvt-ltd-sister-concern-of-yomari-group-of-companies\\/8922&quot;,&quot;profile_picture&quot;:&quot;https:\\/\\/img.jobsnepal.com\\/small\\/tiCdUbc9F68itAHJC0jVHT3J0yA1DhwYeS2H319E.jpeg&quot;,&quot;cover_picture&quot;:&quot;https:\\/\\/img.jobsnepal.com\\/banner\\/8922_528_Job_offers_banner.jpg&quot;}\u200B}\u200B,{\u200B&quot;id&quot;:120569,&quot;title&quot;:&quot;\\ufeffJava Backend Developer&quot;,&quot;created_at&quot;:&quot;3 weeks ago&quot;,&quot;job_details&quot;:&quot;&lt;p style=\\&quot;text-align:center;\\&quot;&gt;&lt;span&gt;&lt;b&gt;\\ufeffJava Backend Developer\\u00a0&lt;\\/b&gt;&lt;br \\/&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;We are looking for a &lt;b&gt;Backend Software Engineer&lt;\\/b&gt; in Java with a strong desire to work in golang for our Cloud product that leverages innovative cloud native technologies and cloud services that primarily focus on NoOps and Developer Experience (DX). The ideal candidate will have strong experience developing &lt;b&gt;concurrent, distributed, rich and intuitive consumer-facing products&lt;\\/b&gt; or highly integrated enterprise applications and willing to switch to a language like GoLang.\\u00a0&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;We develop Cloud Agnostic\\u00a0 PaaS that leverage Kubernetes to reduce significant time to roll out the Cloud Native application across the managed or on premise infrastructure. Our product powers companies to achieve new levels of velocity, agility, reliability, and efficiency in their projects and systems.\\u00a0&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Job Description&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;ul&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Take part in software and architectural development activities&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Be involved in all phases of the agile software development lifecycle&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Engage in technical grooming discussions where you should be able to learn as well as contribute&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Write well designed, testable, efficient code&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Proactively seek out and minimize pain points within the infrastructure and code base&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Create next-gen solutions for unique and challenging use cases&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Ensure designs follow specifications&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Prepare and produce releases of software components&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Recommend changes to improve established java or golang application processes\\u2019&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Qualifications&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;ul&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Bachelor\\u2019s in Computer Science, or related field or equivalent experience&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;2 to 3 years of professional experience in Java based application development&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Skills and Knowledge\\u00a0&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;ul&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Write highly concurrent, elastic, message driven and scalable code\\u00a0&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Be focused, passionate, and strive to find simple solutions to complex problems&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Excellent understanding of OOP design concepts and software development processes and methods&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Sound in Spring Framework, Hibernate and JPA.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Experience in MySQL, PostgreSQL and MongoDB&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Ability to learn new, emerging technologies like golang.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Should have a solid general understanding of application components and search engines \\u2013 what happens on the front end, what happens on the back end.&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Ability to effectively work on multiple projects simultaneously and effectively contend with competing priorities&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Possess troubleshooting, code optimization and refactoring skills&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Nice to Have&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;ul&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Working knowledge of Docker&lt;\\/span&gt;&lt;\\/li&gt;&lt;li style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Hands on Kubernetes\\u00a0&lt;\\/span&gt;&lt;\\/li&gt;&lt;\\/ul&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Why a Career with BerryBytes?&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Our Culture:&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;At BerryBytes, we work in a collaborative and innovative work environment. We work with brilliant and passionate people who strive and encourage others to do their best. BerryBytes&#039;s idea-rich environment welcomes creative and sometimes unconventional perspectives!&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Growth Opportunities:&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;You will have the opportunity to grow and make an impact from your work. We encourage innovation in all who become a part of our team. With growing operations internationally, there are lots of lateral and upward advancement opportunities for rewarding and developing careers with BerryBytes. We\\u2019re strong believers in continuing education and provide the resources that you need to continue learning.&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;&lt;b&gt;Employee Perks:&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;We offer flexible hours, competitive PTO policy, incentive, bonus and attractive compensation and benefit plans. We make it our obligation to the team here to stay current with compensation trends in the tech field.&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:justify;\\&quot;&gt;&lt;span&gt;Please send your latest resume in PDF format at &lt;b&gt;hr@berrybytes.com&lt;\\/b&gt;&lt;\\/span&gt;&lt;\\/p&gt;&lt;p style=\\&quot;text-align:center;\\&quot;&gt;&lt;span&gt;&lt;i&gt;We thank all applicants in advance for applying. Only individuals selected for interviews will be contacted.&lt;\\/i&gt;&lt;\\/span&gt;&lt;\\/p&gt;&quot;,&quot;apply&quot;:{\u200B&quot;status&quot;:true}\u200B,&quot;apply_button_option&quot;:&quot;Show&quot;,&quot;company&quot;:{\u200B&quot;id&quot;:11604,&quot;name&quot;:&quot;BerryBytes&quot;,&quot;url&quot;:&quot;https:\\/\\/www.jobsnepal.com\\/employer\\/berrybytes\\/11604&quot;,&quot;profile_picture&quot;:&quot;https:\\/\\/img.jobsnepal.com\\/small\\/qP9mbL9IxzwCH54mYqMhs1sKYLSvCKYZjKRxQzKf.png&quot;,&quot;cover_picture&quot;:null}}]\"";

        String json= StringEscapeUtils.unescapeHtml3(encoded);
         System.out.println(json);
         json = json.substring(1,json.length()-1);


        ObjectMapper objectMapper = new ObjectMapper();

        try{
            Job[] jobs = objectMapper.readValue(json,Job[].class);
            String jsons= StringEscapeUtils.unescapeHtml3(json);
            System.out.println(jobs.length);
            for(Job job:jobs){
               System.out.println(job.getJobDetails());

            }


        }catch (Exception ex){
            System.out.println(ex);
        }





    }
}
