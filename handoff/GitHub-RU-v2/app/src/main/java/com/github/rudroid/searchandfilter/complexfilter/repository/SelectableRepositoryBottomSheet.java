package com.github.rudroid.searchandfilter.complexfilter.repository;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a0;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.lifecycle.u1;
import com.github.rudroid.fragments.onboarding.notifications.viewmodel.z;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableRepositoryBottomSheet extends Hilt_SelectableRepositoryBottomSheet {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] d1;
    public final l1 Y0;
    public final com.github.rudroid.fragments.util.c Z0;
    public final w61.p a1;
    public final int b1;
    public final int c1;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
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

    public static final class c extends k71.l implements j71.a {
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

    public static final class d extends k71.l implements j71.a {
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

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ t s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t tVar) {
            super(0);
            this.s = tVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class f extends k71.l implements j71.a {
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

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w61.h hVar) {
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

    public static final class h extends k71.l implements j71.a {
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
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? this.s.f0() : f0;
        }
    }

    public static final class i implements q0, k71.g {
        public final /* synthetic */ z r;

        public i(z zVar) {
            this.r = zVar;
        }

        public final /* synthetic */ void a(Object obj) {
            this.r.k(obj);
        }

        public final w61.e b() {
            return this.r;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q0) || !(obj instanceof k71.g)) {
                return false;
            }
            return this.r.equals(((k71.g) obj).b());
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class j extends k71.l implements j71.a {
        public j() {
            super(0);
        }

        public final Object a() {
            return SelectableRepositoryBottomSheet.this;
        }
    }

    public static final class k extends k71.l implements j71.a {
        public final /* synthetic */ j s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.s = jVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class l extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class m extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w61.h hVar) {
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

    public static final class n extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableRepositoryBottomSheet.this.f0() : f0;
        }
    }

    static {
        r71.e pVar = new k71.p(SelectableRepositoryBottomSheet.class, "isActivityHosted", "isActivityHosted()Z", 0);
        k71.x.a.getClass();
        d1 = new r71.e[]{pVar};
        Companion = new a();
    }

    public SelectableRepositoryBottomSheet() {
        w61.h s = sy.w.s(w61.i.s, new k(new j()));
        this.Y0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.complexfilter.repository.a.class), new l(s), new n(s), new m(s));
        this.Z0 = new com.github.rudroid.fragments.util.c("EXTRA_IS_ACTIVITY_HOSTED", new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(29));
        this.a1 = sy.w.t(new t(this, 0));
        this.b1 = 2131954229;
        this.c1 = 2131954217;
    }

    public final a0 E4() {
        SelectableRepositoryFragment.Companion.getClass();
        SelectableRepositoryFragment selectableRepositoryFragment = new SelectableRepositoryFragment();
        selectableRepositoryFragment.n4(((a0) this).x);
        return selectableRepositoryFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int H4() {
        return this.c1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int I4() {
        return this.b1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void J4(String str) {
        com.github.rudroid.searchandfilter.complexfilter.repository.a aVar = (com.github.rudroid.searchandfilter.complexfilter.repository.a) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        aVar.P(str);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void K4(String str) {
        com.github.rudroid.searchandfilter.complexfilter.repository.a aVar = (com.github.rudroid.searchandfilter.complexfilter.repository.a) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        aVar.S(str);
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        com.github.rudroid.searchandfilter.complexfilter.repository.a aVar = (com.github.rudroid.searchandfilter.complexfilter.repository.a) this.Y0.getValue();
        d1.a(n1.y(new com.github.rudroid.searchandfilter.complexfilter.repository.l(new y00.l(aVar.t.b, 10)), aVar.G)).e(F3(), new i(new z(22, this)));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
