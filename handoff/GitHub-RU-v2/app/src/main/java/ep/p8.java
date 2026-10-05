package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p8 implements aa.a {
    public static final p8 a = new p8();
    public static final List b = sy.d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.wc wcVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wcVar = (jo.wc) aa.c.b(aa.c.c(q8.a, true)).a(eVar, wVar);
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
            return new jo.vc(wcVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vc vcVar = (jo.vc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vcVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(q8.a, true)).b(fVar, wVar, vcVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vcVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vcVar.c);
    }
}
