package z70;

import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.google.android.gms.internal.measurement.a9;
import hc0.lk;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ w s = new w(2);
    public static final /* synthetic */ w t = new w(3);
    public static final /* synthetic */ w u = new w(4);
    public static final /* synthetic */ w v = new w(5);
    public final /* synthetic */ int r;

    public /* synthetic */ w(int i) {
        this.r = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(h91.h hVar, String str) {
        int i;
        String str2;
        k71.k.g(str, "value");
        String[] strArr = ea.a.y;
        hVar.J0(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    hVar.O0(i2, str, i);
                }
                hVar.P0(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                hVar.P0(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            hVar.O0(i2, str, length);
        }
        hVar.J0(34);
    }

    public Object c() {
        switch (this.r) {
            case 2:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.h7.a.b()).booleanValue());
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l = (Long) com.google.android.gms.internal.measurement.b7.I.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                com.google.android.gms.internal.measurement.z6.s.a();
                Long l2 = (Long) com.google.android.gms.internal.measurement.b7.d0.b();
                l2.getClass();
                return l2;
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) a9.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List list = a80.d.a;
        List list2 = a80.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == w.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(y.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(w.class).hashCode();
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
        com.github.rudroid.common.h hVar;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            hVar = (com.github.rudroid.common.h) bVar.a(str, new k81.z("com.github.rudroid.common.DiscussionStatus", com.github.rudroid.common.h.values()));
        }
        hVar = DiscussionStatusFilter.x;
        return new DiscussionStatusFilter(hVar);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
