package c30;

import androidx.datastore.core.CorruptionException;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.z6;
import hc0.kz;
import java.io.File;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, n5.b {
    public static final /* synthetic */ o0 s = new o0(3);
    public static final /* synthetic */ o0 t = new o0(4);
    public static final /* synthetic */ o0 u = new o0(5);
    public static final /* synthetic */ o0 v = new o0(6);
    public final /* synthetic */ int r;

    public /* synthetic */ o0(int i) {
        this.r = i;
    }

    public static h91.a0 b(String str, boolean z) {
        k71.k.g(str, "<this>");
        h91.kShadow kVar = i91.c.a;
        h91.h hVar = new h91.h();
        hVar.P0(str);
        return i91.c.d(hVar, z);
    }

    public static h91.a0 e(File file) {
        String str = h91.a0.s;
        k71.k.g(file, "<this>");
        String file2 = file.toString();
        k71.k.f(file2, "toString(...)");
        return b(file2, false);
    }

    public Object a(CorruptionException corruptionException) {
        throw corruptionException;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.e.b();
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.V.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.D.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) k7.b.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        kz.Companion.getClass();
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List list = d30.e.a;
        List list2 = d30.e.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == o0.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(p0.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(o0.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        if (str == null) {
            return null;
        }
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return new NotificationFilterFilter((com.github.domain.searchandfilter.filters.data.notification.a) bVar.a(str, com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer()));
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
