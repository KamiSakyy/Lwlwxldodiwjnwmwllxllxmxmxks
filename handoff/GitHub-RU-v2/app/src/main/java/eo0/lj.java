package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lj implements aaShadow.a {
    public static final lj a = new lj();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "size", "url", "contentType", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Integer num;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                num = num2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                num = num2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num2 = Integer.valueOf((int) nextLong);
                } else {
                    num2 = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 3) {
                num = num2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 4) {
                num = num2;
                str4 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                num = num2;
                str5 = (String) aa.c.a.a(eVar, wVar);
            }
            num2 = num;
        }
        Integer num3 = num2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (num3 == null) {
            k41.b.B(eVar, "size");
            throw null;
        }
        int intValue = num3.intValue();
        if (str3 == null) {
            k41.b.B(eVar, "url");
            throw null;
        }
        if (str4 == null) {
            k41.b.B(eVar, "contentType");
            throw null;
        }
        if (str5 != null) {
            return new jn0.hs(intValue, str, str2, str3, str4, str5);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.hs hsVar = (jn0.hs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hsVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hsVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, hsVar.b);
        fVar.z0("size");
        fVar.z(hsVar.c);
        fVar.z0("url");
        bVar.b(fVar, wVar, hsVar.d);
        fVar.z0("contentType");
        bVar.b(fVar, wVar, hsVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hsVar.f);
    }
}
