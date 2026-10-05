package com.github.rudroid.issueorpullrequest.triagesheet;

import com.github.rudroid.issueorpullrequest.triagesheet.b;
import com.github.service.models.response.issueorpullrequest.IssueType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sy.d0;
import w61.a0;
import yz0.i2;
import yz0.m2;
import yz0.o2;
import yz0.v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class r<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f16677r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f16678s;

    public r(y71.j jVar, t tVar) {
        this.f16677r = jVar;
        this.f16678s = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.rudroid.issueorpullrequest.triagesheet.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q qVar;
        int i;
        int i10;
        ?? arrayList;
        ArrayList a10;
        ?? arrayList2;
        List list;
        t tVar = this.f16678s;
        com.github.rudroid.activities.util.c cVar2 = tVar.f16681t;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.f16675v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f16675v = i11 - Integer.MIN_VALUE;
                Object obj2 = qVar.f16674u;
                b71.a aVar = b71.a.r;
                i = qVar.f16675v;
                if (i != 0) {
                    sy.y.j(obj2);
                    i2 i2Var = (i2) obj;
                    x61.r rVar = x61.r.r;
                    if (i2Var != null) {
                        ?? r22 = tVar.f16682u;
                        boolean f6 = cVar2.d().f(com.github.rudroid.common.a.D);
                        boolean f10 = cVar2.d().f(com.github.rudroid.common.a.P);
                        boolean f11 = cVar2.d().f(com.github.rudroid.common.a.S);
                        r22.getClass();
                        ?? r10 = i2Var.A;
                        boolean z10 = i2Var.g;
                        ArrayList arrayList3 = new ArrayList();
                        boolean z11 = i2Var.M;
                        ?? r14 = i2Var.x;
                        b.i iVar = new b.i(2131954781, z11, p.f16514r);
                        if (r14.isEmpty()) {
                            arrayList = d0.n(new b.h(2131954848));
                        } else {
                            arrayList = new ArrayList(x61.n.F((Iterable) r14, 10));
                            Iterator it = r14.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new b.g((yz0.f) it.next()));
                            }
                        }
                        arrayList3.addAll(x61.m.l0(x61.m.l0(d0.n(iVar), (Iterable) arrayList), d0.n(new b.l(2131954781))));
                        boolean z12 = i2Var.N;
                        ?? r72 = i2Var.y;
                        arrayList3.addAll(x61.m.l0(x61.m.l0(d0.n(new b.i(2131954789, z12, p.f16515s)), r72.isEmpty() ? d0.n(new b.h(2131954850)) : d0.n(new b.j(r72))), d0.n(new b.l(2131954789))));
                        if (i2Var.r0) {
                            IssueType issueType = i2Var.q0;
                            arrayList3.addAll(x61.m.l0(x61.m.l0(d0.n(new b.i(2131954788, z10, p.f16520x)), issueType == null ? d0.n(new b.h(2131954849)) : d0.n(new b.C0045b(issueType))), d0.n(new b.l(2131954788))));
                        }
                        if (f6 || !f10) {
                            a10 = (!f6 || f10) ? r22.a(r10, z10) : r22.a(r10, z10);
                        } else {
                            ?? r23 = i2Var.z;
                            b.i iVar2 = new b.i(2131954875, z10, p.f16516t);
                            if (r23.isEmpty()) {
                                list = d0.n(new b.h(2131954854));
                            } else {
                                ArrayList arrayList4 = new ArrayList(x61.n.F((Iterable) r23, 10));
                                Iterator it2 = r23.iterator();
                                while (it2.hasNext()) {
                                    arrayList4.add(new b.c((xz0.f) it2.next()));
                                }
                                list = arrayList4;
                            }
                            a10 = x61.m.l0(x61.m.l0(d0.n(iVar2), list), d0.n(new b.l(2131954875)));
                        }
                        if (!f6) {
                            arrayList3.addAll(a10);
                        }
                        v2 v2Var = i2Var.w;
                        arrayList3.addAll(x61.m.l0(x61.m.l0(d0.n(new b.i(2131954847, z10, p.f16518v)), v2Var == null ? d0.n(new b.h(2131954852)) : d0.n(new b.d(v2Var))), d0.n(new b.l(2131954847))));
                        boolean z13 = i2Var.F;
                        ?? r73 = i2Var.K;
                        b.i iVar3 = new b.i(r73.isEmpty() ? 2131954792 : x61.m.U((List) r73) instanceof m2 ? 2131954790 : 2131954793, z13, p.f16519w);
                        if (r73.isEmpty()) {
                            arrayList2 = d0.n(new b.h(2131954851));
                        } else {
                            arrayList2 = new ArrayList(x61.n.F((Iterable) r73, 10));
                            Iterator it3 = r73.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(new b.k((o2) it3.next()));
                            }
                        }
                        arrayList3.addAll(x61.m.m0(x61.m.l0(d0.n(iVar3), (Iterable) arrayList2), new b.l(2131954792)));
                        if (f6) {
                            arrayList3.addAll(a10);
                        }
                        if (!i2Var.a0) {
                            h01.j jVar = i2Var.s0;
                            if (f11) {
                                rVar = x61.m.l0(x61.m.l0(d0.n(new b.i(2131954857, z10, p.f16521y)), jVar != null ? d0.n(new b.e(jVar)) : d0.n(new b.h(2131954853))), d0.n(new b.l(2131954857)));
                            }
                            arrayList3.addAll(rVar);
                        }
                        rVar = x61.m.F0(arrayList3);
                        i10 = 1;
                    } else {
                        i10 = 1;
                    }
                    qVar.f16675v = i10;
                    if (this.f16677r.c(rVar, qVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return a0.a;
            }
        }
        qVar = new q(this, cVar);
        Object obj22 = qVar.f16674u;
        b71.a aVar2 = b71.a.r;
        i = qVar.f16675v;
        if (i != 0) {
        }
        return a0.a;
    }
}
