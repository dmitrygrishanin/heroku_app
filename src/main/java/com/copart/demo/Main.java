package com.copart.demo;

import com.copart.demo.response.MainResponse;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.config.RedirectConfig.redirectConfig;

public class Main {
    public static void main(String[] args) throws ParseException {

        String payload = "draw=1&columns%5B0%5D%5Bdata%5D=0&columns%5B0%5D%5Bname%5D=&columns%5B0%5D%5Bsearchable%5D=true&columns%5B0%5D%5Borderable%5D=false&columns%5B0%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B0%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B1%5D%5Bdata%5D=1&columns%5B1%5D%5Bname%5D=&columns%5B1%5D%5Bsearchable%5D=true&columns%5B1%5D%5Borderable%5D=false&columns%5B1%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B1%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B2%5D%5Bdata%5D=2&columns%5B2%5D%5Bname%5D=&columns%5B2%5D%5Bsearchable%5D=true&columns%5B2%5D%5Borderable%5D=true&columns%5B2%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B2%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B3%5D%5Bdata%5D=3&columns%5B3%5D%5Bname%5D=&columns%5B3%5D%5Bsearchable%5D=true&columns%5B3%5D%5Borderable%5D=true&columns%5B3%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B3%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B4%5D%5Bdata%5D=4&columns%5B4%5D%5Bname%5D=&columns%5B4%5D%5Bsearchable%5D=true&columns%5B4%5D%5Borderable%5D=true&columns%5B4%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B4%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B5%5D%5Bdata%5D=5&columns%5B5%5D%5Bname%5D=&columns%5B5%5D%5Bsearchable%5D=true&columns%5B5%5D%5Borderable%5D=true&columns%5B5%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B5%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B6%5D%5Bdata%5D=6&columns%5B6%5D%5Bname%5D=&columns%5B6%5D%5Bsearchable%5D=true&columns%5B6%5D%5Borderable%5D=true&columns%5B6%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B6%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B7%5D%5Bdata%5D=7&columns%5B7%5D%5Bname%5D=&columns%5B7%5D%5Bsearchable%5D=true&columns%5B7%5D%5Borderable%5D=true&columns%5B7%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B7%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B8%5D%5Bdata%5D=8&columns%5B8%5D%5Bname%5D=&columns%5B8%5D%5Bsearchable%5D=true&columns%5B8%5D%5Borderable%5D=true&columns%5B8%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B8%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B9%5D%5Bdata%5D=9&columns%5B9%5D%5Bname%5D=&columns%5B9%5D%5Bsearchable%5D=true&columns%5B9%5D%5Borderable%5D=true&columns%5B9%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B9%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B10%5D%5Bdata%5D=10&columns%5B10%5D%5Bname%5D=&columns%5B10%5D%5Bsearchable%5D=true&columns%5B10%5D%5Borderable%5D=true&columns%5B10%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B10%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B11%5D%5Bdata%5D=11&columns%5B11%5D%5Bname%5D=&columns%5B11%5D%5Bsearchable%5D=true&columns%5B11%5D%5Borderable%5D=true&columns%5B11%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B11%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B12%5D%5Bdata%5D=12&columns%5B12%5D%5Bname%5D=&columns%5B12%5D%5Bsearchable%5D=true&columns%5B12%5D%5Borderable%5D=true&columns%5B12%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B12%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B13%5D%5Bdata%5D=13&columns%5B13%5D%5Bname%5D=&columns%5B13%5D%5Bsearchable%5D=true&columns%5B13%5D%5Borderable%5D=true&columns%5B13%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B13%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B14%5D%5Bdata%5D=14&columns%5B14%5D%5Bname%5D=&columns%5B14%5D%5Bsearchable%5D=true&columns%5B14%5D%5Borderable%5D=false&columns%5B14%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B14%5D%5Bsearch%5D%5Bregex%5D=false&columns%5B15%5D%5Bdata%5D=15&columns%5B15%5D%5Bname%5D=&columns%5B15%5D%5Bsearchable%5D=true&columns%5B15%5D%5Borderable%5D=false&columns%5B15%5D%5Bsearch%5D%5Bvalue%5D=&columns%5B15%5D%5Bsearch%5D%5Bregex%5D=false&start=0&length=100&search%5Bvalue%5D=&search%5Bregex%5D=false&query=bmw&watchListOnly=false&freeFormSearch=true&page=0&size=100";
        Map headers = new HashMap<String,String>();
        headers.put("Host","www.copart.com");
        headers.put("Connection","keep-alive");
        headers.put("Accept","application/json, text/javascript, */*; q=0.01");
        headers.put("Origin","https://www.copart.com");
        headers.put("X-XSRF-TOKEN", "7b5a9cc9-b438-421e-8485-1796e98b2ade");
        headers.put("X-Requested-With", "XMLHttpRequest");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36");
        headers.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Sec-Fetch-Site", "same-origin");
        headers.put("Sec-Fetch-Mode", "cors");
        headers.put("Referer","https://www.copart.com/lotSearchResults/?free=true&query=bmw");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7,uk;q=0.6");
        headers.put("Cookie:", "visid_incap_242093=I7eobLR+R32vNtvkNZSGYNHf210AAAAAQUIPAAAAAAAtlJAwax8yBOxKNGo5RvZo; _ga=GA1.2.687190204.1574690780; s_fid=16C64655B900C15F-154D2A357C8E6DCE; s_vi=[CS]v1|2EEDEFEE8531776D-40000129E000660F[CE]; OAID=e6ef343d16bec2849a6d6e2aae6cd506; __gads=ID=6061b11538b0121b:T=1574690780:S=ALNI_MYaaBBWApgeXq0HXTZEWoh6Rq3Atw; _fbp=fb.1.1574690782630.219215067; g2app.searchResultsPageLength=100; MemberServerPool=G2MB; g2app.username=; g2usersessionid_b=5febcc56b826964a37e6a05da6999835; G2JSESSIONID=D07F6E3369FF594488FA73312D92DDDA-n2; userLang=en; incap_ses_377_242093=BWCeUuiZGhxBH7P7T2A7BZQZB14AAAAAgunPuRSXfnpLVCMAG0uQ3g==; copartTimezonePref=%7B%22displayStr%22%3A%22EET%22%2C%22offset%22%3A2%2C%22dst%22%3Afalse%2C%22windowsTz%22%3A%22Europe%2FHelsinki%22%7D; timezone=Europe%2FHelsinki; _gid=GA1.2.1367159000.1577523607; _gat=1; g2app.locationInfo=%7B%22countryCode%22%3A%22UKR%22%2C%22countryName%22%3A%22Ukraine%22%2C%22stateName%22%3A%22Dnipropetrovska%20oblast%22%2C%22stateCode%22%3A%2204%22%2C%22cityName%22%3A%22Pidhorodne%22%2C%22latitude%22%3A48.57528%2C%22longitude%22%3A35.1068%2C%22zipCode%22%3A%2251233%22%2C%22timeZone%22%3A%22%2B03%3A00%22%7D; s_depth=1; s_pv=public%3Ahomepage; s_vnum=1580115607209%26vn%3D1; s_invisit=true; s_lv_s=More%20than%207%20days; s_cc=true; OAGEO=UA%7C%7C%7C%7C%7C%7C%7C%7C%7C%7C; usersessionid=b8d4872aca78e4e741920941deb62716; s_ppvl=23; s_nr=1577523620992-Repeat; s_lv=1577523620994; s_sq=copart-g2-us-prod%3D%2526c.%2526a.%2526activitymap.%2526page%253Dpublic%25253Ahomepage%2526link%253D%25252Fimages%25252Ficons%25252Ficon_Search_Desktop.svg%2526region%253Dsearch-form%2526pageIDType%253D1%2526.activitymap%2526.a%2526.c%2526pid%253Dpublic%25253Ahomepage%2526pidt%253D1%2526oid%253D%25250A%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%25250A%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%252520%2526oidt%253D3%2526ot%253DSUBMIT; s_ppv=public%253Ahomepage%2C59%2C16%2C921%2C979%2C920%2C1920%2C1080%2C1%2CP");

        MainResponse respone =   given()
                .config(RestAssured.config().redirect(redirectConfig().followRedirects(true)))
                .headers(headers)
                .body(payload)
                .post("https://www.copart.com/public/lots/search")
                .then()
            //    .statusCode(200)
                .extract()
                .response().as(MainResponse.class);
        System.out.println(respone.toString());

    }
}
