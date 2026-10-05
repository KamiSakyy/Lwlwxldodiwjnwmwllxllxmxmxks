package com.github.rudroid.utilities.ui;

import androidx.compose.foundation.layout.p2;
import com.github.rudroid.adapters.viewholders.d2;
import com.google.android.gms.internal.measurement.i4;
import f1.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ j71.a s;
    public final /* synthetic */ int t;

    public /* synthetic */ a(int i, int i2, j71.a aVar) {
        this.r = i2;
        this.s = aVar;
        this.t = i;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sg.k0.b(null, false, this.s, null, i4.p0(this.t, sVar), null, sVar, 0, 43);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sg.y.a(100663302, 250, null, sVar2, null, null, null, null, this.s, r1.i.d(259000450, new d2(this.t, 7), sVar2), p2.e(w1.o.a, 1.0f), false);
                } else {
                    sVar2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e8.k(this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.t | 1));
                break;
        }
        return w61.a0.a;
    }
}
