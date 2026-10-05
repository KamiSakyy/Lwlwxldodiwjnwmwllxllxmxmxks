package uw;

import aa.o0;
import aa.w;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import m10.sa;
import m10.v90;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g implements aa.a {
    public static final List a = l.r(new String[]{"id", "description", "durationInSeconds", "stateChangedAt", "isRequired", "displayName", "state", "targetUrl", "avatarUrl", "additionalContext", "underlyingContext", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r17 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r8 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r9 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r13 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r15 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return new uw.d(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        k41.b.B(r20, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        k41.b.B(r20, "additionalContext");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        k41.b.B(r20, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        k41.b.B(r20, "displayName");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        k41.b.B(r20, "isRequired");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        k41.b.B(r20, "stateChangedAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        k41.b.B(r20, "durationInSeconds");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        k41.b.B(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r8 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r17 = r6;
        r6 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r7 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d c(ea.e eVar, w wVar) {
        Boolean bool;
        Integer valueOf;
        Object obj;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num = null;
        String str = null;
        String str2 = null;
        Boolean bool2 = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        v90 v90Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        c cVar = null;
        String str7 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    continue;
                case 2:
                    bool = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    break;
                case 3:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                    continue;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 6:
                    Integer num2 = num;
                    bool = bool2;
                    String u = eVar.u();
                    k.d(u);
                    v90.Companion.getClass();
                    Iterator it = v90.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((v90) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    v90 v90Var2 = (v90) obj;
                    v90Var = v90Var2 == null ? v90.t : v90Var2;
                    num = num2;
                    break;
                case 7:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    continue;
                case 8:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    continue;
                case 9:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 10:
                    cVar = (c) aa.c.b(aa.c.c(h.a, true)).a(eVar, wVar);
                    num = num;
                    continue;
                case 11:
                    str7 = (String) aa.c.a.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, d dVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(dVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("description");
        o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, dVar.b);
        fVar.z0("durationInSeconds");
        fVar.z(dVar.c);
        fVar.z0("stateChangedAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, dVar.d);
        fVar.z0("isRequired");
        f4.C(dVar.e, aa.c.f, fVar, wVar, "displayName");
        bVar.b(fVar, wVar, dVar.f);
        fVar.z0("state");
        fVar.I(dVar.g.r);
        fVar.z0("targetUrl");
        o0Var.b(fVar, wVar, dVar.h);
        fVar.z0("avatarUrl");
        o0Var.b(fVar, wVar, dVar.i);
        fVar.z0("additionalContext");
        bVar.b(fVar, wVar, dVar.j);
        fVar.z0("underlyingContext");
        aa.c.b(aa.c.c(h.a, true)).b(fVar, wVar, dVar.k);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, dVar.l);
    }
}
