package hp;

import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "state", "isDraft", "isInMergeQueue", "title", "titleHTMLString", "number", "repository", "url", "additions", "deletions", "__typename"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002a. Please report as an issue. */
    public static c c(ea.e eVar, aa.w wVar) {
        Integer num;
        Integer num2;
        Object obj;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        String str = null;
        b00 b00Var = null;
        Boolean bool2 = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        Integer num4 = null;
        b bVar = null;
        String str4 = null;
        Integer num5 = null;
        String str5 = null;
        while (true) {
            Boolean bool3 = bool;
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool = bool3;
                case 1:
                    Boolean bool4 = bool2;
                    Integer num6 = num3;
                    num = num4;
                    num2 = num5;
                    String u = eVar.u();
                    k71.k.d(u);
                    b00.Companion.getClass();
                    Iterator it = b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00Var = (b00) obj;
                    if (b00Var == null) {
                        b00Var = b00.v;
                    }
                    bool2 = bool4;
                    bool = bool3;
                    num3 = num6;
                    num4 = num;
                    num5 = num2;
                case 2:
                    bool = (Boolean) aa.c.f.a(eVar, wVar);
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool = bool3;
                case 4:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool = bool3;
                case 5:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    bool = bool3;
                case 6:
                    Boolean bool5 = bool2;
                    num = num4;
                    num2 = num5;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num3 = valueOf;
                    bool2 = bool5;
                    bool = bool3;
                    num4 = num;
                    num5 = num2;
                case 7:
                    bVar = (b) aa.c.c(f.a, false).a(eVar, wVar);
                    bool = bool3;
                case 8:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    bool = bool3;
                case 9:
                    Boolean bool6 = bool2;
                    Integer num7 = num3;
                    num2 = num5;
                    long nextLong2 = eVar.nextLong();
                    if (nextLong2 > 2147483647L) {
                        while (nextLong2 > 2147483647L) {
                            nextLong2 = f4.c(1, nextLong2, "substring(...)");
                        }
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    } else {
                        valueOf2 = Integer.valueOf((int) nextLong2);
                    }
                    num4 = valueOf2;
                    bool2 = bool6;
                    bool = bool3;
                    num3 = num7;
                    num5 = num2;
                case 10:
                    Boolean bool7 = bool2;
                    Integer num8 = num3;
                    Integer num9 = num4;
                    long nextLong3 = eVar.nextLong();
                    if (nextLong3 > 2147483647L) {
                        while (nextLong3 > 2147483647L) {
                            nextLong3 = f4.c(1, nextLong3, "substring(...)");
                        }
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    } else {
                        valueOf3 = Integer.valueOf((int) nextLong3);
                    }
                    num5 = valueOf3;
                    bool2 = bool7;
                    bool = bool3;
                    num3 = num8;
                    num4 = num9;
                case 11:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    bool = bool3;
            }
            if (str == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (b00Var == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (bool3 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Boolean bool8 = bool2;
            boolean booleanValue = bool3.booleanValue();
            if (bool8 == null) {
                k41.b.B(eVar, "isInMergeQueue");
                throw null;
            }
            Integer num10 = num3;
            boolean booleanValue2 = bool8.booleanValue();
            if (str2 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "titleHTMLString");
                throw null;
            }
            if (num10 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Integer num11 = num4;
            int intValue = num10.intValue();
            if (bVar == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (num11 == null) {
                k41.b.B(eVar, "additions");
                throw null;
            }
            Integer num12 = num5;
            int intValue2 = num11.intValue();
            if (num12 == null) {
                k41.b.B(eVar, "deletions");
                throw null;
            }
            int intValue3 = num12.intValue();
            if (str5 != null) {
                return new c(str, b00Var, booleanValue, booleanValue2, str2, str3, intValue, bVar, str4, intValue2, intValue3, str5);
            }
            k41.b.B(eVar, "__typename");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("state");
        fVar.I(cVar.b.r);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        f4.C(cVar.c, bVar2, fVar, wVar, "isInMergeQueue");
        f4.C(cVar.d, bVar2, fVar, wVar, "title");
        bVar.b(fVar, wVar, cVar.e);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, cVar.f);
        fVar.z0("number");
        fVar.z(cVar.g);
        fVar.z0("repository");
        aa.c.c(f.a, false).b(fVar, wVar, cVar.h);
        fVar.z0("url");
        bVar.b(fVar, wVar, cVar.i);
        fVar.z0("additions");
        fVar.z(cVar.j);
        fVar.z0("deletions");
        fVar.z(cVar.k);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cVar.l);
    }
}
