package w80;

import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.z6;
import hc0.ap;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, e51.b, l7.s1 {
    public static final /* synthetic */ n3 s = new n3(3);
    public static final /* synthetic */ n3 t = new n3(4);
    public static final /* synthetic */ n3 u = new n3(5);
    public final /* synthetic */ int r;

    public /* synthetic */ n3(int i) {
        this.r = i;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.S.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.u.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                return Integer.valueOf((int) ((Long) e7.a.b()).longValue());
        }
    }

    public aa.m d() {
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        List list = x80.k.a;
        List list2 = x80.k.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == n3.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(o3.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(n3.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // bm.k
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        switch (this.r) {
            case 1:
                if (str == null) {
                    str = "";
                }
                return new CustomFilter(str);
            default:
                if (str != null) {
                    l81.b bVar = l81.c.d;
                    bVar.getClass();
                    com.github.domain.searchandfilter.filters.data.i iVar = (com.github.domain.searchandfilter.filters.data.i) bVar.a(str, com.github.domain.searchandfilter.filters.data.i.Companion.serializer());
                    if (iVar != null) {
                        return iVar;
                    }
                }
                com.github.domain.searchandfilter.filters.data.i.Companion.getClass();
                return com.github.domain.searchandfilter.filters.data.i.w;
        }
    }

    public long n(long j) {
        return -1L;
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
