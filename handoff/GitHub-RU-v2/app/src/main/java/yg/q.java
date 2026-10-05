package yg;

import androidx.compose.runtime.b2;
import com.github.rudroid.adapters.viewholders.d2;
import com.github.rudroid.uitoolkit.n2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, String str, String str2, w1.r rVar, boolean z) {
        int i3;
        boolean z2;
        w1.r rVar2;
        w1.r rVar3;
        b2 t;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(649024722);
        if ((i & 6) == 0) {
            i3 = (sVar.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.f(str2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 16384 : 8192;
            if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
                sVar.V();
                rVar3 = rVar2;
            } else {
                w1.r rVar4 = i4 != 0 ? w1.o.a : rVar2;
                b(str, z2, aVar, str2, rVar4, null, sVar, (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344));
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new n2(str, z, aVar, str2, rVar3, i, i2);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    public static final void b(String str, boolean z, j71.a aVar, String str2, w1.r rVar, j71.f fVar, androidx.compose.runtime.s sVar, int i) {
        String str3;
        int i2;
        boolean z2;
        j71.a aVar2;
        sVar.e0(-1055025029);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (sVar.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= sVar.g(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            aVar2 = aVar;
            i2 |= sVar.h(aVar2) ? 256 : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(rVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= sVar.h(fVar) ? 131072 : 65536;
        }
        if (sVar.S(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            n.a(rVar, str3, z2, aVar2, str2, new d3.k(6), null, null, 0.0f, fVar, d.a, false, sVar, ((i2 >> 12) & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 12) & 1879048192), 6, 2496);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bh.b(str, z, (Object) aVar, (Object) str2, (Object) rVar, (w61.e) fVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(int i, int i2, int i3, androidx.compose.runtime.s sVar, j71.a aVar, String str, String str2, w1.r rVar, boolean z) {
        int i4;
        w1.r rVar2;
        w1.r rVar3;
        b2 t;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(-1058812894);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.h(aVar) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            rVar2 = rVar;
            i4 |= sVar.f(rVar2) ? 16384 : 8192;
            if ((i2 & 196608) == 0) {
                i4 |= sVar.d(i) ? 131072 : 65536;
            }
            if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
                sVar.V();
                rVar3 = rVar2;
            } else {
                w1.r rVar4 = i5 != 0 ? w1.o.a : rVar2;
                b(str, z, aVar, str2, rVar4, r1.i.d(2008141234, new d2(i, 16), sVar), sVar, (i4 & 14) | 196608 | (i4 & 112) | ((i4 >> 3) & 896) | ((i4 << 3) & 7168) | (i4 & 57344));
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new p(str, z, str2, aVar, rVar3, i, i2, i3);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if ((i2 & 196608) == 0) {
        }
        if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i, int i2, int i3, androidx.compose.runtime.s sVar, j71.a aVar, String str, String str2, w1.r rVar, boolean z) {
        int i4;
        w1.r rVar2;
        w1.r rVar3;
        b2 t;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(1506782542);
        if ((i2 & 6) == 0) {
            i4 = (sVar.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.h(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(str2) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            rVar2 = rVar;
            i4 |= sVar.f(rVar2) ? 16384 : 8192;
            if ((i2 & 196608) == 0) {
                i4 |= sVar.d(i) ? 131072 : 65536;
            }
            if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
                sVar.V();
                rVar3 = rVar2;
            } else {
                w1.r rVar4 = i5 != 0 ? w1.o.a : rVar2;
                b(str, z, aVar, str2, rVar4, r1.i.d(1467169214, new d2(i, 15), sVar), sVar, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
                rVar3 = rVar4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new p(str, z, aVar, str2, rVar3, i, i2, i3);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if ((i2 & 196608) == 0) {
        }
        if (sVar.S(i4 & 1, (74899 & i4) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
