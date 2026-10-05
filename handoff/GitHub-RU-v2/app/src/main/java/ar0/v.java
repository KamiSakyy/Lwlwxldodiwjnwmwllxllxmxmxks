package ar0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "comments"});

    public static r c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        o oVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                oVar = (o) aa.c.c(u.a, false).a(eVar, wVar);
            }
        }
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c = gu0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (oVar != null) {
            return new r(str, str2, oVar, c);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, r rVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, rVar.b);
        fVar.z0("comments");
        aa.c.c(u.a, false).b(fVar, wVar, rVar.c);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, rVar.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (r) obj);
    }
}
