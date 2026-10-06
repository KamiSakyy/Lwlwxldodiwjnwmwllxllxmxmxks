package com.github.rudroid.utilities.viewmodel;

import androidx.lifecycle.a1;
import com.github.rudroid.activities.util.o;
import com.github.rudroid.utilities.w0;
import k71.k;
import oa.m;
import rh.cShadow;
import rh.d;
import rh.e;
import t71.p;
import x61.rShadow;
import y71.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements b {
    public a1 r;
    public m s;

    public c(a1 a1Var, m mVar) {
        k.g(a1Var, "savedStateHandle");
        k.g(mVar, "userManager");
        this.r = a1Var;
        this.s = mVar;
    }

    public final void a(g1 g1Var, fl.b bVar, boolean z) {
        rh.f bVar2;
        rh.f aVar;
        rh.f bVar3;
        k.g(g1Var, "<this>");
        k.g(bVar, "executionError");
        o.Companion.getClass();
        a1 a1Var = this.r;
        k.g(a1Var, "savedStateHandle");
        String str = (String) a1Var.a("EXTRA_URL");
        if (str == null) {
            str = "";
        }
        Boolean bool = (Boolean) a1Var.a("EXTRA_IS_IN_APP_NAVIGATION");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str2 = (String) a1Var.a("EXTRA_USER_PRESET");
        Boolean bool2 = (Boolean) a1Var.a("EXTRA_NEEDS_ACTIVE_ACCOUNT_NOTIFICATION");
        new o(str, str2, booleanValue, bool2 != null ? bool2.booleanValue() : false);
        m mVar = this.s;
        k.g(mVar, "userManager");
        fl.cShadow cVar = bVar.a;
        if (cVar == fl.cShadow.x) {
            aVar = new e.b(bVar);
        } else if (cVar == fl.cShadow.E) {
            aVar = new e.a(bVar);
        } else if (cVar == fl.cShadow.y) {
            aVar = new d.a(bVar);
        } else if (cVar != fl.cShadow.B || ((p.T(str) || booleanValue) && bVar.h == null)) {
            if (cVar == fl.cShadow.A && !p.T(str) && !booleanValue) {
                if ((!p.T(str) ? mVar.j(str) : rShadow.r).size() > 1) {
                    aVar = new d.c(bVar);
                }
            }
            if (cVar == fl.cShadow.r) {
                bVar3 = new cShadow.C0030c(bVar, z);
            } else {
                if (cVar == fl.cShadow.u) {
                    bVar2 = new cShadow.d(bVar, bVar.a(), z);
                } else if (cVar == fl.cShadow.L) {
                    bVar3 = new cShadow.b(bVar, 2131952514, bVar.a(), z);
                } else {
                    String str3 = bVar.b;
                    if (str3 != null) {
                        aVar = new cShadow.a(bVar, str3, bVar.a(), z);
                    } else {
                        bVar2 = new cShadow.b(bVar, 2131952512, bVar.a(), z);
                    }
                }
                aVar = bVar2;
            }
            aVar = bVar3;
        } else {
            aVar = new d.b(bVar);
        }
        w0.q(g1Var, aVar);
    }
}
