package a61;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import androidx.compose.runtime.d3;
import androidx.compose.runtime.e3;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.x1;
import com.github.centrallogger.CentralUsageWorker;
import com.github.service.models.ApiRequestStatus;
import com.google.firebase.sessions.SessionLifecycleService;
import f0.j1;
import f0.l1;
import f0.m1;
import f1.i5;
import h0.a3;
import h0.b2;
import h0.c3;
import h0.e2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import t00.f8;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(a71.c cVar, d51.d dVar, j71.f fVar) {
        super(2, cVar);
        this.v = 19;
        this.y = (c71.j) fVar;
        this.z = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [c71.j, j71.c] */
    /* JADX WARN: Type inference failed for: r0v22, types: [c71.j, j71.f] */
    /* JADX WARN: Type inference failed for: r0v30, types: [c71.j, j71.f] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c71.j, j71.e] */
    /* JADX WARN: Type inference failed for: r2v19, types: [c71.j, j71.e] */
    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new o((p) this.x, (a71.h) this.y, (e1) this.z, cVar, 0);
            case 1:
                return new o((CentralUsageWorker) this.x, (String) this.y, (String) this.z, cVar, 1);
            case 2:
                return new o((androidx.compose.foundation.lazy.layout.a0) this.x, (a0.d0) this.y, (g2.b) this.z, cVar, 2);
            case 3:
                o oVar = new o((h2) this.y, (androidx.compose.runtime.w0) this.z, cVar, 3);
                oVar.x = obj;
                return oVar;
            case 4:
                o oVar2 = new o((a71.h) this.y, (y71.i) this.z, cVar, 4);
                oVar2.x = obj;
                return oVar2;
            case 5:
                return new o((m71.a) this.x, (Context) this.y, (z5.k) this.z, cVar, 5);
            case 6:
                return new o((a81.d) this.x, (BroadcastReceiver.PendingResult) this.y, (j71.e) this.z, cVar);
            case 7:
                o oVar3 = new o((cn.s) this.y, (String) this.z, cVar, 7);
                oVar3.x = obj;
                return oVar3;
            case 8:
                o oVar4 = new o((i3) this.y, (a0.e) this.z, cVar, 8);
                oVar4.x = obj;
                return oVar4;
            case 9:
                o oVar5 = new o((j71.c) this.z, cVar);
                oVar5.y = obj;
                return oVar5;
            case 10:
                return new o((do0.t) this.x, (qn0.p) this.y, (k71.u) this.z, cVar, 10);
            case 11:
                return new o((do0.t) this.x, (qo.p) this.y, (k71.u) this.z, cVar, 11);
            case 12:
                return new o((do0.t) this.x, (rc0.p) this.y, (k71.u) this.z, cVar, 12);
            case 13:
                return new o((j0.j) this.x, (j0.k) this.y, (v71.n0) this.z, cVar, 13);
            case 14:
                return new o((j0.j) this.x, (j0.h) this.y, (v71.n0) this.z, cVar, 14);
            case 15:
                o oVar6 = new o((j0.i) this.y, (i5) this.z, cVar, 15);
                oVar6.x = obj;
                return oVar6;
            case 16:
                o oVar7 = new o((r9.k) this.y, (g9.h) this.z, cVar, 16);
                oVar7.x = obj;
                return oVar7;
            case 17:
                o oVar8 = new o((b21.v) this.y, (aa.d) this.z, cVar, 17);
                oVar8.x = obj;
                return oVar8;
            case 18:
                o oVar9 = new o((go0.z) this.z, cVar);
                oVar9.y = obj;
                return oVar9;
            case 19:
                o oVar10 = new o(cVar, (d51.d) this.z, (j71.f) this.y);
                oVar10.x = obj;
                return oVar10;
            case 20:
                o oVar11 = new o((h0.b0) this.y, (j71.e) this.z, cVar, 20);
                oVar11.x = obj;
                return oVar11;
            case 21:
                return new o((h0.b0) this.x, (j1) this.y, (j71.e) this.z, cVar, 21);
            case 22:
                o oVar12 = new o((h0.y0) this.y, (h0.f1) this.z, cVar, 22);
                oVar12.x = obj;
                return oVar12;
            case 23:
                o oVar13 = new o((h0.f1) this.y, (h0.k0) this.z, cVar, 23);
                oVar13.x = obj;
                return oVar13;
            case 24:
                o oVar14 = new o((h0.y0) this.y, (c3) this.z, cVar, 24);
                oVar14.x = obj;
                return oVar14;
            case 25:
                o oVar15 = new o((c3) this.y, (j71.e) this.z, cVar, 25);
                oVar15.x = obj;
                return oVar15;
            case 26:
                return new o((j71.f) this.x, (e2) this.y, (q2.u) this.z, cVar);
            case 27:
                o oVar16 = new o((v71.d1) this.y, (j71.e) this.z, cVar);
                oVar16.x = obj;
                return oVar16;
            case 28:
                o oVar17 = new o((j71.f) this.y, (h1.o) this.z, cVar, 28);
                oVar17.x = obj;
                return oVar17;
            default:
                o oVar18 = new o((j71.g) this.y, (h1.o) this.z, cVar, 29);
                oVar18.x = obj;
                return oVar18;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 1:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 2:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 3:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 4:
                return ((o) r((a71.c) obj2, (x1) obj)).v(w61.a0.a);
            case 5:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 6:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 7:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 8:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 9:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 10:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 11:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 12:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 13:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 14:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 15:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 16:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 17:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 18:
                return ((o) r((a71.c) obj2, (y71.j) obj)).v(w61.a0.a);
            case 19:
                return ((o) r((a71.c) obj2, (h0.x) obj)).v(w61.a0.a);
            case 20:
                return ((o) r((a71.c) obj2, (h0.h2) obj)).v(w61.a0.a);
            case 21:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 22:
                return ((o) r((a71.c) obj2, (h0.a1) obj)).v(w61.a0.a);
            case 23:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 24:
                return ((o) r((a71.c) obj2, (a3) obj)).v(w61.a0.a);
            case 25:
                return ((o) r((a71.c) obj2, (h0.h2) obj)).v(w61.a0.a);
            case 26:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 27:
                return ((o) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 28:
                return ((o) r((a71.c) obj2, (h1.v0) obj)).v(w61.a0.a);
            default:
                return ((o) r((a71.c) obj2, (w61.k) obj)).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0299, code lost:
    
        if (r5 == r1) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02f7, code lost:
    
        if (r9 == r1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04f6, code lost:
    
        if (r5 == r1) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009d, code lost:
    
        if (r6.O(r16) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x077a, code lost:
    
        if (r3.b(r16) == r10) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0742, code lost:
    
        if (r8 == r10) goto L440;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v81, types: [c71.j, j71.f] */
    /* JADX WARN: Type inference failed for: r2v49, types: [c71.j, j71.f] */
    /* JADX WARN: Type inference failed for: r5v12, types: [c71.j, j71.e] */
    /* JADX WARN: Type inference failed for: r5v17, types: [c71.j, j71.c] */
    /* JADX WARN: Type inference failed for: r5v47, types: [c71.j, j71.e] */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object b;
        boolean z;
        Object s;
        Object k;
        Object f;
        qn0.h hVar;
        qn0.m mVar;
        Object f2;
        qo.h hVar2;
        qo.m mVar2;
        Object f3;
        rc0.h hVar3;
        rc0.m mVar3;
        y71.jShadow jVar;
        Object E;
        y71.jShadow jVar2;
        y71.i q;
        Object obj2;
        v71.z zVar;
        int i = this.v;
        int i2 = 0;
        CancellationException cancellationException = null;
        Object[] objArr = 0;
        w61.a0Shadow a0Var = w61.a0.a;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                p pVar = (p) this.x;
                e61.g gVar = pVar.b;
                b71.a aVar = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    b61.c cVar = b61.c.a;
                    this.w = 1;
                    b = cVar.b(this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        Boolean a = gVar.a.a();
                        if (!((a == null && (a = gVar.b.a()) == null) ? true : a.booleanValue())) {
                            return a0Var;
                        }
                        a71.h hVar4 = (a71.h) this.y;
                        w51.r rVar = new w51.r(hVar4);
                        e1 e1Var = (e1) obj3;
                        k71.k.g(e1Var, "sessionLifecycleServiceBinder");
                        Messenger messenger = new Messenger(new a1(hVar4));
                        c1 c1Var = (c1) rVar.v;
                        k71.k.g(c1Var, "serviceConnection");
                        Context context = e1Var.a;
                        Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
                        intent.setAction(String.valueOf(Process.myPid()));
                        intent.putExtra("ClientCallbackMessenger", messenger);
                        intent.setPackage(context.getPackageName());
                        try {
                            z = context.bindService(intent, c1Var, 65);
                        } catch (SecurityException unused) {
                            z = false;
                        }
                        if (!z) {
                            try {
                                context.unbindService(c1Var);
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        f1.t = rVar;
                        if (f1.s) {
                            f1.s = false;
                            rVar.P(1);
                        }
                        k41.g gVar2 = pVar.a;
                        a5.i iVar = new a5.i(5);
                        gVar2.a();
                        gVar2.j.add(iVar);
                        return a0Var;
                    }
                    sy.y.j(obj);
                    b = obj;
                }
                Collection values = ((Map) b).values();
                if ((values instanceof Collection) && values.isEmpty()) {
                    return a0Var;
                }
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (((v41.i) it.next()).a.a()) {
                        this.w = 2;
                        break;
                    }
                }
                return a0Var;
            case 1:
                CentralUsageWorker centralUsageWorker = (CentralUsageWorker) this.x;
                b71.a aVar2 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    sy.y.j(obj);
                    bi.a aVar3 = centralUsageWorker.h;
                    this.w = 1;
                    bi.a aVar4 = aVar3;
                    s = i21.a.s(aVar4.b, new bi.c((String) this.y, aVar4.a, (String) obj3), this);
                    if (s == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    s = obj;
                }
                xz0.c cVar2 = (xz0.c) s;
                k71.k.g(cVar2, "<this>");
                return cVar2.a == ApiRequestStatus.SUCCESS ? v8.v.a() : ((v8.w) centralUsageWorker).b.c < 5 ? new v8.t() : new v8.s();
            case 2:
                androidx.compose.foundation.lazy.layout.a0Shadow a0Var2 = (androidx.compose.foundation.lazy.layout.a0) this.x;
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                try {
                    if (i5 == 0) {
                        sy.y.j(obj);
                        a0.e eVar = a0Var2.p;
                        Float f4 = new Float(0.0f);
                        a0.d0 d0Var = (a0.d0) this.y;
                        androidx.compose.foundation.lazy.layout.x xVar = new androidx.compose.foundation.lazy.layout.x((g2.b) obj3, a0Var2, 1);
                        this.w = 1;
                        if (a0.e.c(eVar, f4, d0Var, xVar, this, 4) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    a0Var2.k.setValue(Boolean.TRUE);
                    a0Var2.e(false);
                    return a0Var;
                } catch (Throwable th) {
                    int i6 = androidx.compose.foundation.lazy.layout.a0.t;
                    a0Var2.e(false);
                    throw th;
                }
            case 3:
                b71.a aVar6 = b71.a.r;
                int i7 = this.w;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                v71.z zVar2 = (v71.z) this.x;
                this.w = 1;
                ((h2) this.y).f(zVar2, (androidx.compose.runtime.w0) obj3, this);
                return aVar6;
            case 4:
                y71.i iVar2 = (y71.i) obj3;
                a71.h hVar5 = (a71.h) this.y;
                b71.a aVar7 = b71.a.r;
                int i8 = this.w;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                x1 x1Var = (x1) this.x;
                if (k71.k.b(hVar5, a71.i.r)) {
                    d3 d3Var = new d3(x1Var, 0);
                    this.w = 1;
                    if (iVar2.b(d3Var, this) != aVar7) {
                        return a0Var;
                    }
                } else {
                    e3 e3Var = new e3(iVar2, x1Var, (a71.c) null, 0);
                    this.w = 2;
                    if (v71.b0.L(hVar5, e3Var, this) != aVar7) {
                        return a0Var;
                    }
                }
                return aVar7;
            case 5:
                b71.a aVar8 = b71.a.r;
                int i9 = this.w;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                this.w = 1;
                ((m71.a) this.x).P((Context) this.y, (z5.k) obj3, this);
                return aVar8;
            case 6:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.y;
                a81.d dVar = (a81.d) this.x;
                b71.a aVar9 = b71.a.r;
                int i10 = this.w;
                try {
                    try {
                        if (i10 == 0) {
                            sy.y.j(obj);
                            b6.xShadow xVar2 = new b6.xShadow(0, (a71.c) null, (c71.j) obj3);
                            this.w = 1;
                            if (v71.b0.k(xVar2, this) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                        }
                    } catch (Throwable th2) {
                        try {
                            if (!(th2 instanceof CancellationException) || th2.getCause() != null) {
                                c71.g.a(Log.e("GlanceAppWidget", "BroadcastReceiver execution failed", th2));
                            }
                        } finally {
                            v71.b0.i(dVar, (CancellationException) null);
                        }
                    }
                    try {
                        return a0Var;
                    } catch (IllegalStateException unused3) {
                        return a0Var;
                    }
                } finally {
                    try {
                        pendingResult.finish();
                    } catch (IllegalStateException unused4) {
                    }
                }
            case 7:
                String str = (String) obj3;
                cn.s sVar = (cn.s) this.y;
                y71.jShadow jVar3 = (y71.j) this.x;
                b71.a aVar10 = b71.a.r;
                int i12 = this.w;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                sVar.g.add(str);
                cn.hShadow hVar6 = (cn.hShadow) sVar.e.get(str);
                if (hVar6 == null) {
                    return a0Var;
                }
                cn.l lVar = new cn.l(hVar6.a, (List) hVar6.b);
                this.x = null;
                this.w = 1;
                return jVar3.c(lVar, this) == aVar10 ? aVar10 : a0Var;
            case 8:
                b71.a aVar11 = b71.a.r;
                int i13 = this.w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                v71.z zVar3 = (v71.z) this.x;
                f8 J = androidx.compose.runtime.t.J(new d1.x0((i3) this.y, 1));
                c00.r rVar2 = new c00.r(1, (a0.e) obj3, zVar3);
                this.w = 1;
                return J.b(rVar2, this) == aVar11 ? aVar11 : a0Var;
            case 9:
                y71.jShadow jVar4 = (y71.j) this.y;
                b71.a aVar12 = b71.a.r;
                int i14 = this.w;
                if (i14 == 0) {
                    sy.y.j(obj);
                    this.y = null;
                    this.x = jVar4;
                    this.w = 1;
                    k = ((c71.j) obj3).k(this);
                    break;
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    jVar4 = (y71.j) this.x;
                    sy.y.j(obj);
                    k = obj;
                }
                this.y = null;
                this.x = null;
                this.w = 2;
                if (jVar4.c(k, this) != aVar12) {
                    return a0Var;
                }
                return aVar12;
            case 10:
                b71.a aVar13 = b71.a.r;
                int i15 = this.w;
                if (i15 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = ((do0.t) this.x).t;
                    qn0.p pVar2 = (qn0.p) this.y;
                    this.w = 1;
                    f = bVar.f(pVar2);
                    if (f == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    f = obj;
                }
                qn0.e eVar2 = (qn0.e) f;
                if (eVar2 == null) {
                    return a0Var;
                }
                k71.u uVar = (k71.u) obj3;
                qn0.g gVar3 = eVar2.a;
                if (gVar3 != null && (hVar = gVar3.c) != null && (mVar = hVar.c) != null) {
                    i2 = mVar.a;
                }
                uVar.r = i2;
                return a0Var;
            case 11:
                b71.a aVar14 = b71.a.r;
                int i16 = this.w;
                if (i16 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar2 = ((do0.t) this.x).t;
                    qo.p pVar3 = (qo.p) this.y;
                    this.w = 1;
                    f2 = bVar2.f(pVar3);
                    if (f2 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    f2 = obj;
                }
                qo.e eVar3 = (qo.e) f2;
                if (eVar3 == null) {
                    return a0Var;
                }
                k71.u uVar2 = (k71.u) obj3;
                qo.g gVar4 = eVar3.a;
                if (gVar4 != null && (hVar2 = gVar4.c) != null && (mVar2 = hVar2.c) != null) {
                    i2 = mVar2.a;
                }
                uVar2.r = i2;
                return a0Var;
            case 12:
                b71.a aVar15 = b71.a.r;
                int i17 = this.w;
                if (i17 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar3 = ((do0.t) this.x).t;
                    rc0.p pVar4 = (rc0.p) this.y;
                    this.w = 1;
                    f3 = bVar3.f(pVar4);
                    if (f3 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    f3 = obj;
                }
                rc0.e eVar4 = (rc0.e) f3;
                if (eVar4 == null) {
                    return a0Var;
                }
                k71.u uVar3 = (k71.u) obj3;
                rc0.g gVar5 = eVar4.a;
                if (gVar5 != null && (hVar3 = gVar5.c) != null && (mVar3 = hVar3.c) != null) {
                    i2 = mVar3.a;
                }
                uVar3.r = i2;
                return a0Var;
            case 13:
                b71.a aVar16 = b71.a.r;
                int i18 = this.w;
                if (i18 == 0) {
                    sy.y.j(obj);
                    j0.jShadow jVar5 = (j0.j) this.x;
                    j0.k kVar = (j0.k) this.y;
                    this.w = 1;
                    if (jVar5.b(kVar, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                v71.n0 n0Var = (v71.n0) obj3;
                if (n0Var == null) {
                    return a0Var;
                }
                n0Var.a();
                return a0Var;
            case 14:
                b71.a aVar17 = b71.a.r;
                int i19 = this.w;
                if (i19 == 0) {
                    sy.y.j(obj);
                    j0.jShadow jVar6 = (j0.j) this.x;
                    j0.h hVar7 = (j0.h) this.y;
                    this.w = 1;
                    if (jVar6.b(hVar7, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                v71.n0 n0Var2 = (v71.n0) obj3;
                if (n0Var2 == null) {
                    return a0Var;
                }
                n0Var2.a();
                return a0Var;
            case 15:
                b71.a aVar18 = b71.a.r;
                int i20 = this.w;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                v71.z zVar4 = (v71.z) this.x;
                ArrayList arrayList = new ArrayList();
                y71.i a2 = ((j0.i) this.y).a();
                c00.f fVar = new c00.f(arrayList, zVar4, (i5) obj3, 4);
                this.w = 1;
                return a2.b(fVar, this) == aVar18 ? aVar18 : a0Var;
            case 16:
                r9.k kVar2 = (r9.k) this.y;
                b71.a aVar19 = b71.a.r;
                int i22 = this.w;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                v71.z zVar5 = (v71.z) this.x;
                c81.e eVar5 = v71.l0.a;
                v71.f0Shadow f5 = v71.b0.f(zVar5, a81.n.a.w, new g9.e((g9.h) obj3, kVar2, (a71.c) null, 1), 2);
                w9.f.c(kVar2.c.s).b();
                this.w = 1;
                Object s2 = f5.s(this);
                return s2 == aVar19 ? aVar19 : s2;
            case 17:
                aa.d dVar2 = (aa.d) obj3;
                b21.v vVar = (b21.v) this.y;
                b71.a aVar20 = b71.a.r;
                int i23 = this.w;
                if (i23 == 0) {
                    sy.y.j(obj);
                    jVar = (y71.j) this.x;
                    aa.d d = dVar2.d();
                    ga.n.b(d);
                    y71.i q2 = vVar.q(d.b());
                    this.x = jVar;
                    this.w = 1;
                    E = n1.E(q2, this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            if (i23 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                            return a0Var;
                        }
                        jVar2 = (y71.j) this.x;
                        sy.y.j(obj);
                        q = vVar.q(dVar2);
                        this.x = null;
                        this.w = 3;
                        if (n1.q(jVar2, q, this) != aVar20) {
                            return a0Var;
                        }
                        return aVar20;
                    }
                    jVar = (y71.j) this.x;
                    sy.y.j(obj);
                    E = obj;
                }
                aa.e a3 = ((aa.f) E).a();
                a3.a = false;
                aa.f d2 = a3.d();
                this.x = jVar;
                this.w = 2;
                if (jVar.c(d2, this) != aVar20) {
                    jVar2 = jVar;
                    q = vVar.q(dVar2);
                    this.x = null;
                    this.w = 3;
                    if (n1.q(jVar2, q, this) != aVar20) {
                    }
                }
                return aVar20;
            case 18:
                y71.jShadow jVar7 = (y71.j) this.y;
                b71.a aVar21 = b71.a.r;
                int i24 = this.w;
                if (i24 == 0) {
                    sy.y.j(obj);
                    go0.z zVar6 = (go0.z) obj3;
                    this.y = null;
                    this.x = jVar7;
                    this.w = 1;
                    g91.f fVar2 = zVar6.A;
                    if (fVar2 != null) {
                        obj2 = fVar2;
                        break;
                    } else {
                        obj2 = zVar6.o(this);
                        break;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    jVar7 = (y71.j) this.x;
                    sy.y.j(obj);
                    obj2 = obj;
                }
                this.y = null;
                this.x = null;
                this.w = 2;
                if (jVar7.c(obj2, this) != aVar21) {
                    return a0Var;
                }
                return aVar21;
            case 19:
                b71.a aVar22 = b71.a.r;
                int i25 = this.w;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                h0.x xVar3 = (h0.x) this.x;
                j71.f r2 = (j71.f) ((c71.j) this.y);
                h0.n nVar = (h0.n) ((d51.d) obj3).i;
                this.w = 1;
                return r2.f(nVar, xVar3, this) == aVar22 ? aVar22 : a0Var;
            case 20:
                p1 p1Var = ((h0.b0) this.y).d;
                b71.a aVar23 = b71.a.r;
                int i26 = this.w;
                try {
                    if (i26 == 0) {
                        sy.y.j(obj);
                        h0.h2 h2Var = (h0.h2) this.x;
                        p1Var.setValue(Boolean.TRUE);
                        this.w = 1;
                        if (((j71.e) obj3).s(h2Var, this) == aVar23) {
                            return aVar23;
                        }
                    } else {
                        if (i26 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    return a0Var;
                } finally {
                    p1Var.setValue(Boolean.FALSE);
                }
            case 21:
                b71.a aVar24 = b71.a.r;
                int i27 = this.w;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                h0.b0 b0Var = (h0.b0) this.x;
                m1 m1Var = b0Var.c;
                h0.a0Shadow a0Var3 = b0Var.b;
                j1 j1Var = (j1) this.y;
                o oVar = new o((Object) b0Var, obj3, (a71.c) (objArr == true ? 1 : 0), 20);
                this.w = 1;
                m1Var.getClass();
                return v71.b0.k(new l1(j1Var, m1Var, oVar, a0Var3, (a71.c) null), this) == aVar24 ? aVar24 : a0Var;
            case 22:
                b71.a aVar25 = b71.a.r;
                int i28 = this.w;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                h0.a1 a1Var = (h0.a1) this.x;
                h0.y0 y0Var = (h0.y0) this.y;
                fg.d dVar3 = new fg.d(5, a1Var, (h0.f1) obj3);
                this.w = 1;
                return y0Var.s(dVar3, this) == aVar25 ? aVar25 : a0Var;
            case 23:
                h0.f1 f1Var = (h0.f1) this.y;
                b71.a aVar26 = b71.a.r;
                int i29 = this.w;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                v71.z zVar7 = (v71.z) this.x;
                j71.f fVar3 = f1Var.d0;
                long f6 = s3.q.f(f1Var.e0 ? -1.0f : 1.0f, ((h0.k0) obj3).a);
                b2 b2Var = f1Var.a0;
                go0.o oVar2 = h0.d1.a;
                Float f7 = new Float(b2Var == b2.r ? s3.q.c(f6) : s3.q.b(f6));
                this.w = 1;
                return fVar3.f(zVar7, f7, this) == aVar26 ? aVar26 : a0Var;
            case 24:
                b71.a aVar27 = b71.a.r;
                int i30 = this.w;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                a3 a3Var = (a3) this.x;
                h0.y0 y0Var2 = (h0.y0) this.y;
                fg.d dVar4 = new fg.d(6, a3Var, (c3) obj3);
                this.w = 1;
                return y0Var2.s(dVar4, this) == aVar27 ? aVar27 : a0Var;
            case 25:
                b71.a aVar28 = b71.a.r;
                int i32 = this.w;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                h0.h2 h2Var2 = (h0.h2) this.x;
                c3 c3Var = (c3) this.y;
                c3Var.k = h2Var2;
                a3 a3Var2 = c3Var.l;
                this.w = 1;
                return ((j71.e) obj3).s(a3Var2, this) == aVar28 ? aVar28 : a0Var;
            case 26:
                b71.a aVar29 = b71.a.r;
                int i33 = this.w;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                j71.f r1 = (j71.f) ((c71.j) this.x);
                e2 e2Var = (e2) this.y;
                c2.b bVar4 = new c2.b(((q2.u) obj3).c);
                this.w = 1;
                return r1.f(e2Var, bVar4, this) == aVar29 ? aVar29 : a0Var;
            case 27:
                b71.a aVar30 = b71.a.r;
                int i34 = this.w;
                if (i34 == 0) {
                    sy.y.j(obj);
                    zVar = (v71.z) this.x;
                    v71.d1Shadow d1Var = (v71.d1) this.y;
                    this.x = zVar;
                    this.w = 1;
                    break;
                } else {
                    if (i34 != 1) {
                        if (i34 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    zVar = (v71.z) this.x;
                    sy.y.j(obj);
                }
                this.x = null;
                this.w = 2;
                if (((c71.j) obj3).s(zVar, this) != aVar30) {
                    return a0Var;
                }
                return aVar30;
            case 28:
                b71.a aVar31 = b71.a.r;
                int i35 = this.w;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                h1.v0 v0Var = (h1.v0) this.x;
                j71.f fVar4 = (j71.f) this.y;
                h1.n nVar2 = ((h1.o) obj3).n;
                this.w = 1;
                return fVar4.f(nVar2, v0Var, this) == aVar31 ? aVar31 : a0Var;
            default:
                b71.a aVar32 = b71.a.r;
                int i36 = this.w;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var;
                }
                sy.y.j(obj);
                w61.k kVar3 = (w61.k) this.x;
                h1.v0 v0Var2 = (h1.v0) kVar3.r;
                Object obj4 = kVar3.s;
                j71.g gVar6 = (j71.g) this.y;
                h1.n nVar3 = ((h1.o) obj3).n;
                this.w = 1;
                return gVar6.n(nVar3, v0Var2, obj4, this) == aVar32 ? aVar32 : a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(a81.d dVar, BroadcastReceiver.PendingResult pendingResult, j71.e eVar, a71.c cVar) {
        super(2, cVar);
        this.v = 6;
        this.x = dVar;
        this.y = pendingResult;
        this.z = (c71.j) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(go0.z zVar, a71.c cVar) {
        super(2, cVar);
        this.v = 18;
        this.z = zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.v = 9;
        this.z = (c71.j) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(j71.f fVar, e2 e2Var, q2.u uVar, a71.c cVar) {
        super(2, cVar);
        this.v = 26;
        this.x = (c71.j) fVar;
        this.y = e2Var;
        this.z = uVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(v71.d1Shadow d1Var, j71.e eVar, a71.c cVar) {
        super(2, cVar);
        this.v = 27;
        this.y = d1Var;
        this.z = (c71.j) eVar;
    }
}
