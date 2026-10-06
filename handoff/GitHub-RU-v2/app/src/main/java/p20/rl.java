package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rl implements aaShadow.a {
    public static final rl a = new rl();
    public static final List b = sy.d0Shadow.o("defaultBranchRef", "refs", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jv jvVar = null;
        u10.lv lvVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jvVar = (u10.jv) aa.c.b(aa.c.c(ol.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                lvVar = (u10.lv) aa.c.b(aa.c.c(ql.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new u10.mv(jvVar, lvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mv mvVar = (u10.mv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mvVar, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(ol.a, false)).b(fVar, wVar, mvVar.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(ql.a, false)).b(fVar, wVar, mvVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mvVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mvVar.d);
    }
}
