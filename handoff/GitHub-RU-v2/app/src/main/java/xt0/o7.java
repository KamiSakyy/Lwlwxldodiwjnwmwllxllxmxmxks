package xt0;

import java.util.Iterator;
import java.util.List;
import pz0.kt;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "position", "startLine", "line", "pullRequestReview", "thread", "path", "state", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r13 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return new xt0.k7(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        k41.b.B(r19, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        k41.b.B(r19, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        k41.b.B(r19, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        k41.b.B(r19, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        k41.b.B(r19, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r19.s0();
        r14 = yp0.e.c(r19, r20);
        r19.s0();
        r3 = gu0.f.a;
        r15 = gu0.f.c(r19, r20);
        r19.s0();
        r16 = bw0.d.c(r19, r20);
        r19.s0();
        r17 = gt0.b.c(r19, r20);
        r19.s0();
        r3 = at0.d.a;
        r18 = at0.d.c(r19, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r12 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k7 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        h7 h7Var = null;
        j7 j7Var = null;
        String str3 = null;
        kt ktVar = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = ro0.a.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    num = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 3:
                    num2 = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 4:
                    num3 = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 5:
                    h7Var = (h7) aa.c.b(aa.c.c(m7.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    j7Var = (j7) aa.c.b(aa.c.c(p7.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 8:
                    String u = eVar.u();
                    k71.k.d(u);
                    kt.Companion.getClass();
                    Iterator it = kt.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((kt) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    kt ktVar2 = (kt) obj;
                    if (ktVar2 != null) {
                        ktVar = ktVar2;
                        break;
                    } else {
                        ktVar = kt.t;
                        break;
                    }
                case 9:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, k7 k7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k7Var.b);
        fVar.z0("position");
        nn.a aVar = ro0.a.a;
        aa.c.b(aVar).b(fVar, wVar, k7Var.c);
        fVar.z0("startLine");
        aa.c.b(aVar).b(fVar, wVar, k7Var.d);
        fVar.z0("line");
        aa.c.b(aVar).b(fVar, wVar, k7Var.e);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(m7.a, false)).b(fVar, wVar, k7Var.f);
        fVar.z0("thread");
        aa.c.b(aa.c.c(p7.a, true)).b(fVar, wVar, k7Var.g);
        fVar.z0("path");
        bVar.b(fVar, wVar, k7Var.h);
        fVar.z0("state");
        fVar.I(k7Var.i.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, k7Var.j);
        List list = yp0.e.a;
        yp0.e.d(fVar, wVar, k7Var.k);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, k7Var.l);
        List list2 = bw0.d.a;
        bw0.d.d(fVar, wVar, k7Var.m);
        List list3 = gt0.b.a;
        gt0.b.d(fVar, wVar, k7Var.n);
        at0.d dVar = at0.d.a;
        at0.d.d(fVar, wVar, k7Var.o);
    }
}
