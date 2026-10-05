package com.github.rudroid.utilities.ui;

import androidx.compose.runtime.b2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public static final void a(w1.r rVar, Integer num, Integer num2, int i, j71.a aVar, androidx.compose.runtime.s sVar, int i2) {
        w1.r rVar2;
        sVar.e0(1344862525);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= sVar.f(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= sVar.f(num2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sVar.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 14;
            int i5 = i3 << 6;
            int i6 = i4 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016);
            w1.r rVar3 = w1.o.a;
            f.b(rVar3, 2131231509, null, num, num2, i, aVar, sVar, i6, 4);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.achievements.ui.b0(rVar2, num, num2, i, aVar, i2);
        }
    }
}
