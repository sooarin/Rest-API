package demo.controller;


import demo.mapper.UserProfileMapper;
import demo.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserProfileController {

    private UserProfileMapper mapper;

    public UserProfileController(UserProfileMapper mapper) {
        this.mapper = mapper;
    }
    // JSON 형식으로 자동으로 매핑해서 전달
    // id값으로 사용자 정보를 리턴
    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable("id") String id) {
        return mapper.getUserProfile(id);
    }
    // List 전체를 리턴
    @GetMapping("/user/all")
        public List<UserProfile> getUserProfileList() {
            return mapper.getUserProfileList();
    }
    // 데이터 생성 API
    // RequestParam으로 Http프로토콜에 전달하는 게 일반적
    @PutMapping("/user/{id}")
    public void putUserProfile(@PathVariable("id") String id,@RequestParam("passwd") String passwd, @RequestParam("name") String name, @RequestParam("phonenumber") String phonenumber,
                               @RequestParam("address") String address) {
        mapper.insertUserProfile(id, passwd, name, phonenumber, address);
    }
    // 수정 API
    @PostMapping("/user/{id}")
    public void postUserProfile(@PathVariable("id") String id, @RequestParam("passwd") String passwd, @RequestParam("name") String name, @RequestParam("phonenumber") String phonenumber,
                                @RequestParam("address") String address) {
        mapper.updateUserProfile(id, passwd, name, phonenumber, address);
    }
    // 삭제 API
    @DeleteMapping("/user/{id}")
    public void deleteUserProfile(@PathVariable("id") String id) {
        mapper.deleteUserProfile(id);
    }
}
