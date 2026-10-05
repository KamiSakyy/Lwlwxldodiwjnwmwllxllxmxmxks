package x10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"url", "repository", "issue", "id"});

    public static i c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y yVar = null;
        b bVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                yVar = (y) aa.c.c(f1.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                bVar = (b) aa.c.c(i0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (yVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (bVar == null) {
            k41.b.B(eVar, "issue");
            throw null;
        }
        if (str2 != null) {
            return new i(str, yVar, bVar, str2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i iVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("url");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("repository");
        aa.c.c(f1.a, false).b(fVar, wVar, iVar.b);
        fVar.z0("issue");
        aa.c.c(i0.a, false).b(fVar, wVar, iVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.d);
    }
}
