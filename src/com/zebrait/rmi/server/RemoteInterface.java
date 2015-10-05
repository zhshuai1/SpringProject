package com.zebrait.rmi.server;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote{

	public String getServerInfo(int index)throws RemoteException;
	
	public Employee getEmployeeById(String id)throws RemoteException;
}
