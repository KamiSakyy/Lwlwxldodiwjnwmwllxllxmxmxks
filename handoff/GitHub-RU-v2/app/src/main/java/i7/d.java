package i7;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.n;
import com.google.android.gms.internal.measurement.b4;
import v71.b0;
import v71.l;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class d extends m71.a {

    /* renamed from: a, reason: collision with root package name */
    public MeasurementManager f26059a;

    public d(MeasurementManager measurementManager) {
        this.f26059a = measurementManager;
    }

    public static Object q0(d dVar, a aVar, a71.c<? super a0> cVar) {
        new l(1, b4.T(cVar)).t();
        MeasurementManager measurementManager = dVar.f26059a;
        throw null;
    }

    public static Object r0(d dVar, a71.c<? super Integer> cVar) {
        l lVar = new l(1, b4.T(cVar));
        lVar.t();
        dVar.f26059a.getMeasurementApiStatus(new c(0), new w4.a(lVar));
        Object s2 = lVar.s();
        b71.a aVar = b71.a.r;
        return s2;
    }

    public static Object t0(d dVar, Uri uri, InputEvent inputEvent, a71.c<? super a0> cVar) {
        l lVar = new l(1, b4.T(cVar));
        lVar.t();
        dVar.f26059a.registerSource(uri, inputEvent, new c(0), new w4.a(lVar));
        Object s2 = lVar.s();
        return s2 == b71.a.r ? s2 : a0.a;
    }

    public static Object u0(d dVar, e eVar, a71.c<? super a0> cVar) {
        Object k10 = b0.k(new n(dVar, null, 11), cVar);
        return k10 == b71.a.r ? k10 : a0.a;
    }

    public static Object v0(d dVar, Uri uri, a71.c<? super a0> cVar) {
        l lVar = new l(1, b4.T(cVar));
        lVar.t();
        dVar.f26059a.registerTrigger(uri, new c(0), new w4.a(lVar));
        Object s2 = lVar.s();
        return s2 == b71.a.r ? s2 : a0.a;
    }

    public static Object x0(d dVar, f fVar, a71.c<? super a0> cVar) {
        new l(1, b4.T(cVar)).t();
        MeasurementManager measurementManager = dVar.f26059a;
        throw null;
    }

    public static Object z0(d dVar, g gVar, a71.c<? super a0> cVar) {
        new l(1, b4.T(cVar)).t();
        MeasurementManager measurementManager = dVar.f26059a;
        throw null;
    }

    @Override // m71.a
    public Object S(Uri uri, InputEvent inputEvent, a71.c<? super a0> cVar) {
        return t0(this, uri, inputEvent, cVar);
    }

    @Override // m71.a
    public Object T(Uri uri, a71.c<? super a0> cVar) {
        return v0(this, uri, cVar);
    }

    public Object p0(a aVar, a71.c<? super a0> cVar) {
        return q0(this, aVar, cVar);
    }

    public Object s0(e eVar, a71.c<? super a0> cVar) {
        return u0(this, eVar, cVar);
    }

    public Object w0(f fVar, a71.c<? super a0> cVar) {
        return x0(this, fVar, cVar);
    }

    @Override // m71.a
    public Object y(a71.c<? super Integer> cVar) {
        return r0(this, cVar);
    }

    public Object y0(g gVar, a71.c<? super a0> cVar) {
        return z0(this, gVar, cVar);
    }
}
