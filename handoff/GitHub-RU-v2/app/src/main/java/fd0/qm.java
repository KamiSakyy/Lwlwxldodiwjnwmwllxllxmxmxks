package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qm implements aa.a {
    public static final qm a = new qm();
    public static final List b = sy.d0.o(new String[]{"id", "labels", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.qw qwVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                qwVar = (kc0.qw) aa.c.b(aa.c.c(nm.a, false)).a(eVar, wVar);
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
            return new kc0.tw(str, qwVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tw twVar = (kc0.tw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(twVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, twVar.a);
        fVar.z0("labels");
        aa.c.b(aa.c.c(nm.a, false)).b(fVar, wVar, twVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, twVar.c);
    }
}
