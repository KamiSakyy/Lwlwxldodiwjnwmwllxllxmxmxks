package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wc implements aaShadow.a {
    public static final wc a = new wc();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "replyTo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jn0.dj djVar = null;
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
                djVar = (jn0.dj) aa.c.b(aa.c.c(bd.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        er0.i c = er0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.xi(str, str2, djVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xi xiVar = (jn0.xi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xiVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xiVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xiVar.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(bd.a, false)).b(fVar, wVar, xiVar.c);
        List list = er0.l.a;
        er0.l.d(fVar, wVar, xiVar.d);
    }
}
