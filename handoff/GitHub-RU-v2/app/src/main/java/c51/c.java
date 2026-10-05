package c51;

import a5.s;
import a81.t;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c21.u;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.gms.measurement.internal.c2;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.n4;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.p3;
import com.google.android.gms.measurement.internal.p4;
import com.google.android.gms.measurement.internal.q4;
import com.google.android.gms.measurement.internal.s0;
import com.google.android.gms.measurement.internal.s3;
import com.google.android.gms.measurement.internal.t2;
import com.google.android.gms.measurement.internal.t4;
import com.google.android.gms.measurement.internal.v;
import com.google.android.gms.measurement.internal.v1;
import com.google.android.gms.measurement.internal.v4;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.w0;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import m7.x;
import t.q;
import v71.b0;
import v71.l;
import w21.g;
import w21.i;
import w21.m;
import w21.o;
import x9.p;
import y11.h;
import y11.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements Runnable {
    public final /* synthetic */ int r;
    public Object s;
    public Object t;
    public Object u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0524  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        v vVar;
        int i;
        long j;
        int i2;
        Cursor cursor;
        p4 p4Var;
        Cursor cursor2;
        AtomicReference atomicReference;
        p3 p3Var;
        o1 o1Var;
        c1 c1Var;
        t4 t4Var;
        o1 o1Var2;
        c1 c1Var2;
        s0 s0Var;
        int i3;
        o o;
        OverScroller overScroller;
        switch (this.r) {
            case 0:
                d dVar = (d) this.u;
                v41.b bVar = (v41.b) this.s;
                dVar.b(bVar, (g) this.t);
                ((AtomicInteger) dVar.i.t).set(0);
                double min = Math.min(3600000.0d, Math.pow(dVar.b, dVar.a()) * (60000.0d / dVar.a));
                String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
                String str = bVar.b;
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 1:
                v4 v4Var = (v4) this.t;
                o4 o4Var = ((v1) this.u).f;
                o4Var.B();
                f fVar = (f) this.s;
                if (fVar.t.j() == null) {
                    o4Var.a0(fVar, v4Var);
                    return;
                } else {
                    o4Var.Z(fVar, v4Var);
                    return;
                }
            case 2:
                w wVar = (w) this.s;
                v4 v4Var2 = (v4) this.t;
                v1 v1Var = (v1) this.u;
                v1Var.getClass();
                o4 o4Var2 = v1Var.f;
                if ("_cmp".equals(wVar.r) && (vVar = wVar.s) != null) {
                    Bundle bundle = vVar.r;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            o4Var2.a().D.b(wVar.toString(), "Event has been filtered ");
                            wVar = new w("_cmpx", vVar, wVar.t, wVar.u);
                        }
                    }
                }
                String str2 = wVar.r;
                i1 i1Var = o4Var2.r;
                w0 w0Var = o4Var2.x;
                o4.U(i1Var);
                String str3 = v4Var2.r;
                e0 e0Var = TextUtils.isEmpty(str3) ? null : (e0) i1Var.B.h(str3);
                if (e0Var == null) {
                    o4Var2.a().F.b(v4Var2.r, "EES not loaded for");
                    o4Var2.B();
                    o4Var2.j(wVar, v4Var2);
                    return;
                }
                try {
                    s sVar = e0Var.c;
                    o4.U(w0Var);
                    HashMap p0 = w0.p0(wVar.s.C(), true);
                    String g = c2.g(str2, c2.c, c2.a);
                    if (g == null) {
                        g = str2;
                    }
                    if (e0Var.a(new com.google.android.gms.internal.measurement.b(g, wVar.u, p0))) {
                        if (((com.google.android.gms.internal.measurement.b) sVar.u).equals((com.google.android.gms.internal.measurement.b) sVar.t)) {
                            o4Var2.B();
                            o4Var2.j(wVar, v4Var2);
                        } else {
                            o4Var2.a().F.b(str2, "EES edited event");
                            o4.U(w0Var);
                            w D = w0.D((com.google.android.gms.internal.measurement.b) sVar.u);
                            o4Var2.B();
                            o4Var2.j(D, v4Var2);
                        }
                        if (((ArrayList) sVar.s).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) sVar.s;
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            com.google.android.gms.internal.measurement.b bVar2 = (com.google.android.gms.internal.measurement.b) obj2;
                            o4Var2.a().F.b(bVar2.a, "EES logging created event");
                            o4.U(w0Var);
                            w D2 = w0.D(bVar2);
                            o4Var2.B();
                            o4Var2.j(D2, v4Var2);
                        }
                        return;
                    }
                } catch (zzd unused2) {
                    o4Var2.a().x.c("EES error. appId, eventName", v4Var2.s, str2);
                }
                o4Var2.a().F.b(str2, "EES was not applied to event");
                o4Var2.B();
                o4Var2.j(wVar, v4Var2);
                return;
            case 3:
                v1 v1Var2 = (v1) this.u;
                v1Var2.f.B();
                v1Var2.f.h((w) this.s, (String) this.t);
                return;
            case 4:
                v4 v4Var3 = (v4) this.t;
                o4 o4Var3 = ((v1) this.u).f;
                o4Var3.B();
                q4 q4Var = (q4) this.s;
                if (q4Var.j() == null) {
                    o4Var3.X(q4Var.s, v4Var3);
                    return;
                } else {
                    o4Var3.W(q4Var, v4Var3);
                    return;
                }
            case 5:
                v1 v1Var3 = (v1) this.s;
                v4 v4Var4 = (v4) this.t;
                e eVar = (e) this.u;
                o4 o4Var4 = v1Var3.f;
                o4Var4.B();
                String str4 = v4Var4.r;
                u.g(str4);
                HashMap hashMap = o4Var4.V;
                o4Var4.b().z();
                o4Var4.l0();
                com.google.android.gms.measurement.internal.o oVar = o4Var4.t;
                o4.U(oVar);
                long j2 = eVar.r;
                long j3 = eVar.t;
                oVar.z();
                oVar.A();
                Cursor cursor3 = null;
                r21 = null;
                p4 p4Var2 = null;
                try {
                    cursor = oVar.o0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        i = 4;
                        j = j3;
                        i2 = 1;
                        cursor2 = cursor;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    i = 4;
                    j = j3;
                    i2 = 1;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (!cursor.moveToFirst()) {
                    i = 4;
                    j = j3;
                    i2 = 1;
                    if (cursor != null) {
                        cursor.close();
                    }
                    p4Var = p4Var2;
                    if (p4Var != null) {
                        o4Var4.a().A.c("[sgtm] Queued batch doesn't exist. appId, rowId", str4, Long.valueOf(j2));
                        return;
                    }
                    String str5 = p4Var.c;
                    int i5 = eVar.s;
                    if (i5 != i2) {
                        if (i5 == 3) {
                            n4 n4Var = (n4) hashMap.get(str5);
                            if (n4Var == null) {
                                n4Var = new n4(o4Var4);
                                hashMap.put(str5, n4Var);
                            } else {
                                n4Var.b += i2;
                                n4Var.c = n4Var.a();
                            }
                            o4Var4.f().getClass();
                            o4Var4.a().F.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((n4Var.c - System.currentTimeMillis()) / 1000));
                        }
                        com.google.android.gms.measurement.internal.o oVar2 = o4Var4.t;
                        o4.U(oVar2);
                        Long valueOf = Long.valueOf(eVar.r);
                        oVar2.L(valueOf);
                        o4Var4.a().F.c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str4, valueOf);
                        return;
                    }
                    if (hashMap.containsKey(str5)) {
                        hashMap.remove(str5);
                    }
                    com.google.android.gms.measurement.internal.o oVar3 = o4Var4.t;
                    o4.U(oVar3);
                    Long valueOf2 = Long.valueOf(j2);
                    oVar3.G(valueOf2);
                    o4Var4.a().F.c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str4, valueOf2);
                    if (j > 0) {
                        com.google.android.gms.measurement.internal.o oVar4 = o4Var4.t;
                        o4.U(oVar4);
                        o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar4).s;
                        oVar4.z();
                        oVar4.A();
                        Long valueOf3 = Long.valueOf(j);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("upload_type", Integer.valueOf(i2));
                        g21.a aVar = o1Var3.B;
                        s0 s0Var2 = o1Var3.w;
                        aVar.getClass();
                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                        try {
                            if (oVar4.o0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i)}) != 1) {
                                o1.m(s0Var2);
                                s0Var2.A.c("Google Signal pending batch not updated. appId, rowId", str4, valueOf3);
                            }
                            o4Var4.a().F.c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str4, Long.valueOf(j));
                            o4Var4.t(str4);
                            return;
                        } catch (SQLiteException e3) {
                            o1.m(s0Var2);
                            s0Var2.x.d("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e3);
                            throw e3;
                        }
                    }
                    return;
                }
                String string2 = cursor.getString(1);
                u.g(string2);
                try {
                    try {
                        try {
                            i2 = 1;
                            cursor2 = cursor;
                            i = 4;
                            j = j3;
                        } catch (SQLiteException e4) {
                            e = e4;
                            cursor2 = cursor;
                            j = j3;
                            i2 = 1;
                            i = 4;
                            cursor = cursor2;
                            try {
                                s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                                o1.m(s0Var3);
                                s0Var3.x.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                                if (cursor != null) {
                                }
                                p4Var = p4Var2;
                                if (p4Var != null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor3 = cursor;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        i2 = 1;
                        cursor2 = cursor;
                        j = j3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    i = 4;
                    i2 = 1;
                    cursor2 = cursor;
                    j = j3;
                }
                try {
                    p4Var2 = oVar.a0(string2, j2, cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                    cursor2.close();
                } catch (SQLiteException e7) {
                    e = e7;
                    cursor = cursor2;
                    s0 s0Var32 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                    o1.m(s0Var32);
                    s0Var32.x.c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                    if (cursor != null) {
                    }
                    p4Var = p4Var2;
                    if (p4Var != null) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
                p4Var = p4Var2;
                if (p4Var != null) {
                }
            case 6:
                AtomicReference atomicReference2 = (AtomicReference) this.s;
                synchronized (atomicReference2) {
                    try {
                        try {
                            p3Var = (p3) this.u;
                            o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s;
                            c1Var = o1Var.v;
                            o1.k(c1Var);
                        } catch (RemoteException e8) {
                            s0 s0Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((p3) this.u)).s).w;
                            o1.m(s0Var4);
                            s0Var4.x.b(e8, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.s;
                        }
                        if (c1Var.G().i(a2.ANALYTICS_STORAGE)) {
                            f0 f0Var = p3Var.v;
                            if (f0Var != null) {
                                atomicReference2.set(f0Var.G((v4) this.t));
                                String str6 = (String) atomicReference2.get();
                                if (str6 != null) {
                                    t2 t2Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).D;
                                    o1.l(t2Var);
                                    t2Var.y.set(str6);
                                    c1 c1Var3 = o1Var.v;
                                    o1.k(c1Var3);
                                    c1Var3.y.p(str6);
                                }
                                p3Var.M();
                                atomicReference = (AtomicReference) this.s;
                                atomicReference.notify();
                                return;
                            }
                            s0 s0Var5 = o1Var.w;
                            o1.m(s0Var5);
                            s0Var5.x.a("Failed to get app instance id");
                        } else {
                            s0 s0Var6 = o1Var.w;
                            o1.m(s0Var6);
                            s0Var6.C.a("Analytics storage consent denied; will not get app instance id");
                            t2 t2Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).D;
                            o1.l(t2Var2);
                            t2Var2.y.set(null);
                            c1 c1Var4 = o1Var.v;
                            o1.k(c1Var4);
                            c1Var4.y.p((String) null);
                            atomicReference2.set(null);
                        }
                        atomicReference2.notify();
                        return;
                    } catch (Throwable th5) {
                        ((AtomicReference) this.s).notify();
                        throw th5;
                    }
                }
            case 7:
                n0 n0Var = (n0) this.t;
                p3 p3Var2 = (p3) this.u;
                String str7 = null;
                try {
                    try {
                        o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s;
                        c1Var2 = o1Var2.v;
                        s0Var = o1Var2.w;
                        o1.k(c1Var2);
                    } catch (Throwable th6) {
                        t4 t4Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                        o1.k(t4Var2);
                        t4Var2.i0(null, n0Var);
                        throw th6;
                    }
                } catch (RemoteException e9) {
                    s0 s0Var7 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).w;
                    o1.m(s0Var7);
                    s0Var7.x.b(e9, "Failed to get app instance id");
                }
                if (c1Var2.G().i(a2.ANALYTICS_STORAGE)) {
                    f0 f0Var2 = p3Var2.v;
                    if (f0Var2 != null) {
                        str7 = f0Var2.G((v4) this.s);
                        if (str7 != null) {
                            t2 t2Var3 = o1Var2.D;
                            o1.l(t2Var3);
                            t2Var3.y.set(str7);
                            o1.k(c1Var2);
                            c1Var2.y.p(str7);
                        }
                        p3Var2.M();
                        t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).z;
                        o1.k(t4Var);
                        t4Var.i0(str7, n0Var);
                        return;
                    }
                    o1.m(s0Var);
                    s0Var.x.a("Failed to get app instance id");
                } else {
                    o1.m(s0Var);
                    s0Var.C.a("Analytics storage consent denied; will not get app instance id");
                    t2 t2Var4 = o1Var2.D;
                    o1.l(t2Var4);
                    t2Var4.y.set(null);
                    o1.k(c1Var2);
                    c1Var2.y.p((String) null);
                }
                t4Var = o1Var2.z;
                o1.k(t4Var);
                t4Var.i0(str7, n0Var);
                return;
            case 8:
                p3 p3Var3 = (p3) this.s;
                v4 v4Var5 = (v4) this.t;
                e eVar2 = (e) this.u;
                o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var3).s;
                f0 f0Var3 = p3Var3.v;
                if (f0Var3 == null) {
                    s0 s0Var8 = o1Var4.w;
                    o1.m(s0Var8);
                    s0Var8.x.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    f0Var3.v(v4Var5, eVar2);
                    p3Var3.M();
                    return;
                } catch (RemoteException e10) {
                    s0 s0Var9 = o1Var4.w;
                    o1.m(s0Var9);
                    s0Var9.x.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(eVar2.r), e10);
                    return;
                }
            case 9:
                y51.c cVar = (y51.c) this.s;
                s0 s0Var10 = (s0) this.t;
                JobParameters jobParameters = (JobParameters) this.u;
                s0Var10.F.a("AppMeasurementJobService processed last upload request.");
                ((s3) ((Service) cVar.s)).c(jobParameters);
                return;
            case 10:
                l lVar = (l) this.s;
                try {
                    b0.D(lVar.v.b0(a71.d.r), new x((m7.w) this.t, lVar, (gi.b) this.u, (a71.c) null, 0));
                    return;
                } catch (Throwable th7) {
                    lVar.x(th7);
                    return;
                }
            case 11:
                try {
                    obj = ((x4.d) this.s).call();
                } catch (Exception unused3) {
                    obj = null;
                }
                ((Handler) this.u).post(new m((x4.e) this.t, obj, false, 4));
                return;
            case 12:
                x9.w.M((x9.w) this.s, (p) this.t, (x9.d) this.u);
                return;
            case 13:
                x9.w.L((x9.w) this.s, (t) this.t, (c5.b) this.u);
                return;
            case 14:
                y11.a aVar2 = (y11.a) this.t;
                Intent intent = aVar2.r;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    o = q.k((Object) null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = aVar2.r;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar2.r;
                    Integer valueOf4 = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (valueOf4 != null) {
                        bundle2.putInt("google.product_id", valueOf4.intValue());
                    }
                    Context context = (Context) this.s;
                    bundle2.putBoolean("supports_message_handled", true);
                    y11.l n = y11.l.n(context);
                    synchronized (n) {
                        i3 = n.a;
                        n.a = i3 + 1;
                    }
                    o = n.o(new k(i3, 2, bundle2, 0));
                }
                o.a(h.s, new i((CountDownLatch) this.u));
                return;
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.s;
                z21.g gVar = (z21.g) this.u;
                View view = (View) this.t;
                if (view == null || (overScroller = gVar.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    gVar.A(coordinatorLayout, view, gVar.d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) gVar).G(coordinatorLayout, appBarLayout);
                if (appBarLayout.C) {
                    appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.r = i;
        this.u = obj;
        this.s = obj2;
        this.t = obj3;
    }

    public c(p3 p3Var, AtomicReference atomicReference, v4 v4Var) {
        this.r = 6;
        this.s = atomicReference;
        this.t = v4Var;
        Objects.requireNonNull(p3Var);
        this.u = p3Var;
    }
}
