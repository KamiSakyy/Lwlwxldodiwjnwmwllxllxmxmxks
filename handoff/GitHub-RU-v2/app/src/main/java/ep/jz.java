package ep;

import java.util.Iterator;
import java.util.List;
import jo.we0;
import jo.xe0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jz implements aaShadow.a {
    public static final jz a = new jz();
    public static final List b = sy.d0Shadow.o("__typename", "id", "url", "state", "milestone", "viewerCanDeleteHeadRef", "viewerCanReopen");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r12 = r7;
        r7 = r8.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r12 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return new jo.xe0(r2, r3, r4, r5, r6, r7, r12.booleanValue(), r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        k41.b.B(r14, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        k41.b.B(r14, "viewerCanDeleteHeadRef");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r14.s0();
        r9 = gq.k.c(r14, r15);
        r14.s0();
        r10 = lt.n.c(r14, r15);
        r14.s0();
        r11 = ar.e.c(r14, r15);
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r5 == null) goto L19;
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
        m10.b00 b00Var = null;
        we0 we0Var = null;
        Boolean bool3 = null;
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
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    String u = eVar.u();
                    k71.k.d(u);
                    m10.b00.Companion.getClass();
                    Iterator it = m10.b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.b00 b00Var2 = (m10.b00) obj;
                    b00Var = b00Var2 == null ? m10.b00.v : b00Var2;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
                case 4:
                    bool = bool2;
                    we0Var = (we0) aa.c.b(aa.c.c(iz.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 6:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xe0 xe0Var = (xe0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xe0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xe0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xe0Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, xe0Var.c);
        fVar.z0("state");
        fVar.I(xe0Var.d.r);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(iz.a, true)).b(fVar, wVar, xe0Var.e);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(xe0Var.f, bVar2, fVar, wVar, "viewerCanReopen");
        bVar2.b(fVar, wVar, Boolean.valueOf(xe0Var.g));
        List list = gq.k.a;
        gq.k.d(fVar, wVar, xe0Var.h);
        List list2 = lt.n.a;
        lt.n.d(fVar, wVar, xe0Var.i);
        List list3 = ar.e.a;
        ar.e.d(fVar, wVar, xe0Var.j);
    }
}
