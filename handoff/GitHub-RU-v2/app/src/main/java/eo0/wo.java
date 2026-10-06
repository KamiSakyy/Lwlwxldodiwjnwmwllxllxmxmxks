package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wo implements aaShadow.a {
    public static final wo a = new wo();
    public static final List b = sy.d0.o(new String[]{"id", "ref", "comparison", "pullRequestTemplates", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.mz mzVar = null;
        jn0.gz gzVar = null;
        List list = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                mzVar = (jn0.mz) aa.c.b(aa.c.c(vo.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                gzVar = (jn0.gz) aa.c.b(aa.c.c(po.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(uo.a, false))).a(eVar, wVar);
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
        if (str2 != null) {
            return new jn0.nz(str, mzVar, gzVar, list, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.nz nzVar = (jn0.nz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nzVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nzVar.a);
        fVar.z0("ref");
        aa.c.b(aa.c.c(vo.a, false)).b(fVar, wVar, nzVar.b);
        fVar.z0("comparison");
        aa.c.b(aa.c.c(po.a, false)).b(fVar, wVar, nzVar.c);
        fVar.z0("pullRequestTemplates");
        aa.c.b(aa.c.a(aa.c.c(uo.a, false))).b(fVar, wVar, nzVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, nzVar.e);
    }
}
