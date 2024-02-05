programa {
  funcao inicio() {
    logico resposta

    escreva("Tic, tac, tic, tac! Bom dia! Está na hora de acordar. ")
    escreva("Que tal começar o dia com energia? ")
    
    escreva("'sim' ou 'nao': ")
    leia(resposta)

    se (resposta) {
      escreva("Ótimo! Abra os olhos e levante-se.")

      escreva("Responda com 'sim' se deseja bocejar ou 'nao' se não: ")
      leia(resposta)

      se (resposta) {
        escreva("Excelente! Bocejar é uma ótima maneira de despertar completamente. ")

        escreva("Vamo esticar um pouco? Responda com 'sim' ou 'nao': ")
        leia(resposta)

        se (resposta) {
          escreva("Ótimo! Esticar-se ajuda a despertar os músculos. ")

          escreva("Agora vá ao banheiro para escovar os dentes. ")

          escreva("Responda com 'sim' se deseja ir ao banheiro ou 'nao' se não: ")
          leia(resposta)

          se (resposta) {
            escreva("Concluindo as tarefas no banheiro... ")

            escreva("Deseja se vestir para o trabalho? 'sim' ou 'nao'? ")
            leia(resposta)

            se (resposta) {
              escreva("Perfeito! Então vista-se e tenha um bom dia de trabalho!")
            } senao {
              escreva("Tudo bem, continue acordando no seu próprio ritmo, mas cuidado parta não se atrasar. ")
            }

          } senao {
            escreva("Tudo bem, continue acordando no seu próprio ritmo. Lembre-se dos seus afazeres. Não se atrase...")
          }

        } senao {
          escreva("Tudo bem. No seu tempo. ")
        }
      } senao {
        escreva("Tudo bem, continue acordando no seu próprio ritmo, mas não esqueça do trabalho. ")
      }
    } senao {
      escreva("Tudo bem, continue descansando, mas lembre-se de não se atrasar para seus compromissos. ")
    }
  }
}
