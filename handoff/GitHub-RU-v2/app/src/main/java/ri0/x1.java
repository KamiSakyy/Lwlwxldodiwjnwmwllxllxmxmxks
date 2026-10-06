package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x1 implements aa.a {
    public static final x1 a = new x1();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        s1 s1Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                s1Var = (s1) aa.c.c(w1.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (s1Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new t1(str, str2, s1Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t1 t1Var = (t1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t1Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, t1Var.b);
        fVar.z0("owner");
        aa.c.c(w1.a, false).b(fVar, wVar, t1Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t1Var.d);
    }
}
