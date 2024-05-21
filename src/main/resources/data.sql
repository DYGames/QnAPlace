INSERT INTO member values(1, 'dygames@gmail.com', 'dygames', 'dy1234');
INSERT INTO member values(2, 'dygames1@gmail.com', 'dygames1', 'dy1234');

INSERT INTO category values(1, 'Programming');
INSERT INTO category values(2, 'Fashion');
INSERT INTO category values(3, 'Science');

INSERT INTO question_headers values(1);

INSERT INTO question_header values(1, 1, 'LONG', 'Description 1', 'Long Question Hint', 'Long Question');
INSERT INTO question_header values(2, 1, 'SHORT', 'Description 2', 'Short Question Hint', 'Short Question');
INSERT INTO question_header values(3, 1, 'MULTIPLE_CHOICE', 'Description 3', null, 'Multiple Choice Question');

INSERT INTO choice values(1, 3, 'Choice 1');
INSERT INTO choice values(2, 3, 'Choice 2');
INSERT INTO choice values(3, 3, 'Choice 3');

INSERT INTO article values(1, 1, {ts '2012-09-17 18:47:52.69'}, 1, 1, 'Article Body', 'Article Title');

INSERT INTO answer values(1, 1, 1);
INSERT INTO question_body values(1, 1, 'LONG', 'Long Answer 1');
INSERT INTO question_body values(2, 2, 'SHORT', 'Short Answer 1');
INSERT INTO question_body values(3, 3, 'MULTIPLE_CHOICE', '1');
INSERT INTO answer_question_bodies values(1, 1);
INSERT INTO answer_question_bodies values(1, 2);
INSERT INTO answer_question_bodies values(1, 3);

INSERT INTO answer values(1, 1, 2);
INSERT INTO question_body values(4, 1, 'LONG', 'Long Answer 2');
INSERT INTO question_body values(5, 2, 'SHORT', 'Short Answer 2');
INSERT INTO question_body values(6, 3, 'MULTIPLE_CHOICE', '2');
INSERT INTO answer_question_bodies values(2, 4);
INSERT INTO answer_question_bodies values(2, 5);
INSERT INTO answer_question_bodies values(2, 6);

INSERT INTO answer values(1, 2, 3);
INSERT INTO question_body values(7, 1, 'LONG', 'Long Answer 3');
INSERT INTO question_body values(8, 2, 'SHORT', 'Short Answer 3');
INSERT INTO question_body values(9, 3, 'MULTIPLE_CHOICE', '3');
INSERT INTO answer_question_bodies values(3, 7);
INSERT INTO answer_question_bodies values(3, 8);
INSERT INTO answer_question_bodies values(3, 9);
