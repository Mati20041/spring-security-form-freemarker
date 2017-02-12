package pl.mati.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.mati.service.PostService;


@Controller
public class PostsController {

    private PostService postService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("posts", postService.getPosts());
        return "index";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String savePost(PostCommand postCommand, Authentication authentication) {
        postService.saveNewPost(authentication.getName(), postCommand.getContent());
        return "redirect:/";
    }

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }
}
