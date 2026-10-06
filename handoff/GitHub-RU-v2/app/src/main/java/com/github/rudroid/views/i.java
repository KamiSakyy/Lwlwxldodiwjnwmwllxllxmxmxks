package com.github.rudroid.views;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.utilities.ui.g1;
import ic.wc;
import java.util.List;
import k71.xShadow;
import l7.m0;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends m0 {
    public static final /* synthetic */ r71.e[] e = {new k71.m(i.class, "state", "getState()Lcom/github/domain/model/ResultModel;", 0), h1.w(xShadow.a, i.class, "stateEvent", "getStateEvent()Lcom/github/rudroid/utilities/ui/StateEvent;", 0)};
    public final g d = new g(new fl.f(fl.g.s, null, null), this);

    public i() {
        g1.Companion.getClass();
        D(true);
    }

    public static boolean F(fl.f fVar) {
        if (!i21.a.x(fVar)) {
            return false;
        }
        Object obj = fVar.b;
        List list = obj instanceof List ? (List) obj : null;
        return list != null && (list.isEmpty() ^ true);
    }

    public final int k() {
        return F((fl.f) this.d.t(this, e[0])) ? 1 : 0;
    }

    public final long l(int i) {
        return 0L;
    }

    public final void v(n1 n1Var, int i) {
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        wc b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559230, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new j(b);
    }
    public Object d(Object p1, Object p2, Object p3) { return null; }
    public Object t(Object p1) { return null; }
    public Object D(boolean p1) { return null; }
}
