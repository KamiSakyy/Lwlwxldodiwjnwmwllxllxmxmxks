package k50;

import aa.i0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import b21.l;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import hc0.o8;
import java.util.List;
import k81.c1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import l01.w0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements i0, t6.b, bm.k, x, j7.b {
    public static final /* synthetic */ c s = new c(3);
    public static final /* synthetic */ c t = new c(4);
    public static final /* synthetic */ c u = new c(5);
    public static final /* synthetic */ c v = new c(6);
    public final /* synthetic */ int r;

    public /* synthetic */ c(int i) {
        this.r = i;
    }

    public void a(int i, Object obj) {
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                return (String) b7.n.b();
            case 4:
                List list2 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.t.b()).longValue());
            case 5:
                List list3 = c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.v.b()).longValue());
            default:
                return new Boolean(((Boolean) r8.a.b()).booleanValue());
        }
    }

    public m d() {
        o8.Companion.getClass();
        q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List list = l50.a.a;
        List list2 = l50.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == c.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(d.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(c.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list = r.r;
        if (str != null) {
            l81.b bVar = l81.c.d;
            l lVar = ((l81.c) bVar).b;
            k71.e a = k71.x.a(w0.class);
            k71.k.g(lVar, "module");
            KSerializer a2 = lVar.a(a, list);
            if (a2 == null) {
                throw new SerializationException(c1.k(a));
            }
            List list2 = (List) bVar.a(str, new k81.d(a2, 0));
            if (list2 != null) {
                list = list2;
            }
        }
        return new com.github.domain.searchandfilter.filters.data.e(list);
    }

    public void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }



}
