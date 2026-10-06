package bj;

import k71.k;
import oa.j;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public oa.g a;

    public e(oa.g gVar) {
        k.g(gVar, "userService");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, String str3, j71.c cVar) {
        k.g(str, "blockUserId");
        k.g(str2, "organizationId");
        k.g(str3, "discussionId");
        return b31.b.J(((z01.d) this.a.a(jVar)).d(str, str2, str3), jVar, cVar);
    }

}
