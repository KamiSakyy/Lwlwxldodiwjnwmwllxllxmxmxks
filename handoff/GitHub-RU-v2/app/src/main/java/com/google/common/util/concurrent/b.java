package com.google.common.util.concurrent;

import a5.s;
import a71.i;
import a81.g;
import android.app.Application;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.biometric.BiometricFragment;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.compose.foundation.lazy.layout.t1;
import androidx.fragment.app.o;
import c21.u;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.b1;
import com.google.android.gms.measurement.internal.b2;
import com.google.android.gms.measurement.internal.b3;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.c4;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.e1;
import com.google.android.gms.measurement.internal.e2;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.k0;
import com.google.android.gms.measurement.internal.k3;
import com.google.android.gms.measurement.internal.m0;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.n3;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.o3;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.q0;
import com.google.android.gms.measurement.internal.s3;
import com.google.android.gms.measurement.internal.t2;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.v1;
import com.google.android.gms.measurement.internal.v4;
import com.google.android.gms.measurement.internal.x1;
import com.google.android.gms.measurement.internal.y1;
import com.google.android.gms.measurement.internal.y2;
import com.google.android.gms.measurement.internal.y3;
import com.google.android.gms.tasks.RuntimeExecutionException;
import e9.m;
import fa1.v;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n4.d;
import q41.j;
import sy.y;
import t.r;
import t.t;
import v71.b0;
import v71.l;
import v71.x0;
import v8.f;
import w21.h;
import w21.k;
import w8.a0;
import w80.w3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements Runnable {
    public final /* synthetic */ int r;
    public Object s;
    public Object t;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    private final void a() {
        t2 t2Var = (t2) this.t;
        o1 o1Var = (o1) ((s0) t2Var).s;
        c1 c1Var = o1Var.v;
        com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
        o1.k(c1Var);
        c1Var.z();
        c1Var.z();
        q b = q.b(c1Var.D().getString("dma_consent_settings", null));
        q qVar = (q) this.s;
        int i = qVar.a;
        if (!b2.l(i, b.a)) {
            o1.m(s0Var);
            s0Var.D.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = c1Var.D().edit();
        edit.putString("dma_consent_settings", qVar.b);
        edit.apply();
        o1.m(s0Var);
        s0Var.F.b(qVar, "Setting DMA consent(FE)");
        o1 o1Var2 = (o1) ((s0) t2Var).s;
        if (o1Var2.p().J()) {
            p3 p = o1Var2.p();
            p.z();
            p.A();
            p.N(new n3(p, 1));
            return;
        }
        p3 p2 = o1Var2.p();
        p2.z();
        p2.A();
        if (p2.I()) {
            p2.N(new k3(p2, p2.P(false)));
        }
    }

    private final void b() {
        p3 p3Var = (p3) this.t;
        f0 f0Var = p3Var.v;
        o1 o1Var = (o1) ((s0) p3Var).s;
        if (f0Var == null) {
            com.google.android.gms.measurement.internal.s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Failed to send current screen to service");
            return;
        }
        try {
            b3 b3Var = (b3) this.s;
            if (b3Var == null) {
                f0Var.l(0L, null, null, o1Var.r.getPackageName());
            } else {
                f0Var.l(b3Var.c, b3Var.a, b3Var.b, o1Var.r.getPackageName());
            }
            p3Var.M();
        } catch (RemoteException e) {
            com.google.android.gms.measurement.internal.s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e, "Failed to send current screen to the service");
        }
    }

    private final void c() {
        ((o3) this.t).t.K((ComponentName) this.s);
    }

    private final void d() {
        p3 p3Var = ((o3) this.t).t;
        p3Var.v = null;
        if (((z11.b) this.s).s != 7777) {
            p3Var.O();
            return;
        }
        if (p3Var.y == null) {
            p3Var.y = Executors.newScheduledThreadPool(1);
        }
        p3Var.y.schedule((Runnable) new o(9, this), ((Long) c0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    private final void e() {
        o4 o4Var = (o4) this.s;
        o4Var.B();
        Runnable runnable = (Runnable) this.t;
        o4Var.b().z();
        if (o4Var.G == null) {
            o4Var.G = new ArrayList();
        }
        o4Var.G.add(runnable);
        o4Var.q();
    }

    private final /* synthetic */ void f() {
        y51.c cVar = (y51.c) this.s;
        ((s3) ((Service) cVar.s)).c((JobParameters) this.t);
    }

    private final void g() {
        try {
            ((Runnable) this.t).run();
            synchronized (((m) this.s).v) {
                ((m) this.s).a();
            }
        } catch (Throwable th) {
            synchronized (((m) this.s).v) {
                ((m) this.s).a();
                throw th;
            }
        }
    }

    private final void h() {
        b4.T((v) this.s).i(y.d((Throwable) this.t));
    }

    private final void i() {
        ((n4.c) this.s).r = this.t;
    }

    private final void j() {
        ((Application) this.s).unregisterActivityLifecycleCallbacks((n4.c) this.t);
    }

    private final void k() {
        Object obj = this.s;
        try {
            Method method = d.d;
            Object obj2 = this.t;
            if (method != null) {
                method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
            } else {
                d.e.invoke(obj, obj2, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }

    private final void l() {
        try {
            r();
        } catch (Error e) {
            synchronized (((j) this.t).s) {
                ((j) this.t).t = 1;
                throw e;
            }
        }
    }

    private final void m() {
        t.v vVar = ((BiometricFragment) this.t).u0;
        if (vVar.t == null) {
            vVar.t = new t();
        }
        vVar.t.o((r) this.s);
    }

    private final void n() {
        ((l) this.t).F((x0) this.s);
    }

    private final void o() {
        if (((w21.o) this.s).d) {
            ((k) this.t).u.n();
            return;
        }
        try {
            ((k) this.t).u.m(((k) this.t).t.c((w21.o) this.s));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                ((k) this.t).u.l((Exception) e.getCause());
            } else {
                ((k) this.t).u.l(e);
            }
        } catch (Exception e2) {
            ((k) this.t).u.l(e2);
        }
    }

    private final void p() {
        k kVar = (k) this.t;
        w21.o oVar = kVar.u;
        try {
            w21.o oVar2 = (w21.o) kVar.t.c((w21.o) this.s);
            if (oVar2 == null) {
                kVar.h(new NullPointerException("Continuation returned null"));
                return;
            }
            k.m mVar = h.b;
            oVar2.d(mVar, kVar);
            oVar2.c(mVar, kVar);
            oVar2.b.j(new w21.l((Executor) mVar, (w21.b) kVar));
            oVar2.q();
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                oVar.l((Exception) e.getCause());
            } else {
                oVar.l(e);
            }
        } catch (Exception e2) {
            oVar.l(e2);
        }
    }

    private final void q() {
        synchronized (((w21.l) this.t).t) {
            ((w21.c) ((w21.l) this.t).u).x((w21.o) this.s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.s).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.s = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        q41.j.w.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.s), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((j) this.t).s) {
                    if (!z) {
                        j jVar = (j) this.t;
                        if (jVar.t != 4) {
                            jVar.u++;
                            jVar.t = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((j) this.t).s.poll();
                    this.s = runnable;
                    if (runnable == null) {
                        ((j) this.t).t = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:116|(1:118)(9:366|367|368|369|(1:371)(2:392|(4:394|373|374|(24:376|(1:378)(1:390)|380|381|382|383|384|121|(2:123|(2:125|(2:127|(2:129|(2:131|(2:133|(1:135)(1:359))(1:360))(1:361))(1:362))(1:363))(1:364))(1:365)|136|137|138|(1:140)(1:356)|141|(1:143)|145|(1:147)(2:353|(7:355|(3:345|346|(1:348)(1:349))|(5:151|(1:153)(3:336|(3:339|(1:341)(1:342)|337)|343)|(1:155)(1:335)|156|(43:158|(1:160)(1:332)|161|(1:163)|164|(1:166)(1:331)|167|(1:169)|(5:330|171|(1:173)(1:328)|174|(30:176|177|(3:323|324|(18:326|(1:193)(1:321)|194|(1:196)|197|(2:299|(2:305|(2:312|(2:313|(1:320)(2:315|(2:317|318)(1:319)))))(1:304))(1:201)|202|(3:295|(1:297)|298)|206|(1:208)|209|(1:213)|214|(3:216|(7:218|(1:220)(1:251)|221|(1:223)|224|(4:228|(1:230)|231|(1:233))|234)(1:252)|235)(10:253|(4:255|(2:258|(6:260|(1:262)(1:292)|263|(1:265)|266|267))|293|267)(1:294)|268|(1:270)|271|272|273|274|275|(5:277|(1:279)(1:287)|(1:283)|(1:285)|286))|236|(3:238|(1:240)|(5:242|(1:244)|245|(1:247)|248))|249|250))(1:180)|181|(1:322)(1:190)|191|(0)(0)|194|(0)|197|(1:199)|299|(1:302)|305|(4:308|310|312|(3:313|(0)(0)|319))|202|(1:204)|295|(0)|298|206|(0)|209|(2:211|213)|214|(0)(0)|236|(0)|249|250))|327|177|(0)|323|324|(0)|181|(3:184|186|188)|322|191|(0)(0)|194|(0)|197|(0)|299|(0)|305|(0)|202|(0)|295|(0)|298|206|(0)|209|(0)|214|(0)(0)|236|(0)|249|250)(2:333|334))|344|(0)(0)|156|(0)(0)))|148|(0)|(0)|344|(0)(0)|156|(0)(0))))|372|373|374|(0))|119|120|121|(0)(0)|136|137|138|(0)(0)|141|(0)|145|(0)(0)|148|(0)|(0)|344|(0)(0)|156|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:366|(2:367|368)|369|(1:371)(2:392|(4:394|373|374|(24:376|(1:378)(1:390)|380|381|382|383|384|121|(2:123|(2:125|(2:127|(2:129|(2:131|(2:133|(1:135)(1:359))(1:360))(1:361))(1:362))(1:363))(1:364))(1:365)|136|137|138|(1:140)(1:356)|141|(1:143)|145|(1:147)(2:353|(7:355|(3:345|346|(1:348)(1:349))|(5:151|(1:153)(3:336|(3:339|(1:341)(1:342)|337)|343)|(1:155)(1:335)|156|(43:158|(1:160)(1:332)|161|(1:163)|164|(1:166)(1:331)|167|(1:169)|(5:330|171|(1:173)(1:328)|174|(30:176|177|(3:323|324|(18:326|(1:193)(1:321)|194|(1:196)|197|(2:299|(2:305|(2:312|(2:313|(1:320)(2:315|(2:317|318)(1:319)))))(1:304))(1:201)|202|(3:295|(1:297)|298)|206|(1:208)|209|(1:213)|214|(3:216|(7:218|(1:220)(1:251)|221|(1:223)|224|(4:228|(1:230)|231|(1:233))|234)(1:252)|235)(10:253|(4:255|(2:258|(6:260|(1:262)(1:292)|263|(1:265)|266|267))|293|267)(1:294)|268|(1:270)|271|272|273|274|275|(5:277|(1:279)(1:287)|(1:283)|(1:285)|286))|236|(3:238|(1:240)|(5:242|(1:244)|245|(1:247)|248))|249|250))(1:180)|181|(1:322)(1:190)|191|(0)(0)|194|(0)|197|(1:199)|299|(1:302)|305|(4:308|310|312|(3:313|(0)(0)|319))|202|(1:204)|295|(0)|298|206|(0)|209|(2:211|213)|214|(0)(0)|236|(0)|249|250))|327|177|(0)|323|324|(0)|181|(3:184|186|188)|322|191|(0)(0)|194|(0)|197|(0)|299|(0)|305|(0)|202|(0)|295|(0)|298|206|(0)|209|(0)|214|(0)(0)|236|(0)|249|250)(2:333|334))|344|(0)(0)|156|(0)(0)))|148|(0)|(0)|344|(0)(0)|156|(0)(0))))|372|373|374|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x057a, code lost:
    
        if (r13.V() == 1) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x03ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x03ee, code lost:
    
        com.google.android.gms.measurement.internal.o1.m(r10);
        r10.x.c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.s0.H(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x032a, code lost:
    
        r9 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03de A[Catch: IllegalStateException -> 0x03ed, TRY_LEAVE, TryCatch #18 {IllegalStateException -> 0x03ed, blocks: (B:138:0x03cc, B:141:0x03da, B:143:0x03de), top: B:137:0x03cc }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x072f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x042f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0305 A[Catch: NameNotFoundException -> 0x032a, TryCatch #0 {NameNotFoundException -> 0x032a, blocks: (B:374:0x02fa, B:376:0x0305, B:378:0x0311), top: B:373:0x02fa }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v111, types: [com.google.android.gms.measurement.internal.s2] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c21.h hVar;
        d9.q qVar;
        y1 y1Var;
        u0 u0Var;
        PackageManager packageManager;
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        int i;
        int g;
        List<String> list;
        Bundle K;
        Integer valueOf;
        y2 y2Var;
        o1 o1Var;
        o1 o1Var2;
        t1 t1Var;
        y1 O;
        o1 o1Var3;
        y1 y1Var2;
        t1 t1Var2;
        q0 q0Var;
        t4 t4Var;
        b2 b2Var;
        boolean z;
        o1 o1Var4;
        y1 O2;
        y1 O3;
        Bundle bundle;
        Iterator it;
        Boolean L;
        a1 a1Var;
        e1 e1Var;
        o1 o1Var5;
        t4 t4Var2;
        t1 t1Var3;
        com.google.android.gms.measurement.internal.s0 s0Var;
        q0 q0Var2;
        String b;
        Long valueOf2;
        switch (this.r) {
            case 0:
                b1.m mVar = (b1.m) this.t;
                try {
                    y41.t1.z((c) this.s);
                    t2 t2Var = (t2) mVar.t;
                    t2Var.z();
                    mVar.I();
                    t2Var.A = false;
                    t2Var.B = 1;
                    com.google.android.gms.measurement.internal.s0 s0Var2 = ((o1) ((s0) t2Var).s).w;
                    o1.m(s0Var2);
                    s0Var2.E.b(((c4) mVar.s).r, "Successfully registered trigger URI");
                    t2Var.Y();
                    return;
                } catch (Error e) {
                    e = e;
                    mVar.B(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    mVar.B(e);
                    return;
                } catch (ExecutionException e3) {
                    mVar.B(e3.getCause());
                    return;
                }
            case 1:
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.s).run();
                    } catch (Throwable th) {
                        b0.t(i.r, th);
                    }
                    Runnable N0 = ((g) this.t).N0();
                    if (N0 == null) {
                        return;
                    }
                    try {
                        this.s = N0;
                        i2++;
                        if (i2 >= 16) {
                            g gVar = (g) this.t;
                            if (a81.b.j(gVar.u, gVar)) {
                                g gVar2 = (g) this.t;
                                a81.b.i(gVar2.u, gVar2, this);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        g gVar3 = (g) this.t;
                        synchronized (gVar3.x) {
                            g.y.decrementAndGet(gVar3);
                            throw th2;
                        }
                    }
                }
            case 2:
                z11.b bVar = (z11.b) this.s;
                b21.l lVar = (b21.l) this.t;
                a21.a aVar = (a21.a) lVar.s;
                b21.j jVar = (b21.j) ((b21.d) lVar.w).A.get((b21.a) lVar.t);
                if (jVar == null) {
                    return;
                }
                if (bVar.s != 0) {
                    jVar.o(bVar, null);
                    return;
                }
                lVar.r = true;
                if (aVar.l()) {
                    if (!lVar.r || (hVar = (c21.h) lVar.u) == null) {
                        return;
                    }
                    aVar.k(hVar, (Set) lVar.v);
                    return;
                }
                try {
                    aVar.k(null, aVar.a());
                    return;
                } catch (SecurityException unused) {
                    aVar.b("Failed to get service from broker.");
                    jVar.o(new z11.b(10, null, null), null);
                    return;
                }
            case 3:
                w8.c cVar = ((c9.b) this.t).r.f;
                String str4 = (String) this.s;
                synchronized (cVar.k) {
                    try {
                        a0 c = cVar.c(str4);
                        qVar = c != null ? c.a : null;
                    } finally {
                    }
                }
                if (qVar == null || k71.k.b(f.j, qVar.j)) {
                    return;
                }
                synchronized (((c9.b) this.t).t) {
                    ((c9.b) this.t).w.put(aa1.b.B(qVar), qVar);
                    c9.b bVar2 = (c9.b) this.t;
                    ((c9.b) this.t).x.put(aa1.b.B(qVar), z8.h.a(bVar2.y, qVar, bVar2.s.b, bVar2));
                }
                return;
            case 4:
                x1 x1Var = (x1) this.s;
                x1Var.c();
                if (w3.e()) {
                    x1Var.b().I(this);
                    return;
                }
                p pVar = (p) this.t;
                boolean z2 = pVar.c != 0;
                pVar.c = 0L;
                if (z2) {
                    pVar.a();
                    return;
                }
                return;
            case 5:
                d1 d1Var = (d1) this.t;
                o1 o1Var6 = ((e1) d1Var.t).s;
                m1 m1Var = o1Var6.x;
                o1.m(m1Var);
                m1Var.z();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", (String) d1Var.s);
                try {
                    com.google.android.gms.internal.measurement.a0 a0Var = (com.google.android.gms.internal.measurement.a0) ((com.google.android.gms.internal.measurement.c0) this.s);
                    Parcel g2 = a0Var.g();
                    z.b(g2, bundle2);
                    Parcel f = a0Var.f(g2, 1);
                    Bundle bundle3 = (Bundle) z.a(f, Bundle.CREATOR);
                    f.recycle();
                    if (bundle3 == null) {
                        com.google.android.gms.measurement.internal.s0 s0Var3 = o1Var6.w;
                        o1.m(s0Var3);
                        s0Var3.x.a("Install Referrer Service returned a null response");
                    }
                } catch (Exception e4) {
                    com.google.android.gms.measurement.internal.s0 s0Var4 = o1Var6.w;
                    o1.m(s0Var4);
                    s0Var4.x.b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                m1 m1Var2 = o1Var6.x;
                o1.m(m1Var2);
                m1Var2.z();
                throw new IllegalStateException("Unexpected call on client side");
            case 6:
                y1 y1Var3 = y1.UNINITIALIZED;
                o1 o1Var7 = (o1) this.t;
                e2 e2Var = (e2) this.s;
                m1 m1Var3 = o1Var7.x;
                com.google.android.gms.measurement.internal.s0 s0Var5 = o1Var7.w;
                c1 c1Var = o1Var7.v;
                t4 t4Var3 = o1Var7.z;
                o1.m(m1Var3);
                m1Var3.z();
                com.google.android.gms.measurement.internal.h hVar2 = o1Var7.u;
                ((o1) ((s0) hVar2).s).getClass();
                com.google.android.gms.measurement.internal.r rVar = new com.google.android.gms.measurement.internal.r(o1Var7);
                rVar.C();
                o1Var7.J = rVar;
                u0 u0Var2 = e2Var.d;
                k0 k0Var = new k0(o1Var7, e2Var.c, u0Var2 == null ? 0L : u0Var2.r);
                k0Var.B();
                o1Var7.K = k0Var;
                m0 m0Var = new m0(o1Var7);
                m0Var.B();
                o1Var7.H = m0Var;
                p3 p3Var = new p3(o1Var7);
                p3Var.B();
                o1Var7.I = p3Var;
                boolean z3 = t4Var3.t;
                o1 o1Var8 = (o1) ((s0) t4Var3).s;
                if (z3) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                t4Var3.z();
                SecureRandom secureRandom = new SecureRandom();
                long nextLong = secureRandom.nextLong();
                if (nextLong == 0) {
                    nextLong = secureRandom.nextLong();
                    if (nextLong == 0) {
                        com.google.android.gms.measurement.internal.s0 s0Var6 = ((o1) ((s0) t4Var3).s).w;
                        o1.m(s0Var6);
                        s0Var6.A.a("Utils falling back to Random for random id");
                    }
                }
                t4Var3.v.set(nextLong);
                o1Var8.T.incrementAndGet();
                t4Var3.t = true;
                if (c1Var.t) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                SharedPreferences sharedPreferences = ((o1) ((s0) c1Var).s).r.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                c1Var.u = sharedPreferences;
                boolean z4 = sharedPreferences.getBoolean("has_been_opened", false);
                c1Var.J = z4;
                if (!z4) {
                    SharedPreferences.Editor edit = c1Var.u.edit();
                    edit.putBoolean("has_been_opened", true);
                    edit.apply();
                }
                c1Var.w = new b1(c1Var, Math.max(0L, ((Long) c0.d.a(null)).longValue()));
                ((o1) ((s0) c1Var).s).T.incrementAndGet();
                c1Var.t = true;
                k0 k0Var2 = o1Var7.K;
                if (k0Var2.t) {
                    throw new IllegalStateException("Can't initialize twice");
                }
                String str5 = "";
                o1 o1Var9 = (o1) ((s0) k0Var2).s;
                com.google.android.gms.measurement.internal.s0 s0Var7 = o1Var9.w;
                com.google.android.gms.measurement.internal.s0 s0Var8 = o1Var9.w;
                o1.m(s0Var7);
                s0Var7.F.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(k0Var2.B), Long.valueOf(k0Var2.A));
                Context context = o1Var9.r;
                String packageName = context.getPackageName();
                PackageManager packageManager2 = context.getPackageManager();
                String str6 = "unknown";
                String str7 = "Unknown";
                if (packageManager2 == null) {
                    o1.m(s0Var8);
                    u0Var = u0Var2;
                    y1Var = y1Var3;
                    s0Var8.x.b(com.google.android.gms.measurement.internal.s0.H(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                } else {
                    y1Var = y1Var3;
                    u0Var = u0Var2;
                    try {
                        str6 = packageManager2.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused2) {
                        o1.m(s0Var8);
                        s0Var8.x.b(com.google.android.gms.measurement.internal.s0.H(packageName), "Error retrieving app installer package name. appId");
                    }
                    String str8 = str6;
                    if (str8 == null) {
                        str8 = "manual_install";
                    } else if ("com.android.vending".equals(str8)) {
                        str6 = "";
                        packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                            String str9 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str7;
                            try {
                                String str10 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    str = str9;
                                    str3 = str10;
                                    packageManager = packageManager2;
                                    str2 = str6;
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    str7 = str10;
                                    o1.m(s0Var8);
                                    packageManager = packageManager2;
                                    s0Var8.x.c("Error retrieving package info. appId, appName", com.google.android.gms.measurement.internal.s0.H(packageName), str9);
                                    str = str9;
                                    str2 = str6;
                                    str3 = str7;
                                    i = Integer.MIN_VALUE;
                                    k0Var2.u = packageName;
                                    k0Var2.x = str2;
                                    k0Var2.v = str3;
                                    k0Var2.w = i;
                                    k0Var2.y = str;
                                    k0Var2.z = 0L;
                                    g = o1Var9.g();
                                    if (g == 0) {
                                    }
                                    k0Var2.F = "";
                                    b = c2.b(context, o1Var9.G);
                                    if (!TextUtils.isEmpty(b)) {
                                    }
                                    k0Var2.F = str5;
                                    if (g == 0) {
                                    }
                                    list = null;
                                    k0Var2.C = null;
                                    com.google.android.gms.measurement.internal.h hVar3 = o1Var9.u;
                                    o1 o1Var10 = (o1) ((s0) hVar3).s;
                                    u.d("analytics.safelisted_events");
                                    K = hVar3.K();
                                    if (K == null) {
                                    }
                                    valueOf = null;
                                    if (valueOf != null) {
                                    }
                                    if (list != null) {
                                    }
                                    k0Var2.C = list;
                                    if (packageManager != null) {
                                    }
                                    ((o1) ((s0) k0Var2).s).T.incrementAndGet();
                                    k0Var2.t = true;
                                    y2Var = new y2(o1Var7);
                                    y2Var.B();
                                    o1Var7.L = y2Var;
                                    if (y2Var.t) {
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused4) {
                            }
                            k0Var2.u = packageName;
                            k0Var2.x = str2;
                            k0Var2.v = str3;
                            k0Var2.w = i;
                            k0Var2.y = str;
                            k0Var2.z = 0L;
                            g = o1Var9.g();
                            if (g == 0) {
                                o1.m(s0Var8);
                                s0Var8.F.a("App measurement collection enabled");
                            } else if (g == 1) {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement deactivated via the manifest");
                            } else if (g == 3) {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                            } else if (g == 4) {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement disabled via the manifest");
                            } else if (g == 6) {
                                o1.m(s0Var8);
                                s0Var8.C.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                            } else if (g == 7) {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement disabled via the global data collection setting");
                            } else if (g != 8) {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement disabled");
                                o1.m(s0Var8);
                                s0Var8.y.a("Invalid scion state in identity");
                            } else {
                                o1.m(s0Var8);
                                s0Var8.D.a("App measurement disabled due to denied storage consent");
                            }
                            k0Var2.F = "";
                            b = c2.b(context, o1Var9.G);
                            if (!TextUtils.isEmpty(b)) {
                                str5 = b;
                            }
                            k0Var2.F = str5;
                            if (g == 0) {
                                o1.m(s0Var8);
                                s0Var8.F.c("App measurement enabled for app package, google app id", k0Var2.u, k0Var2.F);
                            }
                            list = null;
                            k0Var2.C = null;
                            com.google.android.gms.measurement.internal.h hVar32 = o1Var9.u;
                            o1 o1Var102 = (o1) ((s0) hVar32).s;
                            u.d("analytics.safelisted_events");
                            K = hVar32.K();
                            if (K == null) {
                                com.google.android.gms.measurement.internal.s0 s0Var9 = o1Var102.w;
                                o1.m(s0Var9);
                                s0Var9.x.a("Failed to load metadata: Metadata bundle is null");
                            } else if (K.containsKey("analytics.safelisted_events")) {
                                valueOf = Integer.valueOf(K.getInt("analytics.safelisted_events"));
                                if (valueOf != null) {
                                    try {
                                        String[] stringArray = o1Var102.r.getResources().getStringArray(valueOf.intValue());
                                        if (stringArray != null) {
                                            list = Arrays.asList(stringArray);
                                        }
                                    } catch (Resources.NotFoundException e5) {
                                        com.google.android.gms.measurement.internal.s0 s0Var10 = o1Var102.w;
                                        o1.m(s0Var10);
                                        s0Var10.x.b(e5, "Failed to load string array from metadata: resource not found");
                                    }
                                }
                                if (list != null) {
                                    if (list.isEmpty()) {
                                        o1.m(s0Var8);
                                        s0Var8.C.a("Safelisted event list is empty. Ignoring");
                                    } else {
                                        for (String str11 : list) {
                                            t4 t4Var4 = o1Var9.z;
                                            o1.k(t4Var4);
                                            if (!t4Var4.B0("safelisted event", str11)) {
                                            }
                                        }
                                    }
                                    if (packageManager != null) {
                                        k0Var2.E = i21.a.w(context) ? 1 : 0;
                                    } else {
                                        k0Var2.E = 0;
                                    }
                                    ((o1) ((s0) k0Var2).s).T.incrementAndGet();
                                    k0Var2.t = true;
                                    y2Var = new y2(o1Var7);
                                    y2Var.B();
                                    o1Var7.L = y2Var;
                                    if (y2Var.t) {
                                        throw new IllegalStateException("Can't initialize twice");
                                    }
                                    y2Var.u = (JobScheduler) ((o1) ((s0) y2Var).s).r.getSystemService("jobscheduler");
                                    ((o1) ((s0) y2Var).s).T.incrementAndGet();
                                    y2Var.t = true;
                                    o1.m(s0Var5);
                                    q0 q0Var3 = s0Var5.E;
                                    q0 q0Var4 = s0Var5.D;
                                    q0 q0Var5 = s0Var5.F;
                                    q0 q0Var6 = s0Var5.x;
                                    hVar2.E();
                                    q0Var4.b(133005L, "App measurement initialized, version");
                                    o1.m(s0Var5);
                                    q0Var4.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                                    String F = k0Var.F();
                                    if (t4Var3.a0(F, hVar2.u)) {
                                        o1.m(s0Var5);
                                        q0Var4.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
                                        o1.m(s0Var5);
                                        q0Var4.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(F)));
                                    }
                                    o1.m(s0Var5);
                                    q0Var3.a("Debug-level message logging enabled");
                                    int i3 = o1Var7.R;
                                    AtomicInteger atomicInteger = o1Var7.T;
                                    if (i3 != atomicInteger.get()) {
                                        o1.m(s0Var5);
                                        q0Var6.c("Not all components initialized", Integer.valueOf(o1Var7.R), Integer.valueOf(atomicInteger.get()));
                                    }
                                    o1Var7.M = true;
                                    long j = o1Var7.U;
                                    a2 a2Var = a2.ANALYTICS_STORAGE;
                                    final t2 t2Var2 = o1Var7.D;
                                    m1 m1Var4 = o1Var7.x;
                                    o1.m(m1Var4);
                                    m1Var4.z();
                                    o1.j(o1Var7.L);
                                    int E = o1Var7.L.E();
                                    m8.a();
                                    boolean J = hVar2.J(null, c0.Q0);
                                    boolean z5 = E == 2;
                                    if (J) {
                                        t4Var3.z();
                                        break;
                                    }
                                    if (z5) {
                                        z5 = true;
                                        t4Var3.z();
                                        IntentFilter intentFilter = new IntentFilter();
                                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                        BroadcastReceiver dVar = new b9.d(o1Var8);
                                        Context context2 = o1Var8.r;
                                        boolean z6 = z5;
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            context2.registerReceiver(dVar, intentFilter, null, null, 2);
                                        } else {
                                            context2.registerReceiver(dVar, intentFilter, null, null, 0);
                                        }
                                        com.google.android.gms.measurement.internal.s0 s0Var11 = o1Var8.w;
                                        o1.m(s0Var11);
                                        s0Var11.E.a("Registered app receiver");
                                        if (z6) {
                                            o1.j(o1Var7.L);
                                            o1Var = o1Var7;
                                            o1Var2 = o1Var8;
                                            o1Var7.L.D(((Long) c0.C.a(null)).longValue());
                                            t1Var = c1Var.y;
                                            b2 G = c1Var.G();
                                            int i4 = G.b;
                                            O = hVar2.O("google_analytics_default_allow_ad_storage", false);
                                            o1Var3 = o1Var;
                                            y1 O4 = hVar2.O("google_analytics_default_allow_analytics_storage", false);
                                            y1Var2 = y1Var;
                                            if (O == y1Var2 || O4 != y1Var2) {
                                                t1Var2 = t1Var;
                                                q0Var = q0Var6;
                                                t4Var = t4Var3;
                                                if (b2.l(-10, c1Var.D().getInt("consent_source", 100))) {
                                                    EnumMap enumMap = new EnumMap(a2.class);
                                                    enumMap.put((EnumMap) a2.AD_STORAGE, (a2) O);
                                                    enumMap.put((EnumMap) a2Var, (a2) O4);
                                                    b2Var = new b2(enumMap, -10);
                                                    z = false;
                                                    if (b2Var != null) {
                                                        o1.l(t2Var2);
                                                        t2Var2.V(b2Var, true);
                                                    } else {
                                                        b2Var = G;
                                                    }
                                                    o1.l(t2Var2);
                                                    o1Var4 = (o1) ((s0) t2Var2).s;
                                                    t2Var2.D(b2Var);
                                                    c1Var.z();
                                                    int i5 = q.b(c1Var.D().getString("dma_consent_settings", null)).a;
                                                    O2 = hVar2.O("google_analytics_default_allow_ad_personalization_signals", true);
                                                    if (O2 != y1Var2) {
                                                        o1.m(s0Var5);
                                                        q0Var5.b(O2, "Default ad personalization consent from Manifest");
                                                    }
                                                    O3 = hVar2.O("google_analytics_default_allow_ad_user_data", true);
                                                    if (O3 == y1Var2 && b2.l(-10, i5)) {
                                                        o1.l(t2Var2);
                                                        EnumMap enumMap2 = new EnumMap(a2.class);
                                                        enumMap2.put((EnumMap) a2.AD_USER_DATA, (a2) O3);
                                                        t2Var2.U(new q(enumMap2, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(o1Var3.r().G()) && (i5 == 0 || i5 == 30)) {
                                                        o1.l(t2Var2);
                                                        t2Var2.U(new q((Boolean) null, -10, (Boolean) null, (String) null), true);
                                                    } else if (TextUtils.isEmpty(o1Var3.r().G()) && u0Var != null && (bundle = u0Var.u) != null && b2.l(30, i5)) {
                                                        q c2 = q.c(30, bundle);
                                                        it = c2.e.values().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                if (((y1) it.next()) != y1Var2) {
                                                                    o1.l(t2Var2);
                                                                    t2Var2.U(c2, true);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    L = hVar2.L("google_analytics_tcf_data_enabled");
                                                    if (L != null || L.booleanValue()) {
                                                        o1.m(s0Var5);
                                                        q0Var3.a("TCF client enabled.");
                                                        o1.l(t2Var2);
                                                        t2Var2.z();
                                                        com.google.android.gms.measurement.internal.s0 s0Var12 = o1Var4.w;
                                                        o1.m(s0Var12);
                                                        s0Var12.E.a("Register tcfPrefChangeListener.");
                                                        if (t2Var2.M == null) {
                                                            t2Var2.N = new g2(t2Var2, o1Var4, 2);
                                                            t2Var2.M = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.s2
                                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str12) {
                                                                    t2 t2Var3 = t2.this;
                                                                    o1 o1Var11 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var3).s;
                                                                    h hVar4 = o1Var11.u;
                                                                    s0 s0Var13 = o1Var11.w;
                                                                    if (!hVar4.J(null, c0.Z0)) {
                                                                        if (Objects.equals(str12, "IABTCF_TCString")) {
                                                                            o1.m(s0Var13);
                                                                            s0Var13.F.a("IABTCF_TCString change picked up in listener.");
                                                                            g2 g2Var = t2Var3.N;
                                                                            c21.u.g(g2Var);
                                                                            g2Var.b(500L);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    if (Objects.equals(str12, "IABTCF_TCString") || Objects.equals(str12, "IABTCF_gdprApplies") || Objects.equals(str12, "IABTCF_EnableAdvertiserConsentMode")) {
                                                                        o1.m(s0Var13);
                                                                        s0Var13.F.a("IABTCF_TCString change picked up in listener.");
                                                                        g2 g2Var2 = t2Var3.N;
                                                                        c21.u.g(g2Var2);
                                                                        g2Var2.b(500L);
                                                                    }
                                                                }
                                                            };
                                                        }
                                                        c1 c1Var2 = o1Var4.v;
                                                        o1.k(c1Var2);
                                                        c1Var2.E().registerOnSharedPreferenceChangeListener(t2Var2.M);
                                                        o1.l(t2Var2);
                                                        t2Var2.F();
                                                    }
                                                    a1Var = c1Var.x;
                                                    if (a1Var.a() == 0) {
                                                        o1.m(s0Var5);
                                                        q0Var5.b(Long.valueOf(j), "Persisting first open");
                                                        a1Var.b(j);
                                                    }
                                                    o1.l(t2Var2);
                                                    e1Var = t2Var2.J;
                                                    if (e1Var.e() && e1Var.d()) {
                                                        c1 c1Var3 = e1Var.s.v;
                                                        o1.k(c1Var3);
                                                        c1Var3.O.p((String) null);
                                                    }
                                                    if (o1Var3.h()) {
                                                        o1Var5 = o1Var3;
                                                        t4Var2 = t4Var;
                                                        if (TextUtils.isEmpty(o1Var5.r().G())) {
                                                            t1Var3 = t1Var2;
                                                        } else {
                                                            String G2 = o1Var5.r().G();
                                                            c1Var.z();
                                                            String string = c1Var.D().getString("gmp_app_id", null);
                                                            boolean isEmpty = TextUtils.isEmpty(G2);
                                                            boolean isEmpty2 = TextUtils.isEmpty(string);
                                                            if (!isEmpty && !isEmpty2) {
                                                                u.g(G2);
                                                                if (!G2.equals(string)) {
                                                                    o1.m(s0Var5);
                                                                    q0Var4.a("Rechecking which service to use due to a GMP App Id change");
                                                                    c1Var.z();
                                                                    c1Var.z();
                                                                    Boolean valueOf3 = c1Var.D().contains("measurement_enabled") ? Boolean.valueOf(c1Var.D().getBoolean("measurement_enabled", true)) : null;
                                                                    SharedPreferences.Editor edit2 = c1Var.D().edit();
                                                                    edit2.clear();
                                                                    edit2.apply();
                                                                    if (valueOf3 != null) {
                                                                        c1Var.z();
                                                                        SharedPreferences.Editor edit3 = c1Var.D().edit();
                                                                        edit3.putBoolean("measurement_enabled", valueOf3.booleanValue());
                                                                        edit3.apply();
                                                                    }
                                                                    o1Var5.o().D();
                                                                    o1Var5.I.H();
                                                                    o1Var5.I.F();
                                                                    a1Var.b(j);
                                                                    t1Var3 = t1Var2;
                                                                    t1Var3.p((String) null);
                                                                    String G3 = o1Var5.r().G();
                                                                    c1Var.z();
                                                                    SharedPreferences.Editor edit4 = c1Var.D().edit();
                                                                    edit4.putString("gmp_app_id", G3);
                                                                    edit4.apply();
                                                                }
                                                            }
                                                            t1Var3 = t1Var2;
                                                            String G32 = o1Var5.r().G();
                                                            c1Var.z();
                                                            SharedPreferences.Editor edit42 = c1Var.D().edit();
                                                            edit42.putString("gmp_app_id", G32);
                                                            edit42.apply();
                                                        }
                                                        if (!c1Var.G().i(a2Var)) {
                                                            t1Var3.p((String) null);
                                                        }
                                                        o1.l(t2Var2);
                                                        t2Var2.y.set(t1Var3.o());
                                                        try {
                                                            o1Var2.r.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                                        } catch (ClassNotFoundException unused5) {
                                                            t1 t1Var4 = c1Var.N;
                                                            if (!TextUtils.isEmpty(t1Var4.o())) {
                                                                o1.m(s0Var5);
                                                                s0Var = s0Var5;
                                                                s0Var.A.a("Remote config removed with active feature rollouts");
                                                                t1Var4.p((String) null);
                                                            }
                                                        }
                                                        s0Var = s0Var5;
                                                        if (!TextUtils.isEmpty(o1Var5.r().G())) {
                                                            boolean e6 = o1Var5.e();
                                                            SharedPreferences sharedPreferences2 = c1Var.u;
                                                            if (!(sharedPreferences2 == null ? z : sharedPreferences2.contains("deferred_analytics_collection")) && !hVar2.M()) {
                                                                c1Var.I(!e6);
                                                            }
                                                            if (e6) {
                                                                o1.l(t2Var2);
                                                                t2Var2.L();
                                                            }
                                                            y3 y3Var = o1Var5.y;
                                                            o1.l(y3Var);
                                                            y3Var.w.w();
                                                            o1Var5.p().D(new AtomicReference());
                                                            o1Var5.p().E(c1Var.Q.U());
                                                        }
                                                    } else {
                                                        if (o1Var3.e()) {
                                                            t4Var2 = t4Var;
                                                            if (t4Var2.X("android.permission.INTERNET")) {
                                                                q0Var2 = q0Var;
                                                            } else {
                                                                o1.m(s0Var5);
                                                                q0Var2 = q0Var;
                                                                q0Var2.a("App is missing INTERNET permission");
                                                            }
                                                            if (!t4Var2.X("android.permission.ACCESS_NETWORK_STATE")) {
                                                                o1.m(s0Var5);
                                                                q0Var2.a("App is missing ACCESS_NETWORK_STATE permission");
                                                            }
                                                            o1Var5 = o1Var3;
                                                            Context context3 = o1Var5.r;
                                                            if (!i21.b.a(context3).h() && !hVar2.C()) {
                                                                if (!t4.q0(context3)) {
                                                                    o1.m(s0Var5);
                                                                    q0Var2.a("AppMeasurementReceiver not registered/enabled");
                                                                }
                                                                if (!t4.S(context3)) {
                                                                    o1.m(s0Var5);
                                                                    q0Var2.a("AppMeasurementService not registered/enabled");
                                                                }
                                                            }
                                                            o1.m(s0Var5);
                                                            q0Var2.a("Uploading is not possible. App measurement disabled");
                                                        } else {
                                                            o1Var5 = o1Var3;
                                                            t4Var2 = t4Var;
                                                        }
                                                        s0Var = s0Var5;
                                                    }
                                                    m8.a();
                                                    if (hVar2.J(null, c0.Q0)) {
                                                        t4Var2.z();
                                                        if (t4Var2.V() == 1) {
                                                            z = true;
                                                        }
                                                        if (z) {
                                                            long intValue = ((Integer) c0.x0.a(null)).intValue();
                                                            long nextInt = new Random().nextInt(5000);
                                                            o1Var5.B.getClass();
                                                            long max = Math.max(500L, ((intValue * 1000) + nextInt) - SystemClock.elapsedRealtime());
                                                            if (max > 500) {
                                                                o1.m(s0Var);
                                                                q0Var5.b(Long.valueOf(max), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                            }
                                                            o1.l(t2Var2);
                                                            t2Var2.z();
                                                            if (t2Var2.D == null) {
                                                                t2Var2.D = new g2(t2Var2, o1Var4, 0);
                                                            }
                                                            t2Var2.D.b(max);
                                                        }
                                                    }
                                                    c1Var.G.c(true);
                                                    return;
                                                }
                                            } else {
                                                t1Var2 = t1Var;
                                                q0Var = q0Var6;
                                                t4Var = t4Var3;
                                            }
                                            if (TextUtils.isEmpty(o1Var3.r().G()) && (i4 == 0 || i4 == 30 || i4 == 10 || i4 == 40)) {
                                                o1.l(t2Var2);
                                                z = false;
                                                t2Var2.V(new b2(-10), false);
                                            } else {
                                                z = false;
                                            }
                                            b2Var = null;
                                            if (b2Var != null) {
                                            }
                                            o1.l(t2Var2);
                                            o1Var4 = (o1) ((s0) t2Var2).s;
                                            t2Var2.D(b2Var);
                                            c1Var.z();
                                            int i52 = q.b(c1Var.D().getString("dma_consent_settings", null)).a;
                                            O2 = hVar2.O("google_analytics_default_allow_ad_personalization_signals", true);
                                            if (O2 != y1Var2) {
                                            }
                                            O3 = hVar2.O("google_analytics_default_allow_ad_user_data", true);
                                            if (O3 == y1Var2) {
                                            }
                                            if (TextUtils.isEmpty(o1Var3.r().G())) {
                                            }
                                            if (TextUtils.isEmpty(o1Var3.r().G())) {
                                                q c22 = q.c(30, bundle);
                                                it = c22.e.values().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                            }
                                            L = hVar2.L("google_analytics_tcf_data_enabled");
                                            if (L != null) {
                                            }
                                            o1.m(s0Var5);
                                            q0Var3.a("TCF client enabled.");
                                            o1.l(t2Var2);
                                            t2Var2.z();
                                            com.google.android.gms.measurement.internal.s0 s0Var122 = o1Var4.w;
                                            o1.m(s0Var122);
                                            s0Var122.E.a("Register tcfPrefChangeListener.");
                                            if (t2Var2.M == null) {
                                            }
                                            c1 c1Var22 = o1Var4.v;
                                            o1.k(c1Var22);
                                            c1Var22.E().registerOnSharedPreferenceChangeListener(t2Var2.M);
                                            o1.l(t2Var2);
                                            t2Var2.F();
                                            a1Var = c1Var.x;
                                            if (a1Var.a() == 0) {
                                            }
                                            o1.l(t2Var2);
                                            e1Var = t2Var2.J;
                                            if (e1Var.e()) {
                                                c1 c1Var32 = e1Var.s.v;
                                                o1.k(c1Var32);
                                                c1Var32.O.p((String) null);
                                            }
                                            if (o1Var3.h()) {
                                            }
                                            m8.a();
                                            if (hVar2.J(null, c0.Q0)) {
                                            }
                                            c1Var.G.c(true);
                                            return;
                                        }
                                    }
                                    o1Var = o1Var7;
                                    o1Var2 = o1Var8;
                                    t1Var = c1Var.y;
                                    b2 G4 = c1Var.G();
                                    int i42 = G4.b;
                                    O = hVar2.O("google_analytics_default_allow_ad_storage", false);
                                    o1Var3 = o1Var;
                                    y1 O42 = hVar2.O("google_analytics_default_allow_analytics_storage", false);
                                    y1Var2 = y1Var;
                                    if (O == y1Var2) {
                                    }
                                    t1Var2 = t1Var;
                                    q0Var = q0Var6;
                                    t4Var = t4Var3;
                                    if (b2.l(-10, c1Var.D().getInt("consent_source", 100))) {
                                    }
                                    if (TextUtils.isEmpty(o1Var3.r().G())) {
                                    }
                                    z = false;
                                    b2Var = null;
                                    if (b2Var != null) {
                                    }
                                    o1.l(t2Var2);
                                    o1Var4 = (o1) ((s0) t2Var2).s;
                                    t2Var2.D(b2Var);
                                    c1Var.z();
                                    int i522 = q.b(c1Var.D().getString("dma_consent_settings", null)).a;
                                    O2 = hVar2.O("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (O2 != y1Var2) {
                                    }
                                    O3 = hVar2.O("google_analytics_default_allow_ad_user_data", true);
                                    if (O3 == y1Var2) {
                                    }
                                    if (TextUtils.isEmpty(o1Var3.r().G())) {
                                    }
                                    if (TextUtils.isEmpty(o1Var3.r().G())) {
                                    }
                                    L = hVar2.L("google_analytics_tcf_data_enabled");
                                    if (L != null) {
                                    }
                                    o1.m(s0Var5);
                                    q0Var3.a("TCF client enabled.");
                                    o1.l(t2Var2);
                                    t2Var2.z();
                                    com.google.android.gms.measurement.internal.s0 s0Var1222 = o1Var4.w;
                                    o1.m(s0Var1222);
                                    s0Var1222.E.a("Register tcfPrefChangeListener.");
                                    if (t2Var2.M == null) {
                                    }
                                    c1 c1Var222 = o1Var4.v;
                                    o1.k(c1Var222);
                                    c1Var222.E().registerOnSharedPreferenceChangeListener(t2Var2.M);
                                    o1.l(t2Var2);
                                    t2Var2.F();
                                    a1Var = c1Var.x;
                                    if (a1Var.a() == 0) {
                                    }
                                    o1.l(t2Var2);
                                    e1Var = t2Var2.J;
                                    if (e1Var.e()) {
                                    }
                                    if (o1Var3.h()) {
                                    }
                                    m8.a();
                                    if (hVar2.J(null, c0.Q0)) {
                                    }
                                    c1Var.G.c(true);
                                    return;
                                }
                                k0Var2.C = list;
                                if (packageManager != null) {
                                }
                                ((o1) ((s0) k0Var2).s).T.incrementAndGet();
                                k0Var2.t = true;
                                y2Var = new y2(o1Var7);
                                y2Var.B();
                                o1Var7.L = y2Var;
                                if (y2Var.t) {
                                }
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            if (list != null) {
                            }
                            k0Var2.C = list;
                            if (packageManager != null) {
                            }
                            ((o1) ((s0) k0Var2).s).T.incrementAndGet();
                            k0Var2.t = true;
                            y2Var = new y2(o1Var7);
                            y2Var.B();
                            o1Var7.L = y2Var;
                            if (y2Var.t) {
                            }
                        }
                    }
                    str6 = str8;
                    packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
                    if (packageInfo != null) {
                    }
                }
                packageManager = packageManager2;
                str2 = str6;
                str = str7;
                str3 = str;
                i = Integer.MIN_VALUE;
                k0Var2.u = packageName;
                k0Var2.x = str2;
                k0Var2.v = str3;
                k0Var2.w = i;
                k0Var2.y = str;
                k0Var2.z = 0L;
                g = o1Var9.g();
                if (g == 0) {
                }
                k0Var2.F = "";
                b = c2.b(context, o1Var9.G);
                if (!TextUtils.isEmpty(b)) {
                }
                k0Var2.F = str5;
                if (g == 0) {
                }
                list = null;
                k0Var2.C = null;
                com.google.android.gms.measurement.internal.h hVar322 = o1Var9.u;
                o1 o1Var1022 = (o1) ((s0) hVar322).s;
                u.d("analytics.safelisted_events");
                K = hVar322.K();
                if (K == null) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                if (list != null) {
                }
                k0Var2.C = list;
                if (packageManager != null) {
                }
                ((o1) ((s0) k0Var2).s).T.incrementAndGet();
                k0Var2.t = true;
                y2Var = new y2(o1Var7);
                y2Var.B();
                o1Var7.L = y2Var;
                if (y2Var.t) {
                }
                break;
            case 7:
                o4 o4Var = ((v1) this.t).f;
                o4Var.B();
                com.google.android.gms.measurement.internal.f fVar = (com.google.android.gms.measurement.internal.f) this.s;
                if (fVar.t.j() == null) {
                    o4Var.getClass();
                    String str12 = fVar.r;
                    u.g(str12);
                    v4 Q = o4Var.Q(str12);
                    if (Q != null) {
                        o4Var.a0(fVar, Q);
                        return;
                    }
                    return;
                }
                o4Var.getClass();
                String str13 = fVar.r;
                u.g(str13);
                v4 Q2 = o4Var.Q(str13);
                if (Q2 != null) {
                    o4Var.Z(fVar, Q2);
                    return;
                }
                return;
            case 8:
                n0 n0Var = (n0) this.s;
                t2 t2Var3 = (t2) this.t;
                o1 o1Var11 = (o1) ((s0) t2Var3).s;
                o1 o1Var12 = (o1) ((s0) t2Var3).s;
                y3 y3Var2 = o1Var11.y;
                o1.l(y3Var2);
                o1 o1Var13 = (o1) ((s0) y3Var2).s;
                c1 c1Var4 = o1Var13.v;
                o1.k(c1Var4);
                if (c1Var4.G().i(a2.ANALYTICS_STORAGE)) {
                    o1.k(c1Var4);
                    a1 a1Var2 = c1Var4.I;
                    o1Var13.B.getClass();
                    if (!c1Var4.J(System.currentTimeMillis()) && a1Var2.a() != 0) {
                        valueOf2 = Long.valueOf(a1Var2.a());
                        if (valueOf2 == null) {
                            t4 t4Var5 = o1Var12.z;
                            o1.k(t4Var5);
                            t4Var5.j0(n0Var, valueOf2.longValue());
                            return;
                        } else {
                            try {
                                n0Var.c(null);
                                return;
                            } catch (RemoteException e7) {
                                com.google.android.gms.measurement.internal.s0 s0Var13 = o1Var12.w;
                                o1.m(s0Var13);
                                s0Var13.x.b(e7, "getSessionId failed with exception");
                                return;
                            }
                        }
                    }
                } else {
                    com.google.android.gms.measurement.internal.s0 s0Var14 = o1Var13.w;
                    o1.m(s0Var14);
                    s0Var14.C.a("Analytics storage consent denied; will not get session id");
                }
                valueOf2 = null;
                if (valueOf2 == null) {
                }
                break;
            case 9:
                ((t2) this.t).Q((Boolean) this.s, true);
                return;
            case 10:
                a();
                return;
            case 11:
                t2 t2Var4 = ((AppMeasurementDynamiteService) this.t).f.D;
                o1.l(t2Var4);
                b1.m mVar2 = (b1.m) this.s;
                t2Var4.z();
                t2Var4.A();
                b1.m mVar3 = t2Var4.v;
                if (mVar2 != mVar3) {
                    u.i("EventInterceptor already set.", mVar3 == null);
                }
                t2Var4.v = mVar2;
                return;
            case 12:
                o1 o1Var14 = (o1) ((s0) ((t2) this.s)).s;
                k0 r = o1Var14.r();
                String str14 = (String) this.t;
                String str15 = r.I;
                boolean z7 = false;
                if (str15 != null && !str15.equals(str14)) {
                    z7 = true;
                }
                r.I = str14;
                if (z7) {
                    o1Var14.r().E();
                    return;
                }
                return;
            case 13:
                b();
                return;
            case 14:
                c();
                return;
            case 15:
                d();
                return;
            case 16:
                e();
                return;
            case 17:
                f();
                return;
            case 18:
                g();
                return;
            case 19:
                h();
                return;
            case 20:
                i();
                return;
            case 21:
                j();
                return;
            case 22:
                k();
                return;
            case 23:
                l();
                return;
            case 24:
                m();
                return;
            case 25:
                n();
                return;
            case 26:
                o();
                return;
            case 27:
                p();
                return;
            case 28:
                q();
                return;
            default:
                synchronized (((w21.l) this.t).t) {
                    w21.d dVar2 = (w21.d) ((w21.l) this.t).u;
                    Exception g3 = ((w21.o) this.s).g();
                    u.g(g3);
                    dVar2.h(g3);
                }
                return;
        }
    }

    public String toString() {
        switch (this.r) {
            case 0:
                s sVar = new s(b.class.getSimpleName(), 23);
                b1.m mVar = (b1.m) this.t;
                e51.a aVar = new e51.a(18, false);
                ((e51.a) sVar.s).t = aVar;
                sVar.s = aVar;
                aVar.s = mVar;
                return sVar.toString();
            case 23:
                Runnable runnable = (Runnable) this.s;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((j) this.t).t;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z, int i) {
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }

    public b(d1 d1Var, com.google.android.gms.internal.measurement.c0 c0Var, d1 d1Var2) {
        this.r = 5;
        this.s = c0Var;
        this.t = d1Var;
    }

    public b(t2 t2Var, n0 n0Var) {
        this.r = 8;
        this.s = n0Var;
        Objects.requireNonNull(t2Var);
        this.t = t2Var;
    }

    public b(p3 p3Var, b3 b3Var) {
        this.r = 13;
        this.s = b3Var;
        Objects.requireNonNull(p3Var);
        this.t = p3Var;
    }

    public b(y51.c cVar, o4 o4Var, Runnable runnable) {
        this.r = 16;
        this.s = o4Var;
        this.t = runnable;
    }

    public b(j jVar) {
        this.r = 23;
        this.t = jVar;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class BiometricFragment {
        public BiometricFragment() {
        }
    }

    public b(Object... a) {
    }

    public Object t;
}
