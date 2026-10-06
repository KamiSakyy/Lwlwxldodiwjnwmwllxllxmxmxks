package p31;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public d.a f;

    public a(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = k41.b.J(2130969538, 300, context);
        this.d = k41.b.J(2130969543, 150, context);
        this.e = k41.b.J(2130969542, 100, context);
    }

    public a(Object... a) {
    }
}
