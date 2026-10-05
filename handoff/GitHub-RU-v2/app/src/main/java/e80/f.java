package e80;

import aa.w;
import aa.x;
import hc0.h6;
import hc0.vl;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "submittedAt", "authorCanPushToRepository", "url", "state", "comments", "createdAt", "pullRequest"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r7 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r9 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return new e80.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        k41.b.B(r14, "pullRequest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        k41.b.B(r14, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        k41.b.B(r14, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        k41.b.B(r14, "authorCanPushToRepository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r14.s0();
        r11 = c40.e.c(r14, r15);
        r14.s0();
        r5 = i80.e.a;
        r12 = i80.e.c(r14, r15);
        r14.s0();
        r13 = g70.b.c(r14, r15);
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        r5 = r5.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(ea.e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        ZonedDateTime zonedDateTime = null;
        String str3 = null;
        vl vlVar = null;
        a aVar = null;
        ZonedDateTime zonedDateTime2 = null;
        b bVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            x xVar = h6.a;
            switch (r0) {
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
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    vl.Companion.getClass();
                    Iterator it = vl.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((vl) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    vl vlVar2 = (vl) obj;
                    if (vlVar2 != null) {
                        vlVar = vlVar2;
                        break;
                    } else {
                        vlVar = vl.t;
                        break;
                    }
                case 6:
                    bool = bool2;
                    aVar = (a) aa.c.c(d.a, false).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    h6.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    bVar = (b) aa.c.c(e.a, false).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("submittedAt");
        h6.Companion.getClass();
        x xVar = h6.a;
        aa.c.b(wVar.e(xVar)).b(fVar, wVar, cVar.c);
        fVar.z0("authorCanPushToRepository");
        f4.C(cVar.d, aa.c.f, fVar, wVar, "url");
        bVar.b(fVar, wVar, cVar.e);
        fVar.z0("state");
        fVar.I(cVar.f.r);
        fVar.z0("comments");
        aa.c.c(d.a, false).b(fVar, wVar, cVar.g);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, cVar.h);
        fVar.z0("pullRequest");
        aa.c.c(e.a, false).b(fVar, wVar, cVar.i);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, cVar.j);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, cVar.k);
        List list2 = g70.b.a;
        g70.b.d(fVar, wVar, cVar.l);
    }
}
