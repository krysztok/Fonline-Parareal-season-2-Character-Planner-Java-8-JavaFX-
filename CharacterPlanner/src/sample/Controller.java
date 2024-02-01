package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.*;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.imageio.ImageIO;

public class Controller implements Initializable {
    private Stats stats;
    private boolean isCharacterCreated;
    ObservableList<String> traitList;

    @FXML
    private Text stBaseText;
    @FXML
    private Text peBaseText;
    @FXML
    private Text enBaseText;
    @FXML
    private Text chBaseText;
    @FXML
    private Text inBaseText;
    @FXML
    private Text agBaseText;
    @FXML
    private Text lkBaseText;

    @FXML
    private Text stFinalText;
    @FXML
    private Text peFinalText;
    @FXML
    private Text enFinalText;
    @FXML
    private Text chFinalText;
    @FXML
    private Text inFinalText;
    @FXML
    private Text agFinalText;
    @FXML
    private Text lkFinalText;

    @FXML
    private Button strM;
    @FXML
    private Button peM;
    @FXML
    private Button enM;
    @FXML
    private Button chM;
    @FXML
    private Button inM;
    @FXML
    private Button agM;
    @FXML
    private Button lkM;

    @FXML
    private Button strP;
    @FXML
    private Button peP;
    @FXML
    private Button enP;
    @FXML
    private Button chP;
    @FXML
    private Button inP;
    @FXML
    private Button agP;
    @FXML
    private Button lkP;

    @FXML
    private Text levelLabel;
    @FXML
    private Text levelText;
    @FXML
    private Text expLabel;
    @FXML
    private Text expText;

    @FXML
    private Text hpText;
    @FXML
    private Text hpLevelText;
    @FXML
    private Text SpLevelText;
    @FXML
    private Text ppText;
    @FXML
    private Text viewRangeText;
    @FXML
    private Text sequenceText;
    @FXML
    private Text flatDamageText;
    @FXML
    private Text acText;
    @FXML
    private Text apText;
    @FXML
    private Text cwText;
    @FXML
    private Text meleeText;
    @FXML
    private Text poisonResText;
    @FXML
    private Text radResText;
    @FXML
    private Text hrText;
    @FXML
    private Text criticalChanceText;
    @FXML
    private Text normalDTText;
    @FXML
    private Text LaserDTText;
    @FXML
    private Text FireDTText;
    @FXML
    private Text PlasmaDTText;
    @FXML
    private Text electroDTText;
    @FXML
    private Text explodeDTText;
    @FXML
    private Text speedText;


    @FXML
    private CheckBox sgCB;
    @FXML
    private CheckBox bgCB;
    @FXML
    private CheckBox ewCB;
    @FXML
    private CheckBox ccCB;
    @FXML
    private CheckBox thCB;
    @FXML
    private CheckBox faCB;
    @FXML
    private CheckBox docCB;
    @FXML
    private CheckBox snCB;
    @FXML
    private CheckBox lpCB;
    @FXML
    private CheckBox stCB;
    @FXML
    private CheckBox trCB;
    @FXML
    private CheckBox scCB;
    @FXML
    private CheckBox reCB;
    @FXML
    private CheckBox spCB;
    @FXML
    private CheckBox baCB;
    @FXML
    private CheckBox gaCB;
    @FXML
    private CheckBox ouCB;

    @FXML
    private Text sgSPText;
    @FXML
    private Text bgSPText;
    @FXML
    private Text ewSPText;
    @FXML
    private Text ccSPText;
    @FXML
    private Text thSPText;
    @FXML
    private Text faSPText;
    @FXML
    private Text docSPText;
    @FXML
    private Text snSPText;
    @FXML
    private Text lpSPText;
    @FXML
    private Text stSPText;
    @FXML
    private Text trSPText;
    @FXML
    private Text scSPText;
    @FXML
    private Text reSPText;
    @FXML
    private Text spSPText;
    @FXML
    private Text baSPText;
    @FXML
    private Text gaSPText;
    @FXML
    private Text ouSPText;

    @FXML
    private Text sgSP2Text;
    @FXML
    private Text bgSP2Text;
    @FXML
    private Text ewSP2Text;
    @FXML
    private Text ccSP2Text;
    @FXML
    private Text thSP2Text;
    @FXML
    private Text faSP2Text;
    @FXML
    private Text docSP2Text;
    @FXML
    private Text snSP2Text;
    @FXML
    private Text lpSP2Text;
    @FXML
    private Text stSP2Text;
    @FXML
    private Text trSP2Text;
    @FXML
    private Text scSP2Text;
    @FXML
    private Text reSP2Text;
    @FXML
    private Text spSP2Text;
    @FXML
    private Text baSP2Text;
    @FXML
    private Text gaSP2Text;
    @FXML
    private Text ouSP2Text;

    @FXML
    private Button sgM;
    @FXML
    private Button bgM;
    @FXML
    private Button ewM;
    @FXML
    private Button ccM;
    @FXML
    private Button thM;
    @FXML
    private Button faM;
    @FXML
    private Button docM;
    @FXML
    private Button snM;
    @FXML
    private Button lpM;
    @FXML
    private Button stM;
    @FXML
    private Button trM;
    @FXML
    private Button scM;
    @FXML
    private Button reM;
    @FXML
    private Button spM;
    @FXML
    private Button baM;
    @FXML
    private Button gaM;
    @FXML
    private Button ouM;

    @FXML
    private Button sgP;
    @FXML
    private Button bgP;
    @FXML
    private Button ewP;
    @FXML
    private Button ccP;
    @FXML
    private Button thP;
    @FXML
    private Button faP;
    @FXML
    private Button docP;
    @FXML
    private Button snP;
    @FXML
    private Button lpP;
    @FXML
    private Button stP;
    @FXML
    private Button trP;
    @FXML
    private Button scP;
    @FXML
    private Button reP;
    @FXML
    private Button spP;
    @FXML
    private Button baP;
    @FXML
    private Button gaP;
    @FXML
    private Button ouP;

