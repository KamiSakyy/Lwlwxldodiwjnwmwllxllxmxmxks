package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e8 implements aa.a {
    public static final e8 a = new e8();
    public static final List b = sy.d0.o("id", "locked", "author", "repository", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        jo.bc bcVar = null;
        jo.ic icVar = null;
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
                bcVar = (jo.bc) aa.c.b(aa.c.c(c8.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                icVar = (jo.ic) aa.c.c(i8.a, false).a(eVar, wVar);
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
        if (icVar == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new jo.ec(str, booleanValue, bcVar, icVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ec ecVar = (jo.ec) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ecVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ecVar.a);
        fVar.z0("locked");
        jo.f4.C(ecVar.b, aa.c.f, fVar, wVar, "author");
        aa.c.b(aa.c.c(c8.a, true)).b(fVar, wVar, ecVar.c);
        fVar.z0("repository");
        aa.c.c(i8.a, false).b(fVar, wVar, ecVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ecVar.e);
    }
}
