package com.github.rudroid.uitoolkit.avatarslayout;

import android.graphics.Path;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0Shadow;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
class s implements v0 {
    public final /* synthetic */ float a;

    public s(float f) {
        this.a = f;
    }

    public final w0 a(x0 x0Var, List list, long j) {
        k71.k.g(x0Var, "$this$Layout");
        k71.k.g(list, "measurables");
        final ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u0) it.next()).F(j));
        }
        l1 l1Var = (l1) x61.m.W(arrayList);
        final int i = l1Var != null ? l1Var.s : 0;
        int size = arrayList.size();
        final int max = Math.max(size != 0 ? size != 1 ? ((((l1) arrayList.get(1)).r * 2) + ((l1) arrayList.get(0)).r) - (x0Var.i0(this.a) * 2) : ((l1) x61.m.U(arrayList)).r : 0, 0);
        final int i2 = 0;
        return x0Var.h0(max, i, x61.s.r, new j71.c() { // from class: com.github.rudroid.uitoolkit.avatarslayout.r
            public final Object k(Object obj) {
                switch (i2) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) arrayList;
                        k1 k1Var = (k1) obj;
                        k71.k.g(k1Var, "$this$layout");
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                d0Shadow.x();
                                throw null;
                            }
                            l1 l1Var2 = (l1) obj2;
                            int i6 = max;
                            if (i3 != 0) {
                                int i7 = i;
                                if (i3 == 1) {
                                    k1Var.o(l1Var2, i6 - l1Var2.r, (i7 - l1Var2.g0()) / 2, 1.0f);
                                } else if (i3 == 2) {
                                    k1Var.o(l1Var2, 0, (i7 - l1Var2.g0()) / 2, 1.0f);
                                }
                            } else {
                                k1Var.o(l1Var2, (i6 / 2) - (l1Var2.r / 2), 0, 2.0f);
                            }
                            i3 = i5;
                        }
                        return a0.a;
                    default:
                        d2.i iVar = (d2.i) arrayList;
                        g3.r rVar = (g3.r) obj;
                        g3.a aVar = rVar.a;
                        int d = rVar.d(max);
                        int d2 = rVar.d(i);
                        CharSequence charSequence = aVar.e;
                        if (d < 0 || d > d2 || d2 > charSequence.length()) {
                            StringBuilder m = x.i.m(d, d2, "start(", ") or end(", ") is out of range [0..");
                            m.append(charSequence.length());
                            m.append("], or start > end!");
                            m3.a.a(m.toString());
                        }
                        Path path = new Path();
                        h3.q qVar = aVar.d;
                        qVar.f.getSelectionPath(d, d2, path);
                        int i8 = qVar.h;
                        if (i8 != 0 && !path.isEmpty()) {
                            path.offset(0.0f, i8);
                        }
                        d2.i iVar2 = new d2.i(path);
                        float f = rVar.f;
                        iVar2.j((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                        d2.i.a(iVar, iVar2);
                        return a0.a;
                }
            }
        });
    }
    public Object A() { return null; }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object X() { return null; }
    public Object c(Object p1) { return null; }
    public Object c0(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object l() { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object r() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object c(float p1) { return null; }
    public Object c0(int p1) { return null; }
    public Object d(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object g(boolean p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
