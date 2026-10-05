package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yn implements aa.a {
    public static final yn a = new yn();
    public static final List b = sy.d0.o(new String[]{"id", "commits", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.ky kyVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                kyVar = (jn0.ky) aa.c.c(xn.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (kyVar == null) {
            k41.b.B(eVar, "commits");
            throw null;
        }
        if (str2 != null) {
            return new jn0.my(str, kyVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.my myVar = (jn0.my) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(myVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, myVar.a);
        fVar.z0("commits");
        aa.c.c(xn.a, false).b(fVar, wVar, myVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, myVar.c);
    }
}
