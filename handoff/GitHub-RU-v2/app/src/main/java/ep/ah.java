package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ah implements aa.a {
    public static final ah a = new ah();
    public static final List b = sy.d0.o("id", "replyTo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.mp mpVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                mpVar = (jo.mp) aa.c.b(aa.c.c(fh.a, false)).a(eVar, wVar);
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
            return new jo.gp(str, mpVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.gp gpVar = (jo.gp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gpVar.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(fh.a, false)).b(fVar, wVar, gpVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gpVar.c);
    }
}
