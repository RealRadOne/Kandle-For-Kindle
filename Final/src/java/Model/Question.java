/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sakshi Sinha
 */
public class Question 
{
private String QuestionID;
private String Question;
private String QuizID;
private int Ans;
private String Option1;
private String Option2;
private String Option3;
private String Option4;
public String getQuestionID()
{
            return QuestionID;
}
public void setQuestionID(String QuestionID)
{
            this.QuestionID=QuestionID;
}
public String getQuestion()
{
            return Question;
}
public void setQuestion(String Question)
{
            this.Question=Question;
}
public String getQuizID()
{
            return QuizID;
}
public void setQuizID(String QuizID)
{
            this.QuizID=QuizID;
}
public int getAns()
{
            return Ans;
}
public void setAns(int Ans)
{
            this.Ans=Ans;
}
public String getOption1()
{
            return Option1;
}
public void setOption1(String Option1)
{
            this.Option1=Option1;
}
public String getOption2()
{
            return Option2;
}
public void setOption2(String Option2)
{
            this.Option2=Option2;
}
public String getOption3()
{
            return Option3;
}
public void setOption3(String Option3)
{
            this.Option3=Option3;
}
public String getOption4()
{
            return Option4;
}
public void setOption4(String Option4)
{
            this.Option4=Option4;
}
}
