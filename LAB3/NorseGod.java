package aa224iu__assign3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class NorseGod<Norsegod> extends Application {
	// Field
	private String name;
	private String race;
	private String desc;

	// method
	public NorseGod() {
		name = "";
		race = "";
		desc = "";
	}

	public NorseGod(String x, String y, String z) {
		name = x;
		race = y;
		desc = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String x) {
		name = x;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String x) {
		race = x;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String x) {
		desc = x;
	}

	// ArrayList

	// ArrayList<Norsegod> test = new ArrayList<Norsegod>();

	// GUI
	public void start(Stage primaryStage) {

		BorderPane bp = new BorderPane();

		// HBOX
		HBox list = new HBox();

		// Heading
		Label heading = new Label("NORSE GODS AND OTHER BEGINGS");
		heading.setFont(new Font("Comfortaa", 20));

		// GODLIST
		ListView<String> godList = new ListView<>();
		godList.setPrefWidth(100);

		// GOD
		NorseGod<Object> loki = new NorseGod<Object>("Loki", "Aesir",
				"Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.");
		NorseGod<Object> odin = new NorseGod<Object>("Odin", "Aesir",
				"Odin is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania through the tribal expansions of the Migration Period and the Viking Age. In the modern period, Odin continued to be acknowledged in the rural folklore of Germanic Europe. References to Odin appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including English.");
		NorseGod<Object> thor = new NorseGod<Object>("Thor", "Aesir",
				"Thor, also known as the Thunderer, was considered to be a son of Fjorgyn (Jord) and Odin by some, but among many tribes Thor actually supplanted Odin as the favorite god. He is considered to be the protector of all Midgard, and he wields the mighty hammer Mjollnir. Thor is strength personified. His battle chariot is drawn by two goats, and his hammer Mjollnir causes the lightning that flashes across the sky. Of all the deities, Thor is the most “barbarian” of the lot; rugged, powerful, and lives by his own rules, although he is faithful to the rest of the Aesir. The day Thursday (Thorsdaeg) is sacred to him.\r\n"
						+ "\r\n"
						+ "Thor is married to Sif, a fertility goddess, with whom he had a daughter, Thrud. He also had a mistress, the giantess Jarnsaxa with whom he had two sons, Magni and Modi. Thor is helped by Thialfi, his servant and the messenger of the gods.");
		NorseGod<Object> tyr = new NorseGod<Object>("Tyr", "Aesir",
				"Tyr is the ancient god of War and the Lawgiver of the gods. The bravest of the gods, it is Tyr who makes the binding of Fenrir (Myth 7) possible by sacrificing his right hand. At one time he was the leader of the Norse Pantheon, but was supplanted by Odin much later.\r\n"
						+ "\r\n"
						+ "Tyr also seems to be a god of justice. His name is derived from Tiw or Tiwaz an Tacticus and other Roman writers have equated this character to Mars, the receiver of human sacrifice. His day is Tuesday.");
		NorseGod<Object> fray = new NorseGod<Object>("Freyja", "Vanir",
				"Feyja (modern forms of the name include Freya, Freja, Freyia, Frøya, and Freia) is considered to be the goddess of Love and Beauty, but is also a warrior goddess and one of great wisdom and magick. She and her twin brother Freyr are of a different “race” of gods known as the Vanir. Many of the tribes venerated her higher than the Aesir, calling her “the Frowe” or “The Lady.” She is known as Queen of the Valkyries, choosers of those slain in battle to bear them to Valhalla (the Norse heaven). She, therefore, is a psychopomp like Odhinn and it is said that she gets the “first pick” of the battle slain. She wears the sacred necklace Brisingamen, which she paid for by spending the night with the dwarves who wrought it from the bowels of the earth. The cat is her sacred symbol. There seems to be some confusion between herself and Frigga, Odin’s wife, as they share similar functions; but Frigga seems to be strictly of the Aesir, while Freyja is of the Vanic race. The day Friday (Frejyasdaeg) was named for her (some claim it was for Frigga).");
		NorseGod<Object> fre = new NorseGod<Object>("Freyr", "Vanir",
				"Freyr was one of the most widely and passionately venerated divinities amongst the heathen Norse and other Germanic peoples. One Old Norse poem calls him “the foremost of the gods” and “hated by none.” The reasons for this aren’t hard to understand; their well-being and prosperity depended on his benevolence, which particularly manifested itself in sexual and ecological fertility, bountiful harvests, wealth, and peace. His role in providing health and abundance was often symbolized by his fylgja, the boar Gullinborsti (“Golden-Bristled”),and by his enormous, erect phallus.");
		NorseGod<Object> njord = new NorseGod<Object>("Njord", "Vanir",
				" (pronounced “NYORD;” Old Norse Njörðr, whose meaning/etymology is unknown) is one of the principal gods of the Vanir tribe of deities. He’s also an honorary member of the Aesir gods, having been sent to them during the Aesir-Vanir War along with his son, Freyr, and his daughter, Freya. Freyr and Freya’s mother is Njord’s unnamed sister, who, based on linguistic evidence, is probably Nerthus.\r\n"
						+ "\r\n"
						+ "Njord was particularly associated with wealth, fertility, the sea, and seafaring in historical Germanic religion. A saying among the Norse peoples held especially wealthy people to be “as rich as Njord.”[3]");
		NorseGod<Object> skadi = new NorseGod<Object>("Skadi", "Giant",
				"Skadi (pronounced “SKAHD-ee;” Old Norse Skaði) is a giantess and goddess in Norse mythology. Her name is either identical with the Old Norse common noun skaði, “harm,” or comes from another Germanic root preserved in the Gothic word skadus and the Old English sceadu, both of which mean “shadow.”[1] Her name is likely related to the name “Scandinavia,” but whether Skadi lent her name to the land-mass or vice versa is uncertain.\r\n"
						+ "\r\n"
						+ "Skadi lives in the highest reaches of the mountains, where the snow never melts. She’s an avid huntress, and her bow, snowshoes, and skis are her most often-mentioned attributes.\r\n"
						+ "\r\n"
						+ "She was once married to the god Njord. However, their marriage was a failure; Njord couldn’t stand the cold and dreariness of the mountains, and Skadi couldn’t stand the light and noise of Njord’s home by the seashore, so the two parted ways.");

		godList.getItems().addAll(loki.getName(), odin.getName(), thor.getName(), tyr.getName(), fray.getName(),
				fre.getName(), njord.getName(), skadi.getName()

		);

		// TEXT IN RIGHT SIDE
		Text text1 = new Text();
		text1.setFill(Color.RED);
		text1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 30));
		Text text2 = new Text();
		Text text3 = new Text();
		TextFlow textFlow = new TextFlow(text1, text2, text3);

		// action begin
		godList.getSelectionModel().selectedIndexProperty().addListener(ov -> {

			if (godList.getSelectionModel().getSelectedIndex() == 0) {
				text1.setText(loki.getName() + "\n");
				text2.setText(loki.getRace() + "\n\n");
				text3.setText(loki.getDesc());
			}
			if (godList.getSelectionModel().getSelectedIndex() == 1) {
				text1.setText(odin.getName() + "\n");
				text2.setText(odin.getRace() + "\n\n");
				text3.setText(odin.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 2) {
				text1.setText(thor.getName() + "\n");
				text2.setText(thor.getRace() + "\n\n");
				text3.setText(thor.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 3) {
				text1.setText(tyr.getName() + "\n");
				text2.setText(tyr.getRace() + "\n\n");
				text3.setText(tyr.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 4) {
				text1.setText(fray.getName() + "\n");
				text2.setText(fray.getRace() + "\n\n");
				text3.setText(fray.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 5) {
				text1.setText(fre.getName() + "\n");
				text2.setText(fre.getRace() + "\n\n");
				text3.setText(fre.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 6) {
				text1.setText(njord.getName() + "\n");
				text2.setText(njord.getRace() + "\n\n");
				text3.setText(njord.getDesc());
			}

			if (godList.getSelectionModel().getSelectedIndex() == 6) {
				text1.setText(skadi.getName() + "\n");
				text2.setText(skadi.getRace() + "\n\n");
				text3.setText(skadi.getDesc());
			}

		});

		// add Stuff in box
		list.getChildren().addAll(godList);
		bp.setPrefSize(500, 350);
		bp.setTop(heading);
		bp.setLeft(list);
		bp.setCenter(textFlow);

		Scene scene = new Scene(bp, 500, 350);
		primaryStage.setTitle("Norse Gods");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] agrs) {

		launch(agrs);
	}
}
