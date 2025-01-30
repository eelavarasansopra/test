package com.myspace.rest;

public class RestTemplate {
	
	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("uk3.proxy.tesco.org", 80));
//		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//		requestFactory.setProxy(proxy);
//		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		return restTemplate;
//	}
//	@Bean
//	@Profile("!test")
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		
//		System.out.println("connecting to url");
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.set("Authorization", "Bearer "+"eyJraWQiOiIwNWU0ZjJkOS05MDY4LTQ5MGYtYTBmYy1jMTg4Y2NlODY5ZDciLCJhbGciOiJSUzI1NiJ9.eyJqdGkiOiJCV05Xb3dhcWx3YzBMWVA1TWxLb09UdUltM3BRU25JMlhPTDAiLCJpc3MiOiJodHRwczovL2FwaS1wcGUudGVzY28uY29tL2lkZW50aXR5L3Y0L2lzc3VlLXRva2VuIiwic3ViIjoiMmNjYmJmMzctNzViOC00YzUyLWI5OGYtN2JjNGQ1YWUzNTFiIiwiaWF0IjoxNzA2NTk5MTk2LCJuYmYiOjE3MDY1OTkxOTYsImV4cCI6MTcwNjYwMjc5Niwic2NvcGUiOiJpbnRlcm5hbCBwdWJsaWMiLCJjb25maWRlbmNlX2xldmVsIjoxMiwiY2xpZW50X2lkIjoiMTFiMTBhMDUtMmQ0YS00Y2ZkLWFkOTUtYTFkZDA2OTg1YTg2IiwidG9rZW5fdHlwZSI6ImJlYXJlciIsInNpZCI6IjAxSE5DS1RBMUY2VkFaV1o0MkI2WTNHNEI1LTBhNjZhOGNiLTBmMTAtNDhlMS05NmUyLWNkYTMxMmE1NzUzNS1hUjQ2bUd0STBSelM4eUk3UEdjWl8xZmExdGg3eGdRZGlPS1cifQ.fORk9E9WEUBxqicX339etra4rR5W431V1zQRfCCXZlA0FRUgjtQEJsQutk3t-QgfImCoFaUaz8sxsNKQHfhf05jQ8CGaNbnF5kTguPC04wthZHBvlacAcjwDUwpQV--OoaJrQKhPO1Jp1UDB20et2j2Vrm92QuQn0AXUpzgPKbo6gAZLhRotQjiVGYR458N0otMuGb-MVo7gqN0CPI58SHxoMgsta64jhaix8d2OskjugmQMh6KhKCJpR3C4PhSUxboTHVeewOTtullQ3A8ZPMEXriaE63-l2W9eZG8hmVNKX3JzNu-3K-RnG32G34tHvpPlUMcf2TR5YMQ24buGoQ");
//
//		HttpEntity<String> entity = new HttpEntity<String>(null,headers);
//		try {
//			ResponseEntity<String> response = restTemplate.exchange(
//					"https://api-ppe.tesco.com/colleague/v2/colleagues/me",HttpMethod.GET,entity, String.class);
//			System.out.println("response-->"+response);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("completed connecting to url");
//
//		return args -> {
//		
//		
//		};
//	}

}
