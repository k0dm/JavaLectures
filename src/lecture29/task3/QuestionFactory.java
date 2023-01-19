package lecture29.task3;

import java.util.ArrayList;

public class QuestionFactory {
    public Question getStartQuestion(){
        Question question11 = new Question("Where will you go:",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("На північ(urban)",1));
                        add(new Answer("На захід (гірська місцевість)",2));
                        add(new Answer("На схід (болота)",3));
                    }
                },
                3
        );

        Question question21 = new Question("Побачивши місто, ти підійшов до першого будинку де ти обираєш роль та отримуєш знання:",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("Злодій",1));
                        add(new Answer("Продавець",2));
                        add(new Answer("Скадчик",3));
                    }
                },
                0
        );
        Question question22 = new Question("Біля підніжжя гори був чийсь будинок, ваші дії:",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("Постукати в двері",1));

                        add(new Answer("Злодій",2));

                        add(new Answer("Спригнути з гори",3));

                    }
                },
                3
        );
        question11.getAnswers().get(0).setNextQuestion(question21);
        question11.getAnswers().get(1).setNextQuestion(question22);

        Question question31 = new Question("Тепер ви злодій(ви маєте навичку красти речі). Ви попали на людне місце і бачете солдата який поспішає та п'яницю.Що ви вкрадете::",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("Вкрасти у солдати обойму до АК",1));
                        add(new Answer("Вкрасти у п'яниці гаманець",2));
                    }
                },
                1
        );
        Question question32 = new Question("Тепер ви трейдер(ви маєте навичку обмінювати та продавати речі). Ви попали на людне місце і бачете солдата який поспішає та п'яницю.Що ви вкрадете::",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("Спробувати заробити з циганами",1));
                        add(new Answer("Купити пістол і спробувати його перепродати",2));
                    }
                },
                2
        );
        Question question33 = new Question("Тепер ви Складчик(ви можете розвантажвувати речі). Ви попали на склад де багато товарів і потрібно розгрузити фуру:",
                new ArrayList<Answer>() {
                    {
                        add(new Answer("Вкрасти коробку з їжею та втікти",1));
                        add(new Answer("Розвантажити фуру",2));
                    }
                },
                1
        );
        question21.getAnswers().get(0).setNextQuestion(question31);
        question21.getAnswers().get(1).setNextQuestion(question32);
        question21.getAnswers().get(2).setNextQuestion(question33);


        return question11;
    }
}
