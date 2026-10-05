package bj;

import k71.k;
import oa.j;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final oa.g a;
    public final cn.a b;

    public f(oa.g gVar, cn.a aVar) {
        k.g(gVar, "userService");
        k.g(aVar, "forUserTimelineStoreFactory");
        this.a = gVar;
        this.b = aVar;
    }

    public final y a(j jVar, String str, String str2, String str3, j71.c cVar) {
        k.g(str, "blockUserId");
        k.g(str2, "organizationId");
        k.g(str3, "issueOrPullId");
        return b31.b.J(new y(((z01.d) this.a.a(jVar)).c(str, str2, str3), new an.g(this, jVar, str3, str, (a71.c) null, 1), 6), jVar, cVar);
    }

}
