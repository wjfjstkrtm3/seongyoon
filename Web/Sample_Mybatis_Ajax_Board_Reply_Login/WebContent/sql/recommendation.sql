-- ��õ ���̺� ����
create table ex_rec(
  board_no number REFERENCES ex_board(board_no),
  rec_id varchar2(20) REFERENCES ex_memberinfo(id)
);