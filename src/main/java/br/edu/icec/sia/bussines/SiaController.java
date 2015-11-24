/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.icec.sia.bussines;

import br.edu.icec.sia.model.Alternativa;
import br.edu.icec.sia.model.Questao;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ronny de Arruda
 */
@Stateless
public class SiaController {

    @PersistenceContext
    private EntityManager entityManager;

    public void criarNovaQuestao(Questao questao) {

        Questao questao1 = new Questao(1, "Quantas horas de atividade remunerada (não contar estágio remunerado) que você cumpre? ");

        entityManager.merge(questao1);

    }

    public void criarNovaAlternetiva(Integer questaoId, Alternativa alternativa) {

        Questao questaoComId = entityManager.find(Questao.class, 1L);

        List<Alternativa> listaAlternativa = new ArrayList<>();

        Alternativa alternativa1 = new Alternativa(1, "Não exerço atividade remunerada", questaoComId);
        Alternativa alternativa2 = new Alternativa(2,  " Trabalho eventualmente, sem vínculo trabalhista ", questaoComId);
        Alternativa alternativa3 = new Alternativa(3, "Trabalho até 20 horas ", questaoComId);
        Alternativa alternativa4 = new Alternativa(4, " Trabalho mais de 20 horas e menos de 40 horas semanais. ", questaoComId);
        Alternativa alternativa5 = new Alternativa(5,  "Trabalho 40 ou mais horas semanais. ", questaoComId);

        listaAlternativa.add(alternativa);

        entityManager.merge(listaAlternativa);
    }
    
    public List<Alternativa> retornarListaComQuestao(){
        
       return entityManager.createNamedQuery("retornaQuestao", Alternativa.class).getResultList();
    }

}
