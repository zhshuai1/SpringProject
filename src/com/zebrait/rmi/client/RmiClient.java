package com.zebrait.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.zebrait.rmi.server.Employee;
import com.zebrait.rmi.server.RemoteInterface;

public class RmiClient {

	public static void main(String[] args) {
		try {
			final RemoteInterface client = (RemoteInterface) Naming.lookup("//localhost:9930/rmitest");
			new Thread(new Runnable(){

				@Override
				public void run() {					
					Employee emp;
					int index = 0;
					try {
						while(true){
							Thread.sleep(1000);
							emp = client.getEmployeeById(""+(index++));
							System.out.println("ID="+emp.getId());
							System.out.println("Name="+emp.getName());
						}
					} catch (RemoteException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}).start();
			
			new Thread(new Runnable(){

				@Override
				public void run() {					
					int index = 0;
					try {
						while(true){
							Thread.sleep(5000);
							System.out.println(client.getServerInfo(index++));
						}
					} catch (RemoteException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}).start();
			
			System.out.println("");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
