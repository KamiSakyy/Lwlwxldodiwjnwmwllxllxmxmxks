package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 implements a5.z, e31.b, i0.k, l3.p, w21.d, a5.k, fa1.n, w3.z, j7.b {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ x3(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public static void n(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw jo.f4Shadow.g(it);
        }
    }

    public void a(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.s).setResultCode(i);
    }

    public boolean b(float f) {
        if (f == 0.0f) {
            return false;
        }
        i();
        ((NestedScrollView) this.s).j((int) f);
        return true;
    }

    public long c(s3.k kVar, long j, s3.m mVar, long j2) {
        long j3 = ((s3.j) ((j71.a) this.s).a()).a;
        return (g0.b.a(kVar.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), mVar == s3.m.r) << 32) | (g0.b.a(kVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }

    public Object d(Object obj) {
        return Optional.ofNullable(((fa1.n) this.s).d((q81.c0) obj));
    }

    public float e() {
        return -((NestedScrollView) this.s).getVerticalScrollFactorCompat();
    }

    public float f(float f, float f2) {
        return 0.0f;
    }

    public int g(int i) {
        f1.y3 y3Var = (f1.y3) this.s;
        if (i <= y3Var.r - 1) {
            return i;
        }
        if (i <= y3Var.s - 1) {
            return i - 1;
        }
        int i2 = y3Var.t;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    @Override // w21.d
    public void h(Exception exc) {
        ((x71.t) this.s).e(exc);
    }

    public void i() {
        ((NestedScrollView) this.s).u.abortAnimation();
    }

    public float j(float f) {
        return ((e51.a) this.s).j(f);
    }

    public com.apollographql.apollo.internal.e k() {
        j9.b r;
        androidx.compose.foundation.lazy.layout.t1 t1Var = (androidx.compose.foundation.lazy.layout.t1) this.s;
        j9.d dVar = (j9.d) t1Var.d;
        synchronized (dVar) {
            t1Var.b(true);
            r = dVar.r(((j9.a) t1Var.b).a);
        }
        if (r != null) {
            return new com.apollographql.apollo.internal.e(r);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.app.Dialog, d31.j] */
    public a5.p2 l(View view, a5.p2 p2Var) {
        d31.j r3 = (d31.j) ((d31.j) this.s);
        d31.i iVar = r3.E;
        if (iVar != null) {
            r3.x.Z.remove(iVar);
        }
        d31.i iVar2 = new d31.i(r3.A, p2Var);
        r3.E = iVar2;
        iVar2.e(r3.getWindow());
        BottomSheetBehavior bottomSheetBehavior = r3.x;
        d31.i iVar3 = r3.E;
        ArrayList arrayList = bottomSheetBehavior.Z;
        if (!arrayList.contains(iVar3)) {
            arrayList.add(iVar3);
        }
        return p2Var;
    }

    public int m(int i) {
        f1.y3 y3Var = (f1.y3) this.s;
        if (i < y3Var.r) {
            return i;
        }
        if (i < y3Var.s) {
            return i + 1;
        }
        int i2 = y3Var.t;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    public String o(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            k51.d dVar = (k51.d) this.s;
            k51.e eVar = new k51.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public Map p() {
        Iterator<String> keys;
        JSONObject jSONObject = (JSONObject) this.s;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return x61.s.r;
        }
        List<String> l0 = s71.j.l0(s71.j.g0(keys));
        int s = x61.x.s(x61.n.F(l0, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (String str : l0) {
            k71.k.d(str);
            linkedHashMap.put(str, com.google.android.gms.internal.measurement.i4.I(jSONObject, str));
        }
        return linkedHashMap;
    }

    public void q(float f, float f2, float f3, float f4) {
        a5.s sVar = (a5.s) this.s;
        d2.r t = sVar.t();
        float intBitsToFloat = Float.intBitsToFloat((int) (sVar.u() >> 32)) - (f3 + f);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (sVar.u() & 4294967295L)) - (f4 + f2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            d2.d0.a("Width and height must be greater than or equal to zero");
        }
        sVar.F(floatToRawIntBits);
        t.p(f, f2);
    }

    public JSONObject r() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.s;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(v41.gShadow.i(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    v41.gShadow.b(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    v41.gShadow.b(fileInputStream);
                    throw th;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            v41.gShadow.b(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public void s(float f, long j) {
        d2.r t = ((a5.s) this.s).t();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        t.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        t.b(f);
        t.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void t(float f, float f2, long j) {
        d2.r t = ((a5.s) this.s).t();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        t.p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        t.a(f, f2);
        t.p(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void u(float f, float f2) {
        ((a5.s) this.s).t().p(f, f2);
    }

    public Object v(j71.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.s;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return aVar.a();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public void w() {
        y3 y3Var = (y3) this.s;
        y3Var.z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
        c1 c1Var = o1Var.v;
        o1.k(c1Var);
        g21.a aVar = o1Var.B;
        aVar.getClass();
        if (c1Var.J(System.currentTimeMillis())) {
            c1 c1Var2 = o1Var.v;
            o1.k(c1Var2);
            c1Var2.D.c(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.F.a("Detected application was in foreground");
                aVar.getClass();
                y(System.currentTimeMillis());
            }
        }
    }

    public void x(long j) {
        y3 y3Var = (y3) this.s;
        y3Var.z();
        y3Var.D();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
        c1 c1Var = o1Var.v;
        o1.k(c1Var);
        if (c1Var.J(j)) {
            o1.k(c1Var);
            c1Var.D.c(true);
            o1Var.r().E();
        }
        o1.k(c1Var);
        c1Var.H.b(j);
        if (c1Var.D.b()) {
            y(j);
        }
    }

    public void y(long j) {
        y3 y3Var = (y3) this.s;
        y3Var.z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) y3Var).s;
        if (o1Var.e()) {
            c1 c1Var = o1Var.v;
            o1.k(c1Var);
            c1Var.H.b(j);
            o1Var.B.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j2 = j / 1000;
            Long valueOf = Long.valueOf(j2);
            t2 t2Var = o1Var.D;
            o1.l(t2Var);
            t2Var.K(j, valueOf, "auto", "_sid");
            o1.k(c1Var);
            c1Var.I.b(j2);
            c1Var.D.c(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            o1.l(t2Var);
            t2Var.H(j, bundle, "auto", "_s");
            String o = c1Var.N.o();
            if (TextUtils.isEmpty(o)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", o);
            o1.l(t2Var);
            t2Var.H(j, bundle2, "auto", "_ssr");
        }
    }

    public x3(int i) {
        k3.y tVar;
        this.r = i;
        switch (i) {
            case 26:
                this.s = new ReentrantReadWriteLock();
                break;
            case 27:
            default:
                this.s = new Region();
                break;
            case 28:
                if (Build.VERSION.SDK_INT >= 28) {
                    tVar = new k3.y();
                } else {
                    tVar = new w80.t(7);
                }
                this.s = tVar;
                break;
        }
    }

    public x3(b51.dShadow dVar) {
        this.r = 5;
        this.s = new File((File) dVar.c, "com.crashlytics.settings.json");
    }
}
