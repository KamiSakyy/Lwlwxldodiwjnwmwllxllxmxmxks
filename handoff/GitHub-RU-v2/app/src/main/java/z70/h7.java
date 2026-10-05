package z70;

import hc0.jl;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h7 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "position", "line", "pullRequestReview", "thread", "path", "state", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r12 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return new z70.d7(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        k41.b.B(r18, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        k41.b.B(r18, "path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        r18.s0();
        r13 = c40.e.c(r18, r19);
        r18.s0();
        r3 = i80.e.a;
        r14 = i80.e.c(r18, r19);
        r18.s0();
        r15 = aa0.d.c(r18, r19);
        r18.s0();
        r16 = g70.b.c(r18, r19);
        r18.s0();
        r3 = y60.c.a;
        r17 = y60.c.c(r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
    
        if (r10 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
    
        if (r11 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d7 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        a7 a7Var = null;
        c7 c7Var = null;
        String str3 = null;
        jl jlVar = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = y20.a.a;
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
                    a7Var = (a7) aa.c.b(aa.c.c(f7.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    c7Var = (c7) aa.c.b(aa.c.c(i7.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 7:
                    String u = eVar.u();
                    k71.k.d(u);
                    jl.Companion.getClass();
                    Iterator it = jl.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((jl) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    jl jlVar2 = (jl) obj;
                    if (jlVar2 != null) {
                        jlVar = jlVar2;
                        break;
                    } else {
                        jlVar = jl.t;
                        break;
                    }
                case 8:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, d7 d7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d7Var.b);
        fVar.z0("position");
        nn.a aVar = y20.a.a;
        aa.c.b(aVar).b(fVar, wVar, d7Var.c);
        fVar.z0("line");
        aa.c.b(aVar).b(fVar, wVar, d7Var.d);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(f7.a, false)).b(fVar, wVar, d7Var.e);
        fVar.z0("thread");
        aa.c.b(aa.c.c(i7.a, true)).b(fVar, wVar, d7Var.f);
        fVar.z0("path");
        bVar.b(fVar, wVar, d7Var.g);
        fVar.z0("state");
        fVar.I(d7Var.h.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, d7Var.i);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, d7Var.j);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, d7Var.k);
        List list2 = aa0.d.a;
        aa0.d.d(fVar, wVar, d7Var.l);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, d7Var.m);
        y60.c cVar = y60.c.a;
        y60.c.d(fVar, wVar, d7Var.n);
    }
}
