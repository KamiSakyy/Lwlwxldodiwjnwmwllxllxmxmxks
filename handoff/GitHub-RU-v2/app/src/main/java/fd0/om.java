package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class om implements aaShadow.a {
    public static final om a = new om();
    public static final List b = sy.d0.o(new String[]{"id", "color", "name", "description", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 3) {
                str4 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "color");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str5 != null) {
            return new kc0.rw(str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.rw rwVar = (kc0.rw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rwVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rwVar.a);
        fVar.z0("color");
        bVar.b(fVar, wVar, rwVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, rwVar.c);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, rwVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rwVar.e);
    }
}
