package fr.lteconsulting.pomexplorer.webserver;

import fr.lteconsulting.pomexplorer.Client;

public interface XWebServer
{
	void onNewClient( Client client );

	String onWebsocketMessage( Client client, String message );

	String onGraphQuery( String sessionIdString );

	void onClientLeft( Client client );
}