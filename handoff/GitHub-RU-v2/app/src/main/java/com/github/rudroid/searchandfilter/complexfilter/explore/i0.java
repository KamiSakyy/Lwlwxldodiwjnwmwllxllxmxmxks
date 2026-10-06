package com.github.rudroid.searchandfilter.complexfilter.explore;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import com.github.service.models.response.SpokenLanguage;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 extends com.github.rudroid.searchandfilter.complexfilter.b<SpokenLanguage> implements com.github.rudroid.searchandfilter.complexfilter.d0<u> {
    public static final /* synthetic */ int D = 0;
    public am.d C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(am.d dVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.i0(new com.github.rudroid.profile.ui.hShadow(25, (byte) 0)));
        k71.k.g(dVar, "fetchSpokenLanguageFiltersUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.C = dVar;
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        e0 e0Var;
        int i;
        if (cVar2 instanceof e0) {
            e0Var = (e0) cVar2;
            int i2 = e0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = e0Var.u;
                b71.a aVar = b71.a.r;
                i = e0Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    e0Var.w = 1;
                    obj = this.C.a(jVar, cVar, e0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return new d0((y71.i) obj);
            }
        }
        e0Var = new e0(this, (c71.c) cVar2);
        Object obj2 = e0Var.u;
        b71.a aVar2 = b71.a.r;
        i = e0Var.w;
        if (i != 0) {
        }
        return new d0((y71.i) obj2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        SpokenLanguage spokenLanguage = (SpokenLanguage) obj;
        k71.k.g(spokenLanguage, "value");
        k71.k.g(str, "query");
        return t71.p.I(spokenLanguage.r, str, true);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final androidx.lifecycle.o0 getData() {
        return d1.l(this.v, new a0(0));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        u uVar = (u) obj;
        k71.k.g(uVar, "item");
        W(uVar.a, uVar.b);
    }
}
