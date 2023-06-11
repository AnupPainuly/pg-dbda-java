package com.utils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

import com.core.app.Product;

public interface IOUtils {
	static void writeData(ArrayList<Product> list, String fileName) throws IOException{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(list);
		}
	}
}
