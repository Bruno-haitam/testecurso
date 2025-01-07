package br.com.newgate.todolist.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
    
}
