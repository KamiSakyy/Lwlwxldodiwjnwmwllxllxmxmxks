package com.github.rudroid.shortcuts.activities;

import android.content.Context;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.m2;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p implements j71.f {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ wm.b s;
    public final /* synthetic */ ConfigureShortcutFragment t;
    public final /* synthetic */ Object u;

    public /* synthetic */ p(ConfigureShortcutFragment configureShortcutFragment, g1 g1Var, wm.b bVar) {
        this.u = g1Var;
        this.s = bVar;
        this.t = configureShortcutFragment;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        ArrayList arrayList;
        switch (this.r) {
            case 0:
                com.github.rudroid.shortcuts.a aVar = (com.github.rudroid.shortcuts.a) this.u;
                d2 d2Var = (d2) obj;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g(d2Var, "paddingValues");
                if ((intValue & 6) == 0) {
                    intValue |= sVar.f(d2Var) ? 4 : 2;
                }
                if (sVar.S(intValue & 1, (intValue & 19) != 18)) {
                    wm.b bVar = this.s;
                    com.github.service.models.response.shortcuts.a i = bVar.i();
                    boolean b = k71.k.b(i, ShortcutScope.AllRepositories.INSTANCE);
                    Throwable th2 = null;
                    ConfigureShortcutFragment configureShortcutFragment = this.t;
                    if (b) {
                        List<com.github.domain.searchandfilter.filters.data.d> g = bVar.g();
                        ArrayList arrayList2 = new ArrayList(x61.n.F(g, 10));
                        for (com.github.domain.searchandfilter.filters.data.d dVar : g) {
                            Context i4 = configureShortcutFragment.i4();
                            com.github.rudroid.activities.util.c cVar = configureShortcutFragment.D0;
                            if (cVar == null) {
                                k71.k.m("accountHolder");
                                throw null;
                            }
                            oa.j d = cVar.d();
                            androidx.fragment.app.a1 x3 = configureShortcutFragment.x3();
                            k71.k.f(x3, "getChildFragmentManager(...)");
                            arrayList2.add(com.github.rudroid.searchandfilter.ui.e0.t(dVar, i4, d, x3, configureShortcutFragment.D4(), false, null));
                        }
                        arrayList = arrayList2;
                    } else {
                        if (!(i instanceof ShortcutScope.SpecificRepository)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List<com.github.domain.searchandfilter.filters.data.d> g2 = bVar.g();
                        ArrayList arrayList3 = new ArrayList(x61.n.F(g2, 10));
                        for (com.github.domain.searchandfilter.filters.data.d dVar2 : g2) {
                            Context i42 = configureShortcutFragment.i4();
                            com.github.rudroid.activities.util.c cVar2 = configureShortcutFragment.D0;
                            if (cVar2 == null) {
                                Throwable th3 = th2;
                                k71.k.m("accountHolder");
                                throw th3;
                            }
                            oa.j d2 = cVar2.d();
                            androidx.fragment.app.a1 x32 = configureShortcutFragment.x3();
                            k71.k.f(x32, "getChildFragmentManager(...)");
                            com.github.rudroid.searchandfilter.q D4 = configureShortcutFragment.D4();
                            Throwable th4 = th2;
                            ShortcutScope.SpecificRepository i2 = bVar.i();
                            k71.k.e(i2, "null cannot be cast to non-null type com.github.service.models.response.shortcuts.ShortcutScope.SpecificRepository");
                            String str = i2.s;
                            ShortcutScope.SpecificRepository i3 = bVar.i();
                            k71.k.e(i3, "null cannot be cast to non-null type com.github.service.models.response.shortcuts.ShortcutScope.SpecificRepository");
                            arrayList3.add(com.github.rudroid.searchandfilter.ui.e0.s(dVar2, i42, d2, x32, D4, str, i3.t, aVar.b, null, false));
                            th2 = th4;
                        }
                        arrayList = arrayList3;
                    }
                    w1.r w = androidx.compose.foundation.layout.b.w(w1.o.a, d2Var);
                    String name = bVar.getName();
                    ShortcutType K = bVar.K();
                    ShortcutIcon icon = bVar.getIcon();
                    ShortcutColor f = bVar.f();
                    com.github.service.models.response.shortcuts.a i5 = bVar.i();
                    configureShortcutFragment.E4();
                    Object[] array = ShortcutType.getEntries().toArray(new ShortcutType[0]);
                    RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                    ei.c cVar3 = ei.c.O;
                    runtimeFeatureFlag.getClass();
                    Set r = !RuntimeFeatureFlag.a(cVar3) ? sy.f0.r(ShortcutType.REPOSITORIES) : x61.t.r;
                    k71.k.g(array, "<this>");
                    LinkedHashSet linkedHashSet = new LinkedHashSet(x61.x.s(array.length));
                    x61.l.a0(array, linkedHashSet);
                    linkedHashSet.removeAll(x61.m.O(r));
                    List F0 = x61.m.F0(linkedHashSet);
                    com.github.rudroid.shortcuts.e E4 = configureShortcutFragment.E4();
                    boolean h = sVar.h(E4);
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                    if (h || N == iVar) {
                        N = new t(1, E4, com.github.rudroid.shortcuts.e.class, "updateName", "updateName(Ljava/lang/String;)V", 0, 0);
                        sVar.n0(N);
                    }
                    j71.c cVar4 = (k71.i) N;
                    com.github.rudroid.shortcuts.e E42 = configureShortcutFragment.E4();
                    boolean h2 = sVar.h(E42);
                    Object N2 = sVar.N();
                    if (h2 || N2 == iVar) {
                        N2 = new u(1, E42, com.github.rudroid.shortcuts.e.class, "updateColor", "updateColor(Lcom/github/service/models/response/shortcuts/ShortcutColor;)V", 0, 0);
                        sVar.n0(N2);
                    }
                    j71.c cVar5 = (k71.i) N2;
                    com.github.rudroid.shortcuts.e E43 = configureShortcutFragment.E4();
                    boolean h3 = sVar.h(E43);
                    Object N3 = sVar.N();
                    if (h3 || N3 == iVar) {
                        N3 = new v(1, E43, com.github.rudroid.shortcuts.e.class, "updateIcon", "updateIcon(Lcom/github/service/models/response/shortcuts/ShortcutIcon;)V", 0, 0);
                        sVar.n0(N3);
                    }
                    j71.c cVar6 = (k71.i) N3;
                    boolean z = configureShortcutFragment.E4().z;
                    boolean h4 = sVar.h(configureShortcutFragment);
                    Object N4 = sVar.N();
                    if (h4 || N4 == iVar) {
                        N4 = new k(configureShortcutFragment, 0);
                        sVar.n0(N4);
                    }
                    j71.a aVar2 = (j71.a) N4;
                    boolean h5 = sVar.h(configureShortcutFragment);
                    Object N5 = sVar.N();
                    if (h5 || N5 == iVar) {
                        N5 = new l(configureShortcutFragment, 0);
                        sVar.n0(N5);
                    }
                    j71.c cVar7 = (j71.c) N5;
                    j71.c cVar8 = cVar4;
                    boolean h6 = sVar.h(configureShortcutFragment);
                    Object N6 = sVar.N();
                    if (h6 || N6 == iVar) {
                        N6 = new l(configureShortcutFragment, 1);
                        sVar.n0(N6);
                    }
                    j71.c cVar9 = (j71.c) N6;
                    j71.c cVar10 = cVar5;
                    j71.c cVar11 = cVar6;
                    boolean h7 = sVar.h(configureShortcutFragment);
                    Object N7 = sVar.N();
                    if (h7 || N7 == iVar) {
                        N7 = new k(configureShortcutFragment, 1);
                        sVar.n0(N7);
                    }
                    hg.g.a(w, name, K, icon, f, i5, z, F0, aVar2, cVar7, cVar8, cVar9, cVar10, cVar11, arrayList, (j71.a) N7, sVar, 0, 0, 0);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            default:
                g1 g1Var = (g1) this.u;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTopAppBar");
                if (sVar2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean c = h1.c(g1Var);
                    boolean z2 = !t71.p.T(this.s.getName());
                    ConfigureShortcutFragment configureShortcutFragment2 = this.t;
                    boolean h8 = sVar2.h(configureShortcutFragment2);
                    Object N8 = sVar2.N();
                    if (h8 || N8 == androidx.compose.runtime.n.a) {
                        N8 = new k(configureShortcutFragment2, 2);
                        sVar2.n0(N8);
                    }
                    sg.h0.a(null, z2, (j71.a) N8, null, c, 0.0f, null, i.a, sVar2, 12582912, 105);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ p(wm.b bVar, ConfigureShortcutFragment configureShortcutFragment, com.github.rudroid.shortcuts.a aVar) {
        this.s = bVar;
        this.t = configureShortcutFragment;
        this.u = aVar;
    }
}
