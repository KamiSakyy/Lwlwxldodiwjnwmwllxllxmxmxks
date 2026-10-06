package px0;

import java.util.List;
import jo.f4Shadow;
import ox0.e1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        et0.a c = et0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new e1(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e1 e1Var = (e1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, e1Var.b);
        List list = et0.b.a;
        et0.a aVar = e1Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aVar.a);
        fVar.z0("name");
        bVar2.b(fVar, wVar, aVar.b);
        fVar.z0("unreadCount");
        fVar.z(aVar.c);
        fVar.z0("queryString");
        bVar2.b(fVar, wVar, aVar.d);
        fVar.z0("isDefaultFilter");
        f4Shadow.C(aVar.e, aa.c.f, fVar, wVar, "__typename");
        bVar2.b(fVar, wVar, aVar.f);
    }
}
