package com.github.rudroid.searchandfilter.complexfilter.project;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import androidx.lifecycle.o1;
import androidx.lifecycle.q0;
import androidx.lifecycle.u1;
import com.github.rudroid.searchandfilter.complexfilter.project.SelectableProjectsBottomSheet;
import java.util.List;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SelectableProjectsBottomSheet extends Hilt_SelectableProjectsBottomSheet {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] e1;
    public final l1 Y0;
    public final l1 Z0;
    public final com.github.rudroid.fragments.util.c a1;
    public final w61.p b1;
    public final int c1;
    public final int d1;

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().K0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().g0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ androidx.fragment.app.a0 s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.fragment.app.a0 a0Var) {
            super(0);
            this.s = a0Var;
        }

        public final Object a() {
            return this.s.g4().f0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ com.github.rudroid.searchandfilter.complexfilter.project.s s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.github.rudroid.searchandfilter.complexfilter.project.s sVar) {
            super(0);
            this.s = sVar;
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
        public final /* synthetic */ androidx.fragment.app.a0 s;
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(androidx.fragment.app.a0 a0Var, w61.h hVar) {
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
        public final /* synthetic */ j71.c r;

        public i(j71.c cVar) {
            this.r = cVar;
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableProjectsBottomSheet.this.f0() : f0;
        }
    }

    public static final class k extends k71.l implements j71.a {
        public k() {
            super(0);
        }

        public final Object a() {
            return SelectableProjectsBottomSheet.this;
        }
    }

    public static final class l extends k71.l implements j71.a {
        public final /* synthetic */ k s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.s = kVar;
        }

        public final Object a() {
            return (u1) this.s.a();
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
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class n extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(w61.h hVar) {
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

    public static final class o extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? SelectableProjectsBottomSheet.this.f0() : f0;
        }
    }

    public static final class p extends k71.l implements j71.a {
        public p() {
            super(0);
        }

        public final Object a() {
            return SelectableProjectsBottomSheet.this;
        }
    }

    public static final class q extends k71.l implements j71.a {
        public final /* synthetic */ p s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p pVar) {
            super(0);
            this.s = pVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class r extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class s extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(w61.h hVar) {
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

    static {
        r71.e pVar = new k71.p(SelectableProjectsBottomSheet.class, "isActivityHosted", "isActivityHosted()Z", 0);
        k71.x.a.getClass();
        e1 = new r71.e[]{pVar};
        Companion = new a();
    }

    public SelectableProjectsBottomSheet() {
        k kVar = new k();
        w61.i iVar = w61.i.s;
        w61.h s2 = sy.w.s(iVar, new l(kVar));
        this.Y0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.complexfilter.project.i.class), new m(s2), new o(s2), new n(s2));
        w61.h s3 = sy.w.s(iVar, new q(new p()));
        this.Z0 = new l1(k71.x.a(y.class), new r(s3), new j(s3), new s(s3));
        this.a1 = new com.github.rudroid.fragments.util.c("EXTRA_IS_ACTIVITY_HOSTED", new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.f(28));
        this.b1 = sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.project.s(this, 0));
        this.c1 = 2131954228;
        this.d1 = 2131954216;
    }

    public final androidx.fragment.app.a0 E4() {
        LegacyProjectsTabFragment.Companion.getClass();
        LegacyProjectsTabFragment legacyProjectsTabFragment = new LegacyProjectsTabFragment();
        legacyProjectsTabFragment.n4(((androidx.fragment.app.a0) this).x);
        return legacyProjectsTabFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int H4() {
        return this.d1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final int I4() {
        return this.c1;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void J4(String str) {
        ((com.github.rudroid.searchandfilter.complexfilter.project.i) this.Y0.getValue()).P(str == null ? "" : str);
        y yVar = (y) this.Z0.getValue();
        if (str == null) {
            str = "";
        }
        yVar.P(str);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog
    public final void K4(String str) {
        ((com.github.rudroid.searchandfilter.complexfilter.project.i) this.Y0.getValue()).S(str == null ? "" : str);
        y yVar = (y) this.Z0.getValue();
        if (str == null) {
            str = "";
        }
        yVar.S(str);
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        final o0 o0Var = new o0();
        y yVar = (y) this.Z0.getValue();
        final androidx.lifecycle.h a2 = d1.a(n1.y(new x(new y00.l(yVar.t.b, 10)), yVar.F));
        com.github.rudroid.searchandfilter.complexfilter.project.i iVar = (com.github.rudroid.searchandfilter.complexfilter.project.i) this.Y0.getValue();
        final androidx.lifecycle.h a3 = d1.a(n1.y(new com.github.rudroid.searchandfilter.complexfilter.project.h(new y00.l(iVar.t.b, 10)), iVar.F));
        final int i2 = 0;
        o0Var.l(a2, new i(new j71.c() { // from class: com.github.rudroid.searchandfilter.complexfilter.project.r
            public final Object k(Object obj) {
                int i3 = i2;
                w61.a0 a0Var = w61.a0.a;
                o0 o0Var2 = o0Var;
                androidx.lifecycle.h hVar = a3;
                List list = (List) obj;
                switch (i3) {
                    case 0:
                        SelectableProjectsBottomSheet.a aVar = SelectableProjectsBottomSheet.Companion;
                        List list2 = (List) hVar.d();
                        if (list2 != null) {
                            k71.k.d(list);
                            o0Var2.j(x61.m.l0(list, list2));
                            break;
                        }
                        break;
                    default:
                        SelectableProjectsBottomSheet.a aVar2 = SelectableProjectsBottomSheet.Companion;
                        List list3 = (List) hVar.d();
                        if (list3 != null) {
                            k71.k.d(list);
                            o0Var2.j(x61.m.l0(list3, list));
                            break;
                        }
                        break;
                }
                return a0Var;
            }
        }));
        final int i3 = 1;
        o0Var.l(a3, new i(new j71.c() { // from class: com.github.rudroid.searchandfilter.complexfilter.project.r
            public final Object k(Object obj) {
                int i32 = i3;
                w61.a0 a0Var = w61.a0.a;
                o0 o0Var2 = o0Var;
                androidx.lifecycle.h hVar = a2;
                List list = (List) obj;
                switch (i32) {
                    case 0:
                        SelectableProjectsBottomSheet.a aVar = SelectableProjectsBottomSheet.Companion;
                        List list2 = (List) hVar.d();
                        if (list2 != null) {
                            k71.k.d(list);
                            o0Var2.j(x61.m.l0(list, list2));
                            break;
                        }
                        break;
                    default:
                        SelectableProjectsBottomSheet.a aVar2 = SelectableProjectsBottomSheet.Companion;
                        List list3 = (List) hVar.d();
                        if (list3 != null) {
                            k71.k.d(list);
                            o0Var2.j(x61.m.l0(list3, list));
                            break;
                        }
                        break;
                }
                return a0Var;
            }
        }));
        o0Var.e(F3(), new i(new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(21, this)));
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object F3(Object... a) {
        return null;
    }

    public static Object j4(Object... a) {
        return null;
    }

    public static Object n4(Object... a) {
        return null;
    }

    public static Object z4(Object... a) {
        return null;
    }
    public Object j4() { return null; }
}
