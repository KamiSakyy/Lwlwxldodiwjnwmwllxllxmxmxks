package li;

import com.github.rudroid.actions.checkdetail.v;
import k71.k;
import oa.g;
import oa.j;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final g a;

    public c(g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    public final y a(j jVar, String str, v vVar) {
        k.g(jVar, "user");
        k.g(str, "checkRunId");
        k.g(vVar, "onError");
        return b31.b.J(((kn.b) this.a.a(jVar)).y(str), jVar, vVar);
    }
}
