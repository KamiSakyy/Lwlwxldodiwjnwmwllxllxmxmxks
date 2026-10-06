package tz;

import java.time.ZonedDateTime;
import java.util.List;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "title", "updatedAt", "shortDescription", "public", "number", "viewerCanUpdate", "useElasticsearch", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r12 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r15 = r9;
        r9 = r12.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r15 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r16 = r10;
        r10 = r15.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r16 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r17 = r11;
        r11 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r17 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r12 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r13 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        return new tz.u4(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        k41.b.B(r18, "useElasticsearch");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        k41.b.B(r18, "viewerCanUpdate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        k41.b.B(r18, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        k41.b.B(r18, "public");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        k41.b.B(r18, "updatedAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        k41.b.B(r18, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        r18.s0();
        r14 = tz.n.c(r18, r19);
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r7 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u4 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Integer valueOf;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        String str4 = null;
        Integer num = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str5 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 5:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 6:
                    Boolean bool5 = bool2;
                    Boolean bool6 = bool3;
                    Boolean bool7 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool2 = bool5;
                    bool3 = bool6;
                    bool4 = bool7;
                    continue;
                case 7:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u4 u4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u4Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u4Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u4Var.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, u4Var.c);
        fVar.z0("updatedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, u4Var.d);
        fVar.z0("shortDescription");
        aa.c.i.b(fVar, wVar, u4Var.e);
        fVar.z0("public");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(u4Var.f, bVar2, fVar, wVar, "number");
        fVar.z(u4Var.g);
        fVar.z0("viewerCanUpdate");
        jo.f4Shadow.C(u4Var.h, bVar2, fVar, wVar, "useElasticsearch");
        jo.f4Shadow.C(u4Var.i, bVar2, fVar, wVar, "url");
        bVar.b(fVar, wVar, u4Var.j);
        List list = n.a;
        n.d(fVar, wVar, u4Var.k);
    }
}
