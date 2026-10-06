package sg;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import d2.p0;
import f1.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, final boolean z, f0.v vVar, s0 s0Var, p0 p0Var, boolean z2, final j71.a aVar, final f1.o0 o0Var, androidx.compose.runtime.s sVar, final int i, final int i2) {
        boolean z3;
        int i3;
        final f0.v vVar2;
        final s0 s0Var2;
        final p0 p0Var2;
        final boolean z4;
        final w1.r rVar2;
        b2 t;
        f0.v b;
        int i4;
        boolean z5;
        w1.r rVar3;
        s0 s0Var3;
        p0 p0Var3;
        k71.k.g(str, "text");
        k71.k.g(aVar, "onClick");
        sVar.e0(-1726232683);
        int i5 = i | 6;
        if ((i & 48) == 0) {
            i5 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= sVar.g(zShadow) ? 256 : 128;
        }
        int i6 = 74752 | i5;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i6 = 1647616 | i5;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i6 |= sVar.g(z3) ? 1048576 : 524288;
            if ((12582912 & i) == 0) {
                i6 |= sVar.h(aVar) ? 8388608 : 4194304;
            }
            i3 = i6 | (!sVar.f(o0Var) ? 67108864 : 33554432);
            if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
                sVar.V();
                vVar2 = vVar;
                s0Var2 = s0Var;
                p0Var2 = p0Var;
                z4 = z3;
                rVar2 = rVar;
            } else {
                sVar.X();
                if ((i & 1) == 0 || sVar.A()) {
                    b = y.b(0L, sVar, 3);
                    s0 b2 = f1.p0.b(31, 0.0f);
                    p0 p0Var4 = ih.d.e(sVar).b;
                    i4 = i3 & (-523265);
                    z5 = i7 == 0 ? z3 : true;
                    rVar3 = w1.o.a;
                    s0Var3 = b2;
                    p0Var3 = p0Var4;
                } else {
                    sVar.V();
                    i4 = i3 & (-523265);
                    rVar3 = rVar;
                    b = vVar;
                    s0Var3 = s0Var;
                    p0Var3 = p0Var;
                    z5 = z3;
                }
                sVar.r();
                w1.r r = p2.r(rVar3, 0.0f, 32, 0.0f, 0.0f, 13);
                rVar2 = rVar3;
                float f = ih.a.m;
                float f2 = ih.a.l;
                f0.v vVar3 = b;
                boolean z6 = z5;
                y.a((i4 & 3670016) | ((i4 >> 15) & 896) | 100663344 | ((i4 >> 12) & 57344), 0, new f2(f, f2, f, f2), sVar, p0Var3, vVar3, o0Var, s0Var3, aVar, r1.i.d(250416206, new com.github.rudroid.discussions.ui.g(z, o0Var, z5, str), sVar), r, z6);
                p0Var2 = p0Var3;
                vVar2 = vVar3;
                s0Var2 = s0Var3;
                z4 = z6;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new j71.e() { // from class: sg.l0
                    public final Object s(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m0.a(rVar2, str, z, vVar2, s0Var2, p0Var2, z4, aVar, o0Var, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i | 1), i2);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((12582912 & i) == 0) {
        }
        i3 = i6 | (!sVar.f(o0Var) ? 67108864 : 33554432);
        if (sVar.S(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
