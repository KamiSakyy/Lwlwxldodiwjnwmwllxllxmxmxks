package com.github.rudroid.shortcuts;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import v71.q1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends k1 {
    public static final a Companion = new a();
    public static final ShortcutConfigurationModel F = new ShortcutConfigurationModel(x61.r.r, ShortcutColor.GRAY, ShortcutIcon.ZAP, ShortcutScope.AllRepositories.INSTANCE, ShortcutType.ISSUE, "");
    public final y1 A;
    public final y1 B;
    public q1 C;
    public final y1 D;
    public final y1 E;
    public final tm.a s;
    public final tm.m t;
    public final dl.a u;
    public final com.github.rudroid.activities.util.c v;
    public final wm.b w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public static final class a {
    }

    public e(a1 a1Var, tm.a aVar, tm.m mVar, dl.a aVar2, com.github.rudroid.activities.util.c cVar) {
        ShortcutConfigurationModel shortcutConfigurationModel;
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(aVar, "createShortcutUseCase");
        k71.k.g(mVar, "updateShortcutUseCase");
        k71.k.g(aVar2, "fetchMergeQueueEnabledUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = aVar;
        this.t = mVar;
        this.u = aVar2;
        this.v = cVar;
        ConfigureShortcutRoute configureShortcutRoute = (ConfigureShortcutRoute) sy.y.m(a1Var, k71.x.a(ConfigureShortcutRoute.class), ig.b.a);
        wm.b bVar = configureShortcutRoute.r;
        this.w = bVar;
        this.x = configureShortcutRoute.t;
        this.y = configureShortcutRoute.s;
        this.z = configureShortcutRoute.u;
        if (bVar != null) {
            Companion.getClass();
            if (bVar instanceof ShortcutConfigurationModel) {
                shortcutConfigurationModel = (ShortcutConfigurationModel) bVar;
            } else {
                if (!(bVar instanceof StoredShortcutModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoredShortcutModel storedShortcutModel = (StoredShortcutModel) bVar;
                ShortcutIcon shortcutIcon = storedShortcutModel.w;
                ShortcutColor shortcutColor = storedShortcutModel.v;
                String str = storedShortcutModel.t;
                shortcutConfigurationModel = new ShortcutConfigurationModel(storedShortcutModel.u, shortcutColor, shortcutIcon, storedShortcutModel.x, storedShortcutModel.y, str);
            }
        } else {
            shortcutConfigurationModel = F;
        }
        y1 c = n1.c(shortcutConfigurationModel);
        this.A = c;
        g1.Companion.getClass();
        y1 c2 = n1.c(g1.a.a());
        this.B = c2;
        y1 c3 = n1.c(Boolean.FALSE);
        this.D = c3;
        this.E = n1.c(new com.github.rudroid.shortcuts.a((wm.b) c.getValue(), ((Boolean) c3.getValue()).booleanValue(), (g1) c2.getValue()));
        Q();
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new d(this, null), 3);
    }

    public final void P() {
        wm.b bVar = this.w;
        StoredShortcutModel storedShortcutModel = bVar instanceof StoredShortcutModel ? (StoredShortcutModel) bVar : null;
        String str = storedShortcutModel != null ? storedShortcutModel.r : null;
        y1 y1Var = this.A;
        if (str == null || str.length() == 0) {
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new g((wm.b) y1Var.getValue(), this, this.x, null), 3);
        } else {
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new k((wm.b) y1Var.getValue(), this, this.x, str, null), 3);
        }
    }

    public final void Q() {
        q1 q1Var = this.C;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        ShortcutScope.SpecificRepository specificRepository = ((ShortcutConfigurationModel) this.A.getValue()).v;
        boolean z = specificRepository instanceof ShortcutScope.SpecificRepository;
        y1 y1Var = this.D;
        if (!z) {
            Boolean bool = Boolean.FALSE;
            y1Var.getClass();
            y1Var.k((Object) null, bool);
            return;
        }
        ShortcutScope.SpecificRepository specificRepository2 = specificRepository;
        if (this.v.d().f(com.github.rudroid.common.a.E)) {
            this.C = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new i(this, specificRepository2, null), 3);
            return;
        }
        Boolean bool2 = Boolean.FALSE;
        y1Var.getClass();
        y1Var.k((Object) null, bool2);
    }

    public final void R(com.github.service.models.response.shortcuts.a aVar, j71.c cVar) {
        k71.k.g(aVar, "scope");
        ArrayList arrayList = bm.e.a;
        y1 y1Var = this.A;
        ArrayList c = bm.e.c(aVar, ((ShortcutConfigurationModel) y1Var.getValue()).w);
        ShortcutConfigurationModel c2 = ShortcutConfigurationModel.c((ShortcutConfigurationModel) y1Var.getValue(), c, null, null, aVar, null, null, 109);
        y1Var.getClass();
        y1Var.k((Object) null, c2);
        cVar.k(c);
        Q();
    }
}
