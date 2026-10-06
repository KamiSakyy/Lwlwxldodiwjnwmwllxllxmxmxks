package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y6 implements aaShadow.a {
    public static final y6 a = new y6();
    public static final List b = sy.d0Shadow.o("id", "viewerPermission", "owner", "hasNestedDiscussionAnswersEnabled", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        hc0.fq fqVar = null;
        u10.ia iaVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                fqVar = (hc0.fq) aa.c.b(ic0.b.h).a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                iaVar = (u10.ia) aa.c.c(x6.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (iaVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "hasNestedDiscussionAnswersEnabled");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new u10.ja(str, fqVar, iaVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ja jaVar = (u10.ja) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jaVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jaVar.a);
        fVar.z0("viewerPermission");
        aa.c.b(ic0.b.h).b(fVar, wVar, jaVar.b);
        fVar.z0("owner");
        aa.c.c(x6.a, false).b(fVar, wVar, jaVar.c);
        fVar.z0("hasNestedDiscussionAnswersEnabled");
        jo.f4Shadow.C(jaVar.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, jaVar.e);
    }
}
