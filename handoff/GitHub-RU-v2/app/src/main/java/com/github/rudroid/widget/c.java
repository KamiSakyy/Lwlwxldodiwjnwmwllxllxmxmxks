package com.github.rudroid.widget;

import android.os.Build;
import b6.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final z5.n a(z5.n nVar) {
        k71.k.g(nVar, "<this>");
        return Build.VERSION.SDK_INT >= 31 ? nVar.d(new w(new n6.e())) : nVar.d(new w(new n6.b(16)));
    }
}
