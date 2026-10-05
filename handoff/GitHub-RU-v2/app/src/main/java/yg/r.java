package yg;

import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.t0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, boolean z, int i, j jVar, j71.a aVar, String str2, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        j jVar2;
        int i5;
        int i6;
        w1.r rVar3;
        j jVar3;
        b2 t;
        w1.r rVar4;
        j jVar4;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(658898694);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= sVar.g(z) ? 256 : 128;
        }
        int i8 = i4 | (sVar.d(i) ? 2048 : 1024);
        if ((i3 & 16) == 0) {
            jVar2 = jVar;
            if (sVar.f(jVar2)) {
                i5 = 16384;
                i6 = i8 | i5;
                if ((196608 & i2) == 0) {
                    i6 |= sVar.h(aVar) ? 131072 : 65536;
                }
                if ((1572864 & i2) == 0) {
                    i6 |= sVar.f(str2) ? 1048576 : 524288;
                }
                if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
                    sVar.V();
                    rVar3 = rVar2;
                    jVar3 = jVar2;
                } else {
                    sVar.X();
                    if ((i2 & 1) == 0 || sVar.A()) {
                        rVar4 = i7 != 0 ? w1.o.a : rVar2;
                        if ((i3 & 16) != 0) {
                            i6 &= -57345;
                            jVar4 = new j(null, null, null, null);
                            sVar.r();
                            int i9 = i6 >> 6;
                            w1.r rVar5 = rVar4;
                            n.a(rVar5, str, z, aVar, str2, new d3.k(0), jVar4, null, 0.0f, r1.i.d(616138635, new xg.o(i, jVar4, z), sVar), null, false, sVar, (i6 & 14) | 805306368 | (i6 & 112) | (i6 & 896) | (i9 & 7168) | (i9 & 57344) | ((i6 << 6) & 3670016), 0, 3456);
                            rVar3 = rVar5;
                            jVar3 = jVar4;
                        }
                    } else {
                        sVar.V();
                        if ((i3 & 16) != 0) {
                            i6 &= -57345;
                        }
                        rVar4 = rVar2;
                    }
                    jVar4 = jVar2;
                    sVar.r();
                    int i92 = i6 >> 6;
                    w1.r rVar52 = rVar4;
                    n.a(rVar52, str, z, aVar, str2, new d3.k(0), jVar4, null, 0.0f, r1.i.d(616138635, new xg.o(i, jVar4, z), sVar), null, false, sVar, (i6 & 14) | 805306368 | (i6 & 112) | (i6 & 896) | (i92 & 7168) | (i92 & 57344) | ((i6 << 6) & 3670016), 0, 3456);
                    rVar3 = rVar52;
                    jVar3 = jVar4;
                }
                t = sVar.t();
                if (t == null) {
                    t.d = new t0(rVar3, str, z, i, jVar3, aVar, str2, i2, i3);
                    return;
                }
                return;
            }
        } else {
            jVar2 = jVar;
        }
        i5 = 8192;
        i6 = i8 | i5;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (sVar.S(i6 & 1, (599187 & i6) == 599186)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
