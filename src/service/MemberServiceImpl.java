package service;

import entity.Member;

import java.util.ArrayList;

public class MemberServiceImpl implements MemberService {
    @Override
    public String greet(int i) {
        String[] greetings = {"Good Morning", "Hello", "Good evening"};
        return greetings[i];
    }

    @Override
    public ArrayList<Member> getAll() {
        ArrayList<Member> list = new ArrayList<>();
        Member mem1 =new Member(1, "Linda", "linda@example.com");
        Member mem2 =new Member(2, "James", "James@example.com");
        list.add(mem1);
        list.add(mem2);

        return list;
    }
}
