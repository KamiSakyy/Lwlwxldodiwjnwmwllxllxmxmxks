package com.github.rudroid.shortcuts.activities;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.GitHubFragment;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ConfigureShortcutFragment extends Hilt_ConfigureShortcutFragment implements com.github.rudroid.fragments.util.f {
    public com.github.rudroid.activities.util.c D0;
    public final l1 E0;
    public final l1 F0;
    public androidx.fragment.app.t G0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return ConfigureShortcutFragment.this;
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
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? ConfigureShortcutFragment.this.f0() : f0;
        }
    }

    public static final class f implements j71.a {
        public final /* synthetic */ Object s;
        public final /* synthetic */ com.github.rudroid.searchandfilter.complexfilter.explore.a0 t;

        public f(w61.h hVar, com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var) {
            this.s = hVar;
            this.t = a0Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return new b0(this.t, new a0(ConfigureShortcutFragment.this, this.s));
        }
    }

    public ConfigureShortcutFragment() {
        com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(25);
        kc.k kVar = new kc.k(this);
        w61.i iVar = w61.i.s;
        f fVar = new f(sy.w.s(iVar, new kc.o(kVar)), a0Var);
        w61.h s = sy.w.s(iVar, new kc.g(kVar));
        this.E0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.q.class), new kc.h(s), fVar, new kc.i(s));
        w61.h s2 = sy.w.s(iVar, new b(new a()));
        this.F0 = new l1(k71.x.a(com.github.rudroid.shortcuts.e.class), new c(s2), new e(s2), new d(s2));
    }

    public static void C4(ConfigureShortcutFragment configureShortcutFragment, String str, Bundle bundle) {
        Parcelable parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) bundle.getParcelable("RepositoryIssueTypesBottomSheet_KEY_SELECTED_ISSUE_TYPE", IssueType.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("RepositoryIssueTypesBottomSheet_KEY_SELECTED_ISSUE_TYPE");
            if (!(parcelable2 instanceof IssueType)) {
                parcelable2 = null;
            }
            parcelable = (IssueType) parcelable2;
        }
        configureShortcutFragment.D4().Y(new IssueTypeFilter((IssueType) parcelable), MobileSubjectType.FILTER_ISSUE_TYPE);
    }

    public final com.github.rudroid.searchandfilter.q D4() {
        return (com.github.rudroid.searchandfilter.q) this.E0.getValue();
    }

    public final com.github.rudroid.shortcuts.e E4() {
        return (com.github.rudroid.shortcuts.e) this.F0.getValue();
    }

    public final com.github.rudroid.activities.util.c J2() {
        com.github.rudroid.activities.util.c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        com.github.rudroid.activities.util.c cVar = this.D0;
        if (cVar == null) {
            k71.k.m("accountHolder");
            throw null;
        }
        this.G0 = f4(new m(this), new com.github.rudroid.shortcuts.activities.a(cVar));
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new j71.e() { // from class: com.github.rudroid.shortcuts.activities.n
            public final Object s(Object obj, Object obj2) {
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean S = sVar.S(intValue & 1, (intValue & 3) != 2);
                w61.a0 a0Var = w61.a0.a;
                if (!S) {
                    sVar.V();
                    return a0Var;
                }
                ConfigureShortcutFragment configureShortcutFragment = ConfigureShortcutFragment.this;
                com.github.rudroid.shortcuts.a aVar = (com.github.rudroid.shortcuts.a) k41.b.l(configureShortcutFragment.E4().E, (androidx.fragment.app.l1) null, sVar, 7).getValue();
                wm.b bVar = aVar.a;
                g1 g1Var = aVar.c;
                if (h1.g(g1Var)) {
                    sVar.c0(-439299993);
                    boolean h = sVar.h(configureShortcutFragment) | sVar.h(g1Var);
                    Object N = sVar.N();
                    if (h || N == androidx.compose.runtime.n.a) {
                        N = new s(configureShortcutFragment, g1Var, null);
                        sVar.n0(N);
                    }
                    androidx.compose.runtime.t.f(sVar, (j71.e) N, a0Var);
                    sVar.q(false);
                } else if (h1.b(g1Var)) {
                    sVar.c0(-1538172388);
                    sVar.q(false);
                    com.github.rudroid.utilities.ui.n0 n0Var = g1Var instanceof com.github.rudroid.utilities.ui.n0 ? (com.github.rudroid.utilities.ui.n0) g1Var : null;
                    com.github.rudroid.activities.h0 u4 = configureShortcutFragment.u4(n0Var != null ? n0Var.b : null);
                    if (u4 != null) {
                        GitHubFragment.x4(configureShortcutFragment, u4, (m0.b) null, (ViewGroup) null, 14);
                    }
                } else {
                    sVar.c0(-446244737);
                    sVar.q(false);
                }
                ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-723669423, new bd.d(configureShortcutFragment, g1Var, bVar, aVar, 24), sVar), sVar, 805306368, 511);
                return a0Var;
            }
        }, true, -788191933));
        return composeView;
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            com.github.rudroid.main.navigation.f.a(sy.s.i(this), "CHOOSE_SHORTCUT_REPOSITORY_RESULT_KEY", F3(), new l(this, 2));
        }
        wm.b bVar = ((com.github.rudroid.shortcuts.a) E4().E.getValue()).a;
        com.github.rudroid.searchandfilter.q D4 = D4();
        ArrayList arrayList = bm.e.a;
        D4.W(bm.e.c(bVar.i(), bVar.K()), bVar.g());
        x3().i0("RepositoryIssueTypesBottomSheet_KEY_SELECTED_ISSUE_TYPE_RESULT", F3(), new m(this));
        com.github.rudroid.utilities.w0.a(D4().G, F3(), androidx.lifecycle.w.u, new z(this, null));
    }
}
