package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.runtime.f1;
import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import com.github.rudroid.starredreposandlists.u0;
import java.util.ArrayList;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
final class r implements v0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f1 d;

    public r(int i, int i2, int i3, f1 f1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f1Var;
    }

    public final w0 a(x0 x0Var, List list, long j) {
        final int i;
        k71.k.g(x0Var, "$this$Layout");
        k71.k.g(list, "measurables");
        boolean isEmpty = list.isEmpty();
        x61.s sVar = x61.s.r;
        int i2 = 0;
        if (isEmpty || (i = this.a) == 0) {
            return x0Var.h0(0, 0, sVar, new u0(14));
        }
        int i3 = this.b;
        int i4 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (i3 * 0.75f);
        int[] iArr = new int[i];
        int i5 = 0;
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                d0.x();
                throw null;
            }
            int i7 = i5 % i;
            iArr[i7] = Math.max(iArr[i7], Math.min(((androidx.compose.ui.layout.u0) obj).B(Integer.MAX_VALUE), i4));
            i5 = i6;
        }
        if (i3 != Integer.MAX_VALUE) {
            int i8 = 0;
            for (int i9 = 0; i9 < i; i9++) {
                i8 += iArr[i9];
            }
            int i11 = i3 - i8;
            loop2: while (i11 > 0) {
                q71.g N = x61.l.N(iArr);
                ArrayList arrayList = new ArrayList();
                x61.v it = N.iterator();
                while (((q71.f) it).t) {
                    Object next = it.next();
                    if (iArr[((Number) next).intValue()] < i4) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.isEmpty()) {
                    break;
                }
                int max = Math.max(1, i11 / arrayList.size());
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    int intValue = ((Number) obj2).intValue();
                    if (i11 == 0) {
                        break loop2;
                    }
                    int min = Math.min(max, Math.min(i4 - iArr[intValue], i11));
                    iArr[intValue] = iArr[intValue] + min;
                    i11 -= min;
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
        int i13 = 0;
        for (Object obj3 : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                d0.x();
                throw null;
            }
            int i15 = iArr[i13 % i];
            arrayList2.add(((androidx.compose.ui.layout.u0) obj3).F(s3.b.b(i15, i15, 0, 12)));
            i13 = i14;
        }
        final int i16 = this.c;
        int[] iArr2 = new int[i16];
        int size2 = arrayList2.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj4 = arrayList2.get(i17);
            i17++;
            int i18 = i2 + 1;
            if (i2 < 0) {
                d0.x();
                throw null;
            }
            int i19 = i2 / i;
            iArr2[i19] = Math.max(iArr2[i19], ((l1) obj4).s);
            i2 = i18;
        }
        final t tVar = new t(x61.l.e0(iArr), x61.l.e0(iArr2));
        this.d.setValue(tVar);
        return x0Var.h0(tVar.c, tVar.d, sVar, new j71.c() { // from class: com.github.rudroid.uitoolkit.markdown.components.q
            public final Object k(Object obj5) {
                t tVar2;
                k1 k1Var = (k1) obj5;
                k71.k.g(k1Var, "$this$layout");
                int i21 = 0;
                for (int i22 = 0; i22 < i16; i22++) {
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        tVar2 = tVar;
                        int i25 = i;
                        if (i23 < i25) {
                            l1 l1Var = (l1) x61.m.X((i25 * i22) + i23, arrayList2);
                            if (l1Var != null) {
                                k1Var.i(l1Var, i24, i21, 0.0f);
                            }
                            i24 += ((Number) tVar2.a.get(i23)).intValue();
                            i23++;
                        }
                    }
                    i21 += ((Number) tVar2.b.get(i22)).intValue();
                }
                return w61.a0.a;
            }
        });
    }
}
