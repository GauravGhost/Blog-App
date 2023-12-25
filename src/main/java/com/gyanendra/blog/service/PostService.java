package com.gyanendra.blog.service;

import com.gyanendra.blog.entity.Post;
import com.gyanendra.blog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public Post savePost(Post post) {
        // Save the post to the database
        postRepository.save(post);
        return post;
    }

// public void deletePost(Long postId) {
//       // Fetch the post from the database
//       Post post = postRepository.findById(postId);

//       // Check if each tag is associated with any other post
//       for (Tag tag : post.getTags()) {
//           // Fetch all posts that have this tag
//           Set<Post> postsWithTag = tagRepository.findByTags(tag);

//           // If the tag is not associated with any other post, delete it
//           if (postsWithTag.size() == 1) {
//               tagRepository.delete(tag);
//           }
//       }

//       // Delete the post from the database
//       postRepository.delete(post);
//   }
}
