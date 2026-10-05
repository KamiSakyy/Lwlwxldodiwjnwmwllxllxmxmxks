package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lg implements aa.a {
    public static final lg a = new lg();
    public static final List b = sy.d0.o("id", "issueOrPullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.eo eoVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                eoVar = (jo.eo) aa.c.b(aa.c.c(hg.a, true)).a(eVar, wVar);
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
            return new jo.io(str, eoVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.io ioVar = (jo.io) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ioVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ioVar.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(hg.a, true)).b(fVar, wVar, ioVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ioVar.c);
    }
}
