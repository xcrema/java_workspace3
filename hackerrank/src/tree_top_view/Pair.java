package tree_top_view;

public class Pair<T1, T2> {
	public final T1 first;
	public final T2 second;
	
	private Pair(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}
	
	public static <T1, T2> Pair<T1, T2> of(T1 a, T2 b){
		return new Pair<>(a, b);
	}
}
