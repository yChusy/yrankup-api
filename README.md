# yRankup API

Nesse tópico você irá encontrar os métodos e explicações sobre a API do yRankup, o download também estará disponível abaixo.


## Download

https://dl.dropboxusercontent.com/s/cvom5mhhwndokhs/yRankup_API.jar?dl=0


## Gerindo a API central

    yRankupAPI yrankup = yRankupAPI.api; // irá lhe retornar a classe da API.

## Gerindo um Player

    Player p = e.getPlayer(); // pegando um player de um evento
    PlayerRank player = yrankup.getPlayer(p); // gerindo um player do plugin.

## Trabalhando com fragmentos

    double possui = yrankup.getFragmentos(p); // lhe retorna a quantia de fragmentos de um jogador.
    yrankup.setFragmentos(p, 1000); // seta um valor de fragmentos para um jogador.
    yrankup.addFragmentos(p, 100); // adicionada fragmentos ao jogador.
    yrankup.removeFragmentos(p, 10); // remove fragmentos de um jogador.

## Trabalhando com os ranks do jogador

    boolean possui = yrankup.hasRank(p); // retorna se o jogador possui rank.
    Rank rank = yrankup.getRank(p); // retorna o rank do jogador;
    boolean possuiProximo = yrankup.hasNextRank(p); // retorna se  o jogador possui um próximo rank.
    Rank nextRank = yrankup.getNextRank(p); // retorna o próximo rank do jogador.

## Trabalhando com os prestígios do jogador

    boolean possui = yrankup.hasPrestigio(p); // retorna se o jogador possui prestígio.
    Prestigio prestigio = yrankup.getPrestigio(p); // retorna o prestígio do jogador;
    boolean possuiProximo = yrankup.hasNextPrestigio(p); // retorna se  o jogador possui um próximo prestígio.
    Prestigio nextPrestigio = yrankup.getNextPrestigio(p); // retorna o próximo prestígio do jogador.

# Eventos

    RankUpEvent - Cancelável - Ativado quando um jogador evolui de rank.
    FragmentosGainEvent - Cancelável - Ativado quando um jogador ganha fragmentos matando mobs e/ou minerando.
