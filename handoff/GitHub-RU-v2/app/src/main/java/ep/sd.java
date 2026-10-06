package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sd implements aaShadow.a {
    public static final sd a = new sd();
    public static final List b = sy.d0Shadow.o("__typename", "id", "replyTo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jo.ik ikVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                ikVar = (jo.ik) aa.c.b(aa.c.c(xd.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        ms.i c = ms.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.ck(str, str2, ikVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ck ckVar = (jo.ck) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ckVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ckVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ckVar.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(xd.a, false)).b(fVar, wVar, ckVar.c);
        List list = ms.l.a;
        ms.l.d(fVar, wVar, ckVar.d);
    }
}
