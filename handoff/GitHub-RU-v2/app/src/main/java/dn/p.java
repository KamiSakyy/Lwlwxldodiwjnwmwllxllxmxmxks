package dn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import y71.n0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public s a;
    public oa.m b;
    public com.github.rudroid.common.k c;

    public p(s sVar, oa.m mVar, com.github.rudroid.common.k kVar) {
        k71.k.g(sVar, "fetchMobileAuthRequestUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(kVar, "featureManager");
        this.a = sVar;
        this.b = mVar;
        this.c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a2 -> B:10:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b8 -> B:11:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        l lVar;
        int i;
        Iterator it;
        Collection collection;
        int i2;
        int i3;
        int i4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i5 = lVar.C;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lVar.C = i5 - Integer.MIN_VALUE;
                Object obj = lVar.A;
                b71.a aVar = b71.a.r;
                i = lVar.C;
                a71.c cVar2 = null;
                if (i != 0) {
                    sy.y.j(obj);
                    ArrayList e = this.b.e();
                    ArrayList arrayList = new ArrayList();
                    it = e.iterator();
                    collection = arrayList;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = lVar.z;
                    i3 = lVar.y;
                    i4 = lVar.x;
                    oa.j jVar = lVar.w;
                    it = lVar.v;
                    collection = lVar.u;
                    sy.y.j(obj);
                    y71.y yVar = new y71.y(new o((y71.i) obj, jVar, 0), new cn.r(jVar, cVar2, 2));
                    if (yVar != null) {
                        collection.add(yVar);
                    }
                    if (!it.hasNext()) {
                        jVar = (oa.j) it.next();
                        if (jVar.f(com.github.rudroid.common.a.C) && this.c.c() && jVar.e() > System.currentTimeMillis()) {
                            com.github.rudroid.pushnotifications.v vVar = new com.github.rudroid.pushnotifications.v(jVar);
                            lVar.getClass();
                            lVar.u = collection;
                            lVar.v = it;
                            lVar.w = jVar;
                            lVar.x = i4;
                            lVar.y = i3;
                            lVar.z = i2;
                            lVar.C = 1;
                            obj = this.a.a(jVar, vVar, lVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                            y71.y yVar2 = new y71.y(new o((y71.i) obj, jVar, 0), new cn.r(jVar, cVar2, 2));
                            if (yVar2 != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        } else {
                            yVar2 = null;
                            if (yVar2 != null) {
                            }
                            if (!it.hasNext()) {
                                int i6 = n0.a;
                                return new y71.e((List) collection, a71.i.r, -2, x71.a.r);
                            }
                        }
                    }
                }
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.A;
        b71.a aVar2 = b71.a.r;
        i = lVar.C;
        a71.c cVar22 = null;
        if (i != 0) {
        }
    }
}
