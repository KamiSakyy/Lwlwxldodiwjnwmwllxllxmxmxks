package kj;

import yz0.r3;
import z01.w0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public oa.g a;
    public cn.a b;

    public g0(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "reactionService");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, r3 r3Var, j71.c cVar, c71.c cVar2) {
        f0 f0Var;
        int i;
        oa.j jVar2;
        k71.w wVar;
        if (cVar2 instanceof f0) {
            f0Var = (f0) cVar2;
            int i2 = f0Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.B = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.z;
                b71.a aVar = b71.a.r;
                i = f0Var.B;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    w0 w0Var = (w0) this.a.a(jVar);
                    String str2 = r3Var.b;
                    String str3 = r3Var.a.a;
                    f0Var.u = jVar;
                    f0Var.v = str;
                    f0Var.w = r3Var;
                    f0Var.x = cVar;
                    f0Var.y = wVar2;
                    f0Var.B = 1;
                    Object b = w0Var.b(str2, str3);
                    if (b == aVar) {
                        return aVar;
                    }
                    jVar2 = jVar;
                    wVar = wVar2;
                    obj = b;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k71.w wVar3 = f0Var.y;
                    cVar = f0Var.x;
                    r3Var = f0Var.w;
                    str = f0Var.v;
                    oa.j jVar3 = f0Var.u;
                    sy.y.j(obj);
                    wVar = wVar3;
                    jVar2 = jVar3;
                }
                r3 r3Var2 = r3Var;
                return new d(b31.b.J(b31.b.K(new y71.y(new an.d(wVar, str, this, jVar2, r3Var2, (a71.c) null, 8), (y71.i) obj), jVar2, cVar, new f(wVar, null, 2)), jVar2, cVar), r3Var2, 1);
            }
        }
        f0Var = new f0(this, cVar2);
        Object obj2 = f0Var.z;
        b71.a aVar2 = b71.a.r;
        i = f0Var.B;
        if (i != 0) {
        }
        r3 r3Var22 = r3Var;
        return new d(b31.b.J(b31.b.K(new y71.y(new an.d(wVar, str, this, jVar2, r3Var22, (a71.c) null, 8), (y71.i) obj2), jVar2, cVar, new f(wVar, null, 2)), jVar2, cVar), r3Var22, 1);
    }
}
