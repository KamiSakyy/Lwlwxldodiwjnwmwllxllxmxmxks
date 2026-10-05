package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e9 implements aa.a {
    public static final e9 a = new e9();
    public static final List b = sy.d0.o("id", "requestedByActor", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        v8 v8Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                v8Var = (v8) aa.c.b(aa.c.c(d9.a, true)).a(eVar, wVar);
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
            return new w8(str, v8Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w8 w8Var = (w8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w8Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w8Var.a);
        fVar.z0("requestedByActor");
        aa.c.b(aa.c.c(d9.a, true)).b(fVar, wVar, w8Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w8Var.c);
    }
}