    @FXML
    private Button sgPP;
    @FXML
    private Button bgPP;
    @FXML
    private Button ewPP;
    @FXML
    private Button ccPP;
    @FXML
    private Button thPP;
    @FXML
    private Button faPP;
    @FXML
    private Button docPP;
    @FXML
    private Button snPP;
    @FXML
    private Button lpPP;
    @FXML
    private Button stPP;
    @FXML
    private Button trPP;
    @FXML
    private Button scPP;
    @FXML
    private Button rePP;
    @FXML
    private Button spPP;
    @FXML
    private Button baPP;
    @FXML
    private Button gaPP;
    @FXML
    private Button ouPP;

    @FXML
    private Text skillPointsToUseLabel;
    @FXML
    private Text skillPointsToUseText;

    @FXML
    private ChoiceBox trait1ChoiceBox;
    @FXML
    private Text trait1Text;
    @FXML
    private Text perksListLabel;
    @FXML
    private ScrollPane perksScrollPanel;
    @FXML
    private TextArea perksTextArea;

    @FXML
    private ChoiceBox trait2ChoiceBox;
    @FXML
    private Text trait2Text;
    @FXML
    private Text supportsListLabel;
    @FXML
    private ScrollPane supportsScrollPanel;
    @FXML
    private TextArea supportsTextArea;

    @FXML
    private Text newPerkText;
    @FXML
    private Button levelUpButton;

    @FXML
    private GridPane perksGridPane;

    @FXML
    private Text perksLabel;
    @FXML
    private ChoiceBox perksChoiceBox;
    @FXML
    private Button perksButton;

    @FXML
    private Text masteryLabel;
    @FXML
    private ChoiceBox masteryChoiceBox;
    @FXML
    private Button masteryButton;
    @FXML
    private Text masteryText;


    @FXML
    private Text supportsLabel;
    @FXML
    private ChoiceBox supportsChoiceBox;
    @FXML
    private Button supportsButton;

    @FXML
    private Text implantsLabel;
    @FXML
    private ChoiceBox implantsChoiceBox;
    @FXML
    private Button implantsButton;

    @FXML
    private Text booksLabel;
    @FXML
    private ChoiceBox booksChoiceBox;
    @FXML
    private Button booksButton;

    @FXML
    private CheckBox beerCB;
    @FXML
    private CheckBox jetCB;
    @FXML
    private CheckBox nukaCB;
    @FXML
    private CheckBox cigsCB;
    @FXML
    private CheckBox buffoutCB;
    @FXML
    private CheckBox psychoCB;
    @FXML
    private CheckBox mentatsCB;
    @FXML
    private CheckBox boozeCB;
    @FXML
    private CheckBox gammaCB;
    @FXML
    private CheckBox roentgenCB;
    @FXML
    private CheckBox rotgutCB;
    @FXML
    private CheckBox cookieCB;
    @FXML
    private CheckBox fruitCB;

    @FXML
    private Button screenshotButton;

    @FXML
    private Button resetButton;

