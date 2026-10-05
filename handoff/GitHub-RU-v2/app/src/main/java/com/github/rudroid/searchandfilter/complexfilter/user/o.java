package com.github.rudroid.searchandfilter.complexfilter.user;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.rudroid.repository.branches.y;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import com.github.rudroid.searchandfilter.complexfilter.h0;
import com.github.rudroid.searchandfilter.complexfilter.k;
import java.util.List;
import v71.a0;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o extends com.github.rudroid.searchandfilter.complexfilter.k<yz0.f> implements d0<j> {
    public static final a Companion = new a();
    public final lm.f E;
    public final lm.b F;
    public final String G;
    public final String H;

    public static final class a {
        public static Bundle a(String str, String str2, List list) {
            k71.k.g(str, "owner");
            k71.k.g(str2, "repository");
            k71.k.g(list, "preselected");
            Bundle bundle = new Bundle();
            k.a aVar = com.github.rudroid.searchandfilter.complexfilter.k.Companion;
            Parcelable[] parcelableArr = (Parcelable[]) list.toArray(new yz0.f[0]);
            aVar.getClass();
            k.a.a(parcelableArr, bundle);
            bundle.putString("RepositoryUsersBaseViewModel key_owner", str);
            bundle.putString("RepositoryUsersBaseViewModel key_repository", str2);
            return bundle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lm.f fVar, lm.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, h0 h0Var) {
        super(cVar, a1Var, h0Var, new y(27));
        k71.k.g(fVar, "fetchRepositoryAssignableUsersUseCase");
        k71.k.g(bVar, "fetchAssigneeUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.E = fVar;
        this.F = bVar;
        String str = (String) a1Var.a("RepositoryUsersBaseViewModel key_owner");
        if (str == null) {
            throw new IllegalStateException("owner must be set");
        }
        this.G = str;
        String str2 = (String) a1Var.a("RepositoryUsersBaseViewModel key_repository");
        if (str2 == null) {
            throw new IllegalStateException("repository must be set");
        }
        this.H = str2;
        b0.z(d1.k(this), (a71.h) null, (a0) null, new n(this, cVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object U(o oVar, oa.j jVar, String str, String str2, j71.c cVar, c71.c cVar2) {
        p pVar;
        int i;
        oa.j jVar2;
        String str3;
        String str4;
        if (cVar2 instanceof p) {
            pVar = (p) cVar2;
            int i2 = pVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.z = i2 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.x;
                b71.a aVar = b71.a.r;
                i = pVar2.z;
                if (i != 0) {
                    sy.y.j(obj);
                    lm.f fVar = oVar.E;
                    String str5 = oVar.G;
                    String str6 = oVar.H;
                    pVar2.u = jVar;
                    pVar2.v = str;
                    pVar2.w = str2;
                    pVar2.z = 1;
                    obj = fVar.a(jVar, str5, str6, str, str2, cVar, pVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    jVar2 = jVar;
                    str3 = str;
                    str4 = str2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = pVar2.w;
                    str3 = pVar2.v;
                    jVar2 = pVar2.u;
                    sy.y.j(obj);
                }
                return new s((y71.i) obj, str4, str3, jVar2);
            }
        }
        pVar = new p(oVar, cVar2);
        p pVar22 = pVar;
        Object obj2 = pVar22.x;
        b71.a aVar2 = b71.a.r;
        i = pVar22.z;
        if (i != 0) {
        }
        return new s((y71.i) obj2, str4, str3, jVar2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.k
    public final Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2) {
        return U(this, jVar, str, str2, cVar, (c71.c) cVar2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.y, new com.github.rudroid.searchandfilter.complexfilter.explore.a0(13));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o0<T1,T2,T3,T4> {
        public o0() {
        }
    }
}
