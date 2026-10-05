package wp0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s implements aa.a {
    public static final List a = x61.l.r(new String[]{"abbreviatedOid", "id", "messageHeadline", "author", "repository"});

    public static e c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        j jVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                bVar = (b) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                jVar = (j) aa.c.c(x.a, false).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "abbreviatedOid");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "messageHeadline");
            throw null;
        }
        if (jVar != null) {
            return new e(str, str2, str3, bVar, jVar);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("abbreviatedOid");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("messageHeadline");
        bVar.b(fVar, wVar, eVar.c);
        fVar.z0("author");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, eVar.d);
        fVar.z0("repository");
        aa.c.c(x.a, false).b(fVar, wVar, eVar.e);
    }
}
