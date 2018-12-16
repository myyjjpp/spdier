package edu.csuft.xjz.spider;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App {
  
	 private static film f;

	//alt+/
	public static void main(String[] args) {
		//目标URL
		String url="https://movie.douban.com/top250";
				//使用JSOUP抓取文件
			
		try {
			Document doc=Jsoup.connect(url).get();
			
			Elements es=doc.select(".grid_view .item");
			System.out.print(es.size());
			
			//创建一个影片的列表
			ArrayList<film>list=new ArrayList<>();
			
			for(Element e :es) {
				//每一部影片
				Element t=e.select(".title").first();
				//每一部影片的名字
				String num=e.select(".star span").last().text();
				System.out.println(t.text()+","+num);
			
			
				//f.id
				//f.title
				list.add(f);
			}
//					String title=doc.title();
//					String data=doc.data();
				
//			        System.out.print(title);
//				    System.out.print(data);
		}
		

		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}