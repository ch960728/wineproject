package com.vo;

public class WineVo {
	private int wine_id;
	private String w_name;
	private String w_namee;
	private String productk;
	private String producte;
	private String locationk;
	private String locatione;
	private String kind;
	private String kinds;
	private String use;
	private String alcohol;
	private String temper;
	private String grade;
	private String sugar;
	private String acidity;
	private String body;
	private String tannin;
	private String price;
	private String remark;
	private String year;
	private String liter;
	private String fruit;
	private String flower;
	private String vegetable;
	private String spice;
	private String mineral;
	private String chemistry;
	private String animal;
	private String burnt;
	private String balsamic;
	private String scent;
	private String menu;
	private String img;
	
	
	public WineVo(int wine_id, String w_name, String w_namee, String productk, String producte, String locationk,
			String locatione, String kind, String kinds, String use, String alcohol, String temper, String grade,
			String sugar, String acidity, String body, String tannin, String price, String remark, String year,
			String liter, String fruit, String flower, String vegetable, String spice, String mineral, String chemistry,
			String animal, String burnt, String balsamic, String scent, String menu, String img) {
		super();
		this.wine_id = wine_id;
		this.w_name = w_name;
		this.w_namee = w_namee;
		this.productk = productk;
		this.producte = producte;
		this.locationk = locationk;
		this.locatione = locatione;
		this.kind = kind;
		this.kinds = kinds;
		this.use = use;
		this.alcohol = alcohol;
		this.temper = temper;
		this.grade = grade;
		this.sugar = sugar;
		this.acidity = acidity;
		this.body = body;
		this.tannin = tannin;
		this.price = price;
		this.remark = remark;
		this.year = year;
		this.liter = liter;
		this.fruit = fruit;
		this.flower = flower;
		this.vegetable = vegetable;
		this.spice = spice;
		this.mineral = mineral;
		this.chemistry = chemistry;
		this.animal = animal;
		this.burnt = burnt;
		this.balsamic = balsamic;
		this.scent = scent;
		this.menu = menu;
		this.img = img;
	}
	
	public WineVo(String w_name, String w_namee, String producte, String locationk,
			String kind, String kinds, String use, String alcohol, String temper, String grade,
			String sugar, String acidity, String body, String tannin, String price, String remark, String year,
			String liter, String fruit, String flower, String vegetable, String spice, String mineral, String chemistry,
			String animal, String burnt, String balsamic, String scent, String menu, String img) {
		super();
		this.w_name = w_name;
		this.w_namee = w_namee;
		this.producte = producte;
		this.locationk = locationk;
		this.kind = kind;
		this.kinds = kinds;
		this.use = use;
		this.alcohol = alcohol;
		this.temper = temper;
		this.grade = grade;
		this.sugar = sugar;
		this.acidity = acidity;
		this.body = body;
		this.tannin = tannin;
		this.price = price;
		this.remark = remark;
		this.year = year;
		this.liter = liter;
		this.fruit = fruit;
		this.flower = flower;
		this.vegetable = vegetable;
		this.spice = spice;
		this.mineral = mineral;
		this.chemistry = chemistry;
		this.animal = animal;
		this.burnt = burnt;
		this.balsamic = balsamic;
		this.scent = scent;
		this.menu = menu;
		this.img = img;
	}
	
	
	
	public WineVo(int wine_id,String w_name, String kinds, String price,String img) {
		super();
		this.wine_id = wine_id;
		this.w_name = w_name;
		this.kinds = kinds;
		this.price = price;
		this.img = img;
	}


	public WineVo(int wine_id) {
		super();
		this.wine_id = wine_id;
	}

	public WineVo(int wine_id,String w_name,String img) {
		super();
		this.wine_id = wine_id;
		this.w_name = w_name;
		this.img = img;
	}
	public int getWine_id() {
		return wine_id;
	}
	public void setWine_id(int wine_id) {
		this.wine_id = wine_id;
	}
	public String getW_name() {
		return w_name;
	}
	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
	public String getW_namee() {
		return w_namee;
	}
	public void setW_namee(String w_namee) {
		this.w_namee = w_namee;
	}
	public String getProductk() {
		return productk;
	}
	public void setProductk(String productk) {
		this.productk = productk;
	}
	public String getProducte() {
		return producte;
	}
	public void setProducte(String producte) {
		this.producte = producte;
	}
	public String getLocationk() {
		return locationk;
	}
	public void setLocationk(String locationk) {
		this.locationk = locationk;
	}
	public String getLocatione() {
		return locatione;
	}
	public void setLocatione(String locatione) {
		this.locatione = locatione;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getTemper() {
		return temper;
	}
	public void setTemper(String temper) {
		this.temper = temper;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String getAcidity() {
		return acidity;
	}
	public void setAcidity(String acidity) {
		this.acidity = acidity;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getTannin() {
		return tannin;
	}
	public void setTannin(String tannin) {
		this.tannin = tannin;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getLiter() {
		return liter;
	}
	public void setLiter(String liter) {
		this.liter = liter;
	}
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getFlower() {
		return flower;
	}
	public void setFlower(String flower) {
		this.flower = flower;
	}
	public String getVegetable() {
		return vegetable;
	}
	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
	public String getSpice() {
		return spice;
	}
	public void setSpice(String spice) {
		this.spice = spice;
	}
	public String getMineral() {
		return mineral;
	}
	public void setMineral(String mineral) {
		this.mineral = mineral;
	}
	public String getChemistry() {
		return chemistry;
	}
	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getBurnt() {
		return burnt;
	}
	public void setBurnt(String burnt) {
		this.burnt = burnt;
	}
	public String getBalsamic() {
		return balsamic;
	}
	public void setBalsamic(String balsamic) {
		this.balsamic = balsamic;
	}
	public String getScent() {
		return scent;
	}
	public void setScent(String scent) {
		this.scent = scent;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	
}
