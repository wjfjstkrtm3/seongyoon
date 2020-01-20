package DI_06_Spring;

public class ArticleService {
		private ArticleDao articledao;
		
		public ArticleService(ArticleDao articledao) {
			this.articledao = articledao;
			System.out.println("ArticleService 생성자 함수 호출");
		}
		
		public void write(Article article) {
			this.articledao.insert(article);
		}
		
}
