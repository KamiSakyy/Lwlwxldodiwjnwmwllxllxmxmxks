package q;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public class y0 extends a1 {
    @Override // q.a1
    public void a(StaticLayout.Builder builder, TextView textView) {
        Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            obj = b1.d("getTextDirectionHeuristic").invoke(textView, null);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) obj);
    }
}
