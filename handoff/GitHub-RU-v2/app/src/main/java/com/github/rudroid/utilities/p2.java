package com.github.rudroid.utilities;

import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p2 {

    public static final class a {
    }

    public static final class b {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return Integer.hashCode(0) + a0.s0.b(0, Integer.hashCode(0) * 31, 31);
        }

        public final String toString() {
            return "GraphicAssets(icon=0, foreground=0, background=0)";
        }
    }

    static {
        new Paint(1);
        new DecelerateInterpolator();
    }
}
