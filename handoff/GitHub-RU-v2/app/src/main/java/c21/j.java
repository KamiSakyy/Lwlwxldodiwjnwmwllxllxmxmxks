package c21;

import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.service.models.response.Language;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.z6;
import h91.m0;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements bm.k, com.google.android.gms.measurement.internal.x {
    public static j s;
    public static final /* synthetic */ j t = new j(3);
    public static final /* synthetic */ j u = new j(4);
    public static final /* synthetic */ j v = new j(5);
    public static final /* synthetic */ j w = new j(6);
    public final /* synthetic */ int r;

    public /* synthetic */ j(int i) {
        this.r = i;
    }

    public static final void a(h91.d dVar) {
        b21.v vVar = h91.d.h;
        if (h91.d.i == null) {
            h91.d.i = new h91.d();
            h91.c cVar = new h91.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long nanoTime = System.nanoTime();
        long j = ((m0) dVar).c;
        boolean z = ((m0) dVar).a;
        if (j != 0 && z) {
            dVar.g = Math.min(j, dVar.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            dVar.g = nanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            dVar.g = dVar.c();
        }
        b21.v vVar2 = h91.d.h;
        int i = vVar2.s + 1;
        vVar2.s = i;
        h91.d[] dVarArr = (h91.d[]) vVar2.t;
        if (i == dVarArr.length) {
            h91.d[] dVarArr2 = new h91.d[i * 2];
            x61.l.B(0, 0, 14, dVarArr, dVarArr2);
            vVar2.t = dVarArr2;
        }
        vVar2.n(i, dVar);
        if (dVar.f == 1) {
            h91.d.k.signal();
        }
    }

    public static h91.d b() {
        b21.v vVar = h91.d.h;
        h91.d dVar = ((h91.d[]) vVar.t)[1];
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            h91.d.k.await(h91.d.l, TimeUnit.MILLISECONDS);
            if (((h91.d[]) vVar.t)[1] != null || System.nanoTime() - nanoTime < h91.d.m) {
                return null;
            }
            return h91.d.i;
        }
        long nanoTime2 = dVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            h91.d.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        vVar.u(dVar);
        dVar.e = 2;
        return dVar;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                Boolean bool = (Boolean) j9.a.b();
                bool.getClass();
                return bool;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.get();
                Long l = (Long) b7.z.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.get();
                return (String) b7.a0.b();
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                m8.s.get();
                Boolean bool2 = (Boolean) o8.b.b();
                bool2.getClass();
                return bool2;
        }
    }

    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        Language language;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            language = (Language) bVar.a(str, Language.Companion.serializer());
        } else {
            language = null;
        }
        return new LanguageFilter(language);
    }
}
