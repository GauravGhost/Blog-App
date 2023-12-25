package com.gyanendra.blog.controller;

import com.gyanendra.blog.entity.Post;
import com.gyanendra.blog.entity.Role;
import com.gyanendra.blog.exception.core.BlogException;
import com.gyanendra.blog.facade.PostFacade;
import com.gyanendra.blog.model.common.ResponseHandler;
import com.gyanendra.blog.model.post.PostModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.gyanendra.blog.util.Constants.PostPath.POST_PATH;

@RestController
@AllArgsConstructor
@RequestMapping(POST_PATH)
@Api(value = POST_PATH, tags = "POST APIs")
public class PostController {
    private final PostFacade postFacade;
    @PostMapping
    @ApiOperation(value = "Save Post", response = Post.class)
    public ResponseEntity<Object> savePost(@RequestBody PostModel model) throws BlogException {
        return ResponseHandler.response(HttpStatus.OK, postFacade.savePost(model), true);
    }

}
