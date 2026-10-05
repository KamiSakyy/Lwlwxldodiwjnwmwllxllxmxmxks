package a10;

import a81.t;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.l1;
import androidx.compose.runtime.p1;
import androidx.fragment.app.s;
import ap0.w5;
import ap0.y5;
import bz0.c0;
import c30.n0;
import c71.j;
import com.github.service.repositorycreation.CreateRepositoryInput;
import com.google.android.gms.internal.measurement.d5;
import cq.s6;
import cq.u6;
import h0.h;
import h1.k;
import h1.o;
import j71.f;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import m7.w;
import n5.i0;
import n5.l0;
import n5.o0;
import n5.p0;
import n5.x;
import n5.y;
import sd0.w0;
import sd0.y0;
import v00.m;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ Object x;
    public Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a71.c cVar, d51.d dVar, f fVar) {
        super(1, cVar);
        this.v = 5;
        this.y = dVar;
        this.x = (j) fVar;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new b((e) this.y, (CreateRepositoryInput) this.x, cVar, 0).v(a0.a);
            case 1:
                return new b((ac0.b) this.y, (CreateRepositoryInput) this.x, cVar, 1).v(a0.a);
            case 2:
                return new b((c0) this.y, (ap0.c) this.x, cVar, 2).v(a0.a);
            case 3:
                return new b((c0) this.y, (w5) this.x, cVar, 3).v(a0.a);
            case 4:
                return new b((ac0.b) this.y, (CreateRepositoryInput) this.x, cVar, 4).v(a0.a);
            case 5:
                return new b(cVar, (d51.d) this.y, (f) this.x).v(a0.a);
            case 6:
                return new b((o) this.y, (f) this.x, cVar, 6).v(a0.a);
            case 7:
                return new b((w) this.y, (j71.c) this.x, cVar).v(a0.a);
            case 8:
                return new b((x) this.x, cVar, 8).v(a0.a);
            case 9:
                return new b((y) this.x, cVar, 9).v(a0.a);
            case 10:
                return new b((m) this.y, (String) this.x, cVar, 10).v(a0.a);
            case 11:
                return new b((c0) this.y, (sd0.c) this.x, cVar, 11).v(a0.a);
            case 12:
                return new b((c0) this.y, (w0) this.x, cVar, 12).v(a0.a);
            case 13:
                return new b((ac0.b) this.y, (CreateRepositoryInput) this.x, cVar, 13).v(a0.a);
            case 14:
                return new b((x0.f) this.y, (z0.d) this.x, cVar, 14).v(a0.a);
            case 15:
                return new b((c0) this.y, (cq.c) this.x, cVar, 15).v(a0.a);
            case 16:
                return new b((c0) this.y, (s6) this.x, cVar, 16).v(a0.a);
            case 17:
                return new b((y71.j) this.y, (k71.w) this.x, cVar, 17).v(a0.a);
            case 18:
                return new b((z0.c) this.y, (z0.b) this.x, cVar, 18).v(a0.a);
            case 19:
                return new b((c0) this.y, (c30.c) this.x, cVar, 19).v(a0.a);
            default:
                return new b((c0) this.y, (n0) this.x, cVar, 20).v(a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x031b, code lost:
    
        if (r14 == r0) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Throwable th2;
        p0 p0Var;
        FileInputStream fileInputStream;
        Throwable th3;
        x0.d dVar;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    s00.a aVar2 = ((e) this.y).s;
                    CreateRepositoryInput createRepositoryInput = (CreateRepositoryInput) this.x;
                    this.w = 1;
                    if (aVar2.b(createRepositoryInput, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 1:
                b71.a aVar3 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    ub0.a aVar4 = (ub0.a) ((ac0.b) this.y).t;
                    CreateRepositoryInput createRepositoryInput2 = (CreateRepositoryInput) this.x;
                    this.w = 1;
                    if (aVar4.b(createRepositoryInput2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 2:
                b71.a aVar5 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = ((c0) this.y).b;
                    ap0.e eVar = new ap0.e();
                    ap0.c cVar = (ap0.c) this.x;
                    String str = cVar.a;
                    this.w = 1;
                    if (bVar.p(eVar, cVar, str, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 3:
                b71.a aVar6 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar2 = ((c0) this.y).b;
                    y5 y5Var = new y5();
                    w5 w5Var = (w5) this.x;
                    String str2 = w5Var.a;
                    this.w = 1;
                    if (bVar2.p(y5Var, w5Var, str2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 4:
                b71.a aVar7 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    sy.y.j(obj);
                    vy0.a aVar8 = (vy0.a) ((ac0.b) this.y).t;
                    CreateRepositoryInput createRepositoryInput3 = (CreateRepositoryInput) this.x;
                    this.w = 1;
                    if (aVar8.b(createRepositoryInput3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 5:
                d51.d dVar2 = (d51.d) this.y;
                b71.a aVar9 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    h0.m mVar = new h0.m(dVar2, 2);
                    a61.o oVar = new a61.o((a71.c) null, dVar2, (j) this.x);
                    this.w = 1;
                    if (h.c(mVar, oVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                h0.x a = dVar2.a();
                l1 l1Var = (l1) dVar2.e;
                Object a2 = a.a(l1Var.y());
                if (a2 != null) {
                    if (Math.abs(l1Var.y() - dVar2.a().c(a2)) < 0.5f) {
                        ((p1) dVar2.c).setValue(a2);
                        dVar2.g(a2);
                    }
                }
                return a0.a;
            case 6:
                b71.a aVar10 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    sy.y.j(obj);
                    o oVar2 = (o) this.y;
                    k kVar = new k(oVar2, 3);
                    a61.o oVar3 = new a61.o((f) this.x, oVar2, (a71.c) null, 28);
                    this.w = 1;
                    if (h1.j.g(kVar, oVar3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 7:
                w wVar = (w) this.y;
                b71.a aVar11 = b71.a.r;
                int i8 = this.w;
                try {
                    if (i8 == 0) {
                        sy.y.j(obj);
                        wVar.c();
                        j jVar = (j) this.x;
                        this.w = 1;
                        obj = jVar.k(this);
                        if (obj == aVar11) {
                            return aVar11;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    wVar.r();
                    wVar.h();
                    return obj;
                } catch (Throwable th4) {
                    wVar.h();
                    throw th4;
                }
            case 8:
                x xVar = (x) this.x;
                Integer num = b71.a.r;
                int i9 = this.w;
                try {
                } catch (Throwable th5) {
                    o0 h = xVar.h();
                    this.y = th5;
                    this.w = 2;
                    Integer a3 = h.a();
                    if (a3 == num) {
                        return num;
                    }
                    th2 = th5;
                    obj = a3;
                }
                if (i9 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    obj = x.g(xVar, true, this);
                    if (obj == num) {
                        return num;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.y;
                        sy.y.j(obj);
                        p0Var = new i0(th2, ((Number) obj).intValue());
                        return new w61.k(p0Var, Boolean.TRUE);
                    }
                    sy.y.j(obj);
                }
                p0Var = (p0) obj;
                return new w61.k(p0Var, Boolean.TRUE);
            case 9:
                y yVar = (y) this.x;
                l0 l0Var = yVar.b;
                File file = yVar.a;
                b71.a aVar12 = b71.a.r;
                int r3 = this.w;
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            if (e instanceof FileNotFoundException) {
                                throw d5.j0(file.getParent(), (FileNotFoundException) e);
                            }
                            throw e;
                        }
                    } finally {
                    }
                } catch (FileNotFoundException unused) {
                    if (file.exists()) {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            this.y = fileInputStream2;
                            this.w = 2;
                            Object b = l0Var.b(fileInputStream2);
                            if (b == aVar12) {
                                return aVar12;
                            }
                            fileInputStream = fileInputStream2;
                            obj = b;
                        } catch (Throwable th6) {
                            fileInputStream = fileInputStream2;
                            th3 = th6;
                            try {
                                throw th3;
                            } catch (Throwable th7) {
                                m7.y.s(fileInputStream, th3);
                                throw th7;
                            }
                        }
                    } else {
                        obj = l0Var.a();
                    }
                }
                if (r3 == 0) {
                    sy.y.j(obj);
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    this.y = fileInputStream3;
                    this.w = 1;
                    obj = l0Var.b(fileInputStream3);
                    r3 = fileInputStream3;
                    if (obj == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (r3 != 1) {
                        if (r3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileInputStream = (FileInputStream) this.y;
                        try {
                            sy.y.j(obj);
                            m7.y.s(fileInputStream, (Throwable) null);
                            return obj;
                        } catch (Throwable th8) {
                            th3 = th8;
                            throw th3;
                        }
                    }
                    FileInputStream fileInputStream4 = (FileInputStream) this.y;
                    sy.y.j(obj);
                    r3 = fileInputStream4;
                }
                m7.y.s((Closeable) r3, (Throwable) null);
                return obj;
            case 10:
                b71.a aVar13 = b71.a.r;
                int i11 = this.w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    m mVar2 = (m) this.y;
                    this.w = 1;
                    obj = mVar2.t.a(mVar2.s, mp.a.class, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                String str3 = (String) this.x;
                this.w = 2;
                Object b2 = ((mp.a) obj).b(str3, this);
                if (b2 != aVar13) {
                    return b2;
                }
                return aVar13;
            case 11:
                b71.a aVar14 = b71.a.r;
                int i12 = this.w;
                if (i12 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar3 = ((c0) this.y).b;
                    sd0.e eVar2 = new sd0.e();
                    sd0.c cVar2 = (sd0.c) this.x;
                    String str4 = cVar2.a;
                    this.w = 1;
                    if (bVar3.p(eVar2, cVar2, str4, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 12:
                b71.a aVar15 = b71.a.r;
                int i13 = this.w;
                if (i13 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar4 = ((c0) this.y).b;
                    y0 y0Var = new y0();
                    w0 w0Var = (w0) this.x;
                    String str5 = w0Var.a;
                    this.w = 1;
                    if (bVar4.p(y0Var, w0Var, str5, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 13:
                b71.a aVar16 = b71.a.r;
                int i14 = this.w;
                if (i14 == 0) {
                    sy.y.j(obj);
                    qm0.a aVar17 = (qm0.a) ((ac0.b) this.y).t;
                    CreateRepositoryInput createRepositoryInput4 = (CreateRepositoryInput) this.x;
                    this.w = 1;
                    if (aVar17.b(createRepositoryInput4, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 14:
                x0.f fVar = (x0.f) this.y;
                Handler handler = fVar.e;
                View view = fVar.a;
                b71.a aVar18 = b71.a.r;
                int i15 = this.w;
                a0 a0Var = a0.a;
                try {
                    if (i15 == 0) {
                        sy.y.j(obj);
                        x0.e eVar3 = new x0.e();
                        z0.d dVar3 = (z0.d) this.x;
                        x0.d dVar4 = new x0.d(eVar3, new x0.b(fVar, dVar3, 0), new x0.b(fVar, dVar3, 1), view);
                        j71.c cVar3 = fVar.b;
                        if (cVar3 != null && (dVar = (x0.d) cVar3.k(dVar4)) != null) {
                            dVar4 = dVar;
                        }
                        Looper myLooper = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (myLooper == (handler2 != null ? handler2.getLooper() : null)) {
                            ActionMode startActionMode = view.startActionMode(new x0.j(dVar4), 1);
                            if (startActionMode != null) {
                                fVar.h = startActionMode;
                            }
                            return a0Var;
                        }
                        androidx.fragment.app.e eVar4 = fVar.i;
                        if (eVar4 == null) {
                            eVar4 = new androidx.fragment.app.e(fVar, dVar4, eVar3, 8);
                            fVar.i = eVar4;
                        }
                        view.post(eVar4);
                        this.w = 1;
                        Object k = eVar3.a.k(this);
                        if (k != aVar18) {
                            k = a0Var;
                        }
                        if (k == aVar18) {
                            return aVar18;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    if (Looper.myLooper() != (handler != null ? handler.getLooper() : null)) {
                        s sVar = fVar.j;
                        if (sVar == null) {
                            sVar = new s(28, fVar);
                            fVar.j = sVar;
                        }
                        view.post(sVar);
                    } else {
                        ActionMode actionMode = fVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    androidx.fragment.app.e eVar5 = fVar.i;
                    if (eVar5 != null) {
                        view.removeCallbacks(eVar5);
                    }
                    fVar.h = null;
                    return a0Var;
                } finally {
                    handler.a();
                    Looper myLooper2 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (myLooper2 != (handler3 != null ? handler3.getLooper() : null)) {
                        s sVar2 = fVar.j;
                        if (sVar2 == null) {
                            sVar2 = new s(28, fVar);
                            fVar.j = sVar2;
                        }
                        view.post(sVar2);
                    } else {
                        ActionMode actionMode2 = fVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    androidx.fragment.app.e eVar6 = fVar.i;
                    if (eVar6 != null) {
                        view.removeCallbacks(eVar6);
                    }
                    fVar.h = null;
                }
            case 15:
                b71.a aVar19 = b71.a.r;
                int i16 = this.w;
                if (i16 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar5 = ((c0) this.y).b;
                    cq.e eVar7 = new cq.e();
                    cq.c cVar4 = (cq.c) this.x;
                    String str6 = cVar4.a;
                    this.w = 1;
                    if (bVar5.p(eVar7, cVar4, str6, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 16:
                b71.a aVar20 = b71.a.r;
                int i17 = this.w;
                if (i17 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar6 = ((c0) this.y).b;
                    u6 u6Var = new u6();
                    s6 s6Var = (s6) this.x;
                    String str7 = s6Var.a;
                    this.w = 1;
                    if (bVar6.p(u6Var, s6Var, str7, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            case 17:
                k71.w wVar2 = (k71.w) this.x;
                b71.a aVar21 = b71.a.r;
                int i18 = this.w;
                if (i18 == 0) {
                    sy.y.j(obj);
                    y71.j jVar2 = (y71.j) this.y;
                    t tVar = z71.b.b;
                    Object obj2 = wVar2.r;
                    if (obj2 == tVar) {
                        obj2 = null;
                    }
                    this.w = 1;
                    if (jVar2.c(obj2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                wVar2.r = null;
                return a0.a;
            case 18:
                z0.b bVar7 = (z0.b) this.x;
                p1 p1Var = ((z0.c) this.y).c;
                b71.a aVar22 = b71.a.r;
                int i19 = this.w;
                a0 a0Var2 = a0.a;
                try {
                    if (i19 == 0) {
                        sy.y.j(obj);
                        p1Var.setValue(bVar7);
                        this.w = 1;
                        Object k2 = bVar7.b.k(this);
                        if (k2 != aVar22) {
                            k2 = a0Var2;
                        }
                        if (k2 == aVar22) {
                            return aVar22;
                        }
                    } else {
                        if (i19 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    return a0Var2;
                } finally {
                    p1Var.setValue((Object) null);
                }
            case 19:
                b71.a aVar23 = b71.a.r;
                int i21 = this.w;
                if (i21 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar8 = ((c0) this.y).b;
                    c30.d dVar5 = new c30.d(0);
                    c30.c cVar5 = (c30.c) this.x;
                    String str8 = cVar5.a;
                    this.w = 1;
                    if (bVar8.p(dVar5, cVar5, str8, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar24 = b71.a.r;
                int i22 = this.w;
                if (i22 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar9 = ((c0) this.y).b;
                    c30.o0 o0Var = new c30.o0(0);
                    n0 n0Var = (n0) this.x;
                    String str9 = n0Var.a;
                    this.w = 1;
                    if (bVar9.p(o0Var, n0Var, str9, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.y = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w wVar, j71.c cVar, a71.c cVar2) {
        super(1, cVar2);
        this.v = 7;
        this.y = wVar;
        this.x = (j) cVar;
    }
}
