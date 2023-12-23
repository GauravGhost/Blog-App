// package com.gyanendra.blog.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.HashSet;
// import java.util.Set;

// @Service

// public class PostService {

//    private final PostRepository postRepository;
//    private final TagRepository tagRepository;

//    @Autowired
//    public PostService(PostRepository postRepository, TagRepository tagRepository) {
//        this.postRepository = postRepository;
//        this.tagRepository = tagRepository;
//    }

//    public Post createPost(String title, String content, Set<String> tagNames) {
//        // Create a new post
//        Post post = new Post();
//        post.setTitle(title);
//        post.setContent(content);

//        // Fetch the tags from the database
//        Set<Tag> tags = new HashSet<>();
//        for (String tagName : tagNames) {
//            Tag tag = tagRepository.findByName(tagName);
//            if (tag == null) {
//                tag = new Tag();
//                tag.setName(tagName);
//                tagRepository.save(tag);
//            }
//            tags.add(tag);
//        }

//        // Set the tags for the post
//        post.setTags(tags);

//        // Save the post to the database
//        postRepository.save(post);

//        return post;
//    }

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
// }
