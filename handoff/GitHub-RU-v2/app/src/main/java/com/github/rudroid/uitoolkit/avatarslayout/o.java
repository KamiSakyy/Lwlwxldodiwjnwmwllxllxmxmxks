package com.github.rudroid.uitoolkit.avatarslayout;

import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.u;

/* loaded from: /home/user/work/p/classes3.dex */
final class o implements v0 {
    public final /* synthetic */ float a;

    public o(float f) {
        this.a = f;
    }

    public final w0 a(x0 x0Var, List list, long j) {
        k71.k.g(x0Var, "$this$Layout");
        k71.k.g(list, "measurables");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u0) it.next()).F(j));
        }
        u uVar = new u();
        l1 l1Var = (l1) x61.m.W(arrayList);
        int i = l1Var != null ? l1Var.s : 0;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            i2 += ((l1) obj).r;
        }
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            size2 = 0;
        }
        float f = this.a;
        int i0 = i2 - (x0Var.i0(f) * size2);
        return x0Var.h0(i0 >= 0 ? i0 : 0, i, x61.s.r, new e(arrayList, uVar, f, 1));
    }
    public static Object m(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public Object g(Object p1, int p2, long p3, Object p4) { return null; }
}
