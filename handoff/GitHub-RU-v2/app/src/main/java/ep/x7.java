package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x7 implements aaShadow.a {
    public static final x7 a = new x7();
    public static final List b = sy.d0.o("id", "replyTo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.yb ybVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ybVar = (jo.yb) aa.c.b(aa.c.c(a8.a, false)).a(eVar, wVar);
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
            return new jo.ub(str, ybVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ub ubVar = (jo.ub) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ubVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ubVar.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(a8.a, false)).b(fVar, wVar, ubVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ubVar.c);
    }
}
