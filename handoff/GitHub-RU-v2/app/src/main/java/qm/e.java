package qm;

import c71.j;
import sy.y;
import w61.a0;
import z01.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ u0 w;
    public /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.v;
        u0 u0Var = (u0) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        a71.c cVar = (a71.c) obj3;
        switch (i) {
            case 0:
                e eVar = new e(3, cVar, 0);
                eVar.w = u0Var;
                eVar.x = booleanValue;
                return eVar.v(a0.a);
            case 1:
                e eVar2 = new e(3, cVar, 1);
                eVar2.w = u0Var;
                eVar2.x = booleanValue;
                return eVar2.v(a0.a);
            case 2:
                e eVar3 = new e(3, cVar, 2);
                eVar3.w = u0Var;
                eVar3.x = booleanValue;
                return eVar3.v(a0.a);
            default:
                e eVar4 = new e(3, cVar, 3);
                eVar4.w = u0Var;
                eVar4.x = booleanValue;
                return eVar4.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                u0 u0Var = this.w;
                boolean z = this.x;
                b71.a aVar = b71.a.r;
                y.j(obj);
                return u0Var.b(z);
            case 1:
                u0 u0Var2 = this.w;
                boolean z2 = this.x;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                return u0Var2.m(z2);
            case 2:
                u0 u0Var3 = this.w;
                boolean z3 = this.x;
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                return u0Var3.f(z3);
            default:
                u0 u0Var4 = this.w;
                boolean z4 = this.x;
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                return u0Var4.j(z4);
        }
    }
}
