package com.github.rudroid.utilities;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 {
    public static final void a(androidx.fragment.app.a0 a0Var, j71.a aVar) {
        k71.k.g(a0Var, "<this>");
        androidx.fragment.app.a0 F = a0Var.x3().F("CreateAgentTaskBottomSheetTag");
        if (F != null) {
            androidx.lifecycle.e0 e0Var = F.j0;
            if (e0Var.v != androidx.lifecycle.w.r) {
                e0Var.h(new y0(a0Var, aVar));
                return;
            }
        }
        if (a0Var.I3()) {
            aVar.a();
        }
    }

    public static final void b(androidx.fragment.app.a0 a0Var, List list, k71.e eVar) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                sy.d0.x();
                throw null;
            }
            com.github.rudroid.main.navigation.f.c(sy.s.i(a0Var), obj, sy.t.o(new com.github.rudroid.agents.sessionevents.w1(i, eVar, 3)), 4);
            i = i2;
        }
    }
}
