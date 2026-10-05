package eo0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0.o(new String[]{"__typename", "pullRequestReview", "subjectType", "position", "thread", "path", "state", "url", "id"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r11 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        if (r12 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        return new jn0.d1(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        k41.b.B(r18, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        k41.b.B(r18, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        k41.b.B(r18, "subjectType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        r18.s0();
        r3 = gu0.f.a;
        r13 = gu0.f.c(r18, r19);
        r18.s0();
        r14 = yp0.e.c(r18, r19);
        r18.s0();
        r15 = bw0.d.c(r18, r19);
        r18.s0();
        r3 = at0.d.a;
        r16 = at0.d.c(r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r9 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r10 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.n1 n1Var = null;
        pz0.cu cuVar = null;
        Integer num = null;
        jn0.p1 p1Var = null;
        String str2 = null;
        pz0.kt ktVar = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    n1Var = (jn0.n1) aa.c.b(aa.c.c(u0.a, false)).a(eVar, wVar);
                    break;
                case 2:
                    String u = eVar.u();
                    k71.k.d(u);
                    pz0.cu.Companion.getClass();
                    Iterator it = pz0.cu.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pz0.cu) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pz0.cu cuVar2 = (pz0.cu) obj;
                    if (cuVar2 != null) {
                        cuVar = cuVar2;
                        break;
                    } else {
                        cuVar = pz0.cu.v;
                        break;
                    }
                case 3:
                    num = (Integer) aa.c.b(ro0.a.a).a(eVar, wVar);
                    break;
                case 4:
                    p1Var = (jn0.p1) aa.c.b(aa.c.c(w0.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    pz0.kt.Companion.getClass();
                    Iterator it2 = pz0.kt.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((pz0.kt) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    pz0.kt ktVar2 = (pz0.kt) obj2;
                    if (ktVar2 != null) {
                        ktVar = ktVar2;
                        break;
                    } else {
                        ktVar = pz0.kt.t;
                        break;
                    }
                case 7:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 8:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.d1 d1Var = (jn0.d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d1Var.a);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(u0.a, false)).b(fVar, wVar, d1Var.b);
        fVar.z0("subjectType");
        fVar.I(d1Var.c.r);
        fVar.z0("position");
        aa.c.b(ro0.a.a).b(fVar, wVar, d1Var.d);
        fVar.z0("thread");
        aa.c.b(aa.c.c(w0.a, true)).b(fVar, wVar, d1Var.e);
        fVar.z0("path");
        bVar.b(fVar, wVar, d1Var.f);
        fVar.z0("state");
        fVar.I(d1Var.g.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, d1Var.h);
        fVar.z0("id");
        bVar.b(fVar, wVar, d1Var.i);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, d1Var.j);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, d1Var.k);
        List list2 = bw0.d.a;
        bw0.d.d(fVar, wVar, d1Var.l);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, d1Var.m);
    }
}
