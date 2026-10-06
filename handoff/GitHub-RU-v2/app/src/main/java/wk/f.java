package wk;

import com.github.domain.database.GitHubDatabase;
import com.google.android.gms.internal.measurement.d5;
import k71.k;
import t00.f8;
import xk.l;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public xk.j a;

    public f(xk.j jVar) {
        k.g(jVar, "repository");
        this.a = jVar;
    }

    public final y a(oa.j jVar, j71.c cVar) {
        k.g(jVar, "user");
        xk.j jVar2 = this.a;
        jVar2.getClass();
        l lVar = jVar2.a;
        lVar.getClass();
        bk.b C = ((GitHubDatabase) lVar.a.a(jVar)).C();
        a71.c cVar2 = null;
        return b31.b.J(new c00.g(new f8(18, d5.B(C.a, new String[]{"pinned_items"}, new bf.c(C))), new y(new cn.e(2, cVar2, 6), jVar2.a(jVar)), new xk.a(3, cVar2, 1), 27), jVar, cVar);
    }
}
