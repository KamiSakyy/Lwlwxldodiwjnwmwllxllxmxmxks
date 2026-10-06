package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jd implements aaShadow.a {
    public static final jd a = new jd();
    public static final List b = sy.d0Shadow.o("id", "issueOrPullRequest", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.zj zjVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                zjVar = (u10.zj) aa.c.b(aa.c.c(hd.a, true)).a(eVar, wVar);
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
            return new u10.bk(str, zjVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bk bkVar = (u10.bk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bkVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bkVar.a);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(hd.a, true)).b(fVar, wVar, bkVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bkVar.c);
    }
}
