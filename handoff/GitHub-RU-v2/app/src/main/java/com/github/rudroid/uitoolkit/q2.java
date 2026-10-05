package com.github.rudroid.uitoolkit;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q2 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    public /* synthetic */ q2(int i, List list) {
        this.r = i;
        this.s = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        w61.k kVar;
        w61.k kVar2;
        Object obj4;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        List list = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r2.a(list, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 1:
                ((Integer) obj2).getClass();
                com.github.rudroid.widget.contribution.k.b(list, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                return a0Var;
            case 2:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(1 & intValue, (intValue & 3) != 2)) {
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.l.a;
                    float f = ih.a.k;
                    androidx.compose.foundation.layout.b.c((w1.r) null, androidx.compose.foundation.layout.l.g(f), androidx.compose.foundation.layout.l.g(f), (w1.i) null, 0, 0, r1.i.d(-577810123, new com.github.rudroid.feed.ui.k0(2, list), sVar), sVar, 1572864, 57);
                } else {
                    sVar.V();
                }
                return a0Var;
            case 3:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.l.a;
                    float f2 = ih.a.k;
                    androidx.compose.foundation.layout.b.c((w1.r) null, androidx.compose.foundation.layout.l.g(f2), androidx.compose.foundation.layout.l.g(f2), (w1.i) null, 0, 0, r1.i.d(689207003, new com.github.rudroid.feed.ui.k0(3, list), sVar2), sVar2, 1572864, 57);
                } else {
                    sVar2.V();
                }
                return a0Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int intValue3 = ((Integer) obj2).intValue();
                k71.k.g(charSequence, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    String str = (String) x61.m.s0(list);
                    int R = t71.p.R(charSequence, str, intValue3, false, 4);
                    if (R >= 0) {
                        kVar2 = new w61.k(Integer.valueOf(R), str);
                        if (kVar2 != null) {
                            return new w61.k(kVar2.r, Integer.valueOf(((String) kVar2.s).length()));
                        }
                        return null;
                    }
                    kVar2 = null;
                    if (kVar2 != null) {
                    }
                } else {
                    int i2 = intValue3 >= 0 ? intValue3 : 0;
                    q71.g gVar = new q71.g(i2, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i3 = ((q71.e) gVar).t;
                    int i4 = ((q71.e) gVar).s;
                    if (z) {
                        if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                            int i5 = i2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (t71.w.A(0, i5, str2.length(), str2, (String) charSequence, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    kVar = new w61.k(Integer.valueOf(i5), str3);
                                } else if (i5 != i4) {
                                    i5 += i3;
                                }
                            }
                        }
                        kVar2 = null;
                    } else {
                        if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                            int i6 = i2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (t71.p.Z(str4, 0, charSequence, i6, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    kVar = new w61.k(Integer.valueOf(i6), str5);
                                } else if (i6 != i4) {
                                    i6 += i3;
                                }
                            }
                            kVar2 = kVar;
                        }
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                    }
                }
        }
    }

    public /* synthetic */ q2(List list, int i, int i2) {
        this.r = i2;
        this.s = list;
    }
}
