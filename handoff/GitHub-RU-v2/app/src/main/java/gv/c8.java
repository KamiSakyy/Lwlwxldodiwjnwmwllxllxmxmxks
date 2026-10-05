package gv;

import java.util.Iterator;
import java.util.List;
import m10.fz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c8 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "position", "startLine", "line", "pullRequestReview", "thread", "path", "state", "url"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r13 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return new gv.y7(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
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
        r14 = ar.e.c(r19, r20);
        r19.s0();
        r3 = pv.f.a;
        r15 = pv.f.c(r19, r20);
        r19.s0();
        r16 = mx.d.c(r19, r20);
        r19.s0();
        r17 = pu.b.c(r19, r20);
        r19.s0();
        r3 = ju.d.a;
        r18 = ju.d.c(r19, r20);
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
    public static y7 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        v7 v7Var = null;
        x7 x7Var = null;
        String str3 = null;
        fz fzVar = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = tp.a.a;
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
                    v7Var = (v7) aa.c.b(aa.c.c(a8.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    x7Var = (x7) aa.c.b(aa.c.c(d8.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 8:
                    String u = eVar.u();
                    k71.k.d(u);
                    fz.Companion.getClass();
                    Iterator it = fz.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fz) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fz fzVar2 = (fz) obj;
                    if (fzVar2 != null) {
                        fzVar = fzVar2;
                        break;
                    } else {
                        fzVar = fz.t;
                        break;
                    }
                case 9:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, y7 y7Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y7Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y7Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, y7Var.b);
        fVar.z0("position");
        nn.a aVar = tp.a.a;
        aa.c.b(aVar).b(fVar, wVar, y7Var.c);
        fVar.z0("startLine");
        aa.c.b(aVar).b(fVar, wVar, y7Var.d);
        fVar.z0("line");
        aa.c.b(aVar).b(fVar, wVar, y7Var.e);
        fVar.z0("pullRequestReview");
        aa.c.b(aa.c.c(a8.a, false)).b(fVar, wVar, y7Var.f);
        fVar.z0("thread");
        aa.c.b(aa.c.c(d8.a, true)).b(fVar, wVar, y7Var.g);
        fVar.z0("path");
        bVar.b(fVar, wVar, y7Var.h);
        fVar.z0("state");
        fVar.I(y7Var.i.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, y7Var.j);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, y7Var.k);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, y7Var.l);
        List list2 = mx.d.a;
        mx.d.d(fVar, wVar, y7Var.m);
        List list3 = pu.b.a;
        pu.b.d(fVar, wVar, y7Var.n);
        ju.d dVar = ju.d.a;
        ju.d.d(fVar, wVar, y7Var.o);
    }
}
