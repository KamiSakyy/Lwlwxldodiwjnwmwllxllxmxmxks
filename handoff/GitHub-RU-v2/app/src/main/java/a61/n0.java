package a61;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.p1;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.internal.h2;
import com.google.android.gms.measurement.internal.x3;
import f0.j1;
import f0.l1;
import f1.aa;
import f1.f5;
import f1.i5;
import f1.t9;
import f1.u9;
import f1.v9;
import f1.z9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import t00.f8;
import v71.m1;
import w2.f2;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(TextClassifier textClassifier, j71.e eVar, a71.c cVar) {
        super(2, cVar);
        this.v = 16;
        this.x = textClassifier;
        this.y = (c71.j) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [c71.j, j71.e] */
    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        int i = this.v;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                return new n0((o0) this.x, (String) obj2, cVar, 0);
            case 1:
                return new n0((w51.r) this.x, (ArrayList) obj2, cVar, 1);
            case 2:
                n0 n0Var = new n0((a9.b) obj2, cVar, 2);
                n0Var.x = obj;
                return n0Var;
            case 3:
                n0 n0Var2 = new n0((androidx.lifecycle.b) obj2, cVar, 3);
                n0Var2.x = obj;
                return n0Var2;
            case 4:
                n0 n0Var3 = new n0((androidx.lifecycle.l0) obj2, cVar, 4);
                n0Var3.x = obj;
                return n0Var3;
            case 5:
                return new n0((androidx.lifecycle.m0) this.x, obj2, cVar, 5);
            case 6:
                return new n0((b1.b) this.x, (b1.m) obj2, cVar, 6);
            case 7:
                return new n0((v71.d1) this.x, (b1.j) obj2, cVar, 7);
            case 8:
                return new n0((b1.o) this.x, (a0.h) obj2, cVar, 8);
            case 9:
                n0 n0Var4 = new n0((AsyncRequestWorker) obj2, cVar, 9);
                n0Var4.x = obj;
                return n0Var4;
            case 10:
                n0 n0Var5 = new n0((b6.c) obj2, cVar, 10);
                n0Var5.x = obj;
                return n0Var5;
            case 11:
                return new n0((Context) this.x, (b6.x0) obj2, cVar, 11);
            case 12:
                return new n0((c3.d) this.x, (Runnable) obj2, cVar, 12);
            case 13:
                return new n0((cj.b) this.x, (oa.j) obj2, cVar, 13);
            case 14:
                return new n0((com.github.rudroid.w) this.x, (oa.j) obj2, cVar, 14);
            case 15:
                return new n0((com.github.rudroid.q0) this.x, (oa.j) obj2, cVar, 15);
            case 16:
                return new n0((TextClassifier) this.x, (j71.e) obj2, cVar);
            case 17:
                return new n0((w2.c1) this.x, (g3.g) obj2, cVar, 17);
            case 18:
                return new n0((dn.u) this.x, (oa.j) obj2, cVar, 18);
            case 19:
                n0 n0Var6 = new n0((e1.a) obj2, cVar, 19);
                n0Var6.x = obj;
                return n0Var6;
            case 20:
                return new n0((e1.g) this.x, (a0.o) obj2, cVar, 20);
            case 21:
                return new n0((e61.i) obj2, cVar, 21);
            case 22:
                return new n0((j0.j) this.x, (j0.f) obj2, cVar, 22);
            case 23:
                return new n0((j0.j) this.x, (j0.g) obj2, cVar, 23);
            case 24:
                return new n0((i5) this.x, (f5) obj2, cVar, 24);
            case 25:
                return new n0((i5) this.x, (j0.h) obj2, cVar, 25);
            case 26:
                return new n0((j0.j) this.x, (v1.q) obj2, cVar, 26);
            case 27:
                u9 u9Var = (u9) this.x;
                j1 j1Var = j1.r;
                return new n0(u9Var, (o) obj2, cVar);
            case 28:
                return new n0((z9) this.x, (w2.f) obj2, cVar, 28);
            default:
                n0 n0Var7 = new n0((b41.e) obj2, cVar, 29);
                n0Var7.x = obj;
                return n0Var7;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 1:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 2:
                return ((n0) r((a71.c) obj2, (x71.t) obj)).v(w61.a0.a);
            case 3:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 4:
                ((n0) r((a71.c) obj2, (x71.t) obj)).v(w61.a0.a);
                return b71.a.r;
            case 5:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 6:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 7:
                ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
                return b71.a.r;
            case 8:
                ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
                return b71.a.r;
            case 9:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 10:
                return ((n0) r((a71.c) obj2, (k6.k) obj)).v(w61.a0.a);
            case 11:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 12:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 13:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 14:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 15:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 16:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 17:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 18:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 19:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 20:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 21:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 22:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 23:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 24:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 25:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 26:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 27:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 28:
                return ((n0) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            default:
                return ((n0) r((a71.c) obj2, (x71.t) obj)).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:373:0x070e, code lost:
    
        if (v71.b0.l(500, r16) == r0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06e8, code lost:
    
        if (r7 == r0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r2.isTouchExplorationEnabled() != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v51, types: [c71.j, j71.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:336:0x070e -> B:330:0x0711). Please report as a decompilation issue!!! */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object b;
        androidx.lifecycle.q0 mVar;
        byte[] bArr;
        byte[] bArr2;
        Object v;
        Object v2;
        Object t;
        e61.i iVar;
        long j;
        a71.c cVar = null;
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i2 = this.w;
                try {
                    if (i2 == 0) {
                        sy.y.j(obj);
                        n5.f fVar = ((o0) this.x).b;
                        m0 m0Var = new m0((String) this.y, cVar, z ? 1 : 0);
                        this.w = 1;
                        if (z3.n(fVar, m0Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                } catch (IOException e) {
                    e.toString();
                }
                return w61.a0.a;
            case 1:
                ArrayList arrayList = (ArrayList) this.y;
                w51.r rVar = (w51.r) this.x;
                LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) rVar.u;
                b71.a aVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    b61.c cVar2 = b61.c.a;
                    this.w = 1;
                    b = cVar2.b(this);
                    if (b == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    b = obj;
                }
                Map map = (Map) b;
                if (!map.isEmpty()) {
                    Collection values = map.values();
                    if (!(values instanceof Collection) || !values.isEmpty()) {
                        Iterator it = values.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((v41.i) it.next()).a.a()) {
                                    for (Message message : x61.m.v0(x61.m.S(sy.d0Shadow.q(new Message[]{w51.r.d(rVar, arrayList, 2), w51.r.d(rVar, arrayList, 1)})), new b1Shadow())) {
                                        Messenger messenger = (Messenger) rVar.t;
                                        if (messenger != null) {
                                            try {
                                                int i4 = message.what;
                                                messenger.send(message);
                                            } catch (RemoteException unused) {
                                                int i5 = message.what;
                                                if (linkedBlockingDeque.offer(message)) {
                                                    linkedBlockingDeque.size();
                                                }
                                            }
                                        } else if (linkedBlockingDeque.offer(message)) {
                                            int i6 = message.what;
                                            linkedBlockingDeque.size();
                                        } else {
                                            int i7 = message.what;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return w61.a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i8 = this.w;
                if (i8 == 0) {
                    sy.y.j(obj);
                    x71.t tVar = (x71.t) this.x;
                    a9.b bVar = (a9.b) this.y;
                    a9.a aVar4 = new a9.a(bVar, tVar);
                    b9.g gVar = bVar.a;
                    gVar.getClass();
                    synchronized (gVar.c) {
                        try {
                            if (gVar.d.add(aVar4)) {
                                if (gVar.d.size() == 1) {
                                    gVar.e = gVar.a();
                                    v8.x a = v8.x.a();
                                    int i9 = b9.h.a;
                                    Objects.toString(gVar.e);
                                    a.getClass();
                                    gVar.c();
                                }
                                aVar4.a(gVar.e);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    a0.g gVar2 = new a0.g(1, (a9.b) this.y, aVar4);
                    this.w = 1;
                    if (t.z.f(tVar, gVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 3:
                androidx.lifecycle.b bVar2 = (androidx.lifecycle.b) this.y;
                b71.a aVar5 = b71.a.r;
                int i10 = this.w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    androidx.lifecycle.m0 m0Var2 = new androidx.lifecycle.m0((androidx.lifecycle.h) bVar2.b, ((v71.z) this.x).K());
                    androidx.lifecycle.p pVar = (androidx.lifecycle.p) bVar2.c;
                    this.w = 1;
                    if (pVar.s(m0Var2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                ((a0.m0) bVar2.e).a();
                return w61.a0.a;
            case 4:
                androidx.lifecycle.l0 l0Var = (androidx.lifecycle.l0) this.y;
                b71.a aVar6 = b71.a.r;
                int i12 = this.w;
                try {
                } catch (Throwable th2) {
                    c81.e eVar = v71.l0.a;
                    w71.d dVar = a81.n.a.w;
                    m1 m1Var = m1.s;
                    dVar.getClass();
                    a71.h y = k21.f.y(dVar, m1Var);
                    androidx.lifecycle.n nVar = new androidx.lifecycle.n(l0Var, (Object) null, (a71.c) null, 1);
                    this.x = th2;
                    this.w = 3;
                    if (v71.b0.L(y, nVar, this) != aVar6) {
                        throw th2;
                    }
                }
                if (i12 == 0) {
                    sy.y.j(obj);
                    mVar = new androidx.lifecycle.m((x71.t) this.x);
                    c81.e eVar2 = v71.l0.a;
                    w71.d dVar2 = a81.n.a.w;
                    androidx.lifecycle.n nVar2 = new androidx.lifecycle.n(l0Var, mVar, (a71.c) null, 0);
                    this.x = mVar;
                    this.w = 1;
                    if (v71.b0.L(dVar2, nVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            sy.y.j(obj);
                            throw new KotlinNothingValueException();
                        }
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th3 = (Throwable) this.x;
                        sy.y.j(obj);
                        throw th3;
                    }
                    mVar = (androidx.lifecycle.q0) this.x;
                    sy.y.j(obj);
                }
                this.x = mVar;
                this.w = 2;
                v71.b0.g(this);
                return aVar6;
            case 5:
                w61.a0Shadow a0Var = w61.a0.a;
                androidx.lifecycle.m0 m0Var3_r7 = (androidx.lifecycle.m0) this.x;
                b71.a aVar7 = b71.a.r;
                int i13 = this.w;
                if (i13 == 0) {
                    sy.y.j(obj);
                    androidx.lifecycle.h hVar = m0Var3_r7.a;
                    this.w = 1;
                    hVar.m(this);
                    if (a0Var == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                m0Var3_r7.a.j(this.y);
                return a0Var;
            case 6:
                b71.a aVar8 = b71.a.r;
                int i14 = this.w;
                if (i14 == 0) {
                    sy.y.j(obj);
                    ef.b bVar3 = new ef.b(13);
                    this.w = 1;
                    a71.h hVar2 = this.s;
                    k71.k.d(hVar2);
                    if (androidx.compose.runtime.t.v(hVar2).t(new androidx.compose.runtime.x0(0, bVar3), this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        throw new KotlinNothingValueException();
                    }
                    sy.y.j(obj);
                }
                y71.m1 c = ((b1.b) this.x).c();
                if (c == null) {
                    return w61.a0.a;
                }
                f0Shadow f0Var = new f0Shadow(i, (b1.m) this.y);
                this.w = 2;
                y71.m1.k(c, f0Var, this);
                return aVar8;
            case 7:
                b1.jShadow jVar = (b1.j) this.y;
                Object obj2 = b71.a.r;
                int i15 = this.w;
                try {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                sy.y.j(obj);
                                throw new KotlinNothingValueException();
                            }
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj);
                                jVar.c.E(1.0f);
                                this.w = 3;
                                if (v71.b0.l(500L, this) == obj2) {
                                    return obj2;
                                }
                                jVar.c.E(0.0f);
                                this.w = 4;
                                break;
                            } else {
                                sy.y.j(obj);
                                jVar.c.E(0.0f);
                                this.w = 4;
                            }
                        } else {
                            sy.y.j(obj);
                        }
                    } else {
                        sy.y.j(obj);
                        v71.d1Shadow d1Var = (v71.d1) this.x;
                        if (d1Var != null) {
                            this.w = 1;
                            d1Var.m((CancellationException) null);
                            Object O = d1Var.O(this);
                            Object obj3 = O;
                            if (O != obj2) {
                                obj3 = w61.a0.a;
                                break;
                            }
                        }
                    }
                    jVar.c.E(1.0f);
                    if (!jVar.a) {
                        this.w = 2;
                        v71.b0.g(this);
                        return obj2;
                    }
                    this.w = 3;
                    if (v71.b0.l(500L, this) == obj2) {
                    }
                    jVar.c.E(0.0f);
                    this.w = 4;
                } catch (Throwable th4) {
                    jVar.c.E(0.0f);
                    throw th4;
                }
                break;
            case 8:
                b71.a aVar9 = b71.a.r;
                int i16 = this.w;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw new KotlinNothingValueException();
                }
                sy.y.j(obj);
                b1.o oVar = (b1.o) this.x;
                a0.h hVar3 = (a0.h) this.y;
                this.w = 1;
                f2.a(oVar, hVar3, this);
                return aVar9;
            case 9:
                AsyncRequestWorker asyncRequestWorker = (AsyncRequestWorker) this.y;
                Context context = ((v8.w) asyncRequestWorker).a;
                e6.n nVar3 = asyncRequestWorker.h;
                b71.a aVar10 = b71.a.r;
                switch (this.w) {
                    case 0:
                        sy.y.j(obj);
                        v71.z zVar = (v71.z) this.x;
                        if (nVar3.D()) {
                            e6.m x = nVar3.x();
                            b6.x0 a2 = b6.v.a(x.r());
                            if (a2 != null) {
                                int[] E0 = x61.m.E0(x.p());
                                this.w = 1;
                                if (a2.d(zVar, context, E0, this) == aVar10) {
                                    return aVar10;
                                }
                            }
                        } else if (nVar3.y()) {
                            e6.c t2 = nVar3.t();
                            b6.x0 a3 = b6.v.a(t2.r());
                            if (a3 != null) {
                                int[] E02 = x61.m.E0(t2.p());
                                this.w = 2;
                                if (a3.a(zVar, context, E02, this) == aVar10) {
                                    return aVar10;
                                }
                            }
                        } else if (nVar3.z()) {
                            e6.e u = nVar3.u();
                            b6.x0 a4 = b6.v.a(u.t());
                            if (a4 != null) {
                                Context context2 = ((v8.w) asyncRequestWorker).a;
                                int r = u.r();
                                String q = u.q();
                                this.w = 3;
                                if (a4.b(zVar, context2, r, q, this) == aVar10) {
                                    return aVar10;
                                }
                            }
                        } else {
                            if (nVar3.C()) {
                                e6.k w = nVar3.w();
                                String r2 = w.r();
                                androidx.glance.appwidget.protobuf.i q2 = w.q();
                                int size = q2.size();
                                if (size == 0) {
                                    bArr = androidx.glance.appwidget.protobuf.e0.b;
                                } else {
                                    byte[] bArr3 = new byte[size];
                                    q2.e(size, bArr3);
                                    bArr = bArr3;
                                }
                                int i17 = ActionCallbackBroadcastReceiver.a;
                                Parcel obtain = Parcel.obtain();
                                obtain.unmarshall(bArr, 0, bArr.length);
                                obtain.setDataPosition(0);
                                Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain);
                                obtain.recycle();
                                c6.f.d(bundle);
                                this.w = 4;
                                Class<?> cls = Class.forName(r2);
                                if (!c6.a.class.isAssignableFrom(cls)) {
                                    throw new IllegalStateException("Provided class must implement ActionCallback.");
                                }
                                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                                k71.k.e(newInstance, "null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback");
                                a0.s0.y(newInstance);
                                throw null;
                            }
                            if (nVar3.A()) {
                                b6.q0 q0Var = new b6.q0(context);
                                this.w = 5;
                                if (q0Var.a(this) == aVar10) {
                                    return aVar10;
                                }
                            } else if (nVar3.B()) {
                                e6.i v3 = nVar3.v();
                                b6.x0 a5 = b6.v.a(v3.t());
                                if (a5 != null) {
                                    Context context3 = ((v8.w) asyncRequestWorker).a;
                                    int q3 = v3.q();
                                    androidx.glance.appwidget.protobuf.i r3 = v3.r();
                                    int size2 = r3.size();
                                    if (size2 == 0) {
                                        bArr2 = androidx.glance.appwidget.protobuf.e0.b;
                                    } else {
                                        byte[] bArr4 = new byte[size2];
                                        r3.e(size2, bArr4);
                                        bArr2 = bArr4;
                                    }
                                    Parcel obtain2 = Parcel.obtain();
                                    obtain2.unmarshall(bArr2, 0, bArr2.length);
                                    obtain2.setDataPosition(0);
                                    Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                                    obtain2.recycle();
                                    this.w = 6;
                                    if (a5.c(zVar, context3, q3, bundle2, this) == aVar10) {
                                        return aVar10;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        sy.y.j(obj);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return v8.v.a();
            case 10:
                w61.a0Shadow a0Var2 = w61.a0.a;
                b71.a aVar11 = b71.a.r;
                int i18 = this.w;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var2;
                }
                sy.y.j(obj);
                k6.k kVar = (k6.k) this.x;
                String m = k21.f.m(((b6.c) this.y).a);
                this.w = 1;
                b6.m mVar2_r7 = (b6.m) kVar.a.remove(m);
                if (mVar2_r7 != null) {
                    mVar2_r7.d.e((Throwable) null);
                    mVar2_r7.b.set(false);
                    mVar2_r7.m.m((CancellationException) null);
                }
                return a0Var2 == aVar11 ? aVar11 : a0Var2;
            case 11:
                b71.a aVar12 = b71.a.r;
                int i19 = this.w;
                if (i19 == 0) {
                    sy.y.j(obj);
                    Context context4 = (Context) this.x;
                    b6.x0 x0Var = (b6.x0) this.y;
                    b6.q0 q0Var2 = new b6.q0(context4);
                    m71.a e2 = x0Var.e();
                    this.w = 1;
                    if (q0Var2.e(x0Var, e2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        sy.y.j(obj);
                    } catch (Throwable unused2) {
                    }
                }
                return w61.a0.a;
            case 12:
                w61.a0Shadow a0Var3 = w61.a0.a;
                c3.d dVar3 = (c3.d) this.x;
                b71.a aVar13 = b71.a.r;
                int i20 = this.w;
                if (i20 == 0) {
                    sy.y.j(obj);
                    c3.g gVar3 = dVar3.f;
                    this.w = 1;
                    Object b2 = gVar3.b(0.0f - gVar3.b, this);
                    if (b2 != aVar13) {
                        b2 = a0Var3;
                    }
                    if (b2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                ((p1) dVar3.c.b).setValue(Boolean.FALSE);
                ((Runnable) this.y).run();
                return a0Var3;
            case 13:
                b71.a aVar14 = b71.a.r;
                int i22 = this.w;
                if (i22 == 0) {
                    sy.y.j(obj);
                    f8 a6 = ((com.github.rudroid.cache.f) ((cj.b) this.x).a.a((oa.j) this.y)).a();
                    this.w = 1;
                    v = n1.v(a6, this);
                    if (v == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    v = obj;
                }
                File file = (File) v;
                if (file != null) {
                    kotlin.io.h hVar4 = kotlin.io.h.r;
                    kotlin.io.e eVar3 = new kotlin.io.e(new kotlin.io.g(file));
                    while (true) {
                        boolean z2 = true;
                        while (eVar3.hasNext()) {
                            File file2 = (File) eVar3.next();
                            if (file2.delete() || !file2.exists()) {
                                if (z2) {
                                    break;
                                }
                            }
                            z2 = false;
                        }
                    }
                }
                return w61.a0.a;
            case 14:
                b71.a aVar15 = b71.a.r;
                int i23 = this.w;
                if (i23 == 0) {
                    sy.y.j(obj);
                    l0 a7 = ((com.github.rudroid.w) this.x).b.a((oa.j) this.y);
                    this.w = 1;
                    v2 = n1.v(a7, this);
                    if (v2 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    v2 = obj;
                }
                com.github.rudroid.copilot.preferences.f fVar2 = (com.github.rudroid.copilot.preferences.f) v2;
                if (fVar2 != null && fVar2.b) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                b71.a aVar16 = b71.a.r;
                int i24 = this.w;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                n5.f fVar3 = (n5.f) ((com.github.rudroid.q0) this.x).c.a((oa.j) this.y);
                androidx.compose.runtime.f2 f2Var = new androidx.compose.runtime.f2(2, (a71.c) null, 1);
                this.w = 1;
                Object n = z3.n(fVar3, f2Var, this);
                return n == aVar16 ? aVar16 : n;
            case 16:
                b71.a aVar17 = b71.a.r;
                int i25 = this.w;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                TextClassifier textClassifier = (TextClassifier) this.x;
                if (textClassifier == null) {
                    return null;
                }
                Object r22 = (c71.j) this.y;
                this.w = 1;
                Object s = r22.s(textClassifier, this);
                return s == aVar17 ? aVar17 : s;
            case 17:
                w61.a0Shadow a0Var4 = w61.a0.a;
                b71.a aVar18 = b71.a.r;
                int i26 = this.w;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var4;
                }
                sy.y.j(obj);
                w2.h hVar5 = (w2.c1) this.x;
                w2.b1Shadow a8 = k0.c.a((g3.g) this.y);
                this.w = 1;
                hVar5.a(a8);
                return a0Var4 == aVar18 ? aVar18 : a0Var4;
            case 18:
                dn.u uVar = (dn.u) this.x;
                b71.a aVar19 = b71.a.r;
                int i27 = this.w;
                if (i27 == 0) {
                    sy.y.j(obj);
                    dn.z zVar2 = uVar.a;
                    oa.jShadow jVar2 = (oa.j) this.y;
                    this.w = 1;
                    if (zVar2.b(jVar2, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                dn.z zVar3 = uVar.a;
                v71.b0.z(zVar3.g, (a71.h) null, (v71.a0Shadow) null, new g0(zVar3, cVar, 9), 3);
                return w61.a0.a;
            case 19:
                e1.a aVar20 = (e1.a) this.y;
                b71.a aVar21 = b71.a.r;
                int i28 = this.w;
                if (i28 == 0) {
                    sy.y.j(obj);
                    v71.z zVar4 = (v71.z) this.x;
                    y71.i a9 = aVar20.F.a();
                    c00.r rVar2 = new c00.r(4, aVar20, zVar4);
                    this.w = 1;
                    if (a9.b(rVar2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 20:
                b71.a aVar22 = b71.a.r;
                int i29 = this.w;
                if (i29 == 0) {
                    sy.y.j(obj);
                    a0.e eVar4 = (a0.e) ((e1.g) this.x).c;
                    Float f = new Float(0.0f);
                    a0.o oVar2 = (a0.o) this.y;
                    this.w = 1;
                    if (a0.e.c(eVar4, f, oVar2, (j71.c) null, this, 12) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 21:
                b71.a aVar23 = b71.a.r;
                int i30 = this.w;
                if (i30 == 0) {
                    sy.y.j(obj);
                    e61.i iVar2 = (e61.i) this.y;
                    y71.i data = iVar2.a.getData();
                    this.x = iVar2;
                    this.w = 1;
                    t = n1.t(data, this);
                    if (t == aVar23) {
                        return aVar23;
                    }
                    iVar = iVar2;
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = (e61.i) this.x;
                    sy.y.j(obj);
                    t = obj;
                }
                e61.i.a(iVar, ((s5.b) t).i());
                return w61.a0.a;
            case 22:
                b71.a aVar24 = b71.a.r;
                int i32 = this.w;
                if (i32 == 0) {
                    sy.y.j(obj);
                    j0.jShadow jVar3 = (j0.j) this.x;
                    j0.f fVar4 = (j0.f) this.y;
                    this.w = 1;
                    if (jVar3.b(fVar4, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 23:
                b71.a aVar25 = b71.a.r;
                int i33 = this.w;
                if (i33 == 0) {
                    sy.y.j(obj);
                    j0.jShadow jVar4 = (j0.j) this.x;
                    j0.g gVar4 = (j0.g) this.y;
                    this.w = 1;
                    if (jVar4.b(gVar4, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 24:
                w61.a0Shadow a0Var5 = w61.a0.a;
                b71.a aVar26 = b71.a.r;
                int i34 = this.w;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var5;
                }
                sy.y.j(obj);
                i5 i5Var = (i5) this.x;
                f5 f5Var = (f5) this.y;
                float f2 = f5Var.a;
                float f3 = f5Var.b;
                float f4 = f5Var.d;
                float f5 = f5Var.c;
                this.w = 1;
                i5Var.a = f2;
                i5Var.b = f3;
                i5Var.c = f4;
                i5Var.d = f5;
                Object b3 = i5Var.b(this);
                if (b3 != aVar26) {
                    b3 = a0Var5;
                }
                return b3 == aVar26 ? aVar26 : a0Var5;
            case 25:
                b71.a aVar27 = b71.a.r;
                int i35 = this.w;
                if (i35 == 0) {
                    sy.y.j(obj);
                    i5 i5Var2 = (i5) this.x;
                    j0.h hVar6 = (j0.h) this.y;
                    this.w = 1;
                    if (i5Var2.a(hVar6, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 26:
                b71.a aVar28 = b71.a.r;
                int i36 = this.w;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                sy.y.j(obj);
                y71.m1 m1Var2 = ((j0.j) this.x).a;
                f1.q0 q0Var3 = new f1.q0((v1.q) this.y, 3);
                this.w = 1;
                m1Var2.b(q0Var3, this);
                return aVar28;
            case 27:
                u9 u9Var = (u9) this.x;
                p1 p1Var = u9Var.E;
                b71.a aVar29 = b71.a.r;
                int i37 = this.w;
                if (i37 == 0) {
                    sy.y.j(obj);
                    p1Var.setValue(Boolean.TRUE);
                    f0.m1 m1Var3 = u9Var.J;
                    t9 t9Var = u9Var.I;
                    j1 j1Var = j1.s;
                    o oVar3 = (o) this.y;
                    this.w = 1;
                    m1Var3.getClass();
                    if (v71.b0.k(new l1(j1Var, m1Var3, oVar3, t9Var, (a71.c) null), this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                p1Var.setValue(Boolean.FALSE);
                return w61.a0.a;
            case 28:
                z9 z9Var = (z9) this.x;
                b71.a aVar30 = b71.a.r;
                int i38 = this.w;
                if (i38 == 0) {
                    sy.y.j(obj);
                    if (z9Var != null) {
                        aa aaVar = z9Var.a;
                        v9 v9Var = aaVar.c;
                        boolean z3 = aaVar.b != null;
                        w2.g gVar5 = (w2.f) this.y;
                        int ordinal = v9Var.ordinal();
                        long j2 = Long.MAX_VALUE;
                        if (ordinal == 0) {
                            j = 4000;
                        } else if (ordinal == 1) {
                            j = 10000;
                        } else {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (gVar5 != null) {
                            AccessibilityManager accessibilityManager = gVar5.a;
                            if (j < 2147483647L) {
                                int i39 = z3 ? 7 : 3;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    int a10 = w2.v0.a(accessibilityManager, (int) j, i39);
                                    if (a10 != Integer.MAX_VALUE) {
                                        j2 = a10;
                                    }
                                } else if (z3) {
                                    break;
                                }
                                this.w = 1;
                                if (v71.b0.l(j2, this) == aVar30) {
                                    return aVar30;
                                }
                            }
                        }
                        j2 = j;
                        this.w = 1;
                        if (v71.b0.l(j2, this) == aVar30) {
                        }
                    }
                    return w61.a0.a;
                }
                if (i38 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                z9Var.a();
                return w61.a0.a;
            default:
                b41.e eVar5 = (b41.e) this.y;
                b71.a aVar31 = b71.a.r;
                int i40 = this.w;
                if (i40 == 0) {
                    sy.y.j(obj);
                    x71.t tVar2 = (x71.t) this.x;
                    f41.e eVar6 = new f41.e(new f41.b(tVar2, eVar5), new a2.d(6, tVar2));
                    w21.o a12 = eVar5.a();
                    a5.s sVar = new a5.s(tVar2, eVar5, eVar6, 17);
                    a12.getClass();
                    h2 h2Var = w21.h.a;
                    a12.d(h2Var, sVar);
                    a12.c(h2Var, new x3(12, tVar2));
                    a2.b bVar4 = new a2.b(3, eVar5, eVar6);
                    this.w = 1;
                    if (t.z.f(tVar2, bVar4, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u9 u9Var, o oVar, a71.c cVar) {
        super(2, cVar);
        this.v = 27;
        j1 j1Var = j1.r;
        this.x = u9Var;
        this.y = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
    }
















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x {
        public x() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z {
        public z() {
        }
    }
}
