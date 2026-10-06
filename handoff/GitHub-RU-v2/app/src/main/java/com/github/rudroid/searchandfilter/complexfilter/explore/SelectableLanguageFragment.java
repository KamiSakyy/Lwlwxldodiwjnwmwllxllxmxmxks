package com.github.rudroid.searchandfilter.complexfilter.explore;

import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableLanguageFragment extends Hilt_SelectableLanguageFragment<com.github.rudroid.searchandfilter.complexfilter.explore.a> {
    public static final a Companion = new a();
    public l1 H0;
    public com.github.rudroid.searchandfilter.complexfilter.explore.b I0;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public final /* synthetic */ com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j jVar) {
            super(0);
            this.s = jVar;
        }

        public final Object a() {
            return ((SelectableLanguageFragment) this.s.s).j4();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
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

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableLanguageFragment.this.f0() : f0;
        }
    }

    public SelectableLanguageFragment() {
        w61.h s = sy.w.s(w61.i.s, new b(new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(2, this)));
        this.H0 = new l1(k71.xShadow.a(n.class), new c(s), new e(s), new d(s));
        this.I0 = new com.github.rudroid.searchandfilter.complexfilter.explore.b(this);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment
    public final com.github.rudroid.searchandfilter.complexfilter.e0 H4() {
        return this.I0;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment
    public final com.github.rudroid.searchandfilter.complexfilter.d0 I4() {
        return (n) this.H0.getValue();
    }


    public static Object j4(Object... a) {
        return null;
    }

    public static Object f0(Object... a) {
        return null;
    }
}
