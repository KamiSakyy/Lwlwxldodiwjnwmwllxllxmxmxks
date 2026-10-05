package e61;

import a61.n0;
import com.google.android.gms.internal.measurement.z3;
import k71.k;
import sy.y;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final s5.e c = b91.g.j("firebase_sessions_enabled");
    public static final s5.e d = new s5.e("firebase_sessions_sampling_rate");
    public static final s5.e e = b91.g.u("firebase_sessions_restart_timeout");
    public static final s5.e f = b91.g.u("firebase_sessions_cache_duration");
    public static final s5.e g = b91.g.z("firebase_sessions_cache_updated_time");
    public final n5.f a;
    public e b;

    public i(n5.f fVar) {
        k.g(fVar, "dataStore");
        this.a = fVar;
        b0.E(new n0(this, (a71.c) null, 21));
    }

    public static final void a(i iVar, s5.b bVar) {
        iVar.getClass();
        iVar.b = new e((Boolean) bVar.d(c), (Double) bVar.d(d), (Integer) bVar.d(e), (Integer) bVar.d(f), (Long) bVar.d(g));
    }

    public final boolean b() {
        e eVar = this.b;
        if (eVar == null) {
            k.m("sessionConfigs");
            throw null;
        }
        Long l = eVar.e;
        if (eVar != null) {
            Integer num = eVar.d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        k.m("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r0.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s5.e eVar, Object obj, c71.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.u;
                b71.a aVar = b71.a.r;
                i = hVar.w;
                if (i != 0) {
                    y.j(obj2);
                    n5.f fVar = this.a;
                    an.g gVar = new an.g(obj, eVar, this, (a71.c) null, 2);
                    hVar.w = 1;
                    if (z3.n(fVar, gVar, hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        hVar = new h(this, cVar);
        Object obj22 = hVar.u;
        b71.a aVar2 = b71.a.r;
        i = hVar.w;
        if (i != 0) {
        }
        return a0.a;
    }
}
