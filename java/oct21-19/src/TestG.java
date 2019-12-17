public class TestG {
	public static void main(String[] args) {
		FirstGen fg = new FirstGen();
		fg.msg();
		fg.call();

		System.out.println("******************************");

		NextGen ng = new NextGen();
		ng.msg();
		ng.call();
		ng.games();

		System.out.println("******************************");

		ThirdGen tg = new ThirdGen();
		tg.msg();
		tg.call();
		tg.games();
		tg.camera();

	}

}
