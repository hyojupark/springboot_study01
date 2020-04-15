package com.springboot01.springboot.service.posts;

import com.springboot01.springboot.domain.posts.PostsRepository;
import com.springboot01.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntitiy()).getId();
    }
}
