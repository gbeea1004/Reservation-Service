package web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/reservations")
public class ApiReservationController {

    @GetMapping("")
    public ResponseEntity<Void> list() {
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(URI.create("/"));
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Void> reservation() {

        // TODO : 예약하기
        return null;
    }

    @PutMapping("/{reservationId}")
    public void cancel(@PathVariable long reservationId) {
        // TODO : 예약취소
    }

    @PostMapping("/{reservationInfoId}/comments")
    public void comment(@PathVariable long reservationInfoId) {
        // TODO : 한줄평 등록
    }
}
