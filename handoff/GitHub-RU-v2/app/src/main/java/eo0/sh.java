package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class sh implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "path", "subjectType", "thread", "url", "state"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return new jn0.cq(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);
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
        r9 = yp0.e.c(r14, r15);
        r14.s0();
        r1 = gu0.f.a;
        r10 = gu0.f.c(r14, r15);
        r14.s0();
        r11 = bw0.d.c(r14, r15);
        r14.s0();
        r12 = gt0.b.c(r14, r15);
        r14.s0();
        r1 = at0.d.a;
        r13 = at0.d.c(r14, r15);
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
    public static jn0.cq c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        pz0.cu cuVar = null;
        jn0.iq iqVar = null;
        String str4 = null;
        pz0.kt ktVar = null;
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
                    pz0.cu.Companion.getClass();
                    Iterator it = pz0.cu.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((pz0.cu) obj2).r.equals(u)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    pz0.cu cuVar2 = (pz0.cu) obj2;
                    if (cuVar2 != null) {
                        cuVar = cuVar2;
                        break;
                    } else {
                        cuVar = pz0.cu.v;
                        break;
                    }
                case 4:
                    iqVar = (jn0.iq) aa.c.b(aa.c.c(yh.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    pz0.kt.Companion.getClass();
                    Iterator it2 = pz0.kt.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((pz0.kt) obj).r.equals(u2)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pz0.kt ktVar2 = (pz0.kt) obj;
                    if (ktVar2 != null) {
                        ktVar = ktVar2;
                        break;
                    } else {
                        ktVar = pz0.kt.t;
                        break;
                    }
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.cq cqVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cqVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cqVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cqVar.b);
        fVar.z0("path");
        bVar.b(fVar, wVar, cqVar.c);
        fVar.z0("subjectType");
        fVar.I(cqVar.d.r);
        fVar.z0("thread");
        aa.c.b(aa.c.c(yh.a, true)).b(fVar, wVar, cqVar.e);
        fVar.z0("url");
        bVar.b(fVar, wVar, cqVar.f);
        fVar.z0("state");
        fVar.I(cqVar.g.r);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, cqVar.h);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, cqVar.i);
        List list2 = bw0.d.a;
        bw0.d.d(fVar, wVar, cqVar.j);
        List list3 = gt0.b.a;
        gt0.b.d(fVar, wVar, cqVar.k);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, cqVar.l);
    }
}
