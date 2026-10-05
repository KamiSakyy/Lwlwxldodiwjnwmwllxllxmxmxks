package com.github.rudroid.utilities;

import android.content.res.Resources;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 {
    public static int a(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static boolean b() {
        return Resources.getSystem().getConfiguration().orientation == 2;
    }
}
