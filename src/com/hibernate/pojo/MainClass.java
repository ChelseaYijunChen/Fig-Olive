/**
 * 
 */
package com.hibernate.pojo;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.service.ProductServiceImpl;
import com.hibernate.util.HibernateUtil;

/**
 * @author: Yijun Chen
 * @date: Mar 5, 6017
 * @time: 16:09:51 AM
 */
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hibernate one to many (Annotation)");
	 	Session session = HibernateUtil.getSessionFactory().openSession();
	
	 	session.beginTransaction();
	 	
//	 	Customer u1 = new Customer();
//	 		u1.setEmail("yijun@gmail.com");
//	 		u1.setRegDate("01/feb/2017");
//	 		u1.setUserName("Yijun");
//	 		u1.setPassword("yijun");
//	 		u1.setPhoneNum("8648900987");
//	 		u1.setAddress("1840 Wessel Court");
//	 		u1.setIsAdmin("Yes");
//	 		session.save(u1);
//	 		
//	 	Customer u2 = new Customer();
//	 		u2.setEmail("Joey@gmail.com");
//	 		u2.setRegDate("01/feb/2017");
//	 		u2.setUserName("Joey");
//	 		u2.setPassword("joey");
//	 		u2.setPhoneNum("8641231234");
//	 		u2.setAddress("3809 Illoni");
//	 		u2.setIsAdmin("No"); 		
//	 		session.save(u2);
 		
//	 		Order o1 = new Order();
//	 		o1.setCustomer(u2);
//	 		o1.setOrderDate(new Date().toString());
//	 		o1.setQuanlity(6);
//	 		u2.getOrder().add(o1);
//	 		session.save(o1);
	 		
//	 		Category c1 = new Category();
//	 		c1.setCategoryId(1);
//	 		c1.setCategoryName("burger");
//	 		session.update(c1);
	 		
	 		Category c2 = new Category();
	 		//c2.setCategoryId(2);
	 		c2.setCategoryName("beverage");
	 		session.save(c2);
	 		
	 		Category c3 = new Category();
	 		//c3.setCategoryId(3);
	 		c3.setCategoryName("sides");
	 		session.save(c3);
	 		
