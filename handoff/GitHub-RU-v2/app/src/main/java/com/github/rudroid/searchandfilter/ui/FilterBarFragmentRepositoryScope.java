package com.github.rudroid.searchandfilter.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.searchandfilter.q0;
import com.github.rudroid.utilities.w0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class FilterBarFragmentRepositoryScope extends Hilt_FilterBarFragmentRepositoryScope {
    public final w61.p L0 = sy.w.t(new com.github.rudroid.searchandfilter.ui.h(this, 0));
    public final l1 M0 = new l1(k71.x.a(q0.class), new b(), new d(), new c());
    public final com.github.rudroid.fragments.util.c N0 = new com.github.rudroid.fragments.util.c("EXTRA_REPO_OWNER");
    public final com.github.rudroid.fragments.util.c O0 = new com.github.rudroid.fragments.util.c("EXTRA_REPO_NAME");
    public final com.github.rudroid.fragments.util.c P0 = new com.github.rudroid.fragments.util.c("EXTRA_IS_ACTIVITY_HOSTED");
    public boolean Q0;
    public static final /* synthetic */ r71.e[] R0 = {new k71.m(FilterBarFragmentRepositoryScope.class, "repositoryOwner", "getRepositoryOwner()Ljava/lang/String;", 0), h1.w(k71.x.a, FilterBarFragmentRepositoryScope.class, "repositoryName", "getRepositoryName()Ljava/lang/String;", 0), new k71.m(FilterBarFragmentRepositoryScope.class, "isActivityHosted", "isActivityHosted()Z", 0)};
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return FilterBarFragmentRepositoryScope.this.g4().K0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return FilterBarFragmentRepositoryScope.this.g4().g0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return FilterBarFragmentRepositoryScope.this.g4().f0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().K0();
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().g0();
        }
    }

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().f0();
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ com.github.rudroid.searchandfilter.ui.h s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.github.rudroid.searchandfilter.ui.h hVar) {
            super(0);
            this.s = hVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class i extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class k extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(androidx.fragment.app.a0 a0Var, w61.h hVar) {
            super(0);
            this.s = a0Var;
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? this.s.f0() : f0;
        }
    }

    @Override // com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase
    public final com.github.rudroid.searchandfilter.q H4() {
        return (com.github.rudroid.searchandfilter.q) this.L0.getValue();
    }

    @Override // com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase
    public final com.github.rudroid.searchandfilter.filterbar.f I4(com.github.domain.searchandfilter.filters.data.d dVar, bm.l lVar) {
        k71.k.g(dVar, "filter");
        Context i4 = i4();
        com.github.rudroid.activities.util.c cVar = this.B0;
        if (cVar == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        oa.j d2 = cVar.d();
        a1 A3 = A3();
        com.github.rudroid.searchandfilter.q H4 = H4();
        r71.e[] eVarArr = R0;
        return e0.s(dVar, i4, d2, A3, H4, (String) this.N0.a(this, eVarArr[0]), (String) this.O0.a(this, eVarArr[1]), this.Q0, lVar, ((Boolean) this.P0.a(this, eVarArr[2])).booleanValue());
    }

    @Override // com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        w0.a(((q0) this.M0.getValue()).x, F3(), androidx.lifecycle.w.u, new com.github.rudroid.searchandfilter.ui.i(this, null));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
