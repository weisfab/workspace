/**
 * 
 */
package weibo4android.examples.statuses;

import weibo4android.Status;
import weibo4android.Weibo;

/**
 * @author sina
 *
 */
public class UpdateStatus {

	/**
	 * 发布一条微博信息 
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
        try {
        	Weibo weibo = new Weibo();
			weibo.setToken(args[0],args[1]);
        	Status status = weibo.updateStatus("夜深了，人睡了。");
        	System.out.println(status.getId() + " : "+ status.getText()+"  "+status.getCreatedAt());
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
