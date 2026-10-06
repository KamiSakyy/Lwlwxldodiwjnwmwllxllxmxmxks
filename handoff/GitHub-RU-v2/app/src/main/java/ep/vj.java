package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vj implements aaShadow.a {
    public static final vj a = new vj();
    public static final List b = sy.d0Shadow.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ct ctVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ctVar = (jo.ct) aa.c.b(aa.c.c(xj.a, true)).a(eVar, wVar);
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
            return new jo.at(ctVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.at atVar = (jo.at) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(atVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(xj.a, true)).b(fVar, wVar, atVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, atVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, atVar.c);
    }
}
