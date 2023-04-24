package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemberRepository() {
        @Override
        public Member save(Member member) {
            return null;
        }

        @Override
        public Optional<Member> findById(Long id) {
            return Optional.empty();
        }

        @Override
        public Optional<Member> findByName(String name) {
            return Optional.empty();
        }

        @Override
        public List<Member> findAll() {
            return null;
        }
    }
}
