package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import androidx.lifecycle.d1;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import f0.z1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ b(FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet, int i) {
        this.r = i;
        this.s = focusedFilterExplainerBottomSheet;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                final FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet = (FocusedFilterExplainerBottomSheet) this.s;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    boolean h = sVar.h(focusedFilterExplainerBottomSheet);
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                    if (h || N == iVar) {
                        final int i = 0;
                        N = new j71.a() { // from class: com.github.rudroid.searchandfilter.complexfilter.notificationfilter.c
                            public final Object a() {
                                switch (i) {
                                    case 0:
                                        FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet2 = focusedFilterExplainerBottomSheet;
                                        v71.b0.z(d1.i(focusedFilterExplainerBottomSheet2), (a71.h) null, (v71.a0) null, new f(focusedFilterExplainerBottomSheet2, null), 3);
                                        break;
                                    default:
                                        FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet3 = focusedFilterExplainerBottomSheet;
                                        ((com.github.rudroid.searchandfilter.h0) focusedFilterExplainerBottomSheet3.T0.getValue()).Y(new NotificationImportantFilter(2, true, false), null);
                                        v71.b0.z(d1.i(focusedFilterExplainerBottomSheet3), (a71.h) null, (v71.a0) null, new g(focusedFilterExplainerBottomSheet3, null), 3);
                                        break;
                                }
                                return w61.a0.a;
                            }
                        };
                        sVar.n0(N);
                    }
                    i21.a.a(0, 1, sVar, (j71.a) N, false);
                    z1 v = f0.o.v(sVar);
                    w1.r a = p2.f.a(w1.o.a, w2.f0.A(sVar), (p2.d) null);
                    boolean h2 = sVar.h(focusedFilterExplainerBottomSheet);
                    Object N2 = sVar.N();
                    if (h2 || N2 == iVar) {
                        d dVar = new d(0, focusedFilterExplainerBottomSheet, FocusedFilterExplainerBottomSheet.class, "sendDismissedAnalyticAndDismiss", "sendDismissedAnalyticAndDismiss()V", 0, 0);
                        sVar.n0(dVar);
                        N2 = dVar;
                    }
                    long j = ih.d.b(sVar).c;
                    rg.g.a(a, com.github.rudroid.uitoolkit.utils.b0.a(v, sVar, 1), (k71.i) N2, ih.d.b(sVar).d, j, 0L, null, null, a.a, r1.i.d(2099955549, new b7.h(28, focusedFilterExplainerBottomSheet, v), sVar), sVar, 905969664, 224);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                FocusedFilterExplainerBottomSheet focusedFilterExplainerBottomSheet2 = (FocusedFilterExplainerBottomSheet) this.s;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1602516384, new b(focusedFilterExplainerBottomSheet2, 0), sVar2), sVar2, 805306368, 511);
                } else {
                    sVar2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                h.c((w1.r) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ b(w1.r rVar, int i) {
        this.r = 2;
        this.s = rVar;
    }
    public static Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4) { return null; }
}
