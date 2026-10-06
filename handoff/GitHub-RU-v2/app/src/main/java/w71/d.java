package w71;

import a71.h;
import a81.n;
import android.os.Handler;
import android.os.Looper;
import b9.f;
import java.util.concurrent.CancellationException;
import k71.k;
import s0.z0;
import v71.b0;
import v71.g0;
import v71.l;
import v71.l0;
import v71.n0;
import v71.n1;
import v71.v;
import x.i;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends v implements g0 {
    public Handler t;
    public String u;
    public boolean v;
    public d w;

    public d(Handler handler, String str, boolean z) {
        this.t = handler;
        this.u = str;
        this.v = z;
        this.w = z ? this : new d(handler, str, true);
    }

    @Override // v71.g0
    public final n0 E0(long j, final Runnable runnable, h hVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.t.postDelayed(runnable, j)) {
            return new n0() { // from class: w71.c
                @Override // v71.n0
                public final void a() {
                    d.this.t.removeCallbacks(runnable);
                }
            };
        }
        N0(hVar, runnable);
        return n1.r;
    }

    @Override // v71.v
    public final void J0(h hVar, Runnable runnable) {
        if (this.t.post(runnable)) {
            return;
        }
        N0(hVar, runnable);
    }

    @Override // v71.g0
    public final void K(long j, l lVar) {
        Runnable fVar = new f(20, lVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.t.postDelayed(fVar, j)) {
            lVar.v(new z0(10, this, fVar));
        } else {
            N0(lVar.v, fVar);
        }
    }

    @Override // v71.v
    public final boolean L0(h hVar) {
        return (this.v && k.b(Looper.myLooper(), this.t.getLooper())) ? false : true;
    }

    @Override // v71.v
    public v M0(int i) {
        a81.b.a(i);
        return this;
    }

    public final void N0(h hVar, Runnable runnable) {
        b0.h(hVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        c81.e eVar = l0.a;
        c81.d.t.J0(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.t == this.t && dVar.v == this.v;
    }

    public final int hashCode() {
        return System.identityHashCode(this.t) ^ (this.v ? 1231 : 1237);
    }

    @Override // v71.v
    public final String toString() {
        d dVar;
        String str;
        c81.e eVar = l0.a;
        d dVar2 = n.a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.w;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.u;
        if (str2 == null) {
            str2 = this.t.toString();
        }
        return this.v ? i.f(str2, ".immediate") : str2;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
