package p20;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class rf implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "path", "subjectType", "thread", "url", "state"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return new u10.gn(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        k41.b.B(r14, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        k41.b.B(r14, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r14.s0();
        r9 = c40.e.c(r14, r15);
        r14.s0();
        r1 = i80.e.a;
        r10 = i80.e.c(r14, r15);
        r14.s0();
        r11 = aa0.d.c(r14, r15);
        r14.s0();
        r12 = g70.b.c(r14, r15);
        r14.s0();
        r1 = y60.c.a;
        r13 = y60.c.c(r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r3 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r5 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u10.gn c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        hc0.bm bmVar = null;
        u10.mn mnVar = null;
        String str4 = null;
        hc0.jl jlVar = null;
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
                    String u = eVar.u();
                    k71.k.d(u);
                    hc0.bm.Companion.getClass();
                    Iterator it = hc0.bm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((hc0.bm) obj2).r.equals(u)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    hc0.bm bmVar2 = (hc0.bm) obj2;
                    if (bmVar2 != null) {
                        bmVar = bmVar2;
                        break;
                    } else {
                        bmVar = hc0.bm.v;
                        break;
                    }
                case 4:
                    mnVar = (u10.mn) aa.c.b(aa.c.c(xf.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    hc0.jl.Companion.getClass();
                    Iterator it2 = hc0.jl.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((hc0.jl) obj).r.equals(u2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hc0.jl jlVar2 = (hc0.jl) obj;
                    if (jlVar2 != null) {
                        jlVar = jlVar2;
                        break;
                    } else {
                        jlVar = hc0.jl.t;
                        break;
                    }
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u10.gn gnVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gnVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gnVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gnVar.b);
        fVar.z0("path");
        bVar.b(fVar, wVar, gnVar.c);
        fVar.z0("subjectType");
        fVar.I(gnVar.d.r);
        fVar.z0("thread");
        aa.c.b(aa.c.c(xf.a, true)).b(fVar, wVar, gnVar.e);
        fVar.z0("url");
        bVar.b(fVar, wVar, gnVar.f);
        fVar.z0("state");
        fVar.I(gnVar.g.r);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, gnVar.h);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, gnVar.i);
        List list2 = aa0.d.a;
        aa0.d.d(fVar, wVar, gnVar.j);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, gnVar.k);
        y60.c cVar = y60.c.a;
        y60.c.d(fVar, wVar, gnVar.l);
    }
}
