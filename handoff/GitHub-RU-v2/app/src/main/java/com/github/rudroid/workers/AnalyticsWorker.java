package com.github.rudroid.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.github.domain.database.GitHubDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import kj.c0;
import oa.j;
import oa.m;
import sy.y;
import v8.v;
import v8.w;
import w61.a0;
import w8.q;
import x61.n;
import y71.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AnalyticsWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public final wj.a g;
    public final c0 h;
    public final com.github.rudroid.common.e i;
    public final m j;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsWorker(Context context, WorkerParameters workerParameters, wj.a aVar, c0 c0Var, com.github.rudroid.common.e eVar, m mVar) {
        super(context, workerParameters);
        k.g(context, "context");
        k.g(workerParameters, "params");
        k.g(aVar, "eventDaoFactory");
        k.g(c0Var, "publishAnalyticEventsUseCase");
        k.g(eVar, "crashLogger");
        k.g(mVar, "userManager");
        this.g = aVar;
        this.h = c0Var;
        this.i = eVar;
        this.j = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ae, code lost:
    
        if (w61.a0.a == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b1, code lost:
    
        if (r1 != r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        com.github.rudroid.workers.a aVar;
        int i;
        Iterator it;
        int i2;
        wj.c cVar2;
        List list;
        char c;
        int i3;
        b bVar;
        char c2;
        List list2;
        boolean z;
        boolean z2;
        Iterator it2;
        j jVar;
        wj.c cVar3;
        int i4;
        int i5;
        List<wj.e> list3;
        if (cVar instanceof com.github.rudroid.workers.a) {
            aVar = (com.github.rudroid.workers.a) cVar;
            int i6 = aVar.C;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.C = i6 - Integer.MIN_VALUE;
                Object obj = aVar.A;
                a0 a0Var = b71.a.r;
                i = aVar.C;
                Context context = ((w) this).a;
                char c3 = 3;
                char c4 = 2;
                Object r102 = 0;
                boolean z3 = true;
                z3 = true;
                List list4 = null;
                if (i != 0) {
                    y.j(obj);
                    it = this.j.e().iterator();
                    i2 = 0;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    i5 = aVar.z;
                    i4 = aVar.y;
                    cVar3 = aVar.w;
                    jVar = aVar.v;
                    it2 = aVar.u;
                    y.j(obj);
                    list3 = (List) obj;
                    if (list3.isEmpty()) {
                    }
                } else {
                    if (i == 2) {
                        int i7 = aVar.z;
                        int i8 = aVar.y;
                        list = aVar.x;
                        cVar2 = aVar.w;
                        Iterator it3 = aVar.u;
                        y.j(obj);
                        i3 = i7;
                        i2 = i8;
                        it = it3;
                        c = 2;
                        bVar = new b(cVar2, list);
                        aVar.u = it;
                        aVar.v = null;
                        aVar.w = null;
                        aVar.x = null;
                        aVar.y = i2;
                        aVar.z = i3;
                        c2 = 3;
                        aVar.C = 3;
                        if (((i) obj).b(bVar, aVar) != a0Var) {
                        }
                        return a0Var;
                    }
                    if (i == 3) {
                        i2 = aVar.y;
                        it = aVar.u;
                        y.j(obj);
                        c = 2;
                        c2 = 3;
                        list2 = null;
                        z = false;
                        z2 = true;
                        char c5 = c;
                        r102 = z;
                        c3 = c2;
                        c4 = c5;
                        list4 = list2;
                        z3 = z2;
                        if (!it.hasNext()) {
                        }
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = aVar.y;
                        it = aVar.u;
                        y.j(obj);
                        c2 = 3;
                        z = false;
                        c = 2;
                        z2 = true;
                        list2 = null;
                        k.f(context, "getApplicationContext(...)");
                        q Z = q.Z(context);
                        k.f(Z, "getInstance(...)");
                        Z.W("AnalyticsWorker");
                        char c52 = c;
                        r102 = z;
                        c3 = c2;
                        c4 = c52;
                        list4 = list2;
                        z3 = z2;
                        if (!it.hasNext()) {
                            jVar = (j) it.next();
                            if (jVar.f(com.github.rudroid.common.a.r)) {
                                wj.a aVar2 = this.g;
                                aVar2.getClass();
                                wj.c y = ((GitHubDatabase) aVar2.a.a(jVar)).y();
                                fi.a aVar3 = fi.b.Companion;
                                k.f(context, "getApplicationContext(...)");
                                aVar3.getClass();
                                if (fi.a.d(context)) {
                                    aVar.getClass();
                                    aVar.u = it;
                                    aVar.v = jVar;
                                    aVar.w = y;
                                    aVar.x = list4;
                                    aVar.y = i2;
                                    aVar.z = r102;
                                    aVar.C = z3 ? 1 : 0;
                                    Object M = m71.a.M(aVar, y.a, z3, (boolean) r102, new wa.g(8));
                                    if (M != a0Var) {
                                        it2 = it;
                                        cVar3 = y;
                                        obj = M;
                                        i4 = i2;
                                        i5 = r102;
                                        list3 = (List) obj;
                                        if (list3.isEmpty()) {
                                            ArrayList arrayList = new ArrayList(n.F(list3, 10));
                                            for (wj.e eVar : list3) {
                                                arrayList.add(new yz0.d(eVar.b, eVar.c, eVar.d, eVar.e, eVar.f));
                                            }
                                            j71.c dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(28, this, list3);
                                            aVar.u = it2;
                                            aVar.v = null;
                                            aVar.w = cVar3;
                                            aVar.x = list3;
                                            aVar.y = i4;
                                            aVar.z = i5;
                                            c = 2;
                                            aVar.C = 2;
                                            Object a2 = this.h.a(jVar, arrayList, dVar, aVar);
                                            if (a2 != a0Var) {
                                                int i9 = i4;
                                                i3 = i5;
                                                i2 = i9;
                                                Iterator it4 = it2;
                                                cVar2 = cVar3;
                                                it = it4;
                                                list = list3;
                                                obj = a2;
                                                bVar = new b(cVar2, list);
                                                aVar.u = it;
                                                aVar.v = null;
                                                aVar.w = null;
                                                aVar.x = null;
                                                aVar.y = i2;
                                                aVar.z = i3;
                                                c2 = 3;
                                                aVar.C = 3;
                                                if (((i) obj).b(bVar, aVar) != a0Var) {
                                                    list2 = null;
                                                    z = false;
                                                    z2 = true;
                                                    char c522 = c;
                                                    r102 = z;
                                                    c3 = c2;
                                                    c4 = c522;
                                                    list4 = list2;
                                                    z3 = z2;
                                                    if (!it.hasNext()) {
                                                        return v.a();
                                                    }
                                                }
                                            }
                                        } else {
                                            c = c4;
                                            c2 = 3;
                                            i2 = i4;
                                            z2 = z3;
                                            list2 = list4;
                                            it = it2;
                                            z = false;
                                            char c5222 = c;
                                            r102 = z;
                                            c3 = c2;
                                            c4 = c5222;
                                            list4 = list2;
                                            z3 = z2;
                                            if (!it.hasNext()) {
                                            }
                                        }
                                    }
                                } else {
                                    c = c4;
                                    c2 = c3;
                                    aVar.getClass();
                                    aVar.u = it;
                                    list2 = null;
                                    aVar.v = null;
                                    aVar.w = null;
                                    aVar.x = null;
                                    aVar.y = i2;
                                    z = false;
                                    aVar.z = 0;
                                    aVar.C = 4;
                                    z2 = true;
                                    Object M2 = m71.a.M(aVar, y.a, false, true, new wa.g(7));
                                    if (M2 != b71.a.r) {
                                    }
                                }
                                return a0Var;
                            }
                            char c6 = c4;
                            c2 = c3;
                            z = r102;
                            c = c6;
                            z2 = z3 ? 1 : 0;
                            list2 = list4;
                            char c52222 = c;
                            r102 = z;
                            c3 = c2;
                            c4 = c52222;
                            list4 = list2;
                            z3 = z2;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        aVar = new com.github.rudroid.workers.a(this, (c71.c) cVar);
        Object obj2 = aVar.A;
        a0 a0Var2 = b71.a.r;
        i = aVar.C;
        Context context2 = ((w) this).a;
        char c32 = 3;
        char c42 = 2;
        Object r1022 = 0;
        boolean z32 = true;
        z32 = true;
        List list42 = null;
        if (i != 0) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }
}
