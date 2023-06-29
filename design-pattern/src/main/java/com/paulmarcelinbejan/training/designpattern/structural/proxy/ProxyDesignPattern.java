package com.paulmarcelinbejan.training.designpattern.structural.proxy;

import com.paulmarcelinbejan.training.designpattern.structural.proxy.example.YouTubeCacheProxy;
import com.paulmarcelinbejan.training.designpattern.structural.proxy.example.YouTubeDownloader;
import com.paulmarcelinbejan.training.designpattern.structural.proxy.example.YouTubeServiceImpl;

// Il Proxy Pattern va usato:
//  - Lazy initialization (virtual proxy) - quando si ha un service pesante che spreca risrse di sistema rimanendo sempre attivo, anche se serve solo di tanto in tanto.
//    Invece di creare l'oggetto all'avvio dell'applicazione, si può ritardare l'inizializzazione dell'oggetto a un momento in cui è veramente necessario.
//  - Access control (protection proxy) - quando si vuole che solo client specifici possano utilizzare il service.
//    Il proxy può passare la richiesta al service solo se le credenziali del client corrispondono ad alcuni criteri.
//  - Logging requests (logging proxy) - quando si vuole mantenere una cronologia delle richieste al service.
//    Il proxy può loggare ciascuna richiesta prima di passarla al service.
//  - Caching request results (caching proxy) - quando è necessario memorizzare nella cache i risultati delle richieste dei client e gestire il ciclo di vita di questa cache, soprattutto se i risultati sono piuttosto grandi.
//    Il proxy può implementare la cache per le richieste ricorrenti che producono sempre gli stessi risultati. Il proxy può utilizzare i parametri delle richieste come chiavi di cache.
//
// Il Proxy  consente di fornire un sostituto o un segnaposto per un altro oggetto.
// Un proxy controlla l'accesso all'oggetto originale, consentendo di eseguire qualcosa prima o dopo che la richiesta arrivi all'oggetto originale.
public class ProxyDesignPattern {

	public static void main(String[] args) {
		YouTubeDownloader naiveDownloader = new YouTubeDownloader(new YouTubeServiceImpl());
		YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

	}

	private static long test(YouTubeDownloader downloader) {
		long startTime = System.currentTimeMillis();

		// User behavior in our app:
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");
		// Users might visit the same page quite often.
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderVideoPage("someothervid");

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}
}
