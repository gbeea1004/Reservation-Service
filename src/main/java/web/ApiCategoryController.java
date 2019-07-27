package web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class ApiCategoryController {

    @GetMapping("")
    public ResponseEntity<Void> list() {
        // TODO : 카테고리 목록
        return null;
    }
}
