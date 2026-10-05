package eh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import bd.m;
import com.github.rudroid.activities.g3;
import d2.a0;
import f1.ub;
import g3.q0;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, q0 q0Var, String str2, q0 q0Var2, d2 d2Var, j71.a aVar, String str3, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        q0 q0Var3;
        String str4;
        int i4;
        q0 q0Var4;
        r rVar3;
        q0 q0Var5;
        String str5;
        d2 d2Var2;
        b2 t;
        q0 q0Var6;
        int i5;
        q0 q0Var7;
        r rVar4;
        String str6;
        q0 q0Var8;
        d2 f2Var;
        String str7;
        q0 q0Var9;
        int i6;
        k71.k.g(str, "title");
        sVar.e0(1491286704);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                q0Var3 = q0Var;
                if (sVar.f(q0Var3)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                q0Var3 = q0Var;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            q0Var3 = q0Var;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str4 = str2;
            i3 |= sVar.f(str4) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= 8192;
            }
            i4 = i3 | 196608;
            if ((1572864 & i) == 0) {
                i4 |= sVar.h(aVar) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i4 |= sVar.f(str3) ? 8388608 : 4194304;
            }
            if (sVar.S(i4 & 1, (4793491 & i4) == 4793490)) {
                sVar.V();
                q0Var4 = q0Var2;
                rVar3 = rVar2;
                q0Var5 = q0Var3;
                str5 = str4;
                d2Var2 = d2Var;
            } else {
                sVar.X();
                int i9 = i & 1;
                r rVar5 = o.a;
                if (i9 == 0 || sVar.A()) {
                    if (i7 != 0) {
                        rVar2 = rVar5;
                    }
                    if ((i2 & 4) != 0) {
                        q0Var6 = ih.d.f(sVar).l;
                        i4 &= -897;
                    } else {
                        q0Var6 = q0Var3;
                    }
                    String str8 = i8 != 0 ? null : str4;
                    q0 q0Var10 = ih.d.f(sVar).u;
                    i5 = i4 & (-57345);
                    float f = ih.a.n;
                    q0Var7 = q0Var6;
                    rVar4 = rVar2;
                    str6 = str8;
                    q0Var8 = q0Var10;
                    f2Var = new f2(f, f, f, f);
                } else {
                    sVar.V();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    q0Var8 = q0Var2;
                    i5 = i4 & (-57345);
                    rVar4 = rVar2;
                    q0Var7 = q0Var3;
                    str6 = str4;
                    f2Var = d2Var;
                }
                sVar.r();
                r b = p2.b(rVar5, 0.0f, ih.a.F, 1);
                boolean z = (i5 & 29360128) == 8388608;
                Object N = sVar.N();
                if (z || N == n.a) {
                    N = new m(str3, 12);
                    sVar.n0(N);
                }
                r f2 = p2.e(androidx.compose.foundation.layout.b.w(f0.o.f(com.github.rudroid.uitoolkit.extensions.d.b(b, aVar, (j71.e) N), ih.d.b(sVar).b, a0.b), f2Var), 1.0f).f(rVar4);
                e0 a = c0.a(l.c, w1.c.D, sVar, 0);
                int hashCode = Long.hashCode(sVar.T);
                v1 l = sVar.l();
                r c = w1.a.c(sVar, f2);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar.g0();
                if (sVar.S) {
                    sVar.k(fVar);
                } else {
                    sVar.q0();
                }
                t.I(sVar, v2.g.f, a);
                t.I(sVar, v2.g.e, l);
                t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                t.E(sVar, v2.g.h);
                t.I(sVar, v2.g.d, c);
                int i11 = ((i5 >> 3) & 14) | 48;
                int i12 = (i5 << 15) & 29360128;
                r rVar6 = rVar4;
                d2 d2Var3 = f2Var;
                ub.b(str, p2.e(rVar5, 1.0f), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var7, sVar, i11, i12, 131068);
                q0 q0Var11 = q0Var7;
                s sVar2 = sVar;
                if (str6 == null) {
                    sVar2.c0(2132524707);
                    sVar2.q(false);
                    str7 = str6;
                    q0Var9 = q0Var8;
                } else {
                    sVar2.c0(2132524708);
                    str7 = str6;
                    q0Var9 = q0Var8;
                    ub.b(str7, p2.e(rVar5, 1.0f), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 10, 0, (j71.c) null, q0Var9, sVar, 48, 24960, 110588);
                    sVar2 = sVar;
                    sVar2.q(false);
                }
                sVar2.q(true);
                str5 = str7;
                q0Var4 = q0Var9;
                rVar3 = rVar6;
                d2Var2 = d2Var3;
                q0Var5 = q0Var11;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new g3(rVar3, str, q0Var5, str5, q0Var4, d2Var2, aVar, str3, i, i2);
                return;
            }
            return;
        }
        str4 = str2;
        if ((i & 24576) == 0) {
        }
        i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (sVar.S(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
