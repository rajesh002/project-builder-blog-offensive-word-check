package utility;

import model.Blog;
import utility.OffensiveWordsChecker;
import utility.OffensiveWordsInterface;

public class CheckBlogPost  extends OffensiveWordsChecker implements OffensiveWordsInterface{

	@Override
	public boolean checkBlogTitle(Blog blog) {
		if(!(offesiveWords(blog.getBlogTitle())))
			return true;
		else
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		if(!(offesiveWords(blog.getBlogDescription())))
			return true;
		else
		return false;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		if(checkBlogTitle(blog)&&checkBlogDescription(blog))
			return true;
		else
			return false;
	}

public boolean offesiveWords(String title) {
		//	String titles[]=title.split(" ");
			String arr[]= {"asshead","assho1e","asshole","assholes",
					"asshopper","bimbo","bimbos","bint","birdlock","bitch","cumguzzler",
					"cumjockey","cummer","cummin","cumming","dickripper","dicks","dicksipper",
					"dickslap","dick-sneeze","faggotcock","faggots","faggs","fagot","fagots"};
			
			for(String tmp:arr) {
				if(title.contains(tmp)) {
					return true;
				}
			}
			return false;

	}
}


