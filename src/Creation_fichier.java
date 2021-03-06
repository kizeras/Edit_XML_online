import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Creation_fichier {

	public Document createDocument() {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("root");

		Element author1 = root.addElement("author")
				.addAttribute("name", "James").addAttribute("location", "UK")
				.addText("James Strachan");

		Element author2 = root.addElement("author").addAttribute("name", "Bob")
				.addAttribute("location", "US").addText("Bob McWhirter");

		return document;
	}
}
