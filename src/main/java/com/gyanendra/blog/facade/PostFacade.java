package com.gyanendra.blog.facade;

import com.gyanendra.blog.entity.Post;
import com.gyanendra.blog.entity.User;
import com.gyanendra.blog.exception.common.InvalidParamException;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.model.post.PostModel;
import com.gyanendra.blog.service.PostService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PostFacade {
    private final PostService postService;
    /**
     * Save post
     *
     * @param model as postModel
     * @return Post
     * @throws BlogException as exception
     */
    public Object savePost(PostModel model) throws BlogException {
        // Checking params
        if (model == null ||
                model.getTitle().isEmpty() || model.getContent().isEmpty()) {
            throw new InvalidParamException();

        }
        // Mapping model UserModel -> User
        Post post = new ModelMapper().map(model, Post.class);
        return postService.savePost(post);
    }
}
