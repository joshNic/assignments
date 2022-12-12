package com.miu.cvbuilder.data.local

import com.miu.cvbuilder.R
import com.miu.cvbuilder.data.*

object DataSource {

    val CV = CV(
        name = "Joshua Mugisha",
        password = "",
        title = "Android Software Engineer",
        careerNote = R.string.career_note,
        experience = Experience(
            languages = "Java, Kotlin, Javascript",
            frameWorks = "Spring, Angular",
            microServices = "AWS, GCP, Docker, Kubernetes, Kafka",
            databases = "Room, MySQL, Casandra",
            tools = "Android Studio, Intellij"
        ),
        aboutMe = R.string.about_me,
        contacts = listOf(
            Contact(R.drawable.icn_phone,"+1(555)555-555","Mobile"),
            Contact(R.drawable.icn_mail,"example@gmail.com","Email"),
            Contact(R.drawable.icn_linkedin,"https://www.linkedin.com/in/joshuamugisha/","LinkedIn"),
            Contact(R.drawable.icn_github,"https://github.com/joshNic","Github"),
        ),
        certifications = listOf(
            Certification(R.drawable.icn_oracle,"OCA Java 8 Programmer 1(2020)","2020"),
            Certification(R.drawable.icn_mcf,"Microsoft Certified Fundamentals 1(2021)","2021")
        ),
        educations = listOf(
            Education(R.drawable.icn_maharishi,"Maharishi International University","Masters of science in computer science"),
            Education(R.drawable.icn_mit,"Massachusetts Institute of Technology","Bachelors of science in computer science")
        ),
        works = listOf(
            Work(R.drawable.icn_google,"Google","Software Developer","Apr 2020","Present","LA","USA","Developing Flutter Apps"),
            Work(R.drawable.icn_oracle,"Oracle","Database Developer","Jul 2018","Apr 2020","SF","USA","Building Database Tables"),

        )
    )
}