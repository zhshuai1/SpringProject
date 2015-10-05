package com.zebrait.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImpl extends UnicastRemoteObject implements RemoteInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3491749919079349917L;

	private int count=0;

	public RemoteInterfaceImpl()throws RemoteException{
		super();
	}

	@Override
	public Employee getEmployeeById(String id) throws RemoteException {
		System.out.println("This is the "+ ++count+ "th request");
		Employee Employee = new Employee();
		Employee.setId(id);
		Employee.setName("雕戈_"+id);
		return Employee;
	}

	@Override
	public String getServerInfo(int index) throws RemoteException {
		System.out.println("This is the "+ ++count+ "th request");
		if(index==5)
			throw new RemoteException("远程抛出的异常");
		return "远程方法调用RMI测试程序_"+index;
	}

}
