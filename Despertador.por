programa {
  funcao inicio() {
    logico resposta

    escreva("Tic, tac, tic, tac! Bom dia! Est� na hora de acordar. ")
    escreva("Que tal come�ar o dia com energia? ")
    
    escreva("'sim' ou 'nao': ")
    leia(resposta)

    se (resposta) {
      escreva("�timo! Abra os olhos e levante-se.")

      escreva("Responda com 'sim' se deseja bocejar ou 'nao' se n�o: ")
      leia(resposta)

      se (resposta) {
        escreva("Excelente! Bocejar � uma �tima maneira de despertar completamente. ")

        escreva("Vamo esticar um pouco? Responda com 'sim' ou 'nao': ")
        leia(resposta)

        se (resposta) {
          escreva("�timo! Esticar-se ajuda a despertar os m�sculos. ")

          escreva("Agora v� ao banheiro para escovar os dentes. ")

          escreva("Responda com 'sim' se deseja ir ao banheiro ou 'nao' se n�o: ")
          leia(resposta)

          se (resposta) {
            escreva("Concluindo as tarefas no banheiro... ")

            escreva("Deseja se vestir para o trabalho? 'sim' ou 'nao'? ")
            leia(resposta)

            se (resposta) {
              escreva("Perfeito! Ent�o vista-se e tenha um bom dia de trabalho!")
            } senao {
              escreva("Tudo bem, continue acordando no seu pr�prio ritmo, mas cuidado parta n�o se atrasar. ")
            }

          } senao {
            escreva("Tudo bem, continue acordando no seu pr�prio ritmo. Lembre-se dos seus afazeres. N�o se atrase...")
          }

        } senao {
          escreva("Tudo bem. No seu tempo. ")
        }
      } senao {
        escreva("Tudo bem, continue acordando no seu pr�prio ritmo, mas n�o esque�a do trabalho. ")
      }
    } senao {
      escreva("Tudo bem, continue descansando, mas lembre-se de n�o se atrasar para seus compromissos. ")
    }
  }
}
