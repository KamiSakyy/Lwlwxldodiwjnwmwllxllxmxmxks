package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ve implements aaShadow.a {
    public static final ve a = new ve();
    public static final List b = sy.d0.o("number", "title", "author", "category", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        u10.bm bmVar = null;
        u10.cm cmVar = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bmVar = (u10.bm) aa.c.b(aa.c.c(se.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                cmVar = (u10.cm) aa.c.c(te.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "number");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "title");
            throw null;
        }
        if (cmVar == null) {
            k41.b.B(eVar, "category");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new u10.fm(intValue, str, bmVar, cmVar, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.fm fmVar = (u10.fm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fmVar, "value");
        fVar.z0("number");
        fVar.z(fmVar.a);
        fVar.z0("title");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fmVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(se.a, true)).b(fVar, wVar, fmVar.c);
        fVar.z0("category");
        aa.c.c(te.a, false).b(fVar, wVar, fmVar.d);
        fVar.z0("id");
        bVar.b(fVar, wVar, fmVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fmVar.f);
    }
}
