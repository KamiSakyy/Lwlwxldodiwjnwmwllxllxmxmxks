package com.github.rudroid.searchandfilter.complexfilter;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import com.github.rudroid.viewmodels.x3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b<T> extends k1 implements f0, x3 {
    public static final /* synthetic */ r71.e[] B;
    public static final a Companion;
    public q1 A;
    public com.github.rudroid.activities.util.a s;
    public h0 t;
    public Object u;
    public p0 v;
    public x01.i w;
    public ArrayList x;
    public j y;
    public y1 z;

    public static final class a {
        public static Bundle a(Parcelable[] parcelableArr) {
            k71.k.g(parcelableArr, "preselected");
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("BaseLocalSearchViewModel_key_preselected", parcelableArr);
            return bundle;
        }
    }

    static {
        r71.e mVar = new k71.m(b.class, "queryValue", "getQueryValue()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        B = new r71.e[]{mVar};
        Companion = new a();
    }

    public b(com.github.rudroid.activities.util.c cVar, a1 a1Var, h0 h0Var) {
        ArrayList arrayList;
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = cVar;
        this.t = h0Var;
        Object[] objArr = (Object[]) a1Var.a("BaseLocalSearchViewModel_key_preselected");
        if (objArr != null) {
            List g0 = x61.l.g0(objArr);
            arrayList = new ArrayList();
            for (T t : g0) {
                if (Boolean.TRUE.booleanValue()) {
                    arrayList.add(t);
                }
            }
        } else {
            arrayList = x61.r.r;
        }
        this.u = arrayList;
        this.v = new p0();
        this.w = new x01.i((String) null, false, true);
        this.x = new ArrayList();
        this.y = new j(this);
        y1 c = n1.c("");
        this.z = c;
        this.t.d(arrayList);
        n1.A(new y71.y(new y00.l(c, 10), new com.github.rudroid.searchandfilter.complexfilter.a(this, null), 6), d1.k(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        f fVar;
        int i;
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i2 = fVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.y = i2 - Integer.MIN_VALUE;
                Object obj = fVar.w;
                b71.a aVar = b71.a.r;
                i = fVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    oa.j d = bVar.s.d();
                    fVar.u = jVar;
                    fVar.v = cVar;
                    fVar.y = 1;
                    obj = bVar.R(d, str, cVar, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = fVar.v;
                    jVar = fVar.u;
                    sy.y.j(obj);
                }
                return n1.I((y71.i) obj, new e(null, bVar, jVar, cVar));
            }
        }
        fVar = new f(bVar, cVar2);
        Object obj2 = fVar.w;
        b71.a aVar2 = b71.a.r;
        i = fVar.y;
        if (i != 0) {
        }
        return n1.I((y71.i) obj2, new e(null, bVar, jVar, cVar));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
    }

    public final void Q(String str) {
        y1 y1Var = this.z;
        y1Var.getClass();
        y1Var.k((Object) null, str);
    }

    public abstract Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2);

    public final void S() {
        fl.f.Companion.getClass();
        this.v.j(fl.e.b(x61.r.r));
        y yVar = new y(1, this);
        q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.A = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new d(this, yVar, null), 3);
    }

    public abstract boolean T(Object obj, String str);

    public final List U() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.x;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (T(obj, (String) this.y.t(this, B[0]))) {
                arrayList.add(obj);
            }
        }
        return this.t.c(arrayList, x61.r.r);
    }

    public final void V(String str) {
        k71.k.g(str, "<set-?>");
        this.y.y(str, B[0]);
    }

    public final void W(Object obj, boolean z) {
        this.t.e(obj, z);
        fl.e eVar = fl.f.Companion;
        List U = U();
        eVar.getClass();
        this.v.j(fl.e.c(U));
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.w;
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final fl.g s() {
        fl.g gVar;
        fl.f fVar = (fl.f) this.v.d();
        return (fVar == null || (gVar = fVar.a) == null) ? fl.g.r : gVar;
    }
}
