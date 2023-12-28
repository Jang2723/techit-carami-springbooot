package com.example.shop.controller;

import com.example.shop.domain.Member;
import com.example.shop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    @GetMapping("/add") // Get방식의 add 호출은 이거 실행
    public String addForm(){
        return "memberForm";
    }

    @PostMapping("/add") // Post방식의 add 호출은 이거 실행
    public String add(@ModelAttribute Member member, Model model){
        memberService.joinMember(member);
        model.addAttribute("member",member);
//        return "memberView";
        return "redirect:/member/list";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Member> memberList = memberService.getMembers();
        model.addAttribute("members",memberList);
        return "memberList";
    }

    @GetMapping("/update")
    public String updateForm(@RequestParam String id, Model model){
        // 업데이트 할 정보를 얻어와야 함
        Member member = memberService.getMember(id);
        model.addAttribute("member",member);
        return "memberUpdateForm";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Member member){
        // 리다이렉트 : 수정하고 나면 회원 리스트가 보고싶어!
        memberService.updateMember(member);

        return "redirect:/member/list";
    }

    @GetMapping("/delete")
    public String delete (@RequestParam String id){
        // 삭제 할 정보를 얻어와야 함
        memberService.deleteMember(id);
        return "redirect:/member/list";
    }

}
