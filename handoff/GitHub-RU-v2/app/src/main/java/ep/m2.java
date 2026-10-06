package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 implements aaShadow.a {
    public static final m2 a = new m2();
    public static final List b = sy.d0Shadow.o("mobileCapabilities", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.i)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
        if (str2 != null) {
            return new jo.d4(str, str2, list);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d4 d4Var = (jo.d4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d4Var, "value");
        fVar.z0("mobileCapabilities");
        aa.c.b(aa.c.a(aa.c.i)).b(fVar, wVar, d4Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d4Var.c);
    }
}
