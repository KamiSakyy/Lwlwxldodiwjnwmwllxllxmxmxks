package com.github.rudroid.templates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import ic.lg;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import l7.m0;
import l7.n1;
import le.p;
import yz0.f5;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends m0 {
    public IssueTemplatesActivity d;
    public ArrayList e;

    public g(IssueTemplatesActivity issueTemplatesActivity) {
        this.d = issueTemplatesActivity;
        D(true);
        this.e = new ArrayList();
    }

    public final int k() {
        return this.e.size();
    }

    public final long l(int i) {
        return ((le.p) this.e.get(i)).a;
    }

    public final int m(int i) {
        return ((le.p) this.e.get(i)).b;
    }

    public final void v(n1 n1Var, int i) {
        String string;
        String string2;
        com.github.rudroid.adapters.viewholders.e eVar_r7 = (com.github.rudroid.adapters.viewholders.e) n1Var;
        p.c cVar = (le.p) this.e.get(i);
        if (cVar instanceof p.c) {
            p.c cVar2 = cVar;
            j5 j5Var = cVar2.c;
            lg lgVar = ((com.github.rudroid.adapters.viewholders.e) ((c) eVar_r7)).u;
            if ((lgVar instanceof lg ? lgVar : null) != null) {
                lg lgVar2 = lgVar;
                boolean z = j5Var instanceof j5;
                if (z) {
                    string = j5Var.s;
                } else if (j5Var instanceof i5) {
                    string = ((k5.f) lgVar2).A.getContext().getString(2131952361);
                    k71.k.f(string, "getString(...)");
                } else if (j5Var instanceof g5) {
                    string = ((g5) j5Var).s;
                } else if (j5Var instanceof h5) {
                    string = ((h5) j5Var).s;
                } else {
                    if (!k71.k.b(j5Var, f5.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = ((k5.f) lgVar2).A.getContext().getString(2131952358);
                    k71.k.f(string, "getString(...)");
                }
                lgVar2.Q0(string);
                View view = ((k5.f) lgVar2).A;
                if (z) {
                    string2 = j5Var.t;
                } else if (j5Var instanceof i5) {
                    string2 = view.getContext().getString(2131952362);
                } else if (j5Var instanceof g5) {
                    string2 = ((g5) j5Var).t;
                } else if (j5Var instanceof h5) {
                    string2 = ((h5) j5Var).t;
                } else {
                    if (!k71.k.b(j5Var, f5.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string2 = view.getContext().getString(2131952359);
                }
                lgVar2.P0(string2);
                ImageView imageView = lgVar2.Q;
                k71.k.f(imageView, "openBrowser");
                imageView.setVisibility((z || (j5Var instanceof f5)) ? 8 : 0);
                lgVar2.S0(cVar2);
            }
        } else if (!(cVar instanceof p.b)) {
            throw new NoWhenBranchMatchedException();
        }
        eVar_r7.u.F0();
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException();
            }
            k5.f b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559258, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new com.github.rudroid.adapters.viewholders.e(b);
        }
        lg b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559278, viewGroup, false, k5.b.b);
        k71.k.f(b2, "inflate(...)");
        lg lgVar = b2;
        IssueTemplatesActivity issueTemplatesActivity = this.d;
        k71.k.g(issueTemplatesActivity, "selectedListener");
        c cVar = new c(lgVar);
        lgVar.R0(issueTemplatesActivity);
        return cVar;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }
    public Object n() { return null; }
    public Object D(boolean p1) { return null; }
}
