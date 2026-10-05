package sg;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.utilities.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, String str, boolean z, j71.a aVar, f1.o0 o0Var, f0.v vVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        boolean z2;
        f1.o0 o0Var2;
        f0.v vVar2;
        w1.r rVar3;
        boolean z3;
        f0.v vVar3;
        b2 t;
        f0.v vVar4;
        w1.r rVar4;
        int i4;
        k71.k.g(str, "text");
        k71.k.g(aVar, "onClick");
        sVar.e0(-428731178);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= sVar.g(z2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= sVar.h(aVar) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                o0Var2 = o0Var;
                i3 |= sVar.f(o0Var2) ? 16384 : 8192;
            } else {
                o0Var2 = o0Var;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    vVar2 = vVar;
                    if (sVar.f(vVar2)) {
                        i4 = 131072;
                        i3 |= i4;
                    }
                } else {
                    vVar2 = vVar;
                }
                i4 = 65536;
                i3 |= i4;
            } else {
                vVar2 = vVar;
            }
            if (sVar.S(i3 & 1, (74899 & i3) == 74898)) {
                sVar.V();
                rVar3 = rVar2;
                z3 = z2;
                vVar3 = vVar2;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    w1.r rVar5 = i5 != 0 ? w1.o.a : rVar2;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 32) != 0) {
                        vVar4 = f0.o.a(0.0f, ih.d.b(sVar).p);
                        i3 &= -458753;
                    } else {
                        vVar4 = vVar2;
                    }
                    rVar4 = rVar5;
                } else {
                    sVar.V();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    f0.v vVar5 = vVar2;
                    rVar4 = rVar2;
                    vVar4 = vVar5;
                }
                sVar.r();
                float f = ih.a.m;
                float f2 = ih.a.l;
                rVar3 = rVar4;
                int i7 = i3 >> 3;
                boolean z4 = z2;
                f0.v vVar6 = vVar4;
                k0.a((i7 & 57344) | (i7 & 112) | 12779520 | (i7 & 896) | (i7 & 7168), 64, new f2(f, f2, f, f2), sVar, null, vVar6, o0Var2, aVar, r1.i.d(-29135683, new ab.m(str, 18), sVar), p2.r(rVar4, 0.0f, 32, 0.0f, 0.0f, 13), z4);
                vVar3 = vVar6;
                z3 = z4;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new l1(rVar3, str, z3, aVar, o0Var, vVar3, i, i2, 4);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (sVar.S(i3 & 1, (74899 & i3) == 74898)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
