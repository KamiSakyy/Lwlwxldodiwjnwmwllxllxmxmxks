package com.github.rudroid.starredreposandlists.createoreditlist;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class EditListFragment extends Hilt_EditListFragment implements com.github.rudroid.fragments.util.f {
    public com.github.rudroid.activities.util.c D0;
    public l1 E0;
    public w61.p F0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return EditListFragment.this;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public final /* synthetic */ a s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.s = aVar;
        }

        public final Object a() {
            return (u1) this.s.a();
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? EditListFragment.this.f0() : f0;
        }
    }

    public EditListFragment() {
        w61.h s = sy.w.s(w61.i.s, new b(new a()));
        this.E0 = new l1(k71.xShadow.a(u0.class), new c(s), new e(s), new d(s));
        this.F0 = sy.w.t(new e0(this, 0));
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new com.github.rudroid.starredreposandlists.createoreditlist.d(1, this), true, -1590858210));
        return composeView;
    }

    public final void Y3() {
        super.Y3();
        String C3 = C3(2131953744);
        k71.k.f(C3, "getString(...)");
        ((com.github.rudroid.utilities.b) this.F0.getValue()).b(C3);
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        com.github.rudroid.utilities.w0.a(new y00.l(((u0) this.E0.getValue()).B, 10), F3(), androidx.lifecycle.w.u, new k0(this, view, null));
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object C3(Object... a) {
        return null;
    }

    public static Object F3(Object... a) {
        return null;
    }

    public static Object g4(Object... a) {
        return null;
    }

    public static Object w3(Object... a) {
        return null;
    }
    public Object g4() { return null; }
    public Object w3() { return null; }
}
