package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t7 implements aaShadow.a {
    public static final t7 a = new t7();
    public static final List b = sy.d0.o("__typename", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.pb pbVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                pbVar = (u10.pb) aa.c.c(s7.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        e80.c c = e80.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (pbVar == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new u10.qb(str, pbVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.qb qbVar = (u10.qb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qbVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qbVar.a);
        fVar.z0("pullRequest");
        aa.c.c(s7.a, true).b(fVar, wVar, qbVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, qbVar.c);
        List list = e80.f.a;
        e80.f.d(fVar, wVar, qbVar.d);
    }
}
