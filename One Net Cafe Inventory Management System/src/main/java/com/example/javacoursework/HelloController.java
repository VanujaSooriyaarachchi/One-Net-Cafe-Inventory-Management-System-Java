package com.example.javacoursework;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.*;
import java.io.*;
import java.io.IOException;
import java.net.URL;
import javafx.scene.control.Alert;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class HelloController implements Initializable {
    @FXML
    private TableView<Items> tableView;
    @FXML
    private TableColumn<Items, Integer> colItemCode;
    @FXML
    private TableColumn<Items, String> colItemName;
    @FXML
    private TableColumn<Items, String> colItemBrand;
    @FXML
    private TableColumn<Items, Double> colItemPrice;
    @FXML
    private TableColumn<Items, Integer> colItemQuantity;
    @FXML
    private TableColumn<Items, String> colItemCategory;
    @FXML
    private TableColumn<Items, String> colDate;
    @FXML
    private TableView<Items> tableView2;
    @FXML
    private TableColumn<Items, Integer> colItemCode2;
    @FXML
    private TableColumn<Items, String> colItemName2;
    @FXML
    private TableColumn<Items, String> colItemBrand2;
    @FXML
    private TableColumn<Items, Double> colItemPrice2;
    @FXML
    private TableColumn<Items, Integer> colItemQuantity2;
    @FXML
    private TableColumn<Items, String> colItemCategory2;
    @FXML
    private TableColumn<Items, String> colDate2;
    @FXML
    private TableView<Items> tableView3;
    @FXML
    private TableColumn<Items, Integer> colItemCode3;
    @FXML
    private TableColumn<Items, String> colItemName3;
    @FXML
    private TableColumn<Items, String> colItemBrand3;
    @FXML
    private TableColumn<Items, Double> colItemPrice3;
    @FXML
    private TableColumn<Items, Integer> colItemQuantity3;
    @FXML
    private TableColumn<Items, String> colItemCategory3;
    @FXML
    private TableColumn<Items, String> colDate3;
    @FXML
    private TableView<Items> tableView4;
    @FXML
    private TableColumn<Items, Integer> colItemCode4;
    @FXML
    private TableColumn<Items, String> colItemName4;
    @FXML
    private TableColumn<Items, String> colItemBrand4;
    @FXML
    private TableColumn<Items, Double> colItemPrice4;
    @FXML
    private TableColumn<Items, Integer> colItemQuantity4;
    @FXML
    private TableColumn<Items, String> colItemCategory4;
    @FXML
    private TableColumn<Items, String> colDate4;
    @FXML
    private TableColumn<Items, Image> colImage;
    @FXML
    private Button btnDealers;
    @FXML
    private Button btnItems;
    @FXML
    private Pane pnlStatus;
    @FXML
    private Label lblStatus;
    @FXML
    private Label lblStatusMin;
    @FXML
    private Pane pnlStatusItems;
    @FXML
    private Pane pnlStatusDealers;
    @FXML
    private ImageView btnClose;
    @FXML
    private ImageView btnMinimize;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Button btnAddItem;
    @FXML
    private Pane pnlAddItem;
    @FXML
    private Button btnUpdateItem;
    @FXML
    private Pane pnlUpdateItem;
    @FXML
    private Button btnDeleteItem;
    @FXML
    private Pane pnlDeleteItem;
    @FXML
    private Button btnViewItem;
    @FXML
    private Pane pnlViewItem;
    @FXML
    private StackPane stackPnlItem;
    @FXML
    private StackPane stackPnlDealer;
    @FXML
    private Button btnDealerDetails;
    @FXML
    private Button btnDealerItems;
    @FXML
    private Button btnSelectDealers;
    @FXML
    private Pane pnlSelectDealers;
    @FXML
    private Pane pnlDealerDetails;
    @FXML
    private Pane pnlDealerItems;
    @FXML
    private TextField txtCategory;
    @FXML
    private TextField txtItemBrand;
    @FXML
    private TextField txtItemCode;
    @FXML
    private TextField txtItemName;
    @FXML
    private TextField txtItemPrice;
    @FXML
    private TextField txtQuantity;
    @FXML
    private DatePicker updateDate;
    @FXML
    private TextField updateItemBrand;
    @FXML
    private TextField updateItemCategory;
    @FXML
    private TextField updateItemCode;
    @FXML
    private TextField updateItemName;
    @FXML
    private TextField updateItemPrice;
    @FXML
    private TextField updateItemQuantity;
    @FXML
    private Button updateItemImage;
    @FXML
    private ImageView updateItemImageView;
    @FXML
    private TableColumn<Dealers, String> colDealer;
    @FXML
    private TableView tblDealers;
    @FXML
    private TableColumn<DealerItems, String> colDealerItemItems;
    @FXML
    private TableColumn<DealerItems, String> colDealerNameItems;
    @FXML
    private TableColumn<DealerItems, Double> colItemPriceItems;
    @FXML
    private TableColumn<DealerItems, Integer> colItemQuantityItems;
    @FXML
    private TableView<DealerItems> tblDealerItems;
    @FXML
    private Button btnDealerPick;
    @FXML
    private TableView<Dealers> tblDealerDetails;
    @FXML
    private TableColumn<Dealers, String> colDealerName;
    @FXML
    private TableColumn<Dealers, String> colDealerContact;
    @FXML
    private TableColumn<Dealers, String> colDealerLocation;
    @FXML
    private Button btnAddImage;
    @FXML
    private ImageView addImageView;


    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField deleteItemCodeField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void handleClicks(ActionEvent event) {
        if
        (event.getSource() == btnDealers) {  //handle dealer section
            lblStatusMin.setText("/home/dealers");
            lblStatus.setText("Dealers");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(37, 84, 199), CornerRadii.EMPTY, Insets.EMPTY)));
            stackPnlDealer.setOpacity(1);
            stackPnlItem.setOpacity(0);
            pnlStatusDealers.toFront();

        } else if (event.getSource() == btnItems) { //handle items section
            lblStatusMin.setText("/home/items");
            lblStatus.setText("Items");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(37, 84, 199), CornerRadii.EMPTY, Insets.EMPTY)));
            stackPnlItem.setOpacity(1);
            stackPnlDealer.setOpacity(0);
            pnlStatusItems.toFront();
            stackPnlItem.setDisable(false);
        }
    }

    private final ObservableList<Items> list = FXCollections.observableArrayList();

    @FXML
    private void itemClicks(ActionEvent event) { //section for add items
        if (event.getSource() == btnAddItem) {
            pnlAddItem.setOpacity(1);
            pnlUpdateItem.setOpacity(0);
            pnlDeleteItem.setOpacity(0);
            pnlViewItem.setOpacity(0);
            pnlAddItem.toFront();

            settingTheTable();
            tableView.setItems(list);

        } else if (event.getSource() == btnUpdateItem) { //section for update items
            pnlAddItem.setOpacity(0);
            pnlUpdateItem.setOpacity(1);
            pnlDeleteItem.setOpacity(0);
            pnlViewItem.setOpacity(0);
            pnlUpdateItem.toFront();

            settingTheTable2();
            tableView2.setItems(list);

        } else if (event.getSource() == btnDeleteItem) { //section for delete items
            pnlAddItem.setOpacity(0);
            pnlUpdateItem.setOpacity(0);
            pnlDeleteItem.setOpacity(1);
            pnlViewItem.setOpacity(0);
            pnlDeleteItem.toFront();

            settingTheTable3();
            tableView3.setItems(list);

        } else if (event.getSource() == btnViewItem) { //section for view items
            pnlAddItem.setOpacity(0);
            pnlUpdateItem.setOpacity(0);
            pnlDeleteItem.setOpacity(0);
            pnlViewItem.setOpacity(1);
            pnlViewItem.setVisible(true);
            pnlViewItem.toFront();


            settingTheTable4();
            tableView4.setItems(list);
        }
    }

    @FXML
    private void dealerClicks(ActionEvent event) {

        if (event.getSource() == btnSelectDealers) { //section for select random dealers
            pnlSelectDealers.setOpacity(1);
            pnlDealerDetails.setOpacity(0);
            pnlDealerItems.setOpacity(0);
            stackPnlItem.setDisable(true);
            pnlSelectDealers.toFront();

        } else if (event.getSource() == btnDealerDetails) { //section for get dealer details
            pnlSelectDealers.setOpacity(0);
            pnlDealerDetails.setOpacity(1);
            pnlDealerItems.setOpacity(0);
            pnlDealerDetails.toFront();

        } else if (event.getSource() == btnDealerItems) { //section for get dealer items
            pnlSelectDealers.setOpacity(0);
            pnlDealerDetails.setOpacity(0);
            pnlDealerItems.setOpacity(1);
            pnlDealerItems.toFront();

        }
    }

    private ArrayList<Items> itemsList = new ArrayList<>();

    @FXML
    private void handleClose(MouseEvent event) { //close button
        if (event.getSource() == btnClose)
            System.exit(0);
    }

    @FXML
    private void handleMinimize(MouseEvent event) { //minimize button
        Stage stage = (Stage) btnMinimize.getScene().getWindow();
        stage.setIconified(true);
    }

    public void goToPageOne(ActionEvent event) throws IOException { //back button. User can go to the page one
        Parent root = FXMLLoader.load(getClass().getResource("start-page.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void saveItemData(ActionEvent event) {
        String itemCode = txtItemCode.getText();
        String itemName = txtItemName.getText();
        String itemBrand = txtItemBrand.getText();
        String itemCategory = txtCategory.getText();
        String itemPrice = txtItemPrice.getText();
        String itemQuantity = txtQuantity.getText();
        LocalDate date = datePicker.getValue();
        Image itemImage = addImageView.getImage();

        boolean isValid = true;
        String errorMessage = "";

        int code = 0; // Initialize the variable "code" to hold the parsed integer value of "itemCode"
        if(itemCode.isEmpty()){ // Check if "itemCode" is empty
            isValid = false;
            txtItemCode.setStyle("-fx-border-color: red");
            errorMessage += "Code is empty.\n"; //give error message for the user
        } else {
            try {
                code = Integer.parseInt(itemCode);
                if( code < 0){
                    isValid = false;
                    txtItemCode.setStyle("-fx-border-color: red");
                    errorMessage += "Code must be positive.\n";
                } else {
                    String[] lineData;
                    String line;
                    try{
                        String fileName = "C:\\Java Course Work\\javaCourseWork\\src\\main\\resources\\com\\example\\javacoursework\\saveAddItems";
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));
                        while ((line = reader.readLine()) != null){
                            lineData = line.split(",");
                            if (lineData[0].equals(itemCode)){
                                isValid = false;
                                txtItemCode.setStyle("-fx-border-color: red");
                                errorMessage += "Code already exists.\n";
                                break;
                            }
                        } reader.close();
                    }catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }
            } catch (NumberFormatException e){
                isValid = false;
                txtItemCode.setStyle("-fx-border-color: red");
                errorMessage += "Code must be an integer value.\n";
            }
        }

        if (itemName.isEmpty()) {
            isValid = false;
            txtItemName.setStyle("-fx-border-color: red;");
            errorMessage += "Please enter a name.\n";
        } else {
            // Check if the name contains only letters and spaces
            if (!itemName.matches("[a-zA-Z ]+")) {
                isValid = false;
                txtItemName.setStyle("-fx-border-color: red;");
                errorMessage += "Please enter a valid name (only letters and spaces are allowed).\n";
            }
        }

        if (itemBrand.isEmpty()) { // Validate the item brand
            isValid = false;
            txtItemBrand.setStyle("-fx-border-color: red;");
            errorMessage += "Please enter a brand.\n";
        }

        if (itemCategory.isEmpty()) { //validae the item category
            isValid = false;
            txtCategory.setStyle("-fx-border-color: red;");
            errorMessage += "Please enter a category.\n";
        }

        int quantity = 0;
        if(itemQuantity.isEmpty()){ //validae the item quantity
            isValid = false;
            txtQuantity.setStyle("-fx-border-color: red");
            errorMessage += "Quantity cannot be empty.\n";
        } else {
            try {
                quantity = Integer.parseInt(itemQuantity);
                if (code < 0) {
                    isValid = false;
                    txtQuantity.setStyle("-fx-border-color: red");
                    errorMessage += "Quantity must be positive.\n";
                }
            } catch (NumberFormatException e) {
                isValid = false;
                txtQuantity.setStyle("-fx-border-color: red");
                errorMessage += "Quantity must be an integer value.\n";
            }
        }

        double price = 0.0;
        if (itemPrice.isEmpty()) { // Validate the price is not empty and is a valid number
            isValid = false;
            txtItemPrice.setStyle("-fx-border-color: red;");
            errorMessage += "Please enter a Price.\n";
        } else{
            try {
                price = Double.parseDouble(itemPrice);

                if (price < 0) { // Validate price is not negative
                    isValid = false;
                    txtItemPrice.setStyle("-fx-border-color: red;");
                    errorMessage += "Price cannot be a negative value.\n";
                }
            } catch (NumberFormatException e) {
                isValid = false;
                txtItemPrice.setStyle("-fx-border-color: red;");
                errorMessage += "Price must be a valid number.\n";
            }
        }

        if (date == null){
            isValid = false;
            datePicker.setStyle("-fx-border-color: red");
            errorMessage += "Please enter the date\n";
        }

        // If all fields are valid, proceed with adding the item
        if (isValid) {

            // Create the new Items object and add it to the itemsList
            Items newItem = new Items(Integer.parseInt(itemCode), itemName, itemBrand, Float.parseFloat(itemPrice), Integer.parseInt(itemQuantity), itemCategory, date, itemImage);
            itemsList.add(newItem);
            list.add(newItem);

            // Clear input fields after adding data
            txtItemCode.clear();
            txtItemName.clear();
            txtItemBrand.clear();
            txtCategory.clear();
            txtItemPrice.clear();
            txtQuantity.clear();
            datePicker.setValue(null);
            addImageView.setImage(null);

            //clear all the background error colour
            txtItemCode.setStyle("");
            txtItemName.setStyle("");
            txtItemBrand.setStyle("");
            txtCategory.setStyle("");
            txtItemPrice.setStyle("");
            txtQuantity.setStyle("");
            datePicker.setStyle("");

            settingTheTable();
            tableView.setItems(list);

            saveDataToFile();
        } else {
            showAlert("Invalid Input", errorMessage);
        }
    }
    private void showAlert(String title, String message){ //setting the alert message
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void saveDataToFile() {
        String filename =  "C:\\Java Course Work\\javaCourseWork\\src\\main\\resources\\com\\example\\javacoursework\\saveAddItems"; //append to the text file for save the adding otem data
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Items item : itemsList) {
                writer.write(item.getItemCode() + "," + item.getItemName() + "," + item.getItemBrand() + ","
                        + item.getItemPrice() + "," + item.getItemQuantity() + "," + item.getItemCategory() + ","
                        + item.getDate());
                writer.newLine();
            }

        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText( e.getMessage());
            alert.show();
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Data Added Successfully.");
        alert.show();


        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) { //sorting item code
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent items based on itemCode
                if (list.get(j).getItemCode() > list.get(j + 1).getItemCode()) {
                    // Swap the items
                    Items temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        tableView.setItems(list);
    }

    @FXML
    private void handleAddImage(ActionEvent event) { //add image
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Image File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));

        File selectedFile = fileChooser.showOpenDialog(btnAddImage.getScene().getWindow());

        if (selectedFile != null) {
            try {
                // Load the selected image file into an Image object
                Image image = new Image(selectedFile.toURI().toString());
                // Set the Image object to the ImageView
                addImageView.setImage(image);

                Items selectedItem = tableView4.getSelectionModel().getSelectedItem();
                if (selectedItem != null) {
                    // Set the image for the selected item
                    selectedItem.setItemImage(image);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void deleteItems(ActionEvent event) { //delete items section
        int itemCodeToDelete = Integer.parseInt(deleteItemCodeField.getText());
        Items itemToDelete = null;
        for (Items item : itemsList) {
            if (item.getItemCode() == itemCodeToDelete) {
                itemToDelete = item;
                break;
            }
        }

        if (itemToDelete != null) {
            itemsList.remove(itemToDelete);
            saveDataToFile(); // Update the text file after deletion
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Item Code " + itemCodeToDelete + " Deleted Successfully!");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Item Code " + itemCodeToDelete + " Not Found.");
            alert.show();
        }

        deleteItemCodeField.clear();

        settingTheTable();
        tableView.setItems(list);

        saveDataToFile();
        list.remove(itemToDelete);
    }

    @FXML
    public void updateItems(ActionEvent event) { //item update section

        int itemCodeToUpdate;
        try {
            itemCodeToUpdate = Integer.parseInt(updateItemCode.getText());
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Item Code must be an integer.");
            return;
        }

        Items itemToUpdate = null;
        for (Items item : itemsList) {
            if (item.getItemCode() == itemCodeToUpdate) {
                itemToUpdate = item;
                list.remove(item);
                break;
            }
        }

        if (itemToUpdate == null) {
            showAlert("Item Not Found", "Item Code " + itemCodeToUpdate + " not found.");
            return;
        }

        String itemName = updateItemName.getText();
        if (itemName.isEmpty() || !itemName.matches("[a-zA-Z]+")){
            showAlert("Invalid Input", "Please enter a valid name");
            return;
        }

        String itemBrand = updateItemBrand.getText();
        if (itemBrand.isEmpty()){
            showAlert("Invalid Input", "Please enter a brand");
            return;
        }

        float itemPrice;
        try {
            itemPrice = Float.parseFloat(updateItemPrice.getText());
            if (itemPrice<0) {
                showAlert("Invalid Input", "Price cannot be a negative value.");
                return;
            }
        } catch (NumberFormatException e){
            showAlert("Invalid Input", "Price must be a valid number.");
            return;
        }

        int itemQuantity;
        try {
            itemQuantity = Integer.parseInt(updateItemQuantity.getText());
            if (itemQuantity < 0){
                showAlert("Invalid Input", "Quantity cannot be a negative value.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Quantity must be an integer value.");
            return;
        }

        LocalDate date = updateDate.getValue();
        if (date == null){
            showAlert("Invalid Input", "Please select a date.");
            return;
        }

            // Update the item details using setters
            itemToUpdate.setItemName(updateItemName.getText());
            itemToUpdate.setItemBrand(updateItemBrand.getText());
            itemToUpdate.setItemCategory(updateItemCategory.getText());
            itemToUpdate.setItemPrice(Float.parseFloat(updateItemPrice.getText()));
            itemToUpdate.setItemQuantity(Integer.parseInt(updateItemQuantity.getText()));
            itemToUpdate.setDate(updateDate.getValue());
            itemToUpdate.setItemImage(updateItemImageView.getImage());

            // Clear the update fields after updating data
            updateItemCode.clear();
            updateItemName.clear();
            updateItemBrand.clear();
            updateItemCategory.clear();
            updateItemPrice.clear();
            updateItemQuantity.clear();
            updateDate.setValue(null);
            updateItemImageView.setImage(null);

            settingTheTable();
            tableView.setItems(list);
            // Save the data to the text file
            saveDataToFile();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Item Code " + itemCodeToUpdate + " Updated Successfully.");
            alert.show();

            list.add(itemToUpdate);
        }

    public void settingTheTable() { //insert data to table
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colItemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemBrand.setCellValueFactory(new PropertyValueFactory<>("itemBrand"));
        colItemPrice.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemQuantity.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colItemCategory.setCellValueFactory(new PropertyValueFactory<>("itemCategory"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    public void settingTheTable2(){
        colItemCode2.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colItemName2.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemBrand2.setCellValueFactory(new PropertyValueFactory<>("itemBrand"));
        colItemPrice2.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemQuantity2.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colItemCategory2.setCellValueFactory(new PropertyValueFactory<>("itemCategory"));
        colDate2.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    public void settingTheTable3() {
        colItemCode3.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colItemName3.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemBrand3.setCellValueFactory(new PropertyValueFactory<>("itemBrand"));
        colItemPrice3.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemQuantity3.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colItemCategory3.setCellValueFactory(new PropertyValueFactory<>("itemCategory"));
        colDate3.setCellValueFactory(new PropertyValueFactory<>("date"));
    }
    public void settingTheTable4() {
        colItemCode4.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colItemName4.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        colItemBrand4.setCellValueFactory(new PropertyValueFactory<>("itemBrand"));
        colItemPrice4.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        colItemQuantity4.setCellValueFactory(new PropertyValueFactory<>("itemQuantity"));
        colItemCategory4.setCellValueFactory(new PropertyValueFactory<>("itemCategory"));
        colDate4.setCellValueFactory(new PropertyValueFactory<>("date"));
        colImage.setCellValueFactory(new PropertyValueFactory<>("itemImage"));
        colImage.setCellFactory(column -> new TableCell<Items, Image>() {
            private final ImageView imageView = new ImageView();

            {
                // Set the size of the ImageView to fit the cell
                imageView.setFitWidth(50);
                imageView.setFitHeight(50);
            }

            @Override
            protected void updateItem(Image image, boolean empty) {
                super.updateItem(image, empty);

                if (empty || image == null) {
                    // If the cell is empty, remove any content from it
                    setGraphic(null);
                } else {
                    // Set the ImageView with the image
                    imageView.setImage(image);
                    setGraphic(imageView);
                }
            }
        });
    }

    private List<Dealers> selectDealers(String fileName) {
        List<Dealers> dealers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 3) {
                    dealers.add(new Dealers(data[0].replaceAll("\"", ""),
                            data[1].replaceAll("\"", ""),
                            data[2].replaceAll("\"", "")));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealers;
    }

    @FXML
    public void pickDealer(ActionEvent event){ //select 4 random dealers
        List<Dealers> allDealers = selectDealers("C:\\Java Course Work\\javaCourseWork\\src\\main\\resources\\com\\example\\javacoursework\\dealers");
        List<Dealers> randomDealers = selectRandomDealers(allDealers, 4);

        colDealer.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDealerName()));
        colDealerName.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDealerName()));
        colDealerContact.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDealerContact()));
        colDealerLocation.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDealerLocation()));

        bubbleSort(randomDealers);

        tblDealers.getItems().clear();
        tblDealers.getItems().addAll(randomDealers);

        List<DealerItems> itemDetailsList = getItemDetailsForSelectedDealers(randomDealers, "C:\\Java Course Work\\javaCourseWork\\src\\main\\resources\\com\\example\\javacoursework\\dealerItems");

        tblDealerItems.getItems().clear();
        tblDealerItems.getItems().addAll(itemDetailsList);

        tblDealerDetails.getItems().clear();
        tblDealerDetails.getItems().addAll(randomDealers);
    }

    private List<Dealers> selectRandomDealers(List<Dealers> dealers, int count) {
        List<Dealers> selectedDealers = new ArrayList<>(dealers);
        List<Dealers> randomDealers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(selectedDealers.size());
            randomDealers.add(selectedDealers.get(randomIndex));
            selectedDealers.remove(randomIndex);
        }
        return randomDealers;
    }

    private void bubbleSort(List<Dealers> dealers) { //sort dealers using there locations
        int n = dealers.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Compare dealer locations using the compareTo() method
                if (dealers.get(j).getDealerLocation().compareTo(dealers.get(j + 1).getDealerLocation()) > 0) {
                    // Swap dealers at index j and j+1
                    Dealers temp = dealers.get(j);
                    dealers.set(j, dealers.get(j + 1));
                    dealers.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    private List<DealerItems> getItemDetailsForSelectedDealers(List<Dealers> selectedDealers, String fileName) {
        List<DealerItems> itemDetailsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 4) {
                    String dealerName = data[0].replaceAll("\"", "");
                    String itemName = data[1].replaceAll("\"", "");
                    double itemPrice = Double.parseDouble(data[2]);
                    int itemQuantity = Integer.parseInt(data[3]);

                    for (Dealers dealer : selectedDealers) {
                        if (dealerName.equals(dealer.getDealerName())) {
                            itemDetailsList.add(new DealerItems(dealerName, itemName, itemPrice, itemQuantity));
                            break;
                        }
                    }

                    colDealerNameItems.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDealerName()));
                    colDealerItemItems.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getItemName()));
                    colItemQuantityItems.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getItemQuantity()).asObject());
                    colItemPriceItems.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getItemPrice()).asObject());

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return itemDetailsList;
    }

}
