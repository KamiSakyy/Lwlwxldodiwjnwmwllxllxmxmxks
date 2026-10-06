package o7;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.TimeoutCancellationException;
import sy.d0;
import v71.b0;

/* loaded from: /home/user/work/p/classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f30054a;

    /* renamed from: b, reason: collision with root package name */
    public final j71.a f30055b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f30056c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f30057d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30058e;

    /* renamed from: f, reason: collision with root package name */
    public final g[] f30059f;

    /* renamed from: g, reason: collision with root package name */
    public final e81.i f30060g;

    /* renamed from: h, reason: collision with root package name */
    public final x61.k f30061h;

    public r(int i, j71.a aVar) {
        this.f30054a = i;
        this.f30055b = aVar;
        this.f30059f = new g[i];
        int i10 = e81.j.a;
        this.f30060g = new e81.i(i, 0);
        this.f30061h = new x61.k(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x004e, B:20:0x0055, B:21:0x006f, B:25:0x007d, B:26:0x0085), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x004e, B:20:0x0055, B:21:0x006f, B:25:0x007d, B:26:0x0085), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        p pVar;
        int i;
        e81.i iVar;
        ReentrantLock reentrantLock;
        x61.k kVar = this.f30061h;
        try {
            try {
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i10 = pVar.f30047w;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        pVar.f30047w = i10 - Integer.MIN_VALUE;
                        Object obj = pVar.f30045u;
                        b71.a aVar = b71.a.r;
                        i = pVar.f30047w;
                        iVar = this.f30060g;
                        if (i != 0) {
                            sy.y.j(obj);
                            pVar.f30047w = 1;
                            if (iVar.a(pVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                        }
                        reentrantLock = this.f30056c;
                        reentrantLock.lock();
                        if (!this.f30058e) {
                            sy.r.w("Connection pool is closed", 21);
                            throw null;
                        }
                        if (kVar.isEmpty() && this.f30057d < this.f30054a) {
                            g gVar = new g((v7.a) this.f30055b.a());
                            g[] gVarArr = this.f30059f;
                            int i11 = this.f30057d;
                            this.f30057d = i11 + 1;
                            gVarArr[i11] = gVar;
                            kVar.addLast(gVar);
                        }
                        return (g) kVar.removeLast();
                    }
                }
                if (!this.f30058e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.f30056c;
            reentrantLock.lock();
        } catch (Throwable th) {
            iVar.c();
            throw th;
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.f30045u;
        b71.a aVar2 = b71.a.r;
        i = pVar.f30047w;
        iVar = this.f30060g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:14:0x006d, B:16:0x0071, B:30:0x0079, B:33:0x0080), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j10, com.github.rudroid.utilities.ui.g gVar, c71.c cVar) {
        q qVar;
        int i;
        k71.w wVar;
        q qVar2;
        Throwable th;
        h1.u uVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f30053z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.f30053z = i10 - Integer.MIN_VALUE;
                Object obj = qVar.f30051x;
                b71.a aVar = b71.a.r;
                i = qVar.f30053z;
                a71.c cVar2 = null;
                if (i != 0) {
                    sy.y.j(obj);
                    k71.w wVar2 = new k71.w();
                    uVar = new h1.u(wVar2, this, cVar2, 16);
                    qVar.f30049v = gVar;
                    qVar.f30050w = wVar2;
                    qVar.f30048u = j10;
                    qVar.f30053z = 1;
                    if (b0.M(b0.I(j10), uVar, qVar) == aVar) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = qVar.f30048u;
                    k71.w wVar3 = qVar.f30050w;
                    com.github.rudroid.utilities.ui.g gVar2 = qVar.f30049v;
                    try {
                        sy.y.j(obj);
                    } catch (Throwable th2) {
                        wVar = wVar3;
                        gVar = gVar2;
                        qVar2 = qVar;
                        th = th2;
                    }
                    wVar = wVar3;
                    gVar = gVar2;
                    qVar2 = qVar;
                    th = null;
                    try {
                        if (th instanceof TimeoutCancellationException) {
                            gVar.a();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = wVar.r;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        qVar = qVar2;
                        k71.w wVar22 = new k71.w();
                        uVar = new h1.u(wVar22, this, cVar2, 16);
                        qVar.f30049v = gVar;
                        qVar.f30050w = wVar22;
                        qVar.f30048u = j10;
                        qVar.f30053z = 1;
                        if (b0.M(b0.I(j10), uVar, qVar) == aVar) {
                            return aVar;
                        }
                        gVar2 = gVar;
                        wVar3 = wVar22;
                        wVar = wVar3;
                        gVar = gVar2;
                        qVar2 = qVar;
                        th = null;
                        if (th instanceof TimeoutCancellationException) {
                        }
                        qVar = qVar2;
                        k71.w wVar222 = new k71.w();
                        uVar = new h1.u(wVar222, this, cVar2, 16);
                        qVar.f30049v = gVar;
                        qVar.f30050w = wVar222;
                        qVar.f30048u = j10;
                        qVar.f30053z = 1;
                        if (b0.M(b0.I(j10), uVar, qVar) == aVar) {
                        }
                    } catch (Throwable th3) {
                        g gVar3 = (g) wVar.r;
                        if (gVar3 != null) {
                            e(gVar3);
                        }
                        throw th3;
                    }
                }
            }
        }
        qVar = new q(this, cVar);
        Object obj3 = qVar.f30051x;
        b71.a aVar2 = b71.a.r;
        i = qVar.f30053z;
        a71.c cVar22 = null;
        if (i != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f30056c;
        reentrantLock.lock();
        try {
            this.f30058e = true;
            for (g gVar : this.f30059f) {
                if (gVar != null) {
                    gVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        x61.k kVar = this.f30061h;
        ReentrantLock reentrantLock = this.f30056c;
        reentrantLock.lock();
        try {
            y61.b i = d0.i();
            int i10 = kVar.t;
            for (int i11 = 0; i11 < i10; i11++) {
                i.add(kVar.get(i11));
            }
            y61.b h10 = d0.h(i);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f30054a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            e81.i iVar = this.f30060g;
            iVar.getClass();
            sb3.append(Math.max(e81.h.x.get(iVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + h10.a() + ")[" + x61.m.c0(h10, (String) null, (String) null, (String) null, 0, (j71.c) null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            g[] gVarArr = this.f30059f;
            int length = gVarArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                g gVar = gVarArr[i13];
                i12++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i12);
                sb4.append("] - ");
                sb4.append(gVar != null ? gVar.f30012r.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (gVar != null) {
                    gVar.r(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(g gVar) {
        k71.k.g(gVar, "connection");
        ReentrantLock reentrantLock = this.f30056c;
        reentrantLock.lock();
        try {
            this.f30061h.addLast(gVar);
            reentrantLock.unlock();
            this.f30060g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
