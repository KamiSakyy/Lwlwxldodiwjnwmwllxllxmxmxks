package com.github.rudroid.searchandfilter.complexfilter.repository;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.rudroid.common.i0;
import com.github.rudroid.repository.branches.y;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k0;
import com.github.service.models.response.SimpleRepository;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends com.github.rudroid.searchandfilter.complexfilter.k<SimpleRepository> implements d0<r> {
    public static final C0001a Companion = new C0001a();
    public final kj.n E;
    public final kj.q F;
    public final v71.v G;
    public final i0 H;

    /* renamed from: com.github.rudroid.searchandfilter.complexfilter.repository.a$a, reason: collision with other inner class name */
    public static final class C0001a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kj.n nVar, kj.q qVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v71.v vVar) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.t(new k0(4)), new y(27));
        k71.k.g(nVar, "searchUseCase");
        k71.k.g(qVar, "fetchTopRepositoriesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        this.E = nVar;
        this.F = qVar;
        this.G = vVar;
        i0 i0Var = (i0) a1Var.a("SelectableRepositoriesSearchViewModel_key_filter");
        this.H = i0Var == null ? i0.r : i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r13 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r13 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2) {
        i iVar;
        int i;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i2 = iVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.w = i2 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.u;
                b71.a aVar = b71.a.r;
                i = iVar2.w;
                if (i == 0) {
                    if (i == 1) {
                        sy.y.j(obj);
                        return new e((y71.i) obj);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return new h((y71.i) obj);
                }
                sy.y.j(obj);
                if (str.length() == 0) {
                    v01.d dVar = v01.d.r;
                    iVar2.w = 1;
                    obj = this.F.a(jVar, str2, dVar, this.H, cVar, iVar2);
                } else {
                    iVar2.w = 2;
                    obj = this.E.a(jVar, str, str2, this.H, cVar, iVar2);
                }
                return aVar;
            }
        }
        iVar = new i(this, (c71.c) cVar2);
        i iVar22 = iVar;
        Object obj2 = iVar22.u;
        b71.a aVar2 = b71.a.r;
        i = iVar22.w;
        if (i == 0) {
        }
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.y, new a0(12));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        r rVar = (r) obj;
        k71.k.g(rVar, "item");
        T(rVar.a, rVar.b);
    }
}
