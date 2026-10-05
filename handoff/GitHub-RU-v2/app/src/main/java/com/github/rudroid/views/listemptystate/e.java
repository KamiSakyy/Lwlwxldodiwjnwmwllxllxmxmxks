package com.github.rudroid.views.listemptystate;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rudroid.utilities.m2;
import com.github.rudroid.views.listemptystate.a;
import ic.v7;
import k71.k;
import k71.m;
import k71.x;
import kotlin.NoWhenBranchMatchedException;
import l7.m0;
import l7.n1;
import le.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends m0 {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] f;
    public final f d;
    public final m2 e;

    public static final class a {
    }

    public static final class b extends d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.github.rudroid.views.listemptystate.a aVar) {
            super(aVar, 1, "IdleState");
            k.g(aVar, "emptyScreen");
        }
    }

    public static final class c extends d {
    }

    public static abstract class d implements z {
        public final com.github.rudroid.views.listemptystate.a r;
        public final int s;
        public final String t;

        public d(com.github.rudroid.views.listemptystate.a aVar, int i, String str) {
            this.r = aVar;
            this.s = i;
            this.t = str;
        }

        public final String E() {
            return this.t;
        }
    }

    static {
        r71.e mVar = new m(e.class, "emptyState", "getEmptyState()Lcom/github/rudroid/views/listemptystate/LoadingStateAdapter$UiState;", 0);
        x.a.getClass();
        f = new r71.e[]{mVar};
        Companion = new a();
    }

    public e() {
        com.github.rudroid.views.listemptystate.a.Companion.getClass();
        this.d = new f(new b(a.C0021a.b), this);
        this.e = new m2();
        D(true);
    }

    public final d F() {
        return (d) this.d.t(this, f[0]);
    }

    public final void G(fl.f fVar, com.github.rudroid.views.listemptystate.a aVar) {
        k.g(fVar, "state");
        k.g(aVar, "emptyScreen");
        this.d.y((i21.a.x(fVar) && fVar.b == null) ? new c(aVar, 0, "LoadingEmptyState") : new b(aVar), f[0]);
    }

    public final int k() {
        return F() instanceof c ? 1 : 0;
    }

    public final long l(int i) {
        return this.e.a(F().t);
    }

    public final int m(int i) {
        return F().s;
    }

    public final void u(RecyclerView recyclerView) {
    }

    public final void v(n1 n1Var, int i) {
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        d F = F();
        if (F instanceof c) {
            v7 b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559165, viewGroup, false, k5.b.b);
            k.f(b2, "inflate(...)");
            return new com.github.rudroid.views.listemptystate.d(b2);
        }
        if (F instanceof b) {
            throw new IllegalStateException("");
        }
        throw new NoWhenBranchMatchedException();
    }







}
