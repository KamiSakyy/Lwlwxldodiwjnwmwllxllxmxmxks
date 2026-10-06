package com.github.rudroid.users;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.a0;
import androidx.lifecycle.a1;
import androidx.lifecycle.l1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.interfaces.z0;
import com.github.rudroid.repository.navigation.UsersRoute;
import com.github.rudroid.uitoolkit.utils.z;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.viewmodels.za;
import k71.x;
import m0.u;
import sy.w;
import sy.y;

/* loaded from: /home/user/work/p/classes3.dex */
public class UsersFragment extends Hilt_UsersFragment implements com.github.rudroid.fragments.util.f, z0, com.github.rudroid.interfaces.a {
    public com.github.rudroid.activities.util.c D0;
    public r E0;
    public final l1 F0;
    public com.github.rudroid.utilities.e G0;
    public final p1 H0;

    public static final class a implements j71.a {
        public final /* synthetic */ d r;
        public final /* synthetic */ Object s;

        public a(d dVar, UsersFragment usersFragment, w61.h hVar) {
            this.r = dVar;
            this.s = hVar;
        }

        public final Object a() {
            return new n(this.r);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.github.rudroid.users.d] */
    public UsersFragment() {
        final int i = 0;
        j71.c r0 = new j71.c(this) { // from class: com.github.rudroid.users.d;
            public final /* synthetic */ UsersFragment s;

            {
                this.s = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
            public final Object k(Object obj) {
                switch (i) {
                    case 0:
                        a1 a1Var = (a1) obj;
                        k71.k.g(a1Var, "savedStateHandle");
                        UsersRoute usersRoute = (UsersRoute) y.m(a1Var, x.a(UsersRoute.class), ze.e.a);
                        UsersFragment usersFragment = this.s;
                        r rVar = usersFragment.E0;
                        if (rVar == null) {
                            k71.k.m("viewModelFactoryProvider");
                            throw null;
                        }
                        com.github.domain.users.a aVar = usersRoute.b;
                        Bundle bundle = ((a0) usersFragment).x;
                        k71.k.g(aVar, "userViewType");
                        return new q(usersFragment, bundle, aVar, rVar);
                    default:
                        String str = (String) obj;
                        k71.k.g(str, "userLogin");
                        this.s.Z2(str);
                        return w61.a0.a;
                }
            }
        };
        kc.k kVar = new kc.k(this);
        w61.i iVar = w61.i.s;
        a aVar = new a(r0, this, w.s(iVar, new kc.o(kVar)));
        w61.h s = w.s(iVar, new kc.g(kVar));
        this.F0 = new l1(x.a(za.class), new kc.h(s), aVar, new kc.i(s));
        this.H0 = t.B(Boolean.FALSE);
    }

    public final za C4() {
        return (za) this.F0.getValue();
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
        composeView.setContent(new r1.d(new j71.e() { // from class: com.github.rudroid.users.e
            public final Object s(Object obj, Object obj2) {
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean S = sVar.S(intValue & 1, (intValue & 3) != 2);
                w61.a0 a0Var = w61.a0.a;
                if (!S) {
                    sVar.V();
                    return a0Var;
                }
                final UsersFragment usersFragment = UsersFragment.this;
                final g1 g1Var = (g1) k41.b.l(usersFragment.C4().w, (androidx.fragment.app.l1) null, sVar, 7).getValue();
                final m0.s a2 = u.a(0, 3, sVar);
                Object N = sVar.N();
                androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                if (N == iVar) {
                    N = no.a.f(sVar);
                }
                final b2.a0 a0Var2 = (b2.a0) N;
                Object N2 = sVar.N();
                if (N2 == iVar) {
                    N2 = new h(a0Var2, null);
                    sVar.n0(N2);
                }
                t.f(sVar, (j71.e) N2, a0Var2);
                if (((Boolean) usersFragment.H0.getValue()).booleanValue()) {
                    sVar.c0(2014629756);
                    boolean f = sVar.f(a2) | sVar.h(usersFragment);
                    Object N3 = sVar.N();
                    if (f || N3 == iVar) {
                        N3 = new i(a2, usersFragment, null);
                        sVar.n0(N3);
                    }
                    t.f(sVar, (j71.e) N3, a0Var);
                } else {
                    sVar.c0(2010400333);
                }
                sVar.q(false);
                ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(1095150407, new j71.e() { // from class: com.github.rudroid.users.f
                    public final Object s(Object obj3, Object obj4) {
                        androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                        int intValue2 = ((Integer) obj4).intValue();
                        if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                            m0.s sVar3 = a2;
                            UsersFragment usersFragment2 = usersFragment;
                            z.a(b2.d.k(f0.o.p(w1.o.a), a0Var2), r1.i.d(345347387, new com.github.rudroid.settings.copilot.debug.q((Object) sVar3, (Object) usersFragment2, false, 11), sVar2), null, null, null, 0, 0L, 0L, r1.i.d(43965573, new com.github.rudroid.actions.workflowruns.f(g1Var, usersFragment2, sVar3, 28), sVar2), sVar2, 100663344, 252);
                            za C4 = usersFragment2.C4();
                            boolean h = sVar2.h(C4);
                            Object N4 = sVar2.N();
                            androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
                            if (h || N4 == iVar2) {
                                j jVar = new j(0, C4, za.class, "canLoadNextPage", "canLoadNextPage()Z", 0, 0);
                                sVar2.n0(jVar);
                                N4 = jVar;
                            }
                            j71.a aVar = (k71.i) N4;
                            za C42 = usersFragment2.C4();
                            boolean h2 = sVar2.h(C42);
                            Object N5 = sVar2.N();
                            if (h2 || N5 == iVar2) {
                                N5 = new k(0, C42, za.class, "loadNextPage", "loadNextPage()V", 0, 0);
                                sVar2.n0(N5);
                            }
                            com.github.rudroid.uitoolkit.utils.lists.t.a(sVar3, 0, aVar, (k71.i) N5, sVar2, 0);
                        } else {
                            sVar2.V();
                        }
                        return w61.a0.a;
                    }
                }, sVar), sVar, 805306368, 511);
                return a0Var;
            }
        }, true, -346949483));
        return composeView;
    }

    public final void Z2(String str) {
        k71.k.g(str, "login");
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(this)) {
            ze.c.b(sy.s.i(this), str);
        } else {
            com.github.rudroid.profile.g.b(i4(), str, new l(2, this, UsersFragment.class, "startActivityForUser", "startActivityForUser(Landroid/content/Intent;Landroid/os/Bundle;)V", 0, 0));
        }
    }

    public final void c3() {
        this.H0.setValue(Boolean.TRUE);
    }



    public static  i4(Object... a) {
        return null;
    }

    public static  g4(Object... a) {
        return null;
    }

    public static  E(Object... a) {
        return null;
    }
    public Object E(Object p1, Object p2) { return null; }
    public Object g4() { return null; }
}
