package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e7 implements aaShadow.a {
    public static final e7 a = new e7();
    public static final List b = sy.d0.o(new String[]{"id", "viewerPermission", "owner", "hasNestedDiscussionAnswersEnabled", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        gn0.jr jrVar = null;
        kc0.qa qaVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                jrVar = (gn0.jr) aa.c.b(hn0.b.h).a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                qaVar = (kc0.qa) aa.c.c(d7.a, false).a(eVar, wVar);
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
        if (qaVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "hasNestedDiscussionAnswersEnabled");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str2 != null) {
            return new kc0.ra(str, jrVar, qaVar, booleanValue, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ra raVar = (kc0.ra) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(raVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, raVar.a);
        fVar.z0("viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, raVar.b);
        fVar.z0("owner");
        aa.c.c(d7.a, false).b(fVar, wVar, raVar.c);
        fVar.z0("hasNestedDiscussionAnswersEnabled");
        jo.f4.C(raVar.d, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, raVar.e);
    }
}
