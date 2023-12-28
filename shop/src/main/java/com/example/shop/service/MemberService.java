package com.example.shop.service;

import com.example.shop.domain.Member;
import com.example.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // final 변수만 추가해서 생성자를 만듦
public class MemberService {

    private final MemberRepository memberRepository;

    public void joinMember(Member member){
        // 처리할 모든 실제 비즈니스, dao(repository)에서는 데이터만 저장
        memberRepository.saveMember(member);
    }

    public List<Member> getMembers(){
        return memberRepository.getMembers();
    }

    public Member getMember(String id){
        return memberRepository.getMember(id);
    }

    public void updateMember(Member member){
        memberRepository.updateMember(member);
    }

    public void deleteMember(String id){
        memberRepository.deleteMember(id);
    }

}
