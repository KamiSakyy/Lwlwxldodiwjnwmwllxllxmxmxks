package kj;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final oa.g a;

    public c0(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, List list, j71.c cVar, c71.c cVar2) {
        b0 b0Var;
        int i;
        if (cVar2 instanceof b0) {
            b0Var = (b0) cVar2;
            int i2 = b0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.w;
                b71.a aVar = b71.a.r;
                i = b0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.a aVar2 = (z01.a) this.a.a(jVar);
                    b0Var.u = jVar;
                    b0Var.v = cVar;
                    b0Var.y = 1;
                    obj = aVar2.a(list);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = b0Var.v;
                    jVar = b0Var.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        b0Var = new b0(this, cVar2);
        Object obj2 = b0Var.w;
        b71.a aVar3 = b71.a.r;
        i = b0Var.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
