package com.github.rudroid.searchandfilter.complexfilter.category;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import sy.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends com.github.rudroid.searchandfilter.complexfilter.b<DiscussionCategoryData> implements d0<com.github.rudroid.searchandfilter.complexfilter.category.a> {
    public static final a Companion = new a();
    public final ik.n C;
    public final v71.v D;
    public final String E;
    public final String F;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ik.n nVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v71.v vVar) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.t(new com.github.rudroid.profile.ui.h(23, (byte) 0)));
        k71.k.g(nVar, "fetchUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        this.C = nVar;
        this.D = vVar;
        String str = (String) a1Var.a("SelectableDiscussionCategorySearchViewModel key_owner");
        if (str == null) {
            throw new IllegalStateException("owner must be set");
        }
        this.E = str;
        String str2 = (String) a1Var.a("SelectableDiscussionCategorySearchViewModel key_repository");
        if (str2 == null) {
            throw new IllegalStateException("repository must be set");
        }
        this.F = str2;
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        n nVar;
        int i;
        if (cVar2 instanceof n) {
            nVar = (n) cVar2;
            int i2 = nVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.w = i2 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.u;
                b71.a aVar = b71.a.r;
                i = nVar2.w;
                if (i != 0) {
                    y.j(obj);
                    nVar2.w = 1;
                    obj = this.C.a(jVar, this.E, this.F, false, str, cVar, nVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return new m((y71.i) obj);
            }
        }
        nVar = new n(this, (c71.c) cVar2);
        n nVar22 = nVar;
        Object obj2 = nVar22.u;
        b71.a aVar2 = b71.a.r;
        i = nVar22.w;
        if (i != 0) {
        }
        return new m((y71.i) obj2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        DiscussionCategoryData discussionCategoryData = (DiscussionCategoryData) obj;
        k71.k.g(discussionCategoryData, "value");
        k71.k.g(str, "query");
        return t71.p.I(discussionCategoryData.s, str, true) || t71.p.I(discussionCategoryData.w, str, true);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.v, new com.github.rudroid.repository.branches.y(28));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.category.a aVar = (com.github.rudroid.searchandfilter.complexfilter.category.a) obj;
        k71.k.g(aVar, "item");
        W(aVar.a, aVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o0<T1,T2,T3,T4> {
        public o0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z<T1,T2,T3,T4> {
        public z() {
        }
    }
}
