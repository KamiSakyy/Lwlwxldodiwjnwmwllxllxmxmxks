package com.github.rudroid.searchandfilter.filter.sort;

import android.os.Bundle;
import androidx.fragment.app.a0;
import androidx.lifecycle.o1;
import androidx.lifecycle.r;
import androidx.lifecycle.u1;
import com.github.commonandroid.views.ScrollableTitleToolbar;
import com.github.rudroid.fragments.BaseBottomSheetDialog;
import com.github.rudroid.m0;
import com.github.rudroid.searchandfilter.filter.sort.RepositoryFilterSortFragment;
import k71.k;
import k71.l;
import k71.x;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryFilterSortBottomSheetDialog extends BaseBottomSheetDialog {
    public final com.github.rudroid.fragments.util.c V0;
    public final com.github.rudroid.fragments.util.c W0;
    public final p X0;
    public static final /* synthetic */ r71.e[] Y0 = {new k71.p(RepositoryFilterSortBottomSheetDialog.class, "filterString", "getFilterString()Ljava/lang/String;", 0), m0.q(x.a, RepositoryFilterSortBottomSheetDialog.class, "isActivityHosted", "isActivityHosted()Z", 0)};
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b extends l implements j71.a {
        public final /* synthetic */ a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().K0();
        }
    }

    public static final class c extends l implements j71.a {
        public final /* synthetic */ a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().g0();
        }
    }

    public static final class d extends l implements j71.a {
        public final /* synthetic */ a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().f0();
        }
    }

    public static final class e extends l implements j71.a {
        public final /* synthetic */ wf.p s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wf.p pVar) {
            super(0);
            this.s = pVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class f extends l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class g extends l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            r rVar = (u1) this.s.getValue();
            r rVar2 = rVar instanceof r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class h extends l implements j71.a {
        public final /* synthetic */ a0 s;
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a0 a0Var, w61.h hVar) {
            super(0);
            this.s = a0Var;
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            r rVar = (u1) this.t.getValue();
            r rVar2 = rVar instanceof r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? this.s.f0() : f0;
        }
    }

    public RepositoryFilterSortBottomSheetDialog() {
        super(false, true, true);
        this.V0 = new com.github.rudroid.fragments.util.c("EXTRA_FILTER", new q01.p(26));
        this.W0 = new com.github.rudroid.fragments.util.c("EXTRA_IS_ACTIVITY_HOSTED", new q01.p(27));
        this.X0 = w.t(new wf.p(this, 0));
    }

    public final void D4(ScrollableTitleToolbar scrollableTitleToolbar) {
        String C3 = C3(2131954305);
        k.f(C3, "getString(...)");
        G4(C3);
    }

    public final a0 E4() {
        RepositoryFilterSortFragment.a aVar = RepositoryFilterSortFragment.Companion;
        String str = (String) this.V0.a(this, Y0[0]);
        aVar.getClass();
        k.g(str, "filterString");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_FILTER", str);
        RepositoryFilterSortFragment repositoryFilterSortFragment = new RepositoryFilterSortFragment();
        repositoryFilterSortFragment.n4(bundle);
        return repositoryFilterSortFragment;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }
}
