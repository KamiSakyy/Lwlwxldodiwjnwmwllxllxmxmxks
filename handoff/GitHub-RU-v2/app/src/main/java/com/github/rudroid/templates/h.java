package com.github.rudroid.templates;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.starredreposandlists.u0;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import g3.z;
import w61.a0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ IssueTemplatesBottomSheet s;

    public /* synthetic */ h(IssueTemplatesBottomSheet issueTemplatesBottomSheet, int i) {
        this.r = i;
        this.s = issueTemplatesBottomSheet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0168, code lost:
    
        if (r9 == androidx.compose.runtime.n.a) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(632413363, new h(this.s, 1), sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    IssueTemplatesBottomSheet issueTemplatesBottomSheet = this.s;
                    f1 n = androidx.compose.runtime.t.n(issueTemplatesBottomSheet.I4().v, sVar2);
                    w1.r b = a2.i.b(w1.o.a, ih.d.e(sVar2).g);
                    long j = ih.d.b(sVar2).d;
                    long j2 = ih.d.b(sVar2).d;
                    boolean h = sVar2.h(issueTemplatesBottomSheet);
                    Object N = sVar2.N();
                    if (!h) {
                        obj3 = N;
                        break;
                    }
                    com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j jVar = new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(20, issueTemplatesBottomSheet);
                    sVar2.n0(jVar);
                    obj3 = jVar;
                    rg.g.a(b, 0.0f, (j71.a) obj3, j, j2, 0L, null, null, r1.i.d(-1002563577, new h(issueTemplatesBottomSheet, 2), sVar2), r1.i.d(1297598358, new com.github.rudroid.settings.codeoptions.g(4, n, issueTemplatesBottomSheet), sVar2), sVar2, 905969664, 226);
                } else {
                    sVar2.V();
                }
                break;
            default:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object N2 = sVar3.N();
                    if (N2 == androidx.compose.runtime.n.a) {
                        N2 = new u0(2);
                        sVar3.n0(N2);
                    }
                    w1.r b2 = d3.q.b(w1.o.a, true, (j71.c) N2);
                    e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar3, 0);
                    int hashCode = Long.hashCode(sVar3.T);
                    v1 l = sVar3.l();
                    w1.r c = w1.a.c(sVar3, b2);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar3.g0();
                    if (sVar3.S) {
                        sVar3.k(fVar);
                    } else {
                        sVar3.q0();
                    }
                    androidx.compose.runtime.t.I(sVar3, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar3, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar3, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar3, v2.g.h);
                    androidx.compose.runtime.t.I(sVar3, v2.g.d, c);
                    IssueTemplatesBottomSheet issueTemplatesBottomSheet2 = this.s;
                    ub.b(i4.q0(2131954768, new Object[]{issueTemplatesBottomSheet2.I4().x, issueTemplatesBottomSheet2.I4().w}, sVar3), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).A, sVar3, 0, 0, 131070);
                    ub.b(i4.p0(2131952352, sVar3), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar3).a, 0L, t1.C(22), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777213), sVar3, 0, 0, 131070);
                    sVar3.q(true);
                } else {
                    sVar3.V();
                }
                break;
        }
        return a0.a;
    }
}
