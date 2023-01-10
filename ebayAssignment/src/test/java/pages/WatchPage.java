package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WatchPage {
	
	@FindBy(id = "gh-cat")
	WebElement category;
	
	
	
	public boolean findCategories() {
		
		List<String> list = new ArrayList<String>();
	
		Select s = new Select(category);
		List<WebElement> options = s.getOptions();
		System.out.println("size of the list---->"+options.size());
				
		for( WebElement option : options) {	
			String str = option.getText();
			System.out.println(str);
			list.add(str);
				
		}		
		
		List<String> copy = new ArrayList<String>(list);
		Collections.sort(copy);
		return copy.equals(list);
				
	}

}
