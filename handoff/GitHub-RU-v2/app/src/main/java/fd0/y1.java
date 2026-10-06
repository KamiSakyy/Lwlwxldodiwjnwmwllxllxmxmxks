package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 implements aaShadow.a {
    public static final y1 a = new y1();
    public static final List b = sy.d0.o(new String[]{"id", "title", "body", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "body");
            throw null;
        }
        if (str4 != null) {
            return new kc0.j3(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j3 j3Var = (kc0.j3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j3Var.a);
        fVar.z0("title");
        bVar.b(fVar, wVar, j3Var.b);
        fVar.z0("body");
        bVar.b(fVar, wVar, j3Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j3Var.d);
    }
}
