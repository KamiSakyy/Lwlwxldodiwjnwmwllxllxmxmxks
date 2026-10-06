package com.github.rudroid.searchandfilter.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.l1;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.utilities.w0;
import ic.w2;
import java.util.concurrent.CancellationException;
import rm0.r3Shadow;
import v71.q1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class FilterBarFragmentBase extends BindingFragment implements com.github.rudroid.fragments.util.f {
    public com.github.rudroid.activities.util.c B0;
    public q1 D0;
    public q1 E0;
    public final y1 G0;
    public final y1 H0;
    public final int C0 = 2131558796;
    public final y1 F0 = n1.c(Boolean.FALSE);

    public FilterBarFragmentBase() {
        x61.r rVar = x61.r.r;
        this.G0 = n1.c(rVar);
        this.H0 = n1.c(rVar);
    }

    public final int C4() {
        return this.C0;
    }

    public abstract com.github.rudroid.searchandfilter.q H4();

    public abstract com.github.rudroid.searchandfilter.filterbar.f I4(com.github.domain.searchandfilter.filters.data.d dVar, bm.l lVar);

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.B0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        Boolean valueOf = Boolean.valueOf(H4().u);
        y1 y1Var = this.F0;
        y1Var.getClass();
        y1Var.k((Object) null, valueOf);
        B4().N.setContent(new r1.d(new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(5, this), true, -1946681974));
        q1 q1Var = this.D0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.D0 = null;
        q1 q1Var2 = this.E0;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.E0 = null;
        r3Shadow r3Var = H4().G;
        l1 F3 = F3();
        c cVar = new c(this, null);
        androidx.lifecycle.w wVar = androidx.lifecycle.w.u;
        this.D0 = w0.a(r3Var, F3, wVar, cVar);
        this.E0 = w0.a(H4().M, F3(), wVar, new d(this, null));
    }

    public <T0> T0 B4(Object... a) {
        return null;
    }

    public <T0> T0 F3(Object... a) {
        return null;
    }

    public <T0> T0 y3(Object... a) {
        return null;
    }

    public <T0> T0 i4(Object... a) {
        return null;
    }

    public <T0> T0 C3(Object... a) {
        return null;
    }

    public <T0> T0 D3(Object... a) {
        return null;
    }
    public Object D3(Object p1, Object p2) { return null; }
    public Object N3(Object p1) { return null; }
    public Object O3(Object p1) { return null; }
    public Object V3(Object p1) { return null; }
    public Object i4() { return null; }
    public Object y3() { return null; }
}
