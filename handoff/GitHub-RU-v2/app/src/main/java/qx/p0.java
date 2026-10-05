package qx;

import java.time.ZonedDateTime;
import java.util.List;
import jo.f4;
import m10.sa;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "emojiHTML", "indicatesLimitedAvailability", "message", "emoji", "expiresAt", "organization", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return new qx.n0(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        k41.b.B(r10, "indicatesLimitedAvailability");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r4 = r4.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r9 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ZonedDateTime zonedDateTime = null;
        m0 m0Var = null;
        String str5 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    m0Var = (m0) aa.c.b(aa.c.c(o0.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, n0 n0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n0Var.a);
        fVar.z0("emojiHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, n0Var.b);
        fVar.z0("indicatesLimitedAvailability");
        f4.C(n0Var.c, aa.c.f, fVar, wVar, "message");
        o0Var.b(fVar, wVar, n0Var.d);
        fVar.z0("emoji");
        o0Var.b(fVar, wVar, n0Var.e);
        fVar.z0("expiresAt");
        sa.Companion.getClass();
        aa.c.b(wVar.e(sa.a)).b(fVar, wVar, n0Var.f);
        fVar.z0("organization");
        aa.c.b(aa.c.c(o0.a, true)).b(fVar, wVar, n0Var.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n0Var.h);
    }
}
