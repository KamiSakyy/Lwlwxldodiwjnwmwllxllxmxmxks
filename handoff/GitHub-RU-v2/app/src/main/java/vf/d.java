package vf;

import android.util.DisplayMetrics;
import k71.k;
import l7.e0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends e0 {
    public static final a Companion = new a();

    public static final class a {
    }

    @Override // l7.e0
    public final float d(DisplayMetrics displayMetrics) {
        k.g(displayMetrics, "displayMetrics");
        return 8.0f / displayMetrics.densityDpi;
    }

    @Override // l7.e0
    public final int g() {
        return -1;
    }
}
