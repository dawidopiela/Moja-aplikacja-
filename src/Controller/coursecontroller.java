

package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;




public class coursecontroller {

        @FXML
        private TableView<?> tbl_course;

        @FXML
        private TableColumn<?, ?> col_course_name;

        @FXML
        private TableColumn<?, ?> col_course_category;

        @FXML
        private TextField tf_course_name;

        @FXML
        private TextField tf_course_category;

        @FXML
        private TextField tf_course_trainer;

        @FXML
        private DatePicker dp_course_date;

        @FXML
        void addCourse(ActionEvent event) {

        }

        @FXML
        void deleteCourse(ActionEvent event) {

        }

        @FXML
        void getCourse(ActionEvent event) {

        }

}



