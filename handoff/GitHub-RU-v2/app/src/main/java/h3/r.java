package h3;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f25486a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final long f25487b = a(0, 0);

    public static final long a(int i, int i10) {
        return (i10 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
