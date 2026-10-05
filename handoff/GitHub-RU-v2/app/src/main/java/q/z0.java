package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public final class z0 extends y0 {
    @Override // q.y0, q.a1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // q.a1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
