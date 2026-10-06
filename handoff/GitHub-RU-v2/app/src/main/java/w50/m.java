package w50;

import aa.p0;
import aa.q0;
import android.graphics.Path;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.Separator;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.z6;
import hc0.tb;
import java.util.Arrays;
import java.util.List;
import k81.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aa.i0, bm.k, com.google.android.gms.measurement.internal.x, k3.w {
    public static final /* synthetic */ m s = new m(3);
    public static final /* synthetic */ m t = new m(4);
    public static final /* synthetic */ m u = new m(5);
    public final /* synthetic */ int r;

    public /* synthetic */ m(int i) {
        this.r = i;
    }

    public static final float a(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f11 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f11;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (abs - f3) / (f5 - f3)))) + f2) * signum;
    }

    public static Path b(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.K.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                j8.s.a();
                return Integer.valueOf((int) ((Long) l8.d.b()).longValue());
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) i8.a.b();
                bool.getClass();
                return bool;
        }
    }

    public aa.m d() {
        tb.Companion.getClass();
        q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List list = x50.b.a;
        List list2 = x50.b.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == m.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(q.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(m.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 == null) goto L7;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        cm.a aVar;
        String str2;
        switch (this.r) {
            case 1:
                if (str != null) {
                    l81.b bVar = l81.c.d;
                    bVar.getClass();
                    aVar = (cm.a) bVar.a(str, new k81.z("com.github.domain.searchandfilter.filters.data.agent.AgentTaskStatus", cm.a.values()));
                    break;
                }
                aVar = AgentTasksStateFilter.y;
                return new AgentTasksStateFilter(aVar);
            default:
                if (str != null) {
                    l81.b bVar2 = l81.c.d;
                    bVar2.getClass();
                    str2 = (String) bVar2.a(str, q1.a);
                    break;
                }
                str2 = "separator";
                return new Separator(str2);
        }
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }

}