    public Controller() {
        stats = new Stats();
        isCharacterCreated = false;
        traitList = null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hide2ndPart();
        setSpecialBase();
        setSpecialLeft();

        skillPointsToUseText.setText(Integer.toString(stats.getSkillTagsLeft()));
        //stats.getSkills().setBaseSkillsValues(stats.getSpecialsBase());
        refreshSkillsValues();
        refreshStatsValues();

        setTraitsChoiceBox();
        trait1ChoiceBox.setValue("");
        trait2ChoiceBox.setValue("");
/*
        trait1ChoiceBox.setOnAction((event) -> {
            if(trait1ChoiceBox.getValue() != null && trait1ChoiceBox.getValue() != stats.getTrait1()){
                String prevTrait = stats.getTrait1();
                String newTrait = trait1ChoiceBox.getValue().toString();

                if(prevTrait != ""){
                    stats.getTraits().getTraitInterface(prevTrait).onRemove(stats);
                    traitList.add(prevTrait);
                }

                stats.setTrait1(newTrait);
                if(newTrait != ""){
                    stats.getTraits().getTraitInterface(newTrait).onPick(stats);
                    traitList.remove(newTrait);
                }

                Collections.sort(traitList);
                trait1ChoiceBox.setItems(traitList);
                trait1ChoiceBox.setValue(newTrait);
                trait2ChoiceBox.setItems(traitList);
                refreshChangeBaseSpecials();
            }
        });

        trait2ChoiceBox.setOnAction((event) -> {
            if(trait2ChoiceBox.getValue() != null && trait2ChoiceBox.getValue() != stats.getTrait2()){
                String prevTrait = stats.getTrait2();
                String newTrait = trait2ChoiceBox.getValue().toString();

                if(prevTrait != ""){
                    stats.getTraits().getTraitInterface(prevTrait).onRemove(stats);
                    traitList.add(prevTrait);
                }

                stats.setTrait2(newTrait);
                if(newTrait != ""){
                    stats.getTraits().getTraitInterface(newTrait).onPick(stats);
                    traitList.remove(newTrait);
                }

                Collections.sort(traitList);
                trait1ChoiceBox.setItems(traitList);

                trait2ChoiceBox.setItems(traitList);
                trait2ChoiceBox.setValue(newTrait);
                refreshChangeBaseSpecials();
            }
        });
*/

        trait1ChoiceBox.setOnAction((event) -> {
            if (trait1ChoiceBox.getValue() != null && trait1ChoiceBox.getValue() != stats.getTrait1()) {
                String prevTrait = stats.getTrait1();
                String newTrait = trait1ChoiceBox.getValue().toString();

                if (prevTrait != "") {
                    stats.getTraits().getTraitInterface(prevTrait).onRemove(stats);
                }

                stats.setTrait1(newTrait);
                if (newTrait != "") {
                    if (newTrait != stats.getTrait2()) {
                        stats.getTraits().getTraitInterface(newTrait).onPick(stats);
                    } else {
                        stats.setTrait2("");
                        trait2ChoiceBox.setValue("");
                    }
                }

                refreshChangeBaseSpecials();
            }
        });

        trait2ChoiceBox.setOnAction((event) -> {
            if (trait2ChoiceBox.getValue() != null && trait2ChoiceBox.getValue() != stats.getTrait2()) {
                String prevTrait = stats.getTrait2();
                String newTrait = trait2ChoiceBox.getValue().toString();

                if (prevTrait != "") {
                    stats.getTraits().getTraitInterface(prevTrait).onRemove(stats);
                }

                stats.setTrait2(newTrait);
                if (newTrait != "") {
                    if (newTrait != stats.getTrait1()) {
                        stats.getTraits().getTraitInterface(newTrait).onPick(stats);
                    } else {
                        stats.setTrait1("");
                        trait1ChoiceBox.setValue("");
                    }
                }

                refreshChangeBaseSpecials();
            }
        });


        /***/
        perksChoiceBox.setOnMousePressed(e -> {
            perksChoiceBox.getItems().clear();
            List<String> availablePerks = stats.getPerks().getAvailablePerks(stats);
            if (availablePerks != null) {
                perksChoiceBox.getItems().addAll(availablePerks);
            }
        });

        perksButton.setOnMouseClicked(e -> {
            if (perksChoiceBox.getValue() != null) {
                String perk = perksChoiceBox.getValue().toString();
                perksChoiceBox.getItems().clear();
                stats.getPerks().getPerkInterface(perk).onPick(stats);
                stats.setAvailablePerk(false);
                perksTextArea.setText(perksTextArea.getText() + perk + " (" + stats.getLevel() + ")\n");

                stats.getSkills().confirmSkills();

                setSpecialBase();
                setSpecialFinal();
                refreshSkillsValues();
                refreshStatsValues();
                newPerkText.setVisible(false);
            }
        });

        masteryChoiceBox.setOnMousePressed(e -> {
            masteryChoiceBox.getItems().clear();
            List<String> availableMasteries = stats.getMasteries().getAvailableMasteries(stats);
            if (availableMasteries != null) {
                masteryChoiceBox.getItems().addAll(availableMasteries);
            }
        });

        masteryButton.setOnMouseClicked(e -> {
            if (masteryChoiceBox.getValue() != null) {
                String mastery = masteryChoiceBox.getValue().toString();
                masteryChoiceBox.getItems().clear();
                stats.getMasteries().getMasteryInterface(mastery).onPick(stats);

                masteryText.setText(mastery);
                masteryText.setVisible(true);

                masteryChoiceBox.setVisible(false);
                masteryButton.setVisible(false);

                stats.getSkills().confirmSkills();
                setSpecialBase();
                setSpecialFinal();
                refreshSkillsValues();
                refreshStatsValues();
            }
        });




        supportsChoiceBox.setOnMousePressed(e -> {
            supportsChoiceBox.getItems().clear();
            List<String> availablePerks = stats.getSupportPerks().getAvailablePerks(stats);

            if (availablePerks != null) {
                supportsChoiceBox.getItems().addAll(availablePerks);
            }
        });

        supportsButton.setOnMouseClicked(e -> {
            if (supportsChoiceBox.getValue() != null) {
                String perk = supportsChoiceBox.getValue().toString();
                supportsChoiceBox.getItems().clear();
                stats.getSupportPerks().getPerkInterface(perk).onPick(stats);

                supportsTextArea.setText(supportsTextArea.getText() + perk + " (" + stats.getLevel() + ")\n");

                stats.getSkills().confirmSkills();

                setSpecialBase();
                setSpecialFinal();
                refreshSkillsValues();
                refreshStatsValues();
            }
        });

        implantsChoiceBox.setOnMousePressed(e -> {
            implantsChoiceBox.getItems().clear();
            List<String> availablePerks = stats.getImplants().getAvailablePerks(stats);

            if (availablePerks != null) {
                implantsChoiceBox.getItems().addAll(availablePerks);
            }
        });

        implantsButton.setOnMouseClicked(e -> {
            if (implantsChoiceBox.getValue() != null) {
                String perk = implantsChoiceBox.getValue().toString();
                implantsChoiceBox.getItems().clear();
                stats.getImplants().getPerkInterface(perk).onPick(stats);

                supportsTextArea.setText(supportsTextArea.getText() + perk + " (" + stats.getLevel() + ")\n");

                stats.getSkills().confirmSkills();

                setSpecialBase();
                setSpecialFinal();
                refreshSkillsValues();
                refreshStatsValues();
            }
        });


        booksChoiceBox.setOnMousePressed(e -> {
            booksChoiceBox.getItems().clear();
            List<String> availablePerks = stats.getBooks().getAvailablePerks(stats);

            if (availablePerks != null) {
                booksChoiceBox.getItems().addAll(availablePerks);
            }
        });

        booksButton.setOnMouseClicked(e -> {
            if (booksChoiceBox.getValue() != null) {
                String perk = booksChoiceBox.getValue().toString();
                booksChoiceBox.getItems().clear();
                stats.getBooks().getPerkInterface(perk).onPick(stats);

                supportsTextArea.setText(supportsTextArea.getText() + perk + " (" + stats.getLevel() + ")\n");

                stats.getSkills().confirmSkills();

                setSpecialBase();
                setSpecialFinal();
                refreshSkillsValues();
                refreshStatsValues();
            }
        });



    }

    @FXML
    public void setSpecialBase() {
        stBaseText.setText(Integer.toString(stats.getSpecialBase("Strength")));
        peBaseText.setText(Integer.toString(stats.getSpecialBase("Perception")));
        enBaseText.setText(Integer.toString(stats.getSpecialBase("Endurance")));
        chBaseText.setText(Integer.toString(stats.getSpecialBase("Charisma")));
        inBaseText.setText(Integer.toString(stats.getSpecialBase("Intelligence")));
        agBaseText.setText(Integer.toString(stats.getSpecialBase("Agility")));
        lkBaseText.setText(Integer.toString(stats.getSpecialBase("Luck")));
    }

