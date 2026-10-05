package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bm implements aa.a {
    public static final bm a = new bm();
    public static final List b = sy.d0.o(new String[]{"author", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.qv qvVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qvVar = (kc0.qv) aa.c.b(aa.c.c(wl.a, true)).a(eVar, wVar);
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
            return new kc0.wv(qvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.wv wvVar = (kc0.wv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wvVar, "value");
        fVar.z0("author");
        aa.c.b(aa.c.c(wl.a, true)).b(fVar, wVar, wvVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wvVar.c);
    }
}
