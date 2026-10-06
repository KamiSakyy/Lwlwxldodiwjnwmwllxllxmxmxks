package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w8 implements aa.a {
    public static final w8 a = new w8();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "requestedBy", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p8 p8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                p8Var = (p8) aa.c.b(aa.c.c(v8.a, false)).a(eVar, wVar);
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
            return new q8(str, p8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q8 q8Var = (q8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q8Var.a);
        fVar.z0("requestedBy");
        aa.c.b(aa.c.c(v8.a, false)).b(fVar, wVar, q8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q8Var.c);
    }
}
