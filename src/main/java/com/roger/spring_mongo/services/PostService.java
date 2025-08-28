package com.roger.spring_mongo.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.roger.spring_mongo.domain.Post;
import com.roger.spring_mongo.repository.PostRepository;
import com.roger.spring_mongo.services.exception.ObjectNotFoundException;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleRegex(text);
    }

}
