package com.github.rudroid.utilities;

import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 extends l7.o1 {
    public final void d(View view, b5.f fVar) {
        k71.k.g(view, "host");
        super.d(view, fVar);
        Object tag = view.getTag(2131363393);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            fVar.l(b5.e.b(num.intValue(), 1, 0, 1, fVar.h(), fVar.a.isSelected()));
        }
    }
}
