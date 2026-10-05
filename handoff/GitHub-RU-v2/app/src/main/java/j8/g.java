package j8;

import android.view.View;
import android.view.ViewGroup;
import l7.x0;
import l7.y0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements y0 {
    @Override // l7.y0
    public final void b(View view) {
    }

    @Override // l7.y0
    public final void d(View view) {
        x0 x0Var = (x0) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) x0Var).width != -1 || ((ViewGroup.MarginLayoutParams) x0Var).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
