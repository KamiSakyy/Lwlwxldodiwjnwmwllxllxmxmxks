package com.github.service.wrapper;

import aa.n0;
import aa.w0;
import in.r;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public interface a {
    static y71.i b(a aVar, w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar, int i) {
        if ((i & 2) != 0) {
            hVar = ga.h.s;
        }
        ga.h hVar2 = hVar;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = r.a;
        }
        Set set3 = set;
        if ((i & 16) != 0) {
            set2 = r.b;
        }
        Set set4 = set2;
        if ((i & 32) != 0) {
            eVar = new com.github.rudroid.widget.contribution.a(3);
        }
        return aVar.g(w0Var, hVar2, z2, set3, set4, eVar, cVar);
    }

    static y71.i o(a aVar, w0 w0Var, ga.h hVar, boolean z, LinkedHashSet linkedHashSet, Set set, int i) {
        if ((i & 2) != 0) {
            hVar = ga.h.s;
        }
        ga.h hVar2 = hVar;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        Set set2 = linkedHashSet;
        if ((i & 8) != 0) {
            set2 = r.a;
        }
        Set set3 = set2;
        if ((i & 16) != 0) {
            set = r.b;
        }
        return aVar.l(w0Var, hVar2, z2, set3, set, new com.github.rudroid.utilities.ui.emojipicker.e(14));
    }

    y71.i d(n0 n0Var);

    y71.i g(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar);

    y71.i l(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar);
}
