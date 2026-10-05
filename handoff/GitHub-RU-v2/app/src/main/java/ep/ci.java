package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ci implements aa.a {
    public static final ci a = new ci();
    public static final List b = sy.d0.o("number", "title", "author", "category", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        jo.pq pqVar = null;
        jo.qq qqVar = null;
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
                pqVar = (jo.pq) aa.c.b(aa.c.c(zh.a, true)).a(eVar, wVar);
            } else if (r0 == 3) {
                qqVar = (jo.qq) aa.c.c(ai.a, false).a(eVar, wVar);
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
        if (qqVar == null) {
            k41.b.B(eVar, "category");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new jo.tq(intValue, str, pqVar, qqVar, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.tq tqVar = (jo.tq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tqVar, "value");
        fVar.z0("number");
        fVar.z(tqVar.a);
        fVar.z0("title");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, tqVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(zh.a, true)).b(fVar, wVar, tqVar.c);
        fVar.z0("category");
        aa.c.c(ai.a, false).b(fVar, wVar, tqVar.d);
        fVar.z0("id");
        bVar.b(fVar, wVar, tqVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, tqVar.f);
    }
}
