package fd0;

import java.util.Iterator;
import java.util.List;
import kc0.n60;
import kc0.o60;
import kc0.r60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class et implements aaShadow.a {
    public static final et a = new et();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "url", "state", "bodyHtml", "milestone", "projectCards", "viewerCanReopen"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r6 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r8 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return new kc0.n60(r2, r3, r4, r5, r6, r7, r8, r9.booleanValue(), r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        k41.b.B(r14, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        k41.b.B(r14, "projectCards");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        k41.b.B(r14, "bodyHtml");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        k41.b.B(r14, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r14.s0();
        r10 = yd0.j.c(r14, r15);
        r14.s0();
        r11 = sg0.n.c(r14, r15);
        r14.s0();
        r12 = se0.e.c(r14, r15);
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r5 == null) goto L21;
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
        gn0.xc xcVar = null;
        String str4 = null;
        o60 o60Var = null;
        r60 r60Var = null;
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
                    gn0.xc.Companion.getClass();
                    Iterator it = gn0.xc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((gn0.xc) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    gn0.xc xcVar2 = (gn0.xc) obj;
                    if (xcVar2 != null) {
                        xcVar = xcVar2;
                        break;
                    } else {
                        xcVar = gn0.xc.v;
                        break;
                    }
                case 4:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    o60Var = (o60) aa.c.b(aa.c.c(ft.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    r60Var = (r60) aa.c.c(jt.a, false).a(eVar, wVar);
                    break;
                case 7:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n60 n60Var = (n60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n60Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n60Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n60Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, n60Var.c);
        fVar.z0("state");
        fVar.I(n60Var.d.r);
        fVar.z0("bodyHtml");
        bVar.b(fVar, wVar, n60Var.e);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(ft.a, true)).b(fVar, wVar, n60Var.f);
        fVar.z0("projectCards");
        aa.c.c(jt.a, false).b(fVar, wVar, n60Var.g);
        fVar.z0("viewerCanReopen");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(n60Var.h));
        List list = yd0.j.a;
        yd0.j.d(fVar, wVar, n60Var.i);
        List list2 = sg0.n.a;
        sg0.n.d(fVar, wVar, n60Var.j);
        List list3 = se0.e.a;
        se0.e.d(fVar, wVar, n60Var.k);
    }
}
