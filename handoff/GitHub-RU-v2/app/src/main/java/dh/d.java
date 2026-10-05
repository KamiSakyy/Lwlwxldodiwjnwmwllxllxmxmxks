package dh;

import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.s;
import f1.o2;
import f1.t2;
import f1.ub;
import f1.x3;
import g3.q0;
import g3.z;
import k3.i;
import k3.o;
import w1.r;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ x3 s;

    public /* synthetic */ d(x3 x3Var, int i) {
        this.r = i;
        this.s = x3Var;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        a0 a0Var = a0.a;
        x3 x3Var = this.s;
        int i2 = 2;
        switch (i) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                f2 f2Var = e.a;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    ub.a(q0.a(ih.d.f(sVar).d, ih.d.b(sVar).F, 0L, (k3.s) null, (o) null, (i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), r1.i.d(1683704601, new d(x3Var, i2), sVar), sVar, 48);
                    break;
                }
            case 1:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                f2 f2Var2 = e.a;
                if (!sVar2.S(1 & intValue2, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    ub.a(q0.a(ih.d.f(sVar2).d, 0L, t1.C(24), (k3.s) null, (o) null, (i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213), r1.i.d(1159135158, new d(x3Var, 3), sVar2), sVar2, 48);
                    break;
                }
            case 2:
                s sVar3 = (s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                f2 f2Var3 = e.a;
                if (!sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    o2.a.b(x3Var.a(), (r) null, 0L, sVar3, 3072, 6);
                    break;
                }
            default:
                s sVar4 = (s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                f2 f2Var4 = e.a;
                if (!sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.V();
                    break;
                } else {
                    float f = 12;
                    o2.a.a(x3Var.b(), x3Var.a(), new t2(), androidx.compose.foundation.layout.b.w(w1.o.a, androidx.compose.foundation.layout.b.f(24, 0.0f, f, f, 2)), ih.d.b(sVar4).F, sVar4, 199680);
                    break;
                }
        }
        return a0Var;
    }
}
