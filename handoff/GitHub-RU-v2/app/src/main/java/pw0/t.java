package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aa.a {
    public static final t a = new t();
    public static final List b = sy.d0.o(new String[]{"id", "commit", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ow0.w wVar2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                wVar2 = (ow0.w) aa.c.c(o.a, false).a(eVar, wVar);
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
        if (wVar2 == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new ow0.c0(str, wVar2, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.c0 c0Var = (ow0.c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c0Var.a);
        fVar.z0("commit");
        aa.c.c(o.a, false).b(fVar, wVar, c0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c0Var.c);
    }
}
