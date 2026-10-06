package p20;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uh implements aaShadow.a {
    public static final uh a = new uh();
    public static final List b = sy.d0.o("id", "name", "tagName", "author", "isPrerelease", "isDraft", "isLatest", "createdAt", "publishedAt", "url", "__typename");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r16 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r17 = r9;
        r9 = r16.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r17 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r10 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r13 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r14 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        return new u10.wp(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        k41.b.B(r19, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        k41.b.B(r19, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        k41.b.B(r19, "isLatest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        k41.b.B(r19, "isDraft");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        k41.b.B(r19, "isPrerelease");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        k41.b.B(r19, "tagName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r4 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r16 = r8;
        r8 = r10.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        u10.rp rpVar = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        ZonedDateTime zonedDateTime = null;
        ZonedDateTime zonedDateTime2 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            int r0 = eVar.r0(b);
            aa.x xVar = hc0.h6.a;
            switch (r0) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    rpVar = (u10.rp) aa.c.b(aa.c.c(qh.a, true)).a(eVar, wVar);
                    break;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    hc0.h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    hc0.h6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 10:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wp wpVar = (u10.wp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wpVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wpVar.a);
        fVar.z0("name");
        aa.c.i.b(fVar, wVar, wpVar.b);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, wpVar.c);
        fVar.z0("author");
        aa.c.b(aa.c.c(qh.a, true)).b(fVar, wVar, wpVar.d);
        fVar.z0("isPrerelease");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(wpVar.e, bVar2, fVar, wVar, "isDraft");
        jo.f4.C(wpVar.f, bVar2, fVar, wVar, "isLatest");
        jo.f4.C(wpVar.g, bVar2, fVar, wVar, "createdAt");
        hc0.h6.Companion.getClass();
        aa.x xVar = hc0.h6.a;
        wVar.e(xVar).b(fVar, wVar, wpVar.h);
        no.a.e(fVar, "publishedAt", wVar, xVar).b(fVar, wVar, wpVar.i);
        fVar.z0("url");
        bVar.b(fVar, wVar, wpVar.j);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, wpVar.k);
    }
}
