package hp;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.o7;
import m10.sa;
import m10.y7;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"taskId", "title", "state", "type", "lastUpdatedAt", "repository", "resources", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return new hp.o(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        k41.b.B(r12, "resources");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        k41.b.B(r12, "type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        k41.b.B(r12, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        k41.b.B(r12, "taskId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r8 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        o7 o7Var = null;
        y7 y7Var = null;
        ZonedDateTime zonedDateTime = null;
        m mVar = null;
        ArrayList arrayList = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    String u = eVar.u();
                    k71.k.d(u);
                    o7.Companion.getClass();
                    Iterator it = o7.D.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((o7) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    o7 o7Var2 = (o7) obj;
                    if (o7Var2 != null) {
                        o7Var = o7Var2;
                        break;
                    } else {
                        o7Var = o7.B;
                        break;
                    }
                case 3:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    y7.Companion.getClass();
                    Iterator it2 = y7.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((y7) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    y7 y7Var2 = (y7) obj2;
                    if (y7Var2 != null) {
                        y7Var = y7Var2;
                        break;
                    } else {
                        y7Var = y7.t;
                        break;
                    }
                case 4:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) no.a.h(wVar, sa.a, eVar, wVar);
                    break;
                case 5:
                    mVar = (m) aa.c.b(aa.c.c(s.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    arrayList = aa.c.a(aa.c.c(t.a, true)).c(eVar, wVar);
                    break;
                case 7:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("taskId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("title");
        aa.c.i.b(fVar, wVar, oVar.b);
        fVar.z0("state");
        fVar.I(oVar.c.r);
        fVar.z0("type");
        fVar.I(oVar.d.r);
        fVar.z0("lastUpdatedAt");
        sa.Companion.getClass();
        aa.c.b(wVar.e(sa.a)).b(fVar, wVar, oVar.e);
        fVar.z0("repository");
        aa.c.b(aa.c.c(s.a, false)).b(fVar, wVar, oVar.f);
        fVar.z0("resources");
        aa.c.a(aa.c.c(t.a, true)).e(fVar, wVar, oVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oVar.h);
    }
}
