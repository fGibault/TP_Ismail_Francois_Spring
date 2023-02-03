package controlleur;

import modele.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.ClientService;

import java.util.List;
@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/client")
    public List<Client> list() {

        return clientService.listsAll();
    }
    @PostMapping //inserer un client
    public void registerNewClient(@RequestBody Client client){ clientService.save(client);}
}
