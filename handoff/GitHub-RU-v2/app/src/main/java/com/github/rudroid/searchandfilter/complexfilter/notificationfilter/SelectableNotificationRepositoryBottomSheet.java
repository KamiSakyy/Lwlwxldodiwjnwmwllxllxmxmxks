package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableNotificationRepositoryBottomSheet extends Hilt_SelectableNotificationRepositoryBottomSheet {
    public static final a Companion = new a();
    public final l1 Y0;
    public final int Z0;
    public final int a1;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SelectableNotificationRepositoryBottomSheet.this;
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableNotificationRepositoryBottomSheet.this.f0() : f0;
        }
    }

    public SelectableNotificationRepositoryBottomSheet() {
        w61.h s = sy.w.s(w61.i.s, new c(new b()));
        this.Y0 = new l1(k71.x.a(s0.class), new d(s), new f(s), new e(s));
        this.Z0 = 2131954229;
        this.a1 = 2131954217;
    }

    public final androidx.fragment.app.a0 E4() {
        SelectableNotificationRepositoryFilterFragment.Companion.getClass();
        SelectableNotificationRepositoryFilterFragment selectableNotificationRepositoryFilterFragment = new SelectableNotificationRepositoryFilterFragment();
        selectableNotificationRepositoryFilterFragment.n4(((androidx.fragment.app.a0) this).x);
        return selectableNotificationRepositoryFilterFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int H4() {
        return this.a1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int I4() {
        return this.Z0;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void J4(String str) {
        s0 s0Var = (s0) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        s0Var.Q(str);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void K4(String str) {
        s0 s0Var = (s0) this.Y0.getValue();
        if (str == null) {
            str = "";
        }
        s0Var.V(str);
    }


    public static  f0(Object... a) {
        return null;
    }
}
