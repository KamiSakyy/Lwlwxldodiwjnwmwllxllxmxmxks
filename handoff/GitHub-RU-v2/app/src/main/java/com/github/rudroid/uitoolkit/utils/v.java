package com.github.rudroid.uitoolkit.utils;

import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes3.dex */
final class v implements v0 {
    public final /* synthetic */ g a;

    public v(g gVar) {
        this.a = gVar;
    }

    public final w0 a(x0 x0Var, List list, long j) {
        k71.k.g(x0Var, "$this$Layout");
        k71.k.g(list, "measurables");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u0) it.next()).F(j));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int i = ((l1) it2.next()).r;
        while (it2.hasNext()) {
            int i2 = ((l1) it2.next()).r;
            if (i < i2) {
                i = i2;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = ((l1) it3.next()).s;
        while (it3.hasNext()) {
            int i4 = ((l1) it3.next()).s;
            if (i3 < i4) {
                i3 = i4;
            }
        }
        this.a.a = (Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(i3) & 4294967295L);
        return x0Var.h0(i, i3, x61.s.r, new bm.f(8, arrayList));
    }
}
