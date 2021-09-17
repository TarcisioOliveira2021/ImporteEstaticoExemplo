package com.exemplo.br.main;

import com.exemplo.br.model.Game;
import static com.exemplo.br.codigo.CodigoCatergoria.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Sem o importe est�tico
public class Main {
	public static void main(String[] args) {
		//Game game1 = new Game("GranSaga", "NPIXEL", 1); --> sem importe est�tico
		Game game1 = new Game("GranSaga", "NPIXEL", MMORPG);	// --> com , n�o precisamos informar mais o c�digo
		Game game2 = new Game("Octopath-traveler", "SQUARE-ENIX", JRPG);	
		Game game3 = new Game("World Flipper", "Cygames", GACHA);
		
		List<Game> listaGames = Arrays.asList(game1,game2,game3);
		String collect = listaGames.stream()
		.map(e-> String.valueOf(e.getNome()))
		.collect(Collectors.joining("  "));
		System.out.println(collect);
	}
}
