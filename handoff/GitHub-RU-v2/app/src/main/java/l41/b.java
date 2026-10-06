package l41;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.measurement.internal.u2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements u2 {
    public final /* synthetic */ k1 a;

    public b(k1 k1Var) {
        this.a = k1Var;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void a(String str, String str2, Bundle bundle) {
        k1 k1Var = this.a;
        k1Var.a(new e1(k1Var, str, str2, bundle, true));
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String b() {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new c1(k1Var, i0Var, 3));
        return (String) i0.g(i0Var.f(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String c() {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new c1(k1Var, i0Var, 4));
        return (String) i0.g(i0Var.f(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void d(Bundle bundle) {
        k1 k1Var = this.a;
        k1Var.a(new x0(k1Var, bundle, 1));
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void e(String str) {
        k1 k1Var = this.a;
        k1Var.a(new a1(k1Var, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void f(String str) {
        k1 k1Var = this.a;
        k1Var.a(new a1(k1Var, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final long g() {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new c1(k1Var, i0Var, 2));
        Long l = (Long) i0.g(i0Var.f(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = k1Var.d + 1;
        k1Var.d = i;
        return nextLong + i;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void h(String str, String str2, Bundle bundle) {
        k1 k1Var = this.a;
        k1Var.a(new y0(k1Var, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final List i(String str, String str2) {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new y0(k1Var, str, str2, i0Var, 1));
        List list = (List) i0.g(i0Var.f(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final int j(String str) {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new z0(k1Var, str, i0Var, 1));
        Integer num = (Integer) i0.g(i0Var.f(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String k() {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new c1(k1Var, i0Var, 1));
        return (String) i0.g(i0Var.f(50L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String l() {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new c1(k1Var, i0Var, 0));
        return (String) i0.g(i0Var.f(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final Map m(String str, String str2, boolean z) {
        i0 i0Var = new i0();
        k1 k1Var = this.a;
        k1Var.a(new e1(k1Var, str, str2, z, i0Var));
        Bundle f = i0Var.f(5000L);
        if (f == null || f.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(f.size());
        for (String str3 : f.keySet()) {
            Object obj = f.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}
