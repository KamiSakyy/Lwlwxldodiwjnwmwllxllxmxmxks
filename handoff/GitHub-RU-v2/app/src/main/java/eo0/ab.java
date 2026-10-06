package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ab implements aaShadow.a {
    public static final ab a = new ab();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "issueOrPullRequest", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.fg fgVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                fgVar = (jn0.fg) aa.c.b(aa.c.c(xa.a, true)).a(eVar, wVar);
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
            return new jn0.ig(str, fgVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ig igVar = (jn0.ig) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(igVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, igVar.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(xa.a, true)).b(fVar, wVar, igVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, igVar.c);
    }
}
