package com.github.rudroid.utilities.ui;

import android.view.View;
import androidx.compose.runtime.b2;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public static final void a(final Integer num, androidx.compose.runtime.s sVar, final int i) {
        b2 b2Var;
        j71.e eVar;
        sVar.e0(-1177864848);
        int i2 = (sVar.f(num) ? 4 : 2) | i;
        if (!sVar.S(i2 & 1, (i2 & 3) != 2)) {
            sVar.V();
        } else {
            if (num == null) {
                b2Var = sVar.t();
                if (b2Var != null) {
                    final int i3 = 0;
                    eVar = new j71.e(i, i3, num) { // from class: com.github.rudroid.utilities.ui.c1
                        public final /* synthetic */ int r;
                        public final /* synthetic */ Integer s;

                        {
                            this.r = i3;
                            this.s = num;
                        }

                        public final Object s(Object obj, Object obj2) {
                            int i4 = this.r;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    e1.a(this.s, sVar2, androidx.compose.runtime.t.L(1));
                                    break;
                                default:
                                    e1.a(this.s, sVar2, androidx.compose.runtime.t.L(1));
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    b2Var.d = eVar;
                }
                return;
            }
            View view = (View) sVar.j(w2.j0.f);
            String n0 = i4.n0(2131820621, num.intValue(), new Object[]{num}, sVar);
            boolean h = sVar.h(view) | sVar.f(n0);
            Object N = sVar.N();
            if (h || N == androidx.compose.runtime.n.a) {
                N = new d1(view, n0, null);
                sVar.n0(N);
            }
            androidx.compose.runtime.t.f(sVar, (j71.e) N, n0);
        }
        b2Var = sVar.t();
        if (b2Var != null) {
            final int i4 = 1;
            eVar = new j71.e(i, i4, num) { // from class: com.github.rudroid.utilities.ui.c1
                public final /* synthetic */ int r;
                public final /* synthetic */ Integer s;

                {
                    this.r = i4;
                    this.s = num;
                }

                public final Object s(Object obj, Object obj2) {
                    int i42 = this.r;
                    androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            e1.a(this.s, sVar2, androidx.compose.runtime.t.L(1));
                            break;
                        default:
                            e1.a(this.s, sVar2, androidx.compose.runtime.t.L(1));
                            break;
                    }
                    return w61.a0.a;
                }
            };
            b2Var.d = eVar;
        }
    }
}
