package tk;

import k71.k;
import oa.j;
import y71.y;
import z01.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final oa.g a;

    public g(oa.g gVar) {
        k.g(gVar, "filesChangedService");
        this.a = gVar;
    }

    public final y a(j jVar, String str, String str2, int i, j71.c cVar) {
        k.g(str, "owner");
        k.g(str2, "name");
        return b31.b.J(((t) this.a.a(jVar)).e(str, i, str2), jVar, cVar);
    }
}
