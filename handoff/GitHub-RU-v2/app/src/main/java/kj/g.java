package kj;

import yz0.r3;
import z01.w0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final oa.g a;
    public final cn.a b;

    public g(oa.g gVar, cn.a aVar) {
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
        e eVar;
        int i;
        oa.j jVar2;
        k71.w wVar;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i2 = eVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.B = i2 - Integer.MIN_VALUE;
                Object obj = eVar.z;
                b71.a aVar = b71.a.r;
                i = eVar.B;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    w0 w0Var = (w0) this.a.a(jVar);
                    String str2 = r3Var.b;
                    String str3 = r3Var.a.a;
                    eVar.u = jVar;
                    eVar.v = str;
                    eVar.w = r3Var;
                    eVar.x = cVar;
                    eVar.y = wVar2;
                    eVar.B = 1;
                    Object a = w0Var.a(str2, str3);
                    if (a == aVar) {
                        return aVar;
                    }
                    jVar2 = jVar;
                    wVar = wVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k71.w wVar3 = eVar.y;
                    cVar = eVar.x;
                    r3Var = eVar.w;
                    str = eVar.v;
                    oa.j jVar3 = eVar.u;
                    sy.y.j(obj);
                    wVar = wVar3;
                    jVar2 = jVar3;
                }
                r3 r3Var2 = r3Var;
                return new d(b31.b.K(new y71.y(new an.d(wVar, str, this, jVar2, r3Var2, (a71.c) null, 7), (y71.i) obj), jVar2, cVar, new f(wVar, null, 0)), r3Var2, 0);
            }
        }
        eVar = new e(this, cVar2);
        Object obj2 = eVar.z;
        b71.a aVar2 = b71.a.r;
        i = eVar.B;
        if (i != 0) {
        }
        r3 r3Var22 = r3Var;
        return new d(b31.b.K(new y71.y(new an.d(wVar, str, this, jVar2, r3Var22, (a71.c) null, 7), (y71.i) obj2), jVar2, cVar, new f(wVar, null, 0)), r3Var22, 0);
    }
}
