package w1;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import v2.d1;
import v2.i1;
import v71.b0;
import v71.e1;
import v71.w;
import v71.z;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class q implements v2.j {
    public boolean A;
    public boolean B;
    public boolean C;
    public a2.b D;
    public boolean E;

    /* renamed from: s, reason: collision with root package name */
    public a81.d f32948s;

    /* renamed from: t, reason: collision with root package name */
    public int f32949t;

    /* renamed from: v, reason: collision with root package name */
    public q f32951v;

    /* renamed from: w, reason: collision with root package name */
    public q f32952w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f32953x;

    /* renamed from: y, reason: collision with root package name */
    public d1 f32954y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32955z;

    /* renamed from: r, reason: collision with root package name */
    public q f32947r = this;

    /* renamed from: u, reason: collision with root package name */
    public int f32950u = -1;

    public final z C0() {
        a81.d dVar = this.f32948s;
        if (dVar != null) {
            return dVar;
        }
        a81.d c10 = b0.c(((w2.t) v2.l.w(this)).getCoroutineContext().A(new e1(((w2.t) v2.l.w(this)).getCoroutineContext().w0(w.s))));
        this.f32948s = c10;
        return c10;
    }

    public boolean D0() {
        return !(this instanceof f0.p);
    }

    public void E0() {
        if (this.E) {
            t2.a.b("node attached multiple times");
        }
        if (this.f32954y == null) {
            t2.a.b("attach invoked on a node without a coordinator");
        }
        this.E = true;
        this.B = true;
    }

    public void F0() {
        if (!this.E) {
            t2.a.b("Cannot detach a node that is not attached");
        }
        if (this.B) {
            t2.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.C) {
            t2.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.E = false;
        a81.d dVar = this.f32948s;
        if (dVar != null) {
            b0.i(dVar, new ModifierNodeDetachedCancellationException());
            this.f32948s = null;
        }
    }

    public void G0() {
    }

    public void H0() {
    }

    public void I0() {
    }

    public void J0() {
        if (!this.E) {
            t2.a.b("reset() called on an unattached node");
        }
        I0();
    }

    public void K0() {
        if (!this.E) {
            t2.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.B) {
            t2.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.B = false;
        G0();
        this.C = true;
    }

    public void L0() {
        if (!this.E) {
            t2.a.b("node detached multiple times");
        }
        if (this.f32954y == null) {
            t2.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.C) {
            t2.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.C = false;
        a2.b bVar = this.D;
        if (bVar != null) {
            bVar.a();
        }
        H0();
    }

    public void M0(q qVar) {
        this.f32947r = qVar;
    }

    public void N0(d1 d1Var) {
        this.f32954y = d1Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d1<T1,T2,T3,T4> {
        public d1() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i1<T1,T2,T3,T4> {
        public i1() {
        }
    }
}
