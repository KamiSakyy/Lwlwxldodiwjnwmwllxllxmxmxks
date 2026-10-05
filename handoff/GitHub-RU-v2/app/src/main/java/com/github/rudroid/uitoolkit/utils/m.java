package com.github.rudroid.uitoolkit.utils;

import android.view.View;
import androidx.compose.runtime.f1;
import w2.j0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final f1 a(androidx.compose.runtime.s sVar) {
        Object N = sVar.N();
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        if (N == iVar) {
            N = androidx.compose.runtime.t.B(Boolean.FALSE);
            sVar.n0(N);
        }
        f1 f1Var = (f1) N;
        View view = (View) sVar.j(j0.f);
        boolean h = sVar.h(view);
        Object N2 = sVar.N();
        if (h || N2 == iVar) {
            N2 = new com.github.rudroid.repositories.repositoryownerrepositories.d(view, f1Var, 14);
            sVar.n0(N2);
        }
        androidx.compose.runtime.t.c(view, (j71.c) N2, sVar);
        return f1Var;
    }
}
