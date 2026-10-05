package eh;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.y2;
import d2.p0;
import f0.v;
import f1.qa;
import g3.q0;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final void a(r rVar, String str, q0 q0Var, d2 d2Var, r1.d dVar, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        r1.d dVar2;
        q0 q0Var2;
        d2 d2Var2;
        q0 q0Var3;
        r rVar3;
        d2 d2Var3;
        k71.k.g(str, "groupTitle");
        sVar.e0(1050441356);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= 128;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            dVar2 = dVar;
            i5 |= sVar.h(dVar2) ? 16384 : 8192;
        } else {
            dVar2 = dVar;
        }
        if (sVar.S(i5 & 1, (i5 & 9363) != 9362)) {
            sVar.X();
            int i6 = i & 1;
            r rVar4 = o.a;
            if (i6 == 0 || sVar.A()) {
                if (i4 != 0) {
                    rVar2 = rVar4;
                }
                q0 q0Var4 = ih.d.f(sVar).w;
                float f = ih.a.n;
                d2 f2Var = new f2(f, f, f, f);
                q0Var3 = q0Var4;
                rVar3 = rVar2;
                d2Var3 = f2Var;
            } else {
                sVar.V();
                q0Var3 = q0Var;
                rVar3 = rVar2;
                d2Var3 = d2Var;
            }
            sVar.r();
            d2 d2Var4 = d2Var3;
            qa.a(p2.e(rVar4, 1.0f).f(rVar3), (p0) null, ih.d.b(sVar).b, 0L, 0.0f, ih.a.f, (v) null, r1.i.d(-395813785, new y2(d2Var3, str, q0Var3, dVar2, 4), sVar), sVar, 12779520, 90);
            rVar2 = rVar3;
            q0Var2 = q0Var3;
            d2Var2 = d2Var4;
        } else {
            sVar.V();
            q0Var2 = q0Var;
            d2Var2 = d2Var;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new x0(rVar2, str, q0Var2, d2Var2, dVar, i, i2, 6);
        }
    }


}
