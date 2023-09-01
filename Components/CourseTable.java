package Components;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Class.Courses;

public class CourseTable extends AbstractTableModel {

    private String[] columnNames = {
            "Course Name",
            "Date",
            "Time",
            "Credit",
            "Ammount",

    };
    private List<Courses> courses;

    public CourseTable() {
        courses = new ArrayList<Courses>();
    }

    public void setData(List<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return courses.size();
    }

    @Override
    public Class<?> getColumnClass(int column) {
        switch (column) {
            case 0:
                return String.class;

            case 1:
                return String.class;

            case 2:
                return String.class;

            case 3:
                return String.class;
            case 4:
                return String.class;

            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int column) {
        switch (column) {
            case 0:
                return false;

            case 1:
                return false;

            case 2:
                return false;

            case 3:
                return false;
            case 4:
                return false;

            default:
                return true;

        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        Courses courses = getCourses(row);
        switch (column) {
            case 0:
                return courses.getCName();

            case 1:
                return courses.getDate();

            case 2:
                return courses.getTime();

            case 3:
                return courses.getCredit();
            case 4:
                return courses.getAmmount();

            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        Courses courses = getCourses(row);

        switch (column) {
            case 0:
                courses.setCName((String) value);
                break;

            case 1:
                courses.setDate((String) value);
                break;

            case 2:
                courses.setTime((String) value);
                break;

            case 3:
                courses.setCredit((int) value);
                break;
            case 4:
                courses.setAmmount((double) value);
                break;

        }

        fireTableCellUpdated(row, column);
    }

    public Courses getCourses(int row) {
        return courses.get(row);
    }

    public void refresh() {

        fireTableDataChanged();
    }

}
