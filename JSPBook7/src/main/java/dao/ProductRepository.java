package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<>();
	
	public ProductRepository() {
		Product house = new Product("P1234", "26층 나무 집", 10800);
		house.setAuthor("앤디 그리피스");
		house.setDescription("『26층 나무 집』은 각종 상을 휩쓸며 독자들의 사랑을 받은《13층 나무 집》의 후속작으로,"
				+ " 글을 쓰는 앤디와 그림을 그리는 테리가 13층 나무 집을 ‘26층 나무 집’으로 올려 짓고 더 흥미진진한 이야기로 돌아왔다."
				+ " 범퍼카 경기장, 스케이트보드 연습장, 진흙탕 경기장, 반중력 방, 자동 판박이 기계, 78가지 맛 아이스크림 가게,"
				+ " 죽음의 미로 등 재미난 놀 거리와 맛나는 먹을거리가 새로 생겼고, 이번에도 앤디와 테리는 큰코 씨의 원고 독촉을 받는다."
				+ " 앤디가 테리와의 첫 만남을 쓰기로 마음먹자마자 테리의 더러운 팬티를 먹은 상어들이 아프면서 한바탕 난리가 나고,"
				+ " 그 와중에 이야기는 정신없이 흘러가는데…….");
		house.setPublisher("시공주니어");
		house.setCategory("초등");
		house.setUnitPrice(10800);
		house.setTotalpages(352);
		house.setReleaseDate("2015.07.20");
		house.setCondition("New");
		
		Product cris = new Product("P1235", "다섯 밤만 더 자면 크리스마스", 13500);
		cris.setAuthor("지미 팰런");
		cris.setDescription("미국 NBC‘더 투나잇 쇼’진행자 지미 팰런의 그림책\r\n"
				+ "크리스마스까지\r\n"
				+ "다섯 밤, 네 밤, 세 밤, 두 밤 그리고 하룻밤…….\r\n"
				+ "크리스마스를 기다리는 아이의 콩닥콩닥 설레임을 느껴보세요!");
		cris.setPublisher("우리동네책공장");
		cris.setCategory("유아");
		cris.setUnitPrice(13500);
		cris.setTotalpages(48);
		cris.setReleaseDate("2022.12.20");
		cris.setCondition("Refurbished");
		
		Product java = new Product("P1236", "Do it! 자바 완전 정복", 18000);
		java.setAuthor("김동형");
		java.setDescription("진짜 개발자가 되려는 사람들을 위한 자바 프로그래밍 입문서가 나왔다! "
				+ "이 책은 ‘이제 막 프로그래밍에 입문한 사람’에게 꼭 필요한 기본기부터 ‘찐개발자’라면 "
				+ "꼭 알아야 할 내용까지 국내 집필서 중 가장 많은 도해와 그림을 이용해 설명한다. "
				+ "특히 프로그래밍 초심자들이 어려워하는 프로그램의 동작을 컴퓨터의 두뇌를 사진 찍듯 그림과 함께 설명한 구성이 눈에 띈다."
				+ " 단기 코딩 학원에서는 다루지 않는 원리와 배경지식까지 배우며 정통 프로그래머로 거듭나는 뿌듯함을 느껴 보자. "
				+ "여기에 400여 개의 프로그래밍 문제가 들어 있어 시험과 취업 면접도 대비할 수 있다. 컴퓨터공학과 1학년생부터 실무에서 자바를 쓰는 현직 개발자까지, "
				+ "자바로 코딩하는 사람이라면 반드시 갖춰야 할 기본기를 이 책과 함께 ‘완전 정복’ 해보자.");
		java.setPublisher("이지스퍼블리싱");
		java.setCategory("중등");
		java.setUnitPrice(18000);
		java.setTotalpages(856);
		java.setReleaseDate("2021.09.15");
		java.setCondition("E-Book");
		
		listOfProducts.add(house);
		listOfProducts.add(cris);
		listOfProducts.add(java);
	}
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	public Product getProductById (String bookID) {
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getBookID() != null && product.getBookID().equals(bookID)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	
}
