package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 implements aaShadow.a {
    public static final n8 a = new n8();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.rc rcVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                rcVar = (jn0.rc) aa.c.c(m8.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        cu0.c c = cu0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (rcVar == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new jn0.sc(str, rcVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.sc scVar = (jn0.sc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(scVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, scVar.a);
        fVar.z0("pullRequest");
        aa.c.c(m8.a, true).b(fVar, wVar, scVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, scVar.c);
        List list = cu0.f.a;
        cu0.f.d(fVar, wVar, scVar.d);
    }
}
