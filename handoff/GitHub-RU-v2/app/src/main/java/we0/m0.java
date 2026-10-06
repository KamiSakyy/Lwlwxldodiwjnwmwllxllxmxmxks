package we0;

import gn0.pj;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o(new String[]{"linesAdded", "linesDeleted", "oldTreeEntry", "newTreeEntry", "diffLines", "isBinary", "isLargeDiff", "isSubmodule", "status", "id", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r11 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r17 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r12 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r18 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r13 = r18.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r14 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r15 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r16 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return new we0.j(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        k41.b.B(r20, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        k41.b.B(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        k41.b.B(r20, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        k41.b.B(r20, "isSubmodule");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        k41.b.B(r20, "isLargeDiff");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        k41.b.B(r20, "isBinary");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        k41.b.B(r20, "linesDeleted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        k41.b.B(r20, "linesAdded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        r17 = r6;
        r6 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if (r4 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        r18 = r7;
        r7 = r4.intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        Integer num2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        n nVar = null;
        i iVar = null;
        List list = null;
        pj pjVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            nn.a aVar = od0.b.a;
            switch (r0) {
                case 0:
                    num = (Integer) aVar.a(eVar, wVar);
                    continue;
                case 1:
                    num2 = (Integer) aVar.a(eVar, wVar);
                    continue;
                case 2:
                    bool = bool2;
                    nVar = (n) aa.c.b(aa.c.c(q0.a, false)).a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    iVar = (i) aa.c.b(aa.c.c(l0.a, false)).a(eVar, wVar);
                    break;
                case 4:
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(i0.a, true)))).a(eVar, wVar);
                    bool2 = bool2;
                    bool3 = bool3;
                    continue;
                case 5:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 6:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 8:
                    Boolean bool5 = bool2;
                    Boolean bool6 = bool3;
                    Boolean bool7 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    pj.Companion.getClass();
                    Iterator it = pj.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pj) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    pj pjVar2 = (pj) obj;
                    pjVar = pjVar2 == null ? pj.t : pjVar2;
                    bool2 = bool5;
                    bool3 = bool6;
                    bool4 = bool7;
                    continue;
                case 9:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 10:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j jVar = (j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("linesAdded");
        fVar.z(jVar.a);
        fVar.z0("linesDeleted");
        fVar.z(jVar.b);
        fVar.z0("oldTreeEntry");
        aa.c.b(aa.c.c(q0.a, false)).b(fVar, wVar, jVar.c);
        fVar.z0("newTreeEntry");
        aa.c.b(aa.c.c(l0.a, false)).b(fVar, wVar, jVar.d);
        fVar.z0("diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(i0.a, true)))).b(fVar, wVar, jVar.e);
        fVar.z0("isBinary");
        aa.b bVar = aa.c.f;
        f4.C(jVar.f, bVar, fVar, wVar, "isLargeDiff");
        f4.C(jVar.g, bVar, fVar, wVar, "isSubmodule");
        f4.C(jVar.h, bVar, fVar, wVar, "status");
        fVar.I(jVar.i.r);
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, jVar.j);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, jVar.k);
    }
    public Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
