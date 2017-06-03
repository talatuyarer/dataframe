package com.github.talatuyarer;

import java.util.List;

public class ColumnTyped<E> implements Column {
	
	private Cell<E>[] cells;
	
	private String name;
	private Type type;
	
	public ColumnTyped(String colName, List<E> values) {
		name = colName;
		values.toArray(cells);
	}

}
