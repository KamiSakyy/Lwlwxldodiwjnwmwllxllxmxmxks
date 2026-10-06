package xk;

import com.github.domain.database.GitHubDatabase;
import com.google.android.gms.internal.measurement.d5;
import in.rShadow;
import rm0.r3Shadow;
import t00.ua;
import t00.z1;
import y71.y;
import z01.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public e a;
    public oa.g b;

    public c(e eVar, oa.g gVar) {
        k71.k.g(eVar, "dashboardNavLinksStore");
        k71.k.g(gVar, "homeServiceFactory");
        this.a = eVar;
        this.b = gVar;
    }

    public final c00.g a(oa.j jVar) {
        e eVar = this.a;
        eVar.getClass();
        a71.c cVar = null;
        return new c00.g(new r3Shadow(17, d5.B(((GitHubDatabase) eVar.a.a(jVar)).w().a, new String[]{"dashboard_nav_links"}, new ua(21)), eVar), new y(new cn.e(2, cVar, 5), b(jVar)), new a(3, cVar, 0), 27);
    }

    public final gl.f b(oa.j jVar) {
        k71.k.g(jVar, "user");
        return rShadow.l(new y(((a0) this.b.a(jVar)).e(), new z1(this, jVar, null, 25), 6));
    }
}