//	 			Product p1 = new Product();
//	 			p1.setProductName("BBQ BACON KING™ Sandwich");
//	 			p1.setCategory(c1);
//	 			p1.setProductDescription("You can’t go wrong with our BBQ BACON KING™ Sandwich featuring two ¼ lb* savory flame-grilled beef patties, topped with a hearty portion of thick-cut smoked bacon, melted American cheese, creamy mayonnaise, and finished off with a hefty portion of BBQ sauce.");
//	 			p1.setProductImage("images/BBQBACONKING.png");
//	 			p1.setProductPrice(11.88);
////	 			o1.getProduct().add(p1);
//	 			session.save(p1);
//	 			
//	 			Product p2 = new ProductServiceImpl().viewProductById(2);
//	 			//p2.setProductId(2);
//	 			p2.setProductName("WHOPPER® SANDWICH");
//	 			p2.setCategory(c1);
//	 			p2.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p2.setProductImage("images/Whopper.jpg");
//	 			p2.setProductPrice(12.88);
//	 			session.update(p2);
//	 			
//	 			Product p3 = new Product();
//	 			p3.setProductName("DOUBLE WHOPPER® SANDWICH");
//	 			p3.setCategory(c1);
//	 			p3.setProductDescription("Our DOUBLE WHOPPER® Sandwich is a pairing of two ¼ lb* savory flame-grilled beef patties topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p3.setProductImage("images/DoubleWhopper.jpg");
//	 			p3.setProductPrice(13.88);
//	 			session.save(p3);
//	 			
//	 			Product p4 = new Product();
//	 			p4.setProductName("WHOPPER JR.® SANDWICH");
//	 			p4.setCategory(c1);
//	 			p4.setProductDescription("Our WHOPPER JR.® Sandwich features one savory flame-grilled beef patty topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p4.setProductImage("images/WhopperJR.jpg");
//	 			p4.setProductPrice(14.88);
//	 			session.save(p4);
//	 			
//	 			Product p5 = new Product();
//	 			p5.setProductName("EXTRA LONG Chessburger");
//	 			p5.setCategory(c1);
//	 			p5.setProductDescription("Our Extra Long Cheeseburger features two beef patties topped with freshly cut onions, crisp iceburg lettuce, ketchup, melted American cheese, and a creamy mayonnaise spread all served on a warm toasted hoagie bun.");
//	 			p5.setProductImage("images/ExtralongCheeseburger.png");
//	 			p5.setProductPrice(15.88);
//	 			session.save(p5);
//	 			
//	 			Product p6 = new Product();
//	 			p6.setProductName("BACON Chessburger");
//	 			p6.setCategory(c1);
//	 			p6.setProductDescription("You can’t go wrong with our Bacon Cheeseburger, a signature flame-grilled beef patty topped with smoked bacon and a layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.");
//	 			p6.setProductImage("images/New_BaconCheeseburger_thumb.png");
//	 			p6.setProductPrice(16.88);
//	 			session.save(p6);
//	 	//======================================================		
//	 	
//	 			Product p7 = new Product();
//	 			p7.setProductName("Coke® ICEE®");
//	 			p7.setCategory(c2);
//	 			p7.setProductDescription("Cool down with a Coke® ICEE® any time of the year. Nutrition information reflects Medium Size Cup.");
//	 			p7.setProductImage("images/Frozen_Coke_ICEE.jpg");
//	 			p7.setProductPrice(4.88);
//	 			session.save(p7);
//	 			
//	 			Product p8 = new Product();
//	 			p8.setProductName("Coca-Cola®");
//	 			p8.setCategory(c2);
//	 			p8.setProductDescription("Perfect with any meal, enjoy the genuine taste of Coca-Cola®.");
//	 			p8.setProductImage("images/Coca_Cola.jpg");
//	 			p8.setProductPrice(3.88);
//	 			session.save(p8);
//	 			
//	 			Product p9 = new Product();
//	 			p9.setProductName("Diet Coke®");
//	 			p9.setCategory(c2);
//	 			p9.setProductDescription("Try a crisp and refreshing no-calorie Diet Coke®.");
//	 			p9.setProductImage("images/Diet_Coke.jpg");
//	 			p9.setProductPrice(3.88);
//	 			session.save(p9);
//	 			
//	 			Product p10 = new Product();
//	 			p10.setProductName("Sprite®");
//	 			p10.setCategory(c2);
//	 			p10.setProductDescription("Let Sprite® refresh your day with the great taste of lemon-lime.");
//	 			p10.setProductImage("images/Sprite.jpg");
//	 			p10.setProductPrice(3.88);
//	 			session.save(p10);
//	 			
//	 			Product p11 = new Product();
//	 			p11.setProductName("Strawberry Banana Smoothie");
//	 			p11.setCategory(c2);
//	 			p11.setProductDescription("With fruit, low fat yogurt, and made fresh to order in the kitchen, our Strawberry Banana Smoothie is the perfect snack to keep you going all day.");
//	 			p11.setProductImage("images/Strawberry_Banana_Smoothie.jpg");
//	 			p11.setProductPrice(6.88);
//	 			session.save(p11);
//	 			
//	 			Product p12 = new Product();
//	 			p12.setProductName("Tropical Mango Smoothie");
//	 			p12.setCategory(c2);
//	 			p12.setProductDescription("With fruit, low fat yogurt, and made fresh to order in the kitchen, our Tropical Mango Smoothie is the perfect snack to keep you going all day.");
//	 			p12.setProductImage("images/Tropical_Mango_Smoothie.jpg");
//	 			p12.setProductPrice(6.88);
//	 			session.save(p12);
//	 			
//	 		//============================================
//	 			
//	 			Product p13 = new Product();
//	 			p13.setProductName("Jalapeño Chicken Fries");
//	 			p13.setCategory(c3);
//	 			p13.setProductDescription("Our Jalapeño Chicken Fries are made with marinated chicken breast and tossed in our savory jalapeño breading for an added kick. Shaped like fries, they are perfect to enjoy with any of our delicious dipping sauces. Choose from BBQ, Honey Mustard, Ranch, Zesty, Buffalo, and Sweet & Sour.");
//	 			//p13.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p13.setProductImage("images/JALAPENOCHICKENFRIES.jpg");
//	 			p13.setProductPrice(3.88);
//	 			session.save(p13);
//	 			
//	 			Product p14 = new Product();
//	 			p14.setProductName("Chicken Nuggets");
//	 			p14.setCategory(c3);
//	 			p14.setProductDescription("Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading, they are perfect for dipping in any of our delicious dipping sauces.");
//	 			p14.setProductImage("images/Nugget.jpg");
//	 			p14.setProductPrice(4.88);
//	 			session.save(p14);
//	 			
//	 			Product p15 = new Product();
//	 			p15.setProductName("French Fries");
//	 			p15.setCategory(c3);
//	 			p15.setProductDescription("More delicious than ever, our signature piping hot, thick cut Salted French Fries are golden on the outside and fluffy on the inside.");
//	 			//p15.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p15.setProductImage("images/French_Fries.jpg");
//	 			p15.setProductPrice(5.88);
//	 			session.save(p15);
//	 			
//	 			Product p16 = new Product();
//	 			p16.setProductName("Onion Rings");
//	 			p16.setCategory(c3);
//	 			p16.setProductDescription("Served hot and crispy, our golden Onion Rings are the perfect treat for plunging into one of our bold or classic sauces.");
//	 			//p16.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p16.setProductImage("images/Onion_Rings.jpg");
//	 			p16.setProductPrice(6.88);
//	 			session.save(p16);
//	 			
//	 			Product p17 = new Product();
//	 			p17.setProductName("Hash Browns");
//	 			p17.setCategory(c3);
//	 			p17.setProductDescription("Make your morning sizzle with a small side of our signature crunchy, golden Hash Browns. Nutrition information reflects medium size.");
//	 			//p17.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p17.setProductImage("images/Hashbrowns.jpg");
//	 			p17.setProductPrice(7.88);
//	 			session.save(p17);
//	 			
//	 			Product p18 = new Product();
//	 			p18.setProductName("Garden Side Salad");
//	 			p18.setCategory(c3);
//	 			p18.setProductDescription("Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing. Nutrition Information does not reflect home-style croutons or KEN’S salad dressing.");
//	 			//p18.setProductDescription("Our WHOPPER® Sandwich is a ¼ lb* of savory flame-grilled beef topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a soft sesame seed bun.");
//	 			p18.setProductImage("images/Garden_Side_Salad.jpg");
//	 			p18.setProductPrice(8.88);
//	 			session.save(p18);
	 			
	 			session.getTransaction().commit();
	 			System.out.println("Done");
	}
}
