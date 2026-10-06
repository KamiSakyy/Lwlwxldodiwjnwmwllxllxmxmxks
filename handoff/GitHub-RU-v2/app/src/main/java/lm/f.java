package lm;

import sy.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public oa.g a;

    public f(oa.g gVar) {
        k71.k.g(gVar, "assignableActorsService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, String str2, String str3, String str4, j71.c cVar, c71.c cVar2) {
        e eVar;
        int i;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i2 = eVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.y = i2 - Integer.MIN_VALUE;
                Object obj = eVar.w;
                b71.a aVar = b71.a.r;
                i = eVar.y;
                if (i != 0) {
                    y.j(obj);
                    z01.c cVar3 = (z01.c) this.a.a(jVar);
                    eVar.u = jVar;
                    eVar.v = cVar;
                    eVar.y = 1;
                    obj = cVar3.a(str, str2, str3, str4);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = eVar.v;
                    jVar = eVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, cVar);
            }
        }
        eVar = new e(this, cVar2);
        Object obj2 = eVar.w;
        b71.a aVar2 = b71.a.r;
        i = eVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, cVar);
    }
}
