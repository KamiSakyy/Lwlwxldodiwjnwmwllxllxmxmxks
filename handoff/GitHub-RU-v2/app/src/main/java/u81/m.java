package u81;

import androidx.compose.foundation.lazy.layout.t1;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.t0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n0.w;
import q81.a0;
import q81.u;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m implements Cloneable {
    public boolean A;
    public t1 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public volatile boolean H;
    public volatile t1 I;
    public final CopyOnWriteArrayList J;
    public final u r;
    public final androidx.lifecycle.b s;
    public final boolean t;
    public final t0 u;
    public final l v;
    public final AtomicBoolean w;
    public Object x;
    public g y;
    public n z;

    public m(u uVar, androidx.lifecycle.b bVar, boolean z) {
        k71.k.g(bVar, "originalRequest");
        this.r = uVar;
        this.s = bVar;
        this.t = z;
        this.u = (t0) uVar.D.s;
        uVar.d.getClass();
        l lVar = new l(this);
        lVar.g(0, TimeUnit.MILLISECONDS);
        this.v = lVar;
        this.w = new AtomicBoolean();
        this.G = true;
        this.J = new CopyOnWriteArrayList();
        new AtomicReference((z3) bVar.f);
    }

    public static final String a(m mVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.H ? "canceled " : "");
        sb.append(mVar.t ? "web socket" : "call");
        sb.append(" to ");
        sb.append(((q81.o) mVar.s.b).g());
        return sb.toString();
    }

    public final void b(n nVar) {
        k71.k.g(nVar, "connection");
        TimeZone timeZone = r81.g.a;
        if (this.z != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.z = nVar;
        nVar.q.add(new k(this, this.x));
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k;
        TimeZone timeZone = r81.g.a;
        n nVar = this.z;
        if (nVar != null) {
            synchronized (nVar) {
                k = k();
            }
            if (this.z == null) {
                if (k != null) {
                    r81.g.c(k);
                }
            } else if (k != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.A && this.v.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            k71.k.d(iOException2);
        }
        return iOException2;
    }

    public final void cancel() {
        if (this.H) {
            return;
        }
        this.H = true;
        t1 t1Var = this.I;
        if (t1Var != null) {
            ((v81.e) t1Var.d).cancel();
        }
        Iterator it = this.J.iterator();
        k71.k.f(it, "iterator(...)");
        while (it.hasNext()) {
            ((r) it.next()).cancel();
        }
    }

    public final Object clone() {
        return new m(this.r, this.s, this.t);
    }

    public final void d(q81.e eVar) {
        if (!this.w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        a91.e eVar2 = a91.e.a;
        this.x = a91.e.a.h();
        w51.r rVar = this.r.a;
        j jVar = new j(this, eVar);
        rVar.getClass();
        w51.r.L(rVar, jVar, (m) null, (j) null, 6);
    }

    public final a0 e() {
        if (!this.w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.v.i();
        a91.e eVar = a91.e.a;
        this.x = a91.e.a.h();
        try {
            w51.r rVar = this.r.a;
            synchronized (rVar) {
                ((ArrayDeque) rVar.u).add(this);
            }
            return h();
        } finally {
            w51.r rVar2 = this.r.a;
            rVar2.getClass();
            w51.r.L(rVar2, (j) null, this, (j) null, 5);
        }
    }

    public final void g(boolean z) {
        t1 t1Var;
        synchronized (this) {
            if (!this.G) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (t1Var = this.I) != null) {
            ((v81.e) t1Var.d).cancel();
            ((m) t1Var.b).i(t1Var, true, true, true, true, null);
        }
        this.B = null;
    }

    public final a0 h() {
        ArrayList arrayList = new ArrayList();
        x61.m.J(arrayList, this.r.b);
        arrayList.add(new q10.d(4, this.r));
        arrayList.add(new q10.d(this.r.j));
        arrayList.add(new a10.d(1));
        arrayList.add(a.a);
        if (!this.t) {
            x61.m.J(arrayList, this.r.c);
        }
        arrayList.add(v81.b.a);
        androidx.lifecycle.b bVar = this.s;
        u uVar = this.r;
        boolean z = false;
        try {
            try {
                a0 f = new w(this, arrayList, 0, (t1) null, bVar, uVar.v, uVar.w, uVar.x).f(this.s);
                if (this.H) {
                    r81.e.b(f);
                    throw new IOException("Canceled");
                }
                j(null);
                return f;
            } catch (IOException e) {
                z = true;
                IOException j = j(e);
                k71.k.e(j, "null cannot be cast to non-null type kotlin.Throwable");
                throw j;
            }
        } catch (Throwable th) {
            if (!z) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:59:0x0014, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:27:0x0052, B:7:0x001d, B:52:0x0023, B:55:0x0029), top: B:58:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:59:0x0014, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:27:0x0052, B:7:0x001d, B:52:0x0023, B:55:0x0029), top: B:58:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:59:0x0014, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:27:0x0052, B:7:0x001d, B:52:0x0023, B:55:0x0029), top: B:58:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:59:0x0014, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:27:0x0052, B:7:0x001d, B:52:0x0023, B:55:0x0029), top: B:58:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:59:0x0014, B:10:0x002f, B:12:0x0033, B:14:0x0037, B:16:0x003b, B:17:0x003d, B:19:0x0041, B:21:0x0045, B:23:0x0049, B:27:0x0052, B:7:0x001d, B:52:0x0023, B:55:0x0029), top: B:58:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException i(t1 t1Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        k71.k.g(t1Var, "exchange");
        if (t1Var.equals(this.I)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.C) {
                        }
                        if (z) {
                            this.C = false;
                        }
                        if (z2) {
                            this.D = false;
                        }
                        if (z4) {
                            this.E = false;
                        }
                        if (z3) {
                            this.F = false;
                        }
                        z7 = (!this.C || this.D || this.E || this.F) ? false : true;
                        if (z7) {
                            if (!this.G) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if ((!z2 || !this.D) && ((!z4 || !this.E) && (!z3 || !this.F))) {
                    z6 = false;
                }
                if (z) {
                }
                if (z2) {
                }
                if (z4) {
                }
                if (z3) {
                }
                if (!this.C) {
                }
                if (z7) {
                }
                boolean z82 = z5;
                z5 = z7;
                z6 = z82;
            }
            if (z5) {
                this.I = null;
                n nVar = this.z;
                if (nVar != null) {
                    synchronized (nVar) {
                        nVar.n++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.G) {
                this.G = false;
                if (!this.C && !this.D && !this.E) {
                    if (!this.F) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        n nVar = this.z;
        k71.k.d(nVar);
        TimeZone timeZone = r81.g.a;
        ArrayList arrayList = nVar.q;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (k71.k.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.z = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        nVar.r = System.nanoTime();
        t0 t0Var = this.u;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) t0Var.e;
        TimeZone timeZone2 = r81.g.a;
        if (!nVar.k) {
            ((t81.c) t0Var.c).c((g91.e) t0Var.d, 0L);
            return null;
        }
        nVar.k = true;
        concurrentLinkedQueue.remove(nVar);
        if (concurrentLinkedQueue.isEmpty()) {
            t81.c cVar = (t81.c) t0Var.c;
            synchronized (cVar.a) {
                if (cVar.a()) {
                    cVar.a.c(cVar);
                }
            }
        }
        return nVar.e;
    }

    public Object a = null;
    public Object i = null;
}
