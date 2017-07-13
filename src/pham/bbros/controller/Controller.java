package pham.bbros.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pham.bbros.controller.Controller;
import pham.bbros.model.DBModel;
import pham.bbros.model.Orchid;

public class Controller {
	
	
private Controller(){}
	
	private static Controller theOne;
	
	private static final String DB_NAME = "PhamilyOrchids.db";
	
	private static final String USER_TABLE_NAME = "user";
	private static final String[] USER_FIELD_NAMES = { "id", "username", "password", "joindate"};
	private static final String[] USER_FIELD_TYPES = { "INTEGER PRIMARY KEY", "TEXT", "TEXT", "TEXT"};
	
	private static final String BUYER_TABLE_NAME = "buyer";
	private static final String[] BUYER_FIELD_NAMES = {"id", "firstname", "lastname"};
	private static final String[] BUYER_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT"};
	
	private static final String ORCHID_TABLE_NAME = "orchids";
	private static final String[] ORCHID_FIELD_NAMES = {"id", "image", "type", "scent", "color", "size", "bloomingseason", "quantity", "description", "price"};
	private static final String[] ORCHID_FIELD_TYPES = {"INTEGER PRIMARY KEY", "TEXT", "TEXT", "TEXT", "TEXT", "DECIMAL", "TEXT", "INTEGER", "TEXT", "FLOAT"};
	
	
	

	private ObservableList<Orchid> mAllOrchidsList;
	
	public static Controller getInstance(){
		if(theOne == null){
			theOne = new Controller();
			theOne.mAllOrchidsList = FXCollections.observableArrayList();
			
			
		}
		return theOne;
	}
}
