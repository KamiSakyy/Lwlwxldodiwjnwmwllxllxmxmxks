package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o7 implements aa.a {
    public static final o7 a = new o7();
    public static final List b = sy.d0.o(new String[]{"id", "locked", "author", "repository", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        jn0.eb ebVar = null;
        jn0.lb lbVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                ebVar = (jn0.eb) aa.c.b(aa.c.c(m7.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                lbVar = (jn0.lb) aa.c.c(s7.a, false).a(eVar, wVar);
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
        if (bool3 == null) {
            k41.b.B(eVar, "locked");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (lbVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new jn0.hb(str, booleanValue, ebVar, lbVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hb hbVar = (jn0.hb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hbVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hbVar.a);
        fVar.z0("locked");
        jo.f4.C(hbVar.b, aa.c.f, fVar, wVar, "author");
        aa.c.b(aa.c.c(m7.a, true)).b(fVar, wVar, hbVar.c);
        fVar.z0("repository");
        aa.c.c(s7.a, false).b(fVar, wVar, hbVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hbVar.e);
    }
}
