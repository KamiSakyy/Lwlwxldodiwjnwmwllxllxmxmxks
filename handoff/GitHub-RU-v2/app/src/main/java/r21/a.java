package r21;

import a5.q1;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.foundation.lazy.layout.s0;
import c21.u;
import com.google.android.gms.measurement.internal.b3;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.j2;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.t2;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import w80.w3;
import x.e;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends c {
    public final o1 a;
    public final t2 b;

    public a(o1 o1Var) {
        u.g(o1Var);
        this.a = o1Var;
        t2 t2Var = o1Var.D;
        o1.l(t2Var);
        this.b = t2Var;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void a(String str, String str2, Bundle bundle) {
        t2 t2Var = this.b;
        ((o1) ((s0) t2Var).s).B.getClass();
        t2Var.E(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String b() {
        f3 f3Var = ((o1) ((s0) this.b).s).C;
        o1.l(f3Var);
        b3 b3Var = f3Var.u;
        if (b3Var != null) {
            return b3Var.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String c() {
        f3 f3Var = ((o1) ((s0) this.b).s).C;
        o1.l(f3Var);
        b3 b3Var = f3Var.u;
        if (b3Var != null) {
            return b3Var.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void d(Bundle bundle) {
        t2 t2Var = this.b;
        ((o1) ((s0) t2Var).s).B.getClass();
        t2Var.M(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void e(String str) {
        o1 o1Var = this.a;
        z zVar = o1Var.E;
        o1.j(zVar);
        o1Var.B.getClass();
        zVar.B(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void f(String str) {
        o1 o1Var = this.a;
        z zVar = o1Var.E;
        o1.j(zVar);
        o1Var.B.getClass();
        zVar.A(str, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final long g() {
        t4 t4Var = this.a.z;
        o1.k(t4Var);
        return t4Var.w0();
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final void h(String str, String str2, Bundle bundle) {
        t2 t2Var = this.a.D;
        o1.l(t2Var);
        t2Var.N(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final List i(String str, String str2) {
        t2 t2Var = this.b;
        o1 o1Var = (o1) ((s0) t2Var).s;
        m1 m1Var = o1Var.x;
        com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
        o1.m(m1Var);
        if (m1Var.F()) {
            o1.m(s0Var);
            s0Var.x.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (w3.e()) {
            o1.m(s0Var);
            s0Var.x.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        m1Var2.J(atomicReference, 5000L, "get conditional user properties", new q1(t2Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return t4.p0(list);
        }
        o1.m(s0Var);
        s0Var.x.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final int j(String str) {
        t2 t2Var = this.b;
        t2Var.getClass();
        u.d(str);
        ((o1) ((s0) t2Var).s).getClass();
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String k() {
        return (String) this.b.y.get();
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final String l() {
        return this.b.O();
    }

    @Override // com.google.android.gms.measurement.internal.u2
    public final Map m(String str, String str2, boolean z) {
        t2 t2Var = this.b;
        o1 o1Var = (o1) ((s0) t2Var).s;
        m1 m1Var = o1Var.x;
        com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
        o1.m(m1Var);
        if (m1Var.F()) {
            o1.m(s0Var);
            s0Var.x.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (w3.e()) {
            o1.m(s0Var);
            s0Var.x.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        m1 m1Var2 = o1Var.x;
        o1.m(m1Var2);
        m1Var2.J(atomicReference, 5000L, "get user properties", new j2(t2Var, atomicReference, str, str2, z));
        List<q4> list = (List) atomicReference.get();
        if (list == null) {
            o1.m(s0Var);
            s0Var.x.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        e eVar = new e(list.size());
        for (q4 q4Var : list) {
            Object j = q4Var.j();
            if (j != null) {
                eVar.put(q4Var.s, j);
            }
        }
        return eVar;
    }
}
