package iy0;

import java.util.Iterator;
import java.util.List;
import pz0.ds;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "databaseId", "name", "layout", "number", "groupByFields", "sortByFields", "fields", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r10 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        return new iy0.v0(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        k41.b.B(r13, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        k41.b.B(r13, "layout");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        k41.b.B(r13, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r2 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v0 c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        String str2 = null;
        ds dsVar = null;
        q0 q0Var = null;
        u0 u0Var = null;
        p0 p0Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            nn.a aVar = ro0.a.a;
            switch (r0) {
                case 0:
                    num = num2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    num = num2;
                    num3 = (Integer) aa.c.b(aVar).a(eVar, wVar);
                    break;
                case 2:
                    num = num2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    ds.Companion.getClass();
                    Iterator it = ds.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((ds) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ds dsVar2 = (ds) obj;
                    if (dsVar2 != null) {
                        dsVar = dsVar2;
                        break;
                    } else {
                        dsVar = ds.t;
                        break;
                    }
                case 4:
                    num2 = (Integer) aVar.a(eVar, wVar);
                    continue;
                case 5:
                    num = num2;
                    q0Var = (q0) aa.c.b(aa.c.c(y0.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    num = num2;
                    u0Var = (u0) aa.c.b(aa.c.c(d1.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    num = num2;
                    p0Var = (p0) aa.c.b(aa.c.c(x0.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, v0 v0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v0Var.a);
        fVar.z0("databaseId");
        nn.a aVar = ro0.a.a;
        aa.c.b(aVar).b(fVar, wVar, v0Var.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, v0Var.c);
        fVar.z0("layout");
        fVar.I(v0Var.d.r);
        fVar.z0("number");
        f1.e.v(v0Var.e, aVar, fVar, wVar, "groupByFields");
        aa.c.b(aa.c.c(y0.a, true)).b(fVar, wVar, v0Var.f);
        fVar.z0("sortByFields");
        aa.c.b(aa.c.c(d1.a, false)).b(fVar, wVar, v0Var.g);
        fVar.z0("fields");
        aa.c.b(aa.c.c(x0.a, false)).b(fVar, wVar, v0Var.h);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, v0Var.i);
    }
}
