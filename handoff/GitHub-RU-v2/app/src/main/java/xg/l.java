package xg;

import androidx.compose.runtime.b2;
import com.github.rudroid.adapters.viewholders.d2;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final void a(w1.r rVar, final int i, final int i2, final int i3, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final int i4, androidx.compose.runtime.s sVar, final int i5, final int i6) {
        w1.r rVar2;
        int i7;
        int i8;
        int i9;
        k71.k.g(aVar, "onDestructiveButtonClick");
        k71.k.g(aVar2, "onNegativeButtonClick");
        k71.k.g(aVar3, "onDialogDismiss");
        sVar.e0(1901417571);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
            rVar2 = rVar;
        } else if ((i5 & 6) == 0) {
            rVar2 = rVar;
            i7 = (sVar.f(rVar2) ? 4 : 2) | i5;
        } else {
            rVar2 = rVar;
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= sVar.d(i) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= sVar.d(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 = i3;
            i7 |= sVar.d(i8) ? 2048 : 1024;
        } else {
            i8 = i3;
        }
        if ((i5 & 24576) == 0) {
            i7 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= sVar.h(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= sVar.h(aVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i9 = i4;
            i7 |= sVar.d(i9) ? 8388608 : 4194304;
        } else {
            i9 = i4;
        }
        if (sVar.S(i7 & 1, (4793491 & i7) != 4793490)) {
            if (i11 != 0) {
                rVar2 = w1.o.a;
            }
            int i12 = (i7 & 14) | 100663728 | (i7 & 7168) | ((i7 >> 9) & 57344);
            int i13 = i7 << 3;
            c.b(rVar2, r1.i.d(-2063689450, new d2(i, 11), sVar), r1.i.d(-1301808139, new d2(i2, 12), sVar), i8, i9, aVar, aVar2, aVar3, true, sVar, i12 | (458752 & i13) | (3670016 & i13) | (i13 & 29360128), 0);
        } else {
            sVar.V();
        }
        final w1.r rVar3 = rVar2;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: xg.k
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.a(rVar3, i, i2, i3, aVar, aVar2, aVar3, i4, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i5 | 1), i6);
                    return a0.a;
                }
            };
        }
    }
    public static final Object b = null;
    public static final Object c = null;
}
