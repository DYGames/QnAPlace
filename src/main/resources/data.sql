INSERT INTO MEMBER values(0, 'dygames@gmail.com', 'dygames');
INSERT INTO MEMBER values(1, 'dygames1@gmail.com', 'dygames1');

INSERT INTO QUESTION_HEADERS values(0);

INSERT INTO QUESTION_HEADER values(0, 0, 'LONG', 'Description 1', 'Long Question Hint', 'Long Question');
INSERT INTO QUESTION_HEADER values(1, 0, 'SHORT', 'Description 2', 'Short Question Hint', 'Short Question');
INSERT INTO QUESTION_HEADER values(2, 0, 'MULTIPLE_CHOICE', 'Description 3', null, 'Multiple Choice Question');

INSERT INTO CHOICE values(0, 2, 'Choice 1');
INSERT INTO CHOICE values(1, 2, 'Choice 2');
INSERT INTO CHOICE values(2, 2, 'Choice 3');

INSERT INTO ARTICLE values(0, {ts '2012-09-17 18:47:52.69'}, 0, 0, 'Article Body', 'Article Title');

INSERT INTO ANSWER values(0, 0, 0);
INSERT INTO QUESTION_BODY values(0, 0, 'LONG', 'Long Answer 1');
INSERT INTO QUESTION_BODY values(1, 1, 'SHORT', 'Short Answer 1');
INSERT INTO QUESTION_BODY values(2, 2, 'MULTIPLE_CHOICE', '1');
INSERT INTO ANSWER_QUESTION_BODIES values(0, 0);
INSERT INTO ANSWER_QUESTION_BODIES values(0, 1);
INSERT INTO ANSWER_QUESTION_BODIES values(0, 2);

INSERT INTO ANSWER values(0, 0, 1);
INSERT INTO QUESTION_BODY values(3, 0, 'LONG', 'Long Answer 2');
INSERT INTO QUESTION_BODY values(4, 1, 'SHORT', 'Short Answer 2');
INSERT INTO QUESTION_BODY values(5, 2, 'MULTIPLE_CHOICE', '2');
INSERT INTO ANSWER_QUESTION_BODIES values(1, 3);
INSERT INTO ANSWER_QUESTION_BODIES values(1, 4);
INSERT INTO ANSWER_QUESTION_BODIES values(1, 5);

INSERT INTO ANSWER values(0, 1, 2);
INSERT INTO QUESTION_BODY values(6, 0, 'LONG', 'Long Answer 3');
INSERT INTO QUESTION_BODY values(7, 1, 'SHORT', 'Short Answer 3');
INSERT INTO QUESTION_BODY values(8, 2, 'MULTIPLE_CHOICE', '3');
INSERT INTO ANSWER_QUESTION_BODIES values(2, 6);
INSERT INTO ANSWER_QUESTION_BODIES values(2, 7);
INSERT INTO ANSWER_QUESTION_BODIES values(2, 8);
