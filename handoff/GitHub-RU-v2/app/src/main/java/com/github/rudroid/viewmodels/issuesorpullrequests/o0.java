package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.viewmodels.i7;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class o0<T> implements y71.j {
    public final /* synthetic */ l r;
    public final /* synthetic */ boolean s;

    public o0(l lVar, boolean z) {
        this.r = lVar;
        this.s = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object value;
        List list;
        PullRequestMergeMethod pullRequestMergeMethod;
        PullRequestMergeMethod pullRequestMergeMethod2;
        String str;
        List list2;
        yz0.s2 s2Var;
        yz0.z1 z1Var;
        yz0.i2 i2Var = (yz0.i2) obj;
        h01.q qVar = i2Var.v;
        i7.a aVar = new i7.a(qVar.e, qVar.d);
        l lVar = this.r;
        lVar.p0 = aVar;
        lVar.q0 = new i7.a(qVar.g, qVar.f);
        y71.y1 y1Var = lVar.j0;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        com.github.rudroid.utilities.ui.t1 t1Var = new com.github.rudroid.utilities.ui.t1(i2Var);
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
        String str2 = i2Var.h;
        k71.k.g(str2, "value");
        lVar.T.c(str2, "EXTRA_ID");
        y71.y1 y1Var2 = lVar.g0;
        boolean z = i2Var.a0;
        if (z && !lVar.e0.d().f(com.github.rudroid.common.a.U)) {
            do {
                value = y1Var2.getValue();
                a6 a6Var = (a6) value;
                h01.h hVar = i2Var.c0;
                List list3 = hVar != null ? hVar.b : null;
                List list4 = x61.r.r;
                list = list3 == null ? list4 : list3;
                PullRequestMergeMethod pullRequestMergeMethod3 = a6Var.b;
                pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                pullRequestMergeMethod2 = (pullRequestMergeMethod3 == pullRequestMergeMethod && (hVar == null || (pullRequestMergeMethod3 = hVar.d) == null)) ? pullRequestMergeMethod : pullRequestMergeMethod3;
                String str3 = a6Var.c;
                if (str3 == null) {
                    if (hVar != null) {
                        str3 = hVar.e;
                    } else {
                        str = null;
                        List list5 = hVar == null ? hVar.f : null;
                        list2 = list5 != null ? list4 : list5;
                        s2Var = a6Var.f;
                        z1Var = i2Var.V;
                    }
                }
                str = str3;
                if (hVar == null) {
                }
                if (list5 != null) {
                }
                s2Var = a6Var.f;
                z1Var = i2Var.V;
            } while (!y1Var2.i(value, a6.a(list, pullRequestMergeMethod2, str, null, null, s2Var, list2, z1Var == null ? z1Var.a : 0)));
            if (((a6) y1Var2.getValue()).b != pullRequestMergeMethod) {
                v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0) null, new h0(lVar, str2, null), 3);
            }
        }
        if (((d6) lVar.m0.getValue()).h && z && str2.length() > 0) {
            v71.q1 q1Var = lVar.A0;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            lVar.A0 = v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0) null, new b1(lVar, str2, null), 3);
        }
        if (!i2Var.r) {
            v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0) null, new v0(lVar, str2, null), 3);
        }
        if (this.s && lVar.q0.a) {
            lVar.D();
        }
        String f0 = lVar.f0();
        String e0 = lVar.e0();
        int c0 = lVar.c0();
        String d0 = lVar.d0();
        boolean z2 = i2Var.a0;
        v71.q1 q1Var2 = lVar.z0;
        if (q1Var2 == null || !q1Var2.f()) {
            lVar.z0 = v71.b0.z(androidx.lifecycle.d1.k(lVar), (a71.h) null, (v71.a0) null, new q1(lVar, z2, f0, e0, c0, d0, null), 3);
        }
        return w61.a0.a;
    }
}
