package eo0;

import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class mj implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "oid", "abbreviatedOid", "signature", "message", "messageBodyHTML", "authoredDate"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return new jn0.is(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        k41.b.B(r9, "authoredDate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        k41.b.B(r9, "messageBodyHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        k41.b.B(r9, "message");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        k41.b.B(r9, "abbreviatedOid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        k41.b.B(r9, "oid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        k41.b.B(r9, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jn0.is c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        jn0.qs qsVar = null;
        String str4 = null;
        String str5 = null;
        ZonedDateTime zonedDateTime = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    qsVar = (jn0.qs) aa.c.b(aa.c.c(uj.a, false)).a(eVar, wVar);
                    break;
                case 4:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    pz0.o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(pz0.o7.a).a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.is isVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(isVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, isVar.a);
        fVar.z0("oid");
        bVar.b(fVar, wVar, isVar.b);
        fVar.z0("abbreviatedOid");
        bVar.b(fVar, wVar, isVar.c);
        fVar.z0("signature");
        aa.c.b(aa.c.c(uj.a, false)).b(fVar, wVar, isVar.d);
        fVar.z0("message");
        bVar.b(fVar, wVar, isVar.e);
        fVar.z0("messageBodyHTML");
        bVar.b(fVar, wVar, isVar.f);
        fVar.z0("authoredDate");
        pz0.o7.Companion.getClass();
        wVar.e(pz0.o7.a).b(fVar, wVar, isVar.g);
    }
}
