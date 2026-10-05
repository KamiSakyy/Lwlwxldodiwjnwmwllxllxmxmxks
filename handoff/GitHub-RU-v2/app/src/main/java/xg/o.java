package xg;

import androidx.compose.foundation.layout.m2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.compose.ui.layout.z;
import com.github.rudroid.uitoolkit.text.n0;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import m7.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements j71.f {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ int s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;

    public /* synthetic */ o(int i, yg.j jVar, boolean z) {
        this.s = i;
        this.u = jVar;
        this.t = z;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        long j;
        switch (this.r) {
            case 0:
                f1 f1Var = (f1) this.u;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryDialogButton");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    w1.o oVar = w1.o.a;
                    if (this.t) {
                        sVar.c0(174664538);
                        w1.r b = p2.b(oVar, nh.a.a((int) (((s3.l) f1Var.getValue()).a >> 32), sVar), 0.0f, 2);
                        float f = 24;
                        com.github.rudroid.uitoolkit.f1.a(b, new s3.h(y.a(f, f)), 2, 0L, sVar, 432, 8);
                        sVar.q(false);
                    } else {
                        sVar.c0(174969919);
                        Object N = sVar.N();
                        if (N == androidx.compose.runtime.n.a) {
                            N = new ab.e(f1Var, 27);
                            sVar.n0(N);
                        }
                        n0.a(i4.p0(this.s, sVar), z.o(oVar, (j71.c) N), 0L, 0L, 0L, null, 0L, 0, false, 0, null, null, sVar, 48, 0, 65532);
                        sVar.q(false);
                    }
                } else {
                    sVar.V();
                }
                break;
            default:
                yg.j jVar = (yg.j) this.u;
                ((Boolean) obj).getClass();
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    w1.r o = p2.o(w1.o.a, ih.a.M);
                    i2.b C = z3.C(this.s, 0, sVar2);
                    k71.k.g(jVar, "<this>");
                    Integer num = jVar.d;
                    if (num != null) {
                        sVar2.c0(1364692273);
                        j = b91.g.l(num.intValue(), sVar2);
                        sVar2.q(false);
                    } else if (this.t) {
                        sVar2.c0(1845140477);
                        j = ih.d.b(sVar2).r0;
                        sVar2.q(false);
                    } else {
                        sVar2.c0(1845142559);
                        j = ih.d.b(sVar2).n0;
                        sVar2.q(false);
                    }
                    p5.a(C, (String) null, o, j, sVar2, 440, 0);
                } else {
                    sVar2.V();
                }
                break;
        }
        return a0.a;
    }

    public /* synthetic */ o(boolean z, f1 f1Var, int i) {
        this.t = z;
        this.u = f1Var;
        this.s = i;
    }
}
