package zk;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public oa.g a;
    public cn.a b;

    public k(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "service");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    public final y71.y a(oa.j jVar, String str, String str2, j71.c cVar) {
        k71.w wVar = new k71.w();
        return b31.b.K(new y71.y(new an.d((Serializable) wVar, (Object) this, (Object) jVar, (Serializable) str, (Object) str2, (a71.c) null, 12), ((z01.f) this.a.a(jVar)).c(str, str2)), jVar, cVar, new kj.f(wVar, null, 5));
    }
}
