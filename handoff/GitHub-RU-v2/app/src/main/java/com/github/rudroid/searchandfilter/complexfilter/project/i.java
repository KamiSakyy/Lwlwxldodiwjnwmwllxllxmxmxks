package com.github.rudroid.searchandfilter.complexfilter.project;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.rudroid.searchandfilter.complexfilter.h0;
import com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k0;
import com.github.service.models.response.LegacyProjectWithNumber;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends com.github.rudroid.searchandfilter.complexfilter.k<LegacyProjectWithNumber> implements com.github.rudroid.searchandfilter.complexfilter.d0<o> {
    public static final /* synthetic */ int I = 0;
    public km.b E;
    public v71.v F;
    public String G;
    public String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(km.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v71.v vVar) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.t(new k0(2)), new com.github.rudroid.searchandfilter.complexfilter.explore.a0(8));
        k71.k.g(bVar, "searchUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        this.E = bVar;
        this.F = vVar;
        String str = (String) a1Var.a("SelectableProjectSearchBundle key_owner");
        if (str == null) {
            throw new IllegalStateException("owner must be set");
        }
        this.G = str;
        String str2 = (String) a1Var.a("SelectableProjectSearchBundle key_repository");
        if (str2 == null) {
            throw new IllegalStateException("repository must be set");
        }
        this.H = str2;
        h0 h0Var = this.t;
        y1 y1Var = h0Var.b;
        List F0 = x61.m.F0(h0Var.c);
        y1Var.getClass();
        y1Var.k((Object) null, F0);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.k
    public final Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2) {
        return this.E.a(jVar, this.G, this.H, str, str2, cVar, (c71.c) cVar2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.y, new com.github.rudroid.searchandfilter.complexfilter.explore.a0(9));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        o oVar = (o) obj;
        k71.k.g(oVar, "item");
        T(oVar.a, oVar.b);
    }

}