    @FXML
    public void setSpecialFinal() {
        stFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Strength")));
        peFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Perception")));
        enFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Endurance")));
        chFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Charisma")));
        inFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Intelligence")));
        agFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Agility")));
        lkFinalText.setText(Integer.toString(stats.getSpecialsAfterDrugs("Luck")));
    }

    @FXML
    public void onSpecialPlusButtonClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String special = "Strength";
        switch (id) {
            case "strP":
                special = "Strength";
                break;
            case "peP":
                special = "Perception";
                break;
            case "enP":
                special = "Endurance";
                break;
            case "chP":
                special = "Charisma";
                break;
            case "inP":
                special = "Intelligence";
                break;
            case "agP":
                special = "Agility";
                break;
            case "lkP":
                special = "Luck";
                break;
        }

        /**/

        int specialToUse = stats.getSpecialToUse();

        if (specialToUse > 0) {
            stats.setSpecialToUse(specialToUse - 1);
            stats.changeSpecialBase(special, 1);

            refreshChangeBaseSpecials();
        }

    }


    @FXML
    public void onSpecialMinusButtonClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String special = "Strength";
        switch (id) {
            case "strM":
                special = "Strength";
                break;
            case "peM":
                special = "Perception";
                break;
            case "enM":
                special = "Endurance";
                break;
            case "chM":
                special = "Charisma";
                break;
            case "inM":
                special = "Intelligence";
                break;
            case "agM":
                special = "Agility";
                break;
            case "lkM":
                special = "Luck";
                break;
        }

        /**/

        int specialToUse = stats.getSpecialToUse();
        stats.setSpecialToUse(specialToUse + 1);
        stats.changeSpecialBase(special, -1);

        refreshChangeBaseSpecials();
    }

    @FXML
    public void onSkillPlusButtonClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String skill = getSkillName(id);
        int cost = stats.getSkills().getSkill(skill).getCost();

        if (stats.getSkillPoints() >= cost && !stats.getSkills().getSkill(skill).isMax()) {
            stats.changeSkillPointsByValue(-cost);
            stats.getSkills().getSkill(skill).addPointToTmp();
        }

        refreshSkillsValues();
        refreshSkillPoints();
        refreshStatsValues();
    }

    @FXML
    public void onSkillPlusPlusButtonClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String skill = getSkillName(id);

        for (int i = 0; i < 5; i++) {
            int cost = stats.getSkills().getSkill(skill).getCost();
            if (stats.getSkillPoints() >= cost && !stats.getSkills().getSkill(skill).isMax()) {
                stats.changeSkillPointsByValue(-cost);
                stats.getSkills().getSkill(skill).addPointToTmp();
            }
        }

        refreshSkillsValues();
        refreshSkillPoints();
        refreshStatsValues();
    }

    @FXML
    public void onSkillMinusButtonClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String skill = getSkillName(id);
        int skillpointsTmp = stats.getSkills().getSkill(skill).getSkillAddedTmp();

        if (skillpointsTmp > 0) {
            stats.getSkills().getSkill(skill).removePointFromTmp();
            int cost = stats.getSkills().getSkill(skill).getCost();
            stats.changeSkillPointsByValue(cost);
        }

        refreshSkillsValues();
        refreshSkillPoints();
        refreshStatsValues();
    }

    public String getSkillName(String id) {
        String name = "Small Guns";

        switch (id) {
            case "sgM":
            case "sgP":
            case "sgPP":
                name = "Small Guns";
                break;
            case "bgM":
            case "bgP":
            case "bgPP":
                name = "Big Guns";
                break;
            case "ewM":
            case "ewP":
            case "ewPP":
                name = "Energy Weapons";
                break;
            case "ccM":
            case "ccP":
            case "ccPP":
                name = "Close Combat";
                break;
            case "thM":
            case "thP":
            case "thPP":
                name = "Throwing";
                break;
            case "faM":
            case "faP":
            case "faPP":
                name = "First Aid";
                break;
            case "docM":
            case "docP":
            case "docPP":
                name = "Doctor";
                break;
            case "snM":
            case "snP":
            case "snPP":
                name = "Sneak";
                break;
            case "lpM":
            case "lpP":
            case "lpPP":
                name = "Lockpick";
                break;
            case "stM":
            case "stP":
            case "stPP":
                name = "Steal";
                break;
            case "trM":
            case "trP":
            case "trPP":
                name = "Traps";
                break;
            case "scM":
            case "scP":
            case "scPP":
                name = "Science";
                break;
            case "reM":
            case "reP":
            case "rePP":
                name = "Repair";
                break;
            case "spM":
            case "spP":
            case "spPP":
                name = "Speech";
                break;
            case "baM":
            case "baP":
            case "baPP":
                name = "Barter";
                break;
            case "gaM":
            case "gaP":
            case "gaPP":
                name = "Gambling";
                break;
            case "ouM":
            case "ouP":
            case "ouPP":
                name = "Outdoorsman";
                break;
        }


        return name;
    }


    @FXML
    public void onDrugsChange(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String drug = "";
        switch (id) {
            case "beerCB":
                drug = "Beer";
                break;
            case "jetCB":
                drug = "Jet";
                break;
            case "nukaCB":
                drug = "Nuka";
                break;
            case "cigsCB":
                drug = "Cigs";
                break;
            case "buffoutCB":
                drug = "Buffout";
                break;
            case "psychoCB":
                drug = "Psycho";
                break;
            case "mentatsCB":
                drug = "Mentats";
                break;
            case "boozeCB":
                drug = "Booze";
                break;
            case "gammaCB":
                drug = "Gamma Beer";
                break;
            case "roentgenCB":
                drug = "Roentgen";
                break;
            case "rotgutCB":
                drug = "Rotgut";
                break;
            case "cookieCB":
                drug = "Cookie";
                break;
            case "fruitCB":
                drug = "Fruit";
                break;
        }

        boolean selected = ((CheckBox) event.getSource()).isSelected();
        int value = selected ? 1 : 0;
        stats.setDrug(drug, value);
        stats.calculateSpecialAfterDrugs();

        setSpecialFinal();
        refreshSkillsValues();
        refreshStatsValues();
    }


    @FXML
    public void setTraitsChoiceBox() {
        Map<String, Integer> traits = stats.getTraits().getTraitsFlags();
        List<String> traitsNames = new ArrayList<>();
        traitsNames.add("");
        traits.forEach((k, v) -> {
            if (v == 0) {
                traitsNames.add(k);
            }
        });
        java.util.Collections.sort(traitsNames);

        traitList = FXCollections.observableList(traitsNames);
        trait1ChoiceBox.getItems().addAll(traitList);
        trait2ChoiceBox.getItems().addAll(traitList);

    }


    @FXML
    public void refreshChangeBaseSpecials() {
        setSpecialBase();
        setSpecialLeft();
        refreshSkillsValues();
        refreshStatsValues();
    }

    @FXML
    public void setSpecialLeft() {
        levelText.setText("SPECIAL points left: " + stats.getSpecialToUse());
    }

    @FXML
    public void hide2ndPart() {
        stFinalText.setVisible(false);
        peFinalText.setVisible(false);
        enFinalText.setVisible(false);
        chFinalText.setVisible(false);
        inFinalText.setVisible(false);
        agFinalText.setVisible(false);
        lkFinalText.setVisible(false);

        levelLabel.setVisible(false);
        expLabel.setVisible(false);
        expText.setVisible(false);

        sgM.setVisible(false);
        bgM.setVisible(false);
        ewM.setVisible(false);
        ccM.setVisible(false);
        thM.setVisible(false);
        faM.setVisible(false);
        docM.setVisible(false);
        snM.setVisible(false);
        lpM.setVisible(false);
        stM.setVisible(false);
        trM.setVisible(false);
        scM.setVisible(false);
        reM.setVisible(false);
        spM.setVisible(false);
        baM.setVisible(false);
        gaM.setVisible(false);
        ouM.setVisible(false);

        sgP.setVisible(false);
        bgP.setVisible(false);
        ewP.setVisible(false);
        ccP.setVisible(false);
        thP.setVisible(false);
        faP.setVisible(false);
        docP.setVisible(false);
        snP.setVisible(false);
        lpP.setVisible(false);
        stP.setVisible(false);
        trP.setVisible(false);
        scP.setVisible(false);
        reP.setVisible(false);
        spP.setVisible(false);
        baP.setVisible(false);
        gaP.setVisible(false);
        ouP.setVisible(false);

        sgPP.setVisible(false);
        bgPP.setVisible(false);
        ewPP.setVisible(false);
        ccPP.setVisible(false);
        thPP.setVisible(false);
        faPP.setVisible(false);
        docPP.setVisible(false);
        snPP.setVisible(false);
        lpPP.setVisible(false);
        stPP.setVisible(false);
        trPP.setVisible(false);
        scPP.setVisible(false);
        rePP.setVisible(false);
        spPP.setVisible(false);
        baPP.setVisible(false);
        gaPP.setVisible(false);
        ouPP.setVisible(false);

        sgSP2Text.setVisible(false);
        bgSP2Text.setVisible(false);
        ewSP2Text.setVisible(false);
        ccSP2Text.setVisible(false);
        thSP2Text.setVisible(false);
        faSP2Text.setVisible(false);
        docSP2Text.setVisible(false);
        snSP2Text.setVisible(false);
        lpSP2Text.setVisible(false);
        stSP2Text.setVisible(false);
        trSP2Text.setVisible(false);
        scSP2Text.setVisible(false);
        reSP2Text.setVisible(false);
        spSP2Text.setVisible(false);
        baSP2Text.setVisible(false);
        gaSP2Text.setVisible(false);
        ouSP2Text.setVisible(false);

        trait1Text.setVisible(false);
        trait2Text.setVisible(false);

        newPerkText.setVisible(false);
        perksListLabel.setVisible(false);
        perksScrollPanel.setVisible(false);

        supportsListLabel.setVisible(false);
        supportsScrollPanel.setVisible(false);

        perksGridPane.setVisible(false);

    }

    @FXML
    public void show2ndPart() {
        stFinalText.setVisible(true);
        peFinalText.setVisible(true);
        enFinalText.setVisible(true);
        chFinalText.setVisible(true);
        inFinalText.setVisible(true);
        agFinalText.setVisible(true);
        lkFinalText.setVisible(true);

        levelLabel.setVisible(true);
        levelText.setText(Integer.toString(stats.getLevel()));
        expLabel.setVisible(true);
        expText.setVisible(true);
        expText.setText(Integer.toString(stats.getExp()));
        skillPointsToUseLabel.setText("Skill Points:");
        levelUpButton.setText("LEVEL UP!");
        skillPointsToUseText.setText(Integer.toString(stats.getSkillPoints()));

        levelText.setFill(Color.BLACK);
        skillPointsToUseLabel.setFill(Color.BLACK);
        skillPointsToUseText.setFill(Color.BLACK);

        sgM.setVisible(true);
        bgM.setVisible(true);
        ewM.setVisible(true);
        ccM.setVisible(true);
        thM.setVisible(true);
        faM.setVisible(true);
        docM.setVisible(true);
        snM.setVisible(true);
        lpM.setVisible(true);
        stM.setVisible(true);
        trM.setVisible(true);
        scM.setVisible(true);
        reM.setVisible(true);
        spM.setVisible(true);
        baM.setVisible(true);
        gaM.setVisible(true);
        ouM.setVisible(true);

        sgP.setVisible(true);
        bgP.setVisible(true);
        ewP.setVisible(true);
        ccP.setVisible(true);
        thP.setVisible(true);
        faP.setVisible(true);
        docP.setVisible(true);
        snP.setVisible(true);
        lpP.setVisible(true);
        stP.setVisible(true);
        trP.setVisible(true);
        scP.setVisible(true);
        reP.setVisible(true);
        spP.setVisible(true);
        baP.setVisible(true);
        gaP.setVisible(true);
        ouP.setVisible(true);

        sgPP.setVisible(true);
        bgPP.setVisible(true);
        ewPP.setVisible(true);
        ccPP.setVisible(true);
        thPP.setVisible(true);
        faPP.setVisible(true);
        docPP.setVisible(true);
        snPP.setVisible(true);
        lpPP.setVisible(true);
        stPP.setVisible(true);
        trPP.setVisible(true);
        scPP.setVisible(true);
        rePP.setVisible(true);
        spPP.setVisible(true);
        baPP.setVisible(true);
        gaPP.setVisible(true);
        ouPP.setVisible(true);

        sgSP2Text.setVisible(true);
        bgSP2Text.setVisible(true);
        ewSP2Text.setVisible(true);
        ccSP2Text.setVisible(true);
        thSP2Text.setVisible(true);
        faSP2Text.setVisible(true);
        docSP2Text.setVisible(true);
        snSP2Text.setVisible(true);
        lpSP2Text.setVisible(true);
        stSP2Text.setVisible(true);
        trSP2Text.setVisible(true);
        scSP2Text.setVisible(true);
        reSP2Text.setVisible(true);
        spSP2Text.setVisible(true);
        baSP2Text.setVisible(true);
        gaSP2Text.setVisible(true);
        ouSP2Text.setVisible(true);

        perksListLabel.setVisible(true);
        perksScrollPanel.setVisible(true);

        supportsListLabel.setVisible(true);
        supportsScrollPanel.setVisible(true);

        perksGridPane.setVisible(true);
        masteryText.setVisible(false);

        strM.setVisible(false);
        peM.setVisible(false);
        enM.setVisible(false);
        chM.setVisible(false);
        inM.setVisible(false);
        agM.setVisible(false);
        lkM.setVisible(false);

        strP.setVisible(false);
        peP.setVisible(false);
        enP.setVisible(false);
        chP.setVisible(false);
        inP.setVisible(false);
        agP.setVisible(false);
        lkP.setVisible(false);

        trait1ChoiceBox.setVisible(false);
        trait2ChoiceBox.setVisible(false);
        trait1Text.setVisible(true);
        trait2Text.setVisible(true);
        trait1Text.setText(stats.getTrait1());
        trait2Text.setText(stats.getTrait2());


        if (sgCB.isSelected()) {
            sgCB.setDisable(true);
        } else {
            sgCB.setVisible(false);
        }

        if (bgCB.isSelected()) {
            bgCB.setDisable(true);
        } else {
            bgCB.setVisible(false);
        }

        if (ewCB.isSelected()) {
            ewCB.setDisable(true);
        } else {
            ewCB.setVisible(false);
        }

        if (ccCB.isSelected()) {
            ccCB.setDisable(true);
        } else {
            ccCB.setVisible(false);
        }
        if (thCB.isSelected()) {
            thCB.setDisable(true);
        } else {
            thCB.setVisible(false);
        }

        if (faCB.isSelected()) {
            faCB.setDisable(true);
        } else {
            faCB.setVisible(false);
        }

        if (docCB.isSelected()) {
            docCB.setDisable(true);
        } else {
            docCB.setVisible(false);
        }

        if (snCB.isSelected()) {
            snCB.setDisable(true);
        } else {
            snCB.setVisible(false);
        }

        if (lpCB.isSelected()) {
            lpCB.setDisable(true);
        } else {
            lpCB.setVisible(false);
        }

        if (stCB.isSelected()) {
            stCB.setDisable(true);
        } else {
            stCB.setVisible(false);
        }

        if (trCB.isSelected()) {
            trCB.setDisable(true);
        } else {
            trCB.setVisible(false);
        }

        if (scCB.isSelected()) {
            scCB.setDisable(true);
        } else {
            scCB.setVisible(false);
        }

        if (reCB.isSelected()) {
            reCB.setDisable(true);
        } else {
            reCB.setVisible(false);
        }

        if (spCB.isSelected()) {
            spCB.setDisable(true);
        } else {
            spCB.setVisible(false);
        }

        if (baCB.isSelected()) {
            baCB.setDisable(true);
        } else {
            baCB.setVisible(false);
        }

        if (gaCB.isSelected()) {
            gaCB.setDisable(true);
        } else {
            gaCB.setVisible(false);
        }

        if (ouCB.isSelected()) {
            ouCB.setDisable(true);
        } else {
            ouCB.setVisible(false);
        }

        setSpecialFinal();
    }

    @FXML
    protected void onLevelUpButtonClick() {
        if (!isCharacterCreated) {
            boolean bool = true;

            if (stats.getSpecialToUse() != 0) {
                bool = false;
                levelText.setFill(Color.RED);
            } else {
                levelText.setFill(Color.BLACK);
            }

            if (stats.getSkillTagsLeft() != 0) {
                bool = false;
                skillPointsToUseText.setFill(Color.RED);
                skillPointsToUseLabel.setFill(Color.RED);
            } else {
                skillPointsToUseText.setFill(Color.BLACK);
                skillPointsToUseLabel.setFill(Color.BLACK);
            }

            if (bool) {
                show2ndPart();
                isCharacterCreated = true;
            }

        } else {
            stats.levelUp();
            stats.calculateStats();

            if (stats.isAvailablePerk()) {
                newPerkText.setVisible(true);
            } else {
                newPerkText.setVisible(false);
            }


            if (stats.isAlertPerk()) {
                newPerkText.setFill(Color.RED);
            } else {
                newPerkText.setFill(Color.BLACK);
            }

            stats.getSkills().confirmSkills();

            refreshStatsValues();
            refreshLevelAndExp();
            refreshSkillPoints();
        }
    }

    @FXML
    public void onSkillCheckBoxClick(ActionEvent event) {
        String id = ((Control) event.getSource()).getId();
        String skill = "Small Guns";
        switch (id) {
            case "sgCB":
                skill = "Small Guns";
                break;
            case "bgCB":
                skill = "Big Guns";
                break;
            case "ewCB":
                skill = "Energy Weapons";
                break;
            case "ccCB":
                skill = "Close Combat";
                break;
            case "thCB":
                skill = "Throwing";
                break;
            case "faCB":
                skill = "First Aid";
                break;
            case "docCB":
                skill = "Doctor";
                break;
            case "snCB":
                skill = "Sneak";
                break;
            case "lpCB":
                skill = "Lockpick";
                break;
            case "stCB":
                skill = "Steal";
                break;
            case "trCB":
                skill = "Traps";
                break;
            case "scCB":
                skill = "Science";
                break;
            case "reCB":
                skill = "Repair";
                break;
            case "spCB":
                skill = "Speech";
                break;
            case "baCB":
                skill = "Barter";
                break;
            case "gaCB":
                skill = "Gambling";
                break;
            case "ouCB":
                skill = "Outdoorsman";
                break;
        }

        CheckBox checkBox = ((CheckBox) event.getSource());
        boolean selected = ((CheckBox) event.getSource()).isSelected();
        int skillTagsToUse = stats.getSkillTagsLeft();
        int skillValue = stats.getSkills().getSkill(skill).getSkillAdded();

        if (selected == true && skillTagsToUse == 0) {
            checkBox.selectedProperty().setValue(false);
        } else if (selected == true && skillTagsToUse > 0) {
            stats.setSkillTagsLeft(skillTagsToUse - 1);
            stats.getSkills().getSkill(skill).setSkillTagged(true);
            stats.getSkills().getSkill(skill).addSkillAdded(20);
        } else {
            stats.setSkillTagsLeft(skillTagsToUse + 1);
            stats.getSkills().getSkill(skill).setSkillTagged(false);
            stats.getSkills().getSkill(skill).addSkillAdded(-20);
        }

        refreshSkillTagsToUse();
        refreshSkillsValues();
        refreshStatsValues();
    }

    @FXML
    protected void refreshSkillTagsToUse() {
        skillPointsToUseText.setText(Integer.toString(stats.getSkillTagsLeft()));
    }

    @FXML
    protected void refreshSkillsValues() {
        sgSPText.setText(stats.getSkills().getSkill("Small Guns").getSkillValueString());
        bgSPText.setText(stats.getSkills().getSkill("Big Guns").getSkillValueString());
        ewSPText.setText(stats.getSkills().getSkill("Energy Weapons").getSkillValueString());
        ccSPText.setText(stats.getSkills().getSkill("Close Combat").getSkillValueString());
        thSPText.setText(stats.getSkills().getSkill("Throwing").getSkillValueString());
        faSPText.setText(stats.getSkills().getSkill("First Aid").getSkillValueString());
        docSPText.setText(stats.getSkills().getSkill("Doctor").getSkillValueString());
        snSPText.setText(stats.getSkills().getSkill("Sneak").getSkillValueString());
        lpSPText.setText(stats.getSkills().getSkill("Lockpick").getSkillValueString());
        stSPText.setText(stats.getSkills().getSkill("Steal").getSkillValueString());
        trSPText.setText(stats.getSkills().getSkill("Traps").getSkillValueString());
        scSPText.setText(stats.getSkills().getSkill("Science").getSkillValueString());
        reSPText.setText(stats.getSkills().getSkill("Repair").getSkillValueString());
        spSPText.setText(stats.getSkills().getSkill("Speech").getSkillValueString());
        baSPText.setText(stats.getSkills().getSkill("Barter").getSkillValueString());
        gaSPText.setText(stats.getSkills().getSkill("Gambling").getSkillValueString());
        ouSPText.setText(stats.getSkills().getSkill("Outdoorsman").getSkillValueString());

        sgSP2Text.setText("(+" + stats.getSkills().getSkill("Small Guns").getSkillPointsUsed() + ")");
        bgSP2Text.setText("(+" + stats.getSkills().getSkill("Big Guns").getSkillPointsUsed() + ")");
        ewSP2Text.setText("(+" + stats.getSkills().getSkill("Energy Weapons").getSkillPointsUsed() + ")");
        ccSP2Text.setText("(+" + stats.getSkills().getSkill("Close Combat").getSkillPointsUsed() + ")");
        thSP2Text.setText("(+" + stats.getSkills().getSkill("Throwing").getSkillPointsUsed() + ")");
        faSP2Text.setText("(+" + stats.getSkills().getSkill("First Aid").getSkillPointsUsed() + ")");
        docSP2Text.setText("(+" + stats.getSkills().getSkill("Doctor").getSkillPointsUsed() + ")");
        snSP2Text.setText("(+" + stats.getSkills().getSkill("Sneak").getSkillPointsUsed() + ")");
        lpSP2Text.setText("(+" + stats.getSkills().getSkill("Lockpick").getSkillPointsUsed() + ")");
        stSP2Text.setText("(+" + stats.getSkills().getSkill("Steal").getSkillPointsUsed() + ")");
        trSP2Text.setText("(+" + stats.getSkills().getSkill("Traps").getSkillPointsUsed() + ")");
        scSP2Text.setText("(+" + stats.getSkills().getSkill("Science").getSkillPointsUsed() + ")");
        reSP2Text.setText("(+" + stats.getSkills().getSkill("Repair").getSkillPointsUsed() + ")");
        spSP2Text.setText("(+" + stats.getSkills().getSkill("Speech").getSkillPointsUsed() + ")");
        baSP2Text.setText("(+" + stats.getSkills().getSkill("Barter").getSkillPointsUsed() + ")");
        gaSP2Text.setText("(+" + stats.getSkills().getSkill("Gambling").getSkillPointsUsed() + ")");
        ouSP2Text.setText("(+" + stats.getSkills().getSkill("Outdoorsman").getSkillPointsUsed() + ")");
    }

    @FXML
    public void refreshStatsValues() {

        stats.calculateStats();

        hpText.setText(stats.getHitPoints());
        hpLevelText.setText(stats.getHitPointsPerLevel());
        SpLevelText.setText(stats.getSpPerLevel());
        ppText.setText(stats.getPartyPoints());
        viewRangeText.setText(stats.getViewRange());
        sequenceText.setText(stats.getSequence());
        flatDamageText.setText(stats.getFlatDamage());
        acText.setText(stats.getArmorClass());
        apText.setText(stats.getActionPoints());
        cwText.setText(stats.getCarryWeight());
        meleeText.setText(stats.getMeleeDamage());
        poisonResText.setText(stats.getPoisonResistance());
        radResText.setText(stats.getRadiationResistance());
        hrText.setText(stats.getHealingRate());
        criticalChanceText.setText(stats.getCriticalChance());
        normalDTText.setText(stats.getNormalDTDR());
        LaserDTText.setText(stats.getLaserlDTDR());
        FireDTText.setText(stats.getFireDTDR());
        PlasmaDTText.setText(stats.getPlasmaDTDR());
        electroDTText.setText(stats.getElectroDTDR());
        explodeDTText.setText(stats.getExplodeDTDR());
        speedText.setText(stats.getMovementSpeed());
    }

    @FXML
    public void refreshLevelAndExp() {
        levelText.setText(Integer.toString(stats.getLevel()));
        expText.setText(Integer.toString(stats.getExp()));
    }

    @FXML
    public void refreshSkillPoints() {
        skillPointsToUseText.setText(Integer.toString(stats.getSkillPoints()));
    }

    @FXML
    public void resetSkillsAndDrugs() {
        sgCB.setSelected(false);
        bgCB.setSelected(false);
        ewCB.setSelected(false);
        ccCB.setSelected(false);
        thCB.setSelected(false);
        faCB.setSelected(false);
        docCB.setSelected(false);
        snCB.setSelected(false);
        lpCB.setSelected(false);
        stCB.setSelected(false);
        trCB.setSelected(false);
        scCB.setSelected(false);
        reCB.setSelected(false);
        spCB.setSelected(false);
        baCB.setSelected(false);
        gaCB.setSelected(false);
        ouCB.setSelected(false);

        beerCB.setSelected(false);
        jetCB.setSelected(false);
        nukaCB.setSelected(false);
        cigsCB.setSelected(false);
        buffoutCB.setSelected(false);
        psychoCB.setSelected(false);
        mentatsCB.setSelected(false);
        boozeCB.setSelected(false);
        gammaCB.setSelected(false);
        roentgenCB.setSelected(false);
        rotgutCB.setSelected(false);
        cookieCB.setSelected(false);
        fruitCB.setSelected(false);

        sgCB.setVisible(true);
        bgCB.setVisible(true);
        ewCB.setVisible(true);
        ccCB.setVisible(true);
        thCB.setVisible(true);
        faCB.setVisible(true);
        docCB.setVisible(true);
        snCB.setVisible(true);
        lpCB.setVisible(true);
        stCB.setVisible(true);
        trCB.setVisible(true);
        scCB.setVisible(true);
        reCB.setVisible(true);
        spCB.setVisible(true);
        baCB.setVisible(true);
        gaCB.setVisible(true);
        ouCB.setVisible(true);

        sgCB.setDisable(false);
        bgCB.setDisable(false);
        ewCB.setDisable(false);
        ccCB.setDisable(false);
        thCB.setDisable(false);
        faCB.setDisable(false);
        docCB.setDisable(false);
        snCB.setDisable(false);
        lpCB.setDisable(false);
        stCB.setDisable(false);
        trCB.setDisable(false);
        scCB.setDisable(false);
        reCB.setDisable(false);
        spCB.setDisable(false);
        baCB.setDisable(false);
        gaCB.setDisable(false);
        ouCB.setDisable(false);
    }

    @FXML
    public void showSpecialButtons() {
        strM.setVisible(true);
        peM.setVisible(true);
        enM.setVisible(true);
        chM.setVisible(true);
        inM.setVisible(true);
        agM.setVisible(true);
        lkM.setVisible(true);

        strP.setVisible(true);
        peP.setVisible(true);
        enP.setVisible(true);
        chP.setVisible(true);
        inP.setVisible(true);
        agP.setVisible(true);
        lkP.setVisible(true);
    }

    @FXML
    public void onResetButtonClick() {

        if (stats.getTrait1() != "") {
            traitList.add(stats.getTrait1());
        }

        if (stats.getTrait2() != "") {
            traitList.add(stats.getTrait2());
        }

        resetSkillsAndDrugs();
        showSpecialButtons();
        stats = new Stats();
        isCharacterCreated = false;

        perksTextArea.clear();
        supportsTextArea.clear();

        hide2ndPart();
        setSpecialBase();
        setSpecialLeft();

        refreshSkillsValues();
        refreshStatsValues();

        skillPointsToUseText.setText(Integer.toString(stats.getSkillTagsLeft()));

        trait1ChoiceBox.setVisible(true);
        trait2ChoiceBox.setVisible(true);

        trait1ChoiceBox.setValue("");
        trait2ChoiceBox.setValue("");

        perksChoiceBox.getItems().clear();
        supportsChoiceBox.getItems().clear();
        booksChoiceBox.getItems().clear();
        masteryChoiceBox.getItems().clear();
        implantsChoiceBox.getItems().clear();

        masteryChoiceBox.setVisible(true);
        masteryButton.setVisible(true);

        levelUpButton.setText("START");
    }

    @FXML
    private VBox vboxAll;

    @FXML
    private void onScreenshotClick() throws IOException {
        WritableImage image = vboxAll.snapshot(new SnapshotParameters(), null);

        FileChooser fileChooser = new FileChooser();
        //Set extension filter
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("png files (*.png)", "*.png"));
        //Prompt user to select a file
        File file = fileChooser.showSaveDialog(null);


        if (file != null) {
            try {
                //Write the snapshot to the chosen file
                ImageIO.write(SwingFXUtils.fromFXImage(image, null), "PNG", file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}