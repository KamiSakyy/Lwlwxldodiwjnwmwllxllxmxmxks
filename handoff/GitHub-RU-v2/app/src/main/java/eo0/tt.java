package eo0;

import java.util.List;
import jn0.h60;
import jn0.p60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tt implements aa.a {
    public static final tt a = new tt();
    public static final List b = sy.d0.o(new String[]{"id", "issueOrPullRequest", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h60 h60Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                h60Var = (h60) aa.c.b(aa.c.c(lt.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new p60(str, h60Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p60 p60Var = (p60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p60Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p60Var.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(lt.a, true)).b(fVar, wVar, p60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p60Var.c);
    }
}
