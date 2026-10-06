package com.github.rudroid.searchandfilter.complexfilter.explore;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import com.github.service.models.response.Language;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends com.github.rudroid.searchandfilter.complexfilter.b<Language> implements com.github.rudroid.searchandfilter.complexfilter.d0<a> {
    public static final /* synthetic */ int D = 0;
    public am.b C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(am.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.i0(new com.github.rudroid.profile.ui.h(24, (byte) 0)));
        k71.k.g(bVar, "fetchLanguageFiltersUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.C = bVar;
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        j jVar2;
        int i;
        if (cVar2 instanceof j) {
            jVar2 = (j) cVar2;
            int i2 = jVar2.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.w = i2 - Integer.MIN_VALUE;
                Object obj = jVar2.u;
                b71.a aVar = b71.a.r;
                i = jVar2.w;
                if (i != 0) {
                    sy.y.j(obj);
                    jVar2.w = 1;
                    obj = this.C.a(jVar, cVar, jVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return new i((y71.i) obj);
            }
        }
        jVar2 = new j(this, (c71.c) cVar2);
        Object obj2 = jVar2.u;
        b71.a aVar2 = b71.a.r;
        i = jVar2.w;
        if (i != 0) {
        }
        return new i((y71.i) obj2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        Language language = (Language) obj;
        k71.k.g(language, "value");
        k71.k.g(str, "query");
        return t71.p.I(language.r, str, true);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final androidx.lifecycle.o0 getData() {
        return d1.l(this.v, new com.github.rudroid.repository.branches.y(29));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        a aVar = (a) obj;
        k71.k.g(aVar, "item");
        W(aVar.a, aVar.b);
    }
}
