package gi;

import a61.l0;
import an.i;
import androidx.lifecycle.n;
import c71.j;
import com.google.android.gms.internal.measurement.z3;
import g3.b0;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import k71.k;
import n5.f;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public f a;
    public l0 b;

    public c(f fVar) {
        k.g(fVar, "dataStore");
        this.a = fVar;
        this.b = z3.G(fVar.getData(), new b0(this));
    }

    public static ZonedDateTime a(long j) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneOffset.UTC);
    }

    public final Object b(s5.e eVar, j jVar) {
        Object n = z3.n(this.a, new n(eVar, (a71.c) null, 10), jVar);
        return n == b71.a.r ? n : a0.a;
    }

    public final void c(String str) {
        v71.b0.E(new b(this, str, null, 0));
    }

    public final Object d(a71.c cVar, Object obj, s5.e eVar) {
        Object n = z3.n(this.a, new i(eVar, obj, (a71.c) null, 2), cVar);
        return n == b71.a.r ? n : a0.a;
    }
    public Object v(Object p1) { return null; }
    public Object v(Object p1) { return null; }
}
