package com.github.rudroid.utilities.ui;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class u implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ ComposeDatePickerDialogFragment s;

    public /* synthetic */ u(ComposeDatePickerDialogFragment composeDatePickerDialogFragment, int i) {
        this.r = i;
        this.s = composeDatePickerDialogFragment;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-662427333, new u(this.s, 1), sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    w1.r w = f0.o.w(w1.o.a, f0.o.v(sVar2), true);
                    final ComposeDatePickerDialogFragment composeDatePickerDialogFragment = this.s;
                    String str = composeDatePickerDialogFragment.M0;
                    LocalDate localDate = composeDatePickerDialogFragment.L0;
                    if (localDate == null) {
                        localDate = LocalDate.now();
                    }
                    k71.k.d(localDate);
                    long millis = TimeUnit.DAYS.toMillis(localDate.toEpochDay());
                    boolean h = sVar2.h(composeDatePickerDialogFragment);
                    Object N = sVar2.N();
                    Object obj3 = androidx.compose.runtime.n.a;
                    if (h || N == obj3) {
                        N = new com.github.rudroid.support.u(5, composeDatePickerDialogFragment);
                        sVar2.n0(N);
                    }
                    j71.c cVar = (j71.c) N;
                    boolean h2 = sVar2.h(composeDatePickerDialogFragment);
                    Object N2 = sVar2.N();
                    if (h2 || N2 == obj3) {
                        final int i = 0;
                        N2 = new j71.a() { // from class: com.github.rudroid.utilities.ui.v
                            public final Object a() {
                                switch (i) {
                                    case 0:
                                        ComposeDatePickerDialogFragment composeDatePickerDialogFragment2 = composeDatePickerDialogFragment;
                                        j71.a aVar = composeDatePickerDialogFragment2.K0;
                                        if (aVar != null) {
                                            aVar.a();
                                        }
                                        composeDatePickerDialogFragment2.t4(false, false);
                                        break;
                                    default:
                                        composeDatePickerDialogFragment.t4(false, false);
                                        break;
                                }
                                return w61.a0.a;
                            }
                        };
                        sVar2.n0(N2);
                    }
                    j71.a aVar = (j71.a) N2;
                    boolean h3 = sVar2.h(composeDatePickerDialogFragment);
                    Object N3 = sVar2.N();
                    if (h3 || N3 == obj3) {
                        final int i2 = 1;
                        N3 = new j71.a() { // from class: com.github.rudroid.utilities.ui.v
                            public final Object a() {
                                switch (i2) {
                                    case 0:
                                        ComposeDatePickerDialogFragment composeDatePickerDialogFragment2 = composeDatePickerDialogFragment;
                                        j71.a aVar2 = composeDatePickerDialogFragment2.K0;
                                        if (aVar2 != null) {
                                            aVar2.a();
                                        }
                                        composeDatePickerDialogFragment2.t4(false, false);
                                        break;
                                    default:
                                        composeDatePickerDialogFragment.t4(false, false);
                                        break;
                                }
                                return w61.a0.a;
                            }
                        };
                        sVar2.n0(N3);
                    }
                    dh.e.a(w, str, millis, cVar, aVar, (j71.a) N3, null, sVar2, 0, 64);
                } else {
                    sVar2.V();
                }
                break;
        }
        return w61.a0.a;
    }
}
