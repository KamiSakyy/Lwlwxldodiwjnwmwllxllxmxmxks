package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z7 implements aaShadow.a {
    public static final z7 a = new z7();
    public static final List b = sy.d0.o("id", "comment", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.ub ubVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ubVar = (jo.ub) aa.c.b(aa.c.c(x7.a, false)).a(eVar, wVar);
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
            return new jo.xb(str, ubVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xb xbVar = (jo.xb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xbVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xbVar.a);
        fVar.z0("comment");
        aa.c.b(aa.c.c(x7.a, false)).b(fVar, wVar, xbVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xbVar.c);
    }
}
