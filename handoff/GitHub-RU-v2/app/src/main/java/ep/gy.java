package ep;

import java.util.Iterator;
import java.util.List;
import jo.id0;
import jo.jd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gy implements aa.a {
    public static final gy a = new gy();
    public static final List b = sy.d0.o("__typename", "id", "url", "state", "bodyHtml", "milestone", "viewerCanReopen");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r6 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return new jo.id0(r2, r3, r4, r5, r6, r7, r8.booleanValue(), r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        k41.b.B(r13, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        k41.b.B(r13, "bodyHtml");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        k41.b.B(r13, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        k41.b.B(r13, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r13.s0();
        r9 = gq.k.c(r13, r14);
        r13.s0();
        r10 = lt.n.c(r13, r14);
        r13.s0();
        r11 = ar.e.c(r13, r14);
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r5 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        m10.wi wiVar = null;
        String str4 = null;
        jd0 jd0Var = null;
        while (true) {
            switch (eVar.r0(b)) {
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
                    String u = eVar.u();
                    k71.k.d(u);
                    m10.wi.Companion.getClass();
                    Iterator it = m10.wi.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.wi) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.wi wiVar2 = (m10.wi) obj;
                    if (wiVar2 != null) {
                        wiVar = wiVar2;
                        break;
                    } else {
                        wiVar = m10.wi.v;
                        break;
                    }
                case 4:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    jd0Var = (jd0) aa.c.b(aa.c.c(hy.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        id0 id0Var = (id0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(id0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, id0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, id0Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, id0Var.c);
        fVar.z0("state");
        fVar.I(id0Var.d.r);
        fVar.z0("bodyHtml");
        bVar.b(fVar, wVar, id0Var.e);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(hy.a, true)).b(fVar, wVar, id0Var.f);
        fVar.z0("viewerCanReopen");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(id0Var.g));
        List list = gq.k.a;
        gq.k.d(fVar, wVar, id0Var.h);
        List list2 = lt.n.a;
        lt.n.d(fVar, wVar, id0Var.i);
        List list3 = ar.e.a;
        ar.e.d(fVar, wVar, id0Var.j);
    }
}
