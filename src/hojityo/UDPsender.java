/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojityo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author lorenzo
 */

class UDPsender{

    public UDPsender(String ip, String portti, String viesti) throws Exception{
		// Parametrit: kohdekone, portti, viesti
        
		InetAddress targetAddr = InetAddress.getByName(ip);
		int targetPort = Integer.parseInt(portti);

		DatagramSocket socket = new DatagramSocket();
		byte[] data = viesti.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length,
				targetAddr, targetPort);
		socket.send(packet);
	} // main

} // UDPLahettaja

