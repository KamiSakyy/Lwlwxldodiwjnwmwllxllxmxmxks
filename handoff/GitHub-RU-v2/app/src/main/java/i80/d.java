package i80;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import bm.k;
import com.github.domain.searchandfilter.filters.data.ProjectStatusFilter;
import com.github.rudroid.common.f0;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.f8;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import hc0.tm;
import java.util.List;
import k81.z;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements i0, t6.b, k, x, q9.e {
    public static final /* synthetic */ d s = new d(3);
    public static final /* synthetic */ d t = new d(4);
    public static final /* synthetic */ d u = new d(5);
    public static final /* synthetic */ d v = new d(6);
    public final /* synthetic */ int r;

    public /* synthetic */ d(int i) {
        this.r = i;
    }

    public boolean b() {
        return true;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                return (String) b7.u0.b();
            case 4:
                List list2 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.o.b()).longValue());
            case 5:
                List list3 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.w.b()).longValue());
            default:
                return new Boolean(((Boolean) f8.a.b()).booleanValue());
        }
    }

    public m d() {
        tm.Companion.getClass();
        j0 j0Var = tm.d;
        k71.k.g(j0Var, "type");
        List list = j80.a.a;
        List list2 = j80.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == d.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(e.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(d.class).hashCode();
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
        f0 f0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            f0Var = (f0) bVar.a(str, new z("com.github.rudroid.common.ProjectStatus", f0.values()));
        }
        f0Var = ProjectStatusFilter.x;
        return new ProjectStatusFilter(f0Var);
    }

    public void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public void shutdown() {
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
