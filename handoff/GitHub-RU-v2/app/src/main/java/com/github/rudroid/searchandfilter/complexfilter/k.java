package com.github.rudroid.searchandfilter.complexfilter;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.viewmodels.x3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import t00.f8;
import v71.q1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k<T> extends k1 implements f0, x3 {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] D;
    public ArrayList A;
    public r B;
    public y1 C;
    public com.github.rudroid.activities.util.a s;
    public h0 t;
    public q1 u;
    public Object v;
    public Object w;
    public y1 x;
    public androidx.lifecycle.h y;
    public x01.i z;

    public static final class a {
        public static void a(Parcelable[] parcelableArr, Bundle bundle) {
            k71.k.g(parcelableArr, "preselected");
            bundle.putParcelableArray("BaseSearchViewModel_key_preselected", parcelableArr);
        }
    }

    static {
        r71.e mVar = new k71.m(k.class, "queryValue", "getQueryValue()Ljava/lang/String;", 0);
        k71.xShadow.a.getClass();
        D = new r71.e[]{mVar};
        Companion = new a();
    }

    public k(com.github.rudroid.activities.util.a aVar, a1 a1Var, h0 h0Var, j71.c cVar) {
        k71.k.g(aVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = aVar;
        this.t = h0Var;
        ArrayList arrayList = x61.rShadow.r;
        this.v = arrayList;
        Object[] objArr = (Object[]) a1Var.a("BaseSearchViewModel_key_preselected");
        if (objArr != null) {
            List g0 = x61.l.g0(objArr);
            ArrayList arrayList2 = new ArrayList();
            for (T t : g0) {
                if (((Boolean) cVar.k(t)).booleanValue()) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        }
        this.w = arrayList;
        y1 c = n1Shadow.c((Object) null);
        this.x = c;
        this.y = d1.a(new f8(23, new y71.p(new com.github.rudroid.repository.branches.y(26), new y00.l(c, 10), (a71.c) null)));
        this.z = new x01.i((String) null, false, true);
        this.A = new ArrayList();
        this.B = new r(this);
        y1 c2 = n1Shadow.c("");
        this.C = c2;
        this.t.d(arrayList);
        n1Shadow.A(new y71.y(new y00.l(n1Shadow.o(c2, 250L), 10), new q(this, null), 6), d1.k(this));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        String str = (String) this.B.t(this, D[0]);
        q1 q1Var = this.u;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.u = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new p(this, str, null), 3);
    }

    public final void P(String str) {
        y1 y1Var = this.C;
        y1Var.getClass();
        y1Var.k((Object) null, str);
    }

    public abstract Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final List R() {
        return this.t.c(this.A, this.v);
    }

    public final void S(String str) {
        k71.k.g(str, "<set-?>");
        this.B.y(str, D[0]);
    }

    public final void T(Object obj, boolean z) {
        this.t.e(obj, z);
        fl.e eVar = fl.f.Companion;
        List R = R();
        eVar.getClass();
        fl.f c = fl.e.c(R);
        y1 y1Var = this.x;
        y1Var.getClass();
        y1Var.k((Object) null, c);
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.z;
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final fl.g s() {
        fl.g gVar;
        fl.f fVar = (fl.f) this.y.d();
        return (fVar == null || (gVar = fVar.a) == null) ? fl.g.r : gVar;
    }
}
