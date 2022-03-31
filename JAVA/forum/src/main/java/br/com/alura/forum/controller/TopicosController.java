package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    //ao utilizar a anotação @ResponseBody, indicamos que o retorno do método deve ser serializado e devolvido no corpo da resposta.
    public List<TopicoDto> lista() {
        Topico topico1 = new Topico("Dúvida", "Duvida com Spring", new Curso("Spring",
                "Programação"));
        Topico topico2 = new Topico("Sugestão", "Adicionar legenda", new Curso("Angular",
                "Programação"));
        Topico topico3 = new Topico("Dúvida", "Duvida com Photoshop", new Curso("Edição de Vídeo",
                "Edição"));

        return TopicoDto.converter(Arrays.asList(topico1, topico2, topico3));
    }
}
