package kj;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final oa.g a;
    public final cn.a b;

    public z(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "lockService");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        y yVar;
        int i;
        oa.j jVar2;
        k71.w wVar;
        if (cVar2 instanceof y) {
            yVar = (y) cVar2;
            int i2 = yVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.A = i2 - Integer.MIN_VALUE;
                Object obj = yVar.y;
                b71.a aVar = b71.a.r;
                i = yVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    z01.k0 k0Var = (z01.k0) this.a.a(jVar);
                    yVar.u = jVar;
                    yVar.v = str;
                    yVar.w = cVar;
                    yVar.x = wVar2;
                    yVar.A = 1;
                    Object b = k0Var.b(str);
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
                    k71.w wVar3 = yVar.x;
                    cVar = yVar.w;
                    str = yVar.v;
                    oa.j jVar3 = yVar.u;
                    sy.y.j(obj);
                    wVar = wVar3;
                    jVar2 = jVar3;
                }
                String str2 = str;
                an.g gVar = new an.g(wVar, this, jVar2, str2, (a71.c) null, 7);
                a71.c cVar3 = null;
                oa.j jVar4 = jVar2;
                return b31.b.K(new y71.y(new y71.y(gVar, (y71.i) obj), new an.g(this, jVar4, str2, cVar3, 8), 6), jVar4, cVar, new f(wVar, cVar3, 1));
            }
        }
        yVar = new y(this, cVar2);
        Object obj2 = yVar.y;
        b71.a aVar2 = b71.a.r;
        i = yVar.A;
        if (i != 0) {
        }
        String str22 = str;
        an.g gVar2 = new an.g(wVar, this, jVar2, str22, (a71.c) null, 7);
        a71.c cVar32 = null;
        oa.j jVar42 = jVar2;
        return b31.b.K(new y71.y(new y71.y(gVar2, (y71.i) obj2), new an.g(this, jVar42, str22, cVar32, 8), 6), jVar42, cVar, new f(wVar, cVar32, 1));
    }
}
