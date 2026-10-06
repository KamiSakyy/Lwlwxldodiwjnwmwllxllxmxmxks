package e50;

import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.z6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.i0, a71.g, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ e s = new e(3);
    public static final /* synthetic */ e t = new e(4);
    public static final /* synthetic */ e u = new e(5);
    public static final /* synthetic */ e v = new e(6);
    public final /* synthetic */ int r;

    public /* synthetic */ e(int i) {
        this.r = i;
    }

    public static final void a(e eVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(x61.n.F(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new o8.a(intValue, ((Number) it2.next()).intValue()));
            }
            x61.m.J(arrayList, arrayList2);
        }
        x61.m.K0(arrayList);
    }

    public static final boolean b(h91.a0Shadow a0Var) {
        h91.a0Shadow a0Var2 = i91.h.v;
        return !t71.w.x(a0Var.b(), ".class", true);
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.l0.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.h.b();
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return (String) b7.b0.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.b();
                Boolean bool = (Boolean) o8.d.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        hc0.o8.Companion.getClass();
        aa.q0 q0Var = hc0.o8.l;
        k71.k.g(q0Var, "type");
        List list = f50.a.a;
        List list2 = f50.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == e.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(h.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(e.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0019, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        List list;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            list = (List) bVar.a(str, new k81.d(com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer(), 0));
        }
        list = x61.rShadow.r;
        return new NotificationRepositoriesFilter(list);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

    public String toString() {
        switch (this.r) {
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
    public Object k(Object p1, Object p2, Object p3) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
