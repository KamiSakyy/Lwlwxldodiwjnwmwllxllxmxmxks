package rb0;

import aa.i0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import android.content.Context;
import bm.k;
import com.github.domain.searchandfilter.filters.data.RepositoryVisibilityFilter;
import com.github.rudroid.common.j0;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import d2.e0;
import ea.f;
import hc0.ap;
import java.util.ArrayList;
import java.util.List;
import k21.d;
import k81.z;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements i0, k, x, d {
    public static final /* synthetic */ b s = new b(3);
    public static final /* synthetic */ b t = new b(4);
    public static final /* synthetic */ b u = new b(5);
    public final /* synthetic */ int r;

    public /* synthetic */ b(int i) {
        this.r = i;
    }

    public static e0 a(List list, float f, float f2, int i) {
        return new e0(list, (ArrayList) null, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), 0);
    }

    public static e0 b(List list) {
        return new e0(list, (ArrayList) null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L), 0);
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                Long l = (Long) b7.U.b();
                l.getClass();
                return l;
            case 4:
                List list2 = c0.a;
                z6.s.a();
                return (String) b7.g.b();
            default:
                List list3 = c0.a;
                Boolean bool = (Boolean) t7.a.b();
                bool.getClass();
                return bool;
        }
    }

    public m d() {
        ap.Companion.getClass();
        q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        List list = sb0.a.a;
        List list2 = sb0.a.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == b.class;
            default:
                return super.equals(obj);
        }
    }

    public k21.c f(Context context, String str, k21.b bVar) {
        k21.c cVar = new k21.c();
        int b = bVar.b(context, str);
        cVar.a = b;
        if (b != 0) {
            cVar.c = -1;
            return cVar;
        }
        int a = bVar.a(context, str, true);
        cVar.b = a;
        if (a != 0) {
            cVar.c = 1;
        }
        return cVar;
    }

    public p0 g() {
        return aa.c.c(c.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(b.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        j0 j0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            j0Var = (j0) bVar.a(str, new z("com.github.rudroid.common.RepositoryVisibility", j0.values()));
        }
        j0Var = RepositoryVisibilityFilter.x;
        return new RepositoryVisibilityFilter(j0Var);
    }

    public void o(f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }




    public Object b(Object p1, Object p2, Object p3) { return null; }
}
