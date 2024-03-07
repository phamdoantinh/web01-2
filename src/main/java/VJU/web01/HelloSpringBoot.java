package VJU.web01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @Autowired
    private HangHoaRepository hanghoaRepository;
    @GetMapping("/hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public  Iterable<HangHoa> getAllHangHoa() {
      // This returns a JSON or XML with the users
      return hanghoaRepository.findAll();
    }
    @GetMapping(path = "/byid/{id}")
    @ResponseBody
    public  HangHoa getById(@PathVariable Integer id) {
      // This returns a JSON or XML with the users
      HangHoa h=hanghoaRepository.findById(id)
                                .orElse(new HangHoa());
      return (h);
    }
  @PostMapping("/themhanghoa")
  public void createUser(@RequestBody HangHoa hh) {
     hanghoaRepository.save(hh);
  }

}

