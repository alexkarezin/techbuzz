package com.sivalabs.techbuzz.posts.usecases.updatepost;

import com.sivalabs.techbuzz.common.exceptions.ResourceNotFoundException;
import com.sivalabs.techbuzz.posts.domain.entities.Category;
import com.sivalabs.techbuzz.posts.domain.entities.Post;
import com.sivalabs.techbuzz.posts.domain.models.PostDTO;
import com.sivalabs.techbuzz.posts.domain.repositories.CategoryRepository;
import com.sivalabs.techbuzz.posts.domain.repositories.PostRepository;
import com.sivalabs.techbuzz.posts.mappers.PostDTOMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UpdatePostHandler {

    private final PostRepository postRepository;

    private final CategoryRepository categoryRepository;
    private final PostDTOMapper postDTOMapper;

    public PostDTO updatePost(UpdatePostRequest request) {
        log.debug("Update post with id={}", request.id());
        Post post =
                postRepository
                        .findById(request.id())
                        .orElseThrow(
                                () ->
                                        new ResourceNotFoundException(
                                                "Post with id: " + request.id() + " not found"));
        Category category = categoryRepository.getReferenceById(request.categoryId());
        post.setCategory(category);
        post.setTitle(request.title());
        post.setUrl(request.url());
        post.setContent(request.content());
        post.setUpdatedAt(LocalDateTime.now());
        return postDTOMapper.toDTO(postRepository.save(post));
    }
}
