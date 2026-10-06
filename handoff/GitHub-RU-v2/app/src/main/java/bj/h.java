package bj;

import k71.k;
import oa.j;
import y71.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public oa.g a;

    public h(oa.g gVar) {
        k.g(gVar, "userService");
        this.a = gVar;
    }

    public final y a(j jVar, String str, j71.c cVar) {
        k.g(jVar, "user");
        k.g(str, "blockUserId");
        k.g(cVar, "onError");
        return b31.b.J(((r1) this.a.a(jVar)).w(str), jVar, cVar);
    }

}
