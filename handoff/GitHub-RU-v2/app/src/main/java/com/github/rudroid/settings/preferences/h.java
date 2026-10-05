package com.github.rudroid.settings.preferences;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.agents.sessionevents.ui.t1;
import com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import com.google.android.gms.internal.measurement.i4;
import d3.q;
import f1.ub;
import g3.q0;
import r3.k;
import w1.o;
import w1.r;
import w2.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ SingleChoiceBottomSheet s;

    public /* synthetic */ h(SingleChoiceBottomSheet singleChoiceBottomSheet, int i) {
        this.r = i;
        this.s = singleChoiceBottomSheet;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = ((Configuration) sVar.j(j0.a)).orientation == 2;
                    String p0 = i4.p0(2131954206, sVar);
                    SingleChoiceBottomSheet singleChoiceBottomSheet = this.s;
                    boolean h = sVar.h(singleChoiceBottomSheet) | sVar.f(p0);
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = n.a;
                    if (h || N == iVar) {
                        N = new com.github.rudroid.repositories.repositoryownerrepositories.d(8, singleChoiceBottomSheet, p0);
                        sVar.n0(N);
                    }
                    r b = q.b(o.a, false, (j71.c) N);
                    float f = ih.a.f;
                    long j = ih.d.b(sVar).d;
                    boolean h2 = sVar.h(singleChoiceBottomSheet);
                    Object N2 = sVar.N();
                    if (h2 || N2 == iVar) {
                        N2 = new j(18, singleChoiceBottomSheet);
                        sVar.n0(N2);
                    }
                    rg.g.a(b, f, (j71.a) N2, j, 0L, 0L, null, null, r1.i.d(-925775457, new h(singleChoiceBottomSheet, 1), sVar), r1.i.d(10816622, new t1(singleChoiceBottomSheet, z, 2), sVar), sVar, 905969664, 240);
                } else {
                    sVar.V();
                }
                break;
            default:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object N3 = sVar2.N();
                    if (N3 == n.a) {
                        N3 = new a0(24);
                        sVar2.n0(N3);
                    }
                    r b2 = q.b(o.a, false, (j71.c) N3);
                    q0 q0Var = ih.d.f(sVar2).C;
                    Bundle bundle = ((androidx.fragment.app.a0) this.s).x;
                    String string = bundle != null ? bundle.getString("key_sheet_title") : null;
                    if (string == null) {
                        string = "";
                    }
                    ub.b(string, b2, 0L, 0L, (k3.s) null, 0L, (k) null, 0L, 2, false, 1, 0, (j71.c) null, q0Var, sVar2, 0, 24960, 110588);
                } else {
                    sVar2.V();
                }
                break;
        }
        return w61.a0.a;
    }
}
