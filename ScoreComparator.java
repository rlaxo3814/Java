package mc.sn.gisa;

import java.util.Comparator;

public class ScoreComparator implements Comparator<ScoreData> {

	@Override
	public int compare(ScoreData o1, ScoreData o2) {
		// TODO Auto-generated method stub
		int result = 0;
		result = o2.calcuNo2() - o1.calcuNo2();
		return result;
	}

}
