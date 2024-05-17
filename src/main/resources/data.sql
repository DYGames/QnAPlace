INSERT INTO MEMBER values(1, 'dygames@gmail.com', 'dygames', 'dy1234');
INSERT INTO MEMBER values(2, 'dygames1@gmail.com', 'dygames1', 'dy1234');

INSERT INTO CATEGORY values(1, 'Programming');
INSERT INTO CATEGORY values(2, 'Fashion');
INSERT INTO CATEGORY values(3, 'Science');

INSERT INTO QUESTION_HEADERS values(1);

INSERT INTO QUESTION_HEADER values(1, 1, 'LONG', 'Description 1', 'Long Question Hint', 'Long Question');
INSERT INTO QUESTION_HEADER values(2, 1, 'SHORT', 'Description 2', 'Short Question Hint', 'Short Question');
INSERT INTO QUESTION_HEADER values(3, 1, 'MULTIPLE_CHOICE', 'Description 3', null, 'Multiple Choice Question');

INSERT INTO CHOICE values(1, 3, 'Choice 1');
INSERT INTO CHOICE values(2, 3, 'Choice 2');
INSERT INTO CHOICE values(3, 3, 'Choice 3');

INSERT INTO ARTICLE values(1, 1, {ts '2012-09-17 18:47:52.69'}, 1, 1, 'Article Body', 'Article Title');

INSERT INTO ANSWER values(1, 1, 1);
INSERT INTO QUESTION_BODY values(1, 1, 'LONG', 'Long Answer 1');
INSERT INTO QUESTION_BODY values(2, 2, 'SHORT', 'Short Answer 1');
INSERT INTO QUESTION_BODY values(3, 3, 'MULTIPLE_CHOICE', '1');
INSERT INTO ANSWER_QUESTION_BODIES values(1, 1);
INSERT INTO ANSWER_QUESTION_BODIES values(1, 2);
INSERT INTO ANSWER_QUESTION_BODIES values(1, 3);

INSERT INTO ANSWER values(1, 1, 2);
INSERT INTO QUESTION_BODY values(4, 1, 'LONG', 'Long Answer 2');
INSERT INTO QUESTION_BODY values(5, 2, 'SHORT', 'Short Answer 2');
INSERT INTO QUESTION_BODY values(6, 3, 'MULTIPLE_CHOICE', '2');
INSERT INTO ANSWER_QUESTION_BODIES values(2, 4);
INSERT INTO ANSWER_QUESTION_BODIES values(2, 5);
INSERT INTO ANSWER_QUESTION_BODIES values(2, 6);

INSERT INTO ANSWER values(1, 2, 3);
INSERT INTO QUESTION_BODY values(7, 1, 'LONG', 'Long Answer 3');
INSERT INTO QUESTION_BODY values(8, 2, 'SHORT', 'Short Answer 3');
INSERT INTO QUESTION_BODY values(9, 3, 'MULTIPLE_CHOICE', '3');
INSERT INTO ANSWER_QUESTION_BODIES values(3, 7);
INSERT INTO ANSWER_QUESTION_BODIES values(3, 8);
INSERT INTO ANSWER_QUESTION_BODIES values(3, 9);
