package zk;

import com.github.service.models.response.issueorpullrequest.CloseReason;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public oa.g a;
    public cn.a b;

    public h(oa.g gVar, cn.a aVar) {
        k71.k.g(gVar, "service");
        k71.k.g(aVar, "timelineStore");
        this.a = gVar;
        this.b = aVar;
    }

    public final y71.y a(oa.j jVar, String str, CloseReason closeReason, z01.p pVar, j71.c cVar) {
        k71.k.g(jVar, "user");
        k71.k.g(str, "issueId");
        return b31.b.J(new y71.y(((z01.h0) this.a.a(jVar)).p(str, closeReason, pVar), new an.d(this, jVar, str, closeReason, pVar, (a71.c) null, 11), 6), jVar, cVar);
    }
}
