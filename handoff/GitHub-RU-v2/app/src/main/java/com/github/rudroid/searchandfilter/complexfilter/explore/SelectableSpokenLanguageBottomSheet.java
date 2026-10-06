package com.github.rudroid.searchandfilter.complexfilter.explore;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.rudroid.utilities.w0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableSpokenLanguageBottomSheet extends Hilt_SelectableSpokenLanguageBottomSheet {
    public static final a Companion = new a();
    public final l1 Y0;
    public final l1 Z0;
    public final int a1;
    public final int b1;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SelectableSpokenLanguageBottomSheet.this;
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ b s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.s = bVar;
        }

        public final Object a() {
            return (u1) this.s.a();
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
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
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

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableSpokenLanguageBottomSheet.this.f0() : f0;
        }
    }

    public static final class g extends k71.l implements j71.a {
        public final /* synthetic */ w s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w wVar) {
            super(0);
            this.s = wVar;
        }

        public final Object a() {
            return this.s.s.j4();
        }
    }

    public static final class h extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
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
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class j extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableSpokenLanguageBottomSheet.this.f0() : f0;
        }
    }

    public SelectableSpokenLanguageBottomSheet() {
        b bVar = new b();
        w61.i iVar = w61.i.s;
        w61.h s = sy.w.s(iVar, new c(bVar));
        this.Y0 = new l1(k71.x.a(i0.class), new d(s), new f(s), new e(s));
        w61.h s2 = sy.w.s(iVar, new g(new w(this, 0)));
        this.Z0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.q.class), new h(s2), new j(s2), new i(s2));
        this.a1 = 2131954230;
        this.b1 = 2131954218;
    }

    public final androidx.fragment.app.a0 E4() {
        SelectableSpokenLanguageFragment.Companion.getClass();
        SelectableSpokenLanguageFragment selectableSpokenLanguageFragment = new SelectableSpokenLanguageFragment();
        selectableSpokenLanguageFragment.n4(((androidx.fragment.app.a0) this).x);
        return selectableSpokenLanguageFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int H4() {
        return this.b1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int I4() {
        return this.a1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void J4(String str) {
        i0 i0Var = (i0) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        i0Var.Q(str);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void K4(String str) {
        i0 i0Var = (i0) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        i0Var.V(str);
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        w0.a(new h0(new y00.l(((i0) this.Y0.getValue()).t.b, 10)), F3(), androidx.lifecycle.w.u, new x(this, view, null));
    }


    public static  f0(Object... a) {
        return null;
    }

    public static  F3(Object... a) {
        return null;
    }

    public static  s4(Object... a) {
        return null;
    }
    public Object s4() { return null; }
}
