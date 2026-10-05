package eo0;

import java.util.List;
import jn0.pc0;
import jn0.tc0;
import jn0.uc0;
import jn0.wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vx implements aa.a {
    public static final vx a = new vx();
    public static final List b = sy.d0.o(new String[]{"id", "repository", "reviewRequests", "latestReviews", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        uc0 uc0Var = null;
        wc0 wc0Var = null;
        pc0 pc0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                uc0Var = (uc0) aa.c.c(wx.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                wc0Var = (wc0) aa.c.b(aa.c.c(yx.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                pc0Var = (pc0) aa.c.b(aa.c.c(rx.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (uc0Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new tc0(str, uc0Var, wc0Var, pc0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        tc0 tc0Var = (tc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tc0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tc0Var.a);
        fVar.z0("repository");
        aa.c.c(wx.a, false).b(fVar, wVar, tc0Var.b);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(yx.a, false)).b(fVar, wVar, tc0Var.c);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(rx.a, false)).b(fVar, wVar, tc0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tc0Var.e);
    }
}
