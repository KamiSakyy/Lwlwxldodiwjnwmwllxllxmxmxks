package b6;

import com.google.android.gms.internal.measurement.b4;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: /home/user/work/p/classes.dex */
public final class o implements a71.f {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x71.t f3648s;

    public o(AtomicReference atomicReference, x71.t tVar) {
        this.f3647r = atomicReference;
        this.f3648s = tVar;
    }

    public final a71.h A(a71.h hVar) {
        return k21.f.y(this, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j71.e eVar, c71.c cVar) {
        n nVar;
        int i;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f3638w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f3638w = i10 - Integer.MIN_VALUE;
                Object obj = nVar.f3636u;
                b71.a aVar = b71.a.r;
                i = nVar.f3638w;
                if (i != 0) {
                    sy.y.j(obj);
                    nVar.f3638w = 1;
                    v71.l lVar = new v71.l(1, b4.T(nVar));
                    lVar.t();
                    x71.s sVar = this.f3648s;
                    lVar.v(new androidx.compose.runtime.g(1, sVar));
                    v71.k kVar = (v71.k) this.f3647r.getAndSet(lVar);
                    if (kVar != null) {
                        kVar.x((Throwable) null);
                    }
                    sVar.j(eVar);
                    if (lVar.s() == aVar) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f3636u;
        b71.a aVar2 = b71.a.r;
        i = nVar.f3638w;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    public final a71.h b0(a71.g gVar) {
        return k21.f.x(this, gVar);
    }

    public a71.g getKey() {
        return v.f3714r;
    }

    public final a71.f w0(a71.g gVar) {
        return k21.f.q(this, gVar);
    }

    public final Object x0(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }
}
