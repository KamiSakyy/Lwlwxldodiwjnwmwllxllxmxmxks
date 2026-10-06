package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 extends e0 {
    public ArrayList A;
    public l3 B;
    public o3 u;
    public f0 v;
    public volatile Boolean w;
    public l3 x;
    public ScheduledExecutorService y;
    public ba.c z;

    public p3(o1 o1Var) {
        super(o1Var);
        this.A = new ArrayList();
        this.z = new ba.c(o1Var.B);
        this.u = new o3(this);
        this.x = new l3(this, o1Var, 0);
        this.B = new l3(this, o1Var, 1);
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return false;
    }

    public final void D(AtomicReference atomicReference) {
        z();
        A();
        N(new c51.c(this, atomicReference, P(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(Bundle bundle) {
        boolean z;
        boolean G;
        z();
        A();
        v vVar = new v(bundle);
        L();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (o1Var.u.J(null, c0.b1)) {
            m0 o = o1Var.o();
            o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) o).s;
            t4 t4Var = o1Var2.z;
            s0 s0Var = o1Var2.w;
            o1.k(t4Var);
            byte[] e0 = t4.e0(vVar);
            if (e0 == null) {
                o1.m(s0Var);
                s0Var.y.a("Null default event parameters; not writing to database");
            } else if (e0.length > 131072) {
                o1.m(s0Var);
                s0Var.y.a("Default event parameters too long for local database. Sending directly to service");
            } else {
                G = o.G(4, e0);
                if (G) {
                    z = true;
                    N(new j2(this, P(false), z, vVar, bundle));
                }
            }
            G = false;
            if (G) {
            }
        }
        z = false;
        N(new j2(this, P(false), z, vVar, bundle));
    }

    public final void F() {
        z();
        A();
        if (Q()) {
            return;
        }
        if (G()) {
            o3 o3Var = this.u;
            p3 p3Var = o3Var.t;
            p3Var.z();
            Context context = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).r;
            synchronized (o3Var) {
                try {
                    if (o3Var.r) {
                        s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o3Var.t).s).w;
                        o1.m(s0Var);
                        s0Var.F.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (o3Var.s != null && (o3Var.s.c() || o3Var.s.g())) {
                            s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o3Var.t).s).w;
                            o1.m(s0Var2);
                            s0Var2.F.a("Already awaiting connection attempt");
                            return;
                        }
                        o3Var.s = new o0(context, Looper.getMainLooper(), c21.g0.a(context), z11.f.b, 93, o3Var, o3Var, null);
                        s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o3Var.t).s).w;
                        o1.m(s0Var3);
                        s0Var3.F.a("Connecting to remote service");
                        o3Var.r = true;
                        c21.uShadow.g(o3Var.s);
                        o3Var.s.o();
                        return;
                    }
                } finally {
                }
            }
        }
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (o1Var.u.C()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = o1Var.r.getPackageManager().queryIntentServices(new Intent().setClassName(o1Var.r, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            s0 s0Var4 = o1Var.w;
            o1.m(s0Var4);
            s0Var4.x.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(o1Var.r, "com.google.android.gms.measurement.AppMeasurementService"));
        o3 o3Var2 = this.u;
        p3 p3Var2 = o3Var2.t;
        p3Var2.z();
        Context context2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).r;
        f21.a b = f21.a.b();
        synchronized (o3Var2) {
            try {
                if (o3Var2.r) {
                    s0 s0Var5 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) o3Var2.t).s).w;
                    o1.m(s0Var5);
                    s0Var5.F.a("Connection attempt already in progress");
                } else {
                    p3 p3Var3 = o3Var2.t;
                    s0 s0Var6 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var3).s).w;
                    o1.m(s0Var6);
                    s0Var6.F.a("Using local app measurement service");
                    o3Var2.r = true;
                    b.a(context2, intent, p3Var3.u, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G() {
        z();
        A();
        if (this.w == null) {
            z();
            A();
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            c1 c1Var = o1Var.v;
            o1.k(c1Var);
            c1Var.z();
            boolean z = false;
            Boolean valueOf = !c1Var.D().contains("use_service") ? null : Boolean.valueOf(c1Var.D().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                k0 r = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r();
                r.A();
                if (r.E != 1) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.F.a("Checking service availability");
                    t4 t4Var = o1Var.z;
                    o1.k(t4Var);
                    int b = z11.f.b.b(((o1) ((androidx.compose.foundation.lazy.layout.s0) t4Var).s).r, 12451000);
                    if (b != 0) {
                        if (b == 1) {
                            s0 s0Var2 = o1Var.w;
                            o1.m(s0Var2);
                            s0Var2.F.a("Service missing");
                        } else if (b != 2) {
                            if (b == 3) {
                                s0 s0Var3 = o1Var.w;
                                o1.m(s0Var3);
                                s0Var3.A.a("Service disabled");
                            } else if (b == 9) {
                                s0 s0Var4 = o1Var.w;
                                o1.m(s0Var4);
                                s0Var4.A.a("Service invalid");
                            } else if (b != 18) {
                                s0 s0Var5 = o1Var.w;
                                o1.m(s0Var5);
                                s0Var5.A.b(Integer.valueOf(b), "Unexpected service status");
                            } else {
                                s0 s0Var6 = o1Var.w;
                                o1.m(s0Var6);
                                s0Var6.A.a("Service updating");
                            }
                            r2 = false;
                        } else {
                            s0 s0Var7 = o1Var.w;
                            o1.m(s0Var7);
                            s0Var7.E.a("Service container out of date");
                            t4 t4Var2 = o1Var.z;
                            o1.k(t4Var2);
                            if (t4Var2.g0() >= 17443) {
                                z = valueOf == null;
                                r2 = false;
                            }
                        }
                        if (z && o1Var.u.C()) {
                            s0 s0Var8 = o1Var.w;
                            o1.m(s0Var8);
                            s0Var8.x.a("No way to upload. Consider using the full version of Analytics");
                        } else if (r2) {
                            c1 c1Var2 = o1Var.v;
                            o1.k(c1Var2);
                            c1Var2.z();
                            SharedPreferences.Editor edit = c1Var2.D().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r2 = z;
                    } else {
                        s0 s0Var9 = o1Var.w;
                        o1.m(s0Var9);
                        s0Var9.F.a("Service available");
                    }
                }
                z = true;
                if (z) {
                }
                if (r2) {
                }
                r2 = z;
            }
            this.w = Boolean.valueOf(r2);
        }
        return this.w.booleanValue();
    }

    public final void H() {
        z();
        A();
        o3 o3Var = this.u;
        if (o3Var.s != null && (o3Var.s.g() || o3Var.s.c())) {
            o3Var.s.f();
        }
        o3Var.s = null;
        try {
            f21.a.b().c(((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r, o3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.v = null;
    }

    public final boolean I() {
        z();
        A();
        if (!G()) {
            return true;
        }
        t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).z;
        o1.k(t4Var);
        return t4Var.g0() >= ((Integer) c0.J0.a(null)).intValue();
    }

    public final boolean J() {
        z();
        A();
        if (!G()) {
            return true;
        }
        t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).z;
        o1.k(t4Var);
        return t4Var.g0() >= 241200;
    }

    public final void K(ComponentName componentName) {
        z();
        if (this.v != null) {
            this.v = null;
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.F.b(componentName, "Disconnected from device MeasurementService");
            z();
            F();
        }
    }

    public final void L() {
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
    }

    public final void M() {
        z();
        ba.c cVar = this.z;
        ((g21.a) cVar.t).getClass();
        cVar.s = SystemClock.elapsedRealtime();
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        this.x.b(((Long) c0.Y.a(null)).longValue());
    }

    public final void N(Runnable runnable) {
        z();
        if (Q()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.A;
        long size = arrayList.size();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var.getClass();
        if (size >= 1000) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.B.b(60000L);
            F();
        }
    }

    public final void O() {
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        q0 q0Var = s0Var.F;
        ArrayList arrayList = this.A;
        q0Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.B.c();
    }

    public final v4 P(boolean z) {
        long abs;
        Pair pair;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var.getClass();
        k0 r = o1Var.r();
        String str = null;
        if (z) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) s0Var).s;
            c1 c1Var = o1Var2.v;
            o1.k(c1Var);
            if (c1Var.w != null) {
                c1 c1Var2 = o1Var2.v;
                o1.k(c1Var2);
                b1 b1Var = c1Var2.w;
                c1 c1Var3 = (c1) b1Var.e;
                c1Var3.z();
                c1Var3.z();
                long j = ((c1) b1Var.e).D().getLong((String) b1Var.b, 0L);
                if (j == 0) {
                    b1Var.d();
                    abs = 0;
                } else {
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var3).s).B.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = b1Var.a;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        b1Var.d();
                    } else {
                        String string = c1Var3.D().getString((String) b1Var.d, null);
                        long j3 = c1Var3.D().getLong((String) b1Var.c, 0L);
                        b1Var.d();
                        pair = (string == null || j3 <= 0) ? c1.R : new Pair(string, Long.valueOf(j3));
                        if (pair != null && pair != c1.R) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = no.a.q(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = no.a.q(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return r.D(str);
    }

    public final boolean Q() {
        z();
        A();
        return this.v != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #58 {all -> 0x0480, blocks: (B:213:0x0470, B:236:0x0444, B:238:0x044a, B:239:0x044d, B:227:0x0491, B:355:0x037b, B:359:0x0385, B:360:0x0396), top: B:212:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #61 {all -> 0x0202, blocks: (B:183:0x01dd, B:186:0x01f1, B:188:0x01f6, B:197:0x021a, B:198:0x021d, B:195:0x0216, B:246:0x0223, B:249:0x0237, B:251:0x024f, B:254:0x0258, B:255:0x025b, B:257:0x0249, B:260:0x025f, B:263:0x0273, B:265:0x028b, B:270:0x0295, B:271:0x0298, B:268:0x0285, B:281:0x029c, B:289:0x02b0, B:291:0x02da, B:299:0x02e4, B:300:0x02e7, B:305:0x02d4, B:276:0x02f4, B:278:0x0301, B:352:0x0366), top: B:182:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0648  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(f0 f0Var, d21.a aVar, v4 v4Var) {
        ArrayList arrayList;
        o1 o1Var;
        Context context;
        s0 s0Var;
        int i;
        SQLiteDatabase sQLiteDatabase;
        String str;
        int i2;
        String str2;
        String str3;
        int i3;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        long j;
        String str4;
        String[] strArr;
        int i4;
        int i5;
        int i6;
        long j2;
        String str5;
        b0 b0Var;
        Parcel obtain;
        v vVar;
        int i7;
        f fVar;
        q4 q4Var;
        int i8;
        int size;
        int i9;
        o1 o1Var2;
        s0 s0Var2;
        int i10;
        String str6;
        long j3;
        long j4;
        Context context2;
        a5.s sVar;
        long currentTimeMillis;
        d21.a aVar2 = aVar;
        z();
        A();
        L();
        o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var3.getClass();
        Context context3 = o1Var3.r;
        s0 s0Var3 = o1Var3.w;
        g21.a aVar3 = o1Var3.B;
        h hVar = o1Var3.u;
        v4 v4Var2 = v4Var;
        int i12 = 100;
        int i13 = 0;
        for (int i14 = 100; i13 < 1001 && i12 == i14; i14 = 100) {
            ArrayList arrayList2 = new ArrayList();
            m0 o = o1Var3.o();
            int i15 = i14;
            String str7 = "entry";
            String str8 = "type";
            String str9 = "rowid";
            g21.a aVar4 = aVar3;
            o1 o1Var4 = (o1) ((androidx.compose.foundation.lazy.layout.s0) o).s;
            o.z();
            int i16 = i13;
            if (o.v) {
                o1Var = o1Var3;
                context = context3;
                s0Var = s0Var3;
            } else {
                arrayList = new ArrayList();
                o1Var = o1Var3;
                if (((o1) ((androidx.compose.foundation.lazy.layout.s0) o).s).r.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i17 = 5;
                    context = context3;
                    s0Var = s0Var3;
                    int i18 = 0;
                    int i19 = 5;
                    while (i18 < i17) {
                        try {
                            SQLiteDatabase F = o.F();
                            if (F == null) {
                                try {
                                    try {
                                        o.v = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        sQLiteDatabase = F;
                                        cursor = null;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    str = str9;
                                    i2 = i18;
                                    str3 = str7;
                                    sQLiteDatabase = F;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    try {
                                        SystemClock.sleep(i19);
                                        i19 += 20;
                                        if (cursor2 != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i18 = i2 + 1;
                                        i17 = i3;
                                        str8 = str2;
                                        str7 = str3;
                                        str9 = str;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursor2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    str = str9;
                                    i2 = i18;
                                    str3 = str7;
                                    sQLiteDatabase = F;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    s0 s0Var4 = o1Var4.w;
                                    o1.m(s0Var4);
                                    s0Var4.x.b(e, "Error reading entries from local database");
                                    o.v = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i18 = i2 + 1;
                                    i17 = i3;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    str = str9;
                                    i2 = i18;
                                    str3 = str7;
                                    sQLiteDatabase = F;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor2 = null;
                                    if (sQLiteDatabase != null) {
                                    }
                                    s0 s0Var5 = o1Var4.w;
                                    o1.m(s0Var5);
                                    s0Var5.x.b(e, "Error reading entries from local database");
                                    o.v = true;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i18 = i2 + 1;
                                    i17 = i3;
                                    str8 = str2;
                                    str7 = str3;
                                    str9 = str;
                                }
                            } else {
                                F.beginTransaction();
                                try {
                                    cursor3 = F.query("messages", new String[]{str9}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                    try {
                                        long j5 = -1;
                                        if (cursor3.moveToFirst()) {
                                            i2 = i18;
                                            try {
                                                j = cursor3.getLong(0);
                                                try {
                                                    cursor3.close();
                                                } catch (SQLiteDatabaseLockedException unused2) {
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = F;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i19);
                                                    i19 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e3) {
                                                    e = e3;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = F;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    s0 s0Var42 = o1Var4.w;
                                                    o1.m(s0Var42);
                                                    s0Var42.x.b(e, "Error reading entries from local database");
                                                    o.v = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e4) {
                                                    e = e4;
                                                    str = str9;
                                                    str3 = str7;
                                                    sQLiteDatabase = F;
                                                    i3 = 5;
                                                    str2 = str8;
                                                    cursor2 = null;
                                                    if (sQLiteDatabase != null) {
                                                    }
                                                    s0 s0Var52 = o1Var4.w;
                                                    o1.m(s0Var52);
                                                    s0Var52.x.b(e, "Error reading entries from local database");
                                                    o.v = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str = str9;
                                                str3 = str7;
                                                sQLiteDatabase = F;
                                                i3 = 5;
                                                str2 = str8;
                                                if (cursor3 != null) {
                                                    try {
                                                        cursor3.close();
                                                    } catch (SQLiteDatabaseLockedException unused3) {
                                                        cursor2 = null;
                                                        SystemClock.sleep(i19);
                                                        i19 += 20;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i2 + 1;
                                                        i17 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteFullException e5) {
                                                        e = e5;
                                                        cursor2 = null;
                                                        s0 s0Var422 = o1Var4.w;
                                                        o1.m(s0Var422);
                                                        s0Var422.x.b(e, "Error reading entries from local database");
                                                        o.v = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i2 + 1;
                                                        i17 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (SQLiteException e6) {
                                                        e = e6;
                                                        cursor2 = null;
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        s0 s0Var522 = o1Var4.w;
                                                        o1.m(s0Var522);
                                                        s0Var522.x.b(e, "Error reading entries from local database");
                                                        o.v = true;
                                                        if (cursor2 != null) {
                                                        }
                                                        if (sQLiteDatabase == null) {
                                                        }
                                                        sQLiteDatabase.close();
                                                        i18 = i2 + 1;
                                                        i17 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        cursor = null;
                                                        if (cursor != null) {
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                        }
                                                        throw th;
                                                    }
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i2 = i18;
                                            cursor3.close();
                                            j = -1;
                                        }
                                        if (j != -1) {
                                            str4 = "rowid<?";
                                            strArr = new String[]{String.valueOf(j)};
                                        } else {
                                            str4 = null;
                                            strArr = null;
                                        }
                                        try {
                                            String[] strArr2 = {str9, str8, str7};
                                            h hVar2 = o1Var4.u;
                                            b0 b0Var2 = c0.b1;
                                            str = str9;
                                            try {
                                                try {
                                                    i4 = 4;
                                                    i5 = 3;
                                                    if (hVar2.J(null, b0Var2)) {
                                                        i6 = 5;
                                                        try {
                                                            strArr2 = new String[]{str, str8, str7, "app_version", "app_version_int"};
                                                        } catch (SQLiteDatabaseLockedException unused4) {
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = F;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            SystemClock.sleep(i19);
                                                            i19 += 20;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i18 = i2 + 1;
                                                            i17 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteFullException e7) {
                                                            e = e7;
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = F;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            s0 s0Var4222 = o1Var4.w;
                                                            o1.m(s0Var4222);
                                                            s0Var4222.x.b(e, "Error reading entries from local database");
                                                            o.v = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i18 = i2 + 1;
                                                            i17 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        } catch (SQLiteException e8) {
                                                            e = e8;
                                                            i3 = 5;
                                                            str3 = str7;
                                                            sQLiteDatabase = F;
                                                            str2 = str8;
                                                            cursor2 = null;
                                                            if (sQLiteDatabase != null) {
                                                            }
                                                            s0 s0Var5222 = o1Var4.w;
                                                            o1.m(s0Var5222);
                                                            s0Var5222.x.b(e, "Error reading entries from local database");
                                                            o.v = true;
                                                            if (cursor2 != null) {
                                                            }
                                                            if (sQLiteDatabase == null) {
                                                            }
                                                            sQLiteDatabase.close();
                                                            i18 = i2 + 1;
                                                            i17 = i3;
                                                            str8 = str2;
                                                            str7 = str3;
                                                            str9 = str;
                                                        }
                                                    } else {
                                                        i6 = 5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused5) {
                                                    str3 = str7;
                                                    sQLiteDatabase = F;
                                                    str2 = str8;
                                                    i3 = 5;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i19);
                                                    i19 += 20;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                        i18 = i2 + 1;
                                                        i17 = i3;
                                                        str8 = str2;
                                                        str7 = str3;
                                                        str9 = str;
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                                try {
                                                    Cursor query = F.query("messages", strArr2, str4, strArr, null, null, "rowid asc", Integer.toString(i15));
                                                    while (query.moveToNext()) {
                                                        try {
                                                            try {
                                                                try {
                                                                    j5 = query.getLong(0);
                                                                    try {
                                                                        int i20 = query.getInt(1);
                                                                        str2 = str8;
                                                                        try {
                                                                            byte[] blob = query.getBlob(2);
                                                                            str3 = str7;
                                                                            try {
                                                                                if (o1Var4.u.J(null, b0Var2)) {
                                                                                    try {
                                                                                        str5 = query.getString(i5);
                                                                                        cursor2 = query;
                                                                                        j2 = query.getLong(i4);
                                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        SystemClock.sleep(i19);
                                                                                        i19 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e9) {
                                                                                        e = e9;
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        s0 s0Var42222 = o1Var4.w;
                                                                                        o1.m(s0Var42222);
                                                                                        s0Var42222.x.b(e, "Error reading entries from local database");
                                                                                        o.v = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e10) {
                                                                                        e = e10;
                                                                                        cursor2 = query;
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        if (sQLiteDatabase != null) {
                                                                                        }
                                                                                        s0 s0Var52222 = o1Var4.w;
                                                                                        o1.m(s0Var52222);
                                                                                        s0Var52222.x.b(e, "Error reading entries from local database");
                                                                                        o.v = true;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    cursor2 = query;
                                                                                    j2 = 0;
                                                                                    str5 = null;
                                                                                }
                                                                                if (i20 == 0) {
                                                                                    b0Var = b0Var2;
                                                                                    try {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    obtain.unmarshall(blob, 0, blob.length);
                                                                                                    obtain.setDataPosition(0);
                                                                                                    w createFromParcel = w.CREATOR.createFromParcel(obtain);
                                                                                                    if (createFromParcel != null) {
                                                                                                        arrayList.add(new l0(createFromParcel, str5, j2));
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused7) {
                                                                                                    s0 s0Var6 = o1Var4.w;
                                                                                                    o1.m(s0Var6);
                                                                                                    s0Var6.x.a("Failed to load event from local database");
                                                                                                    obtain.recycle();
                                                                                                }
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (Throwable th5) {
                                                                                            th = th5;
                                                                                            sQLiteDatabase = F;
                                                                                            cursor = cursor2;
                                                                                            if (cursor != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteDatabaseLockedException unused8) {
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        SystemClock.sleep(i19);
                                                                                        i19 += 20;
                                                                                        if (cursor2 != null) {
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteFullException e12) {
                                                                                        e = e12;
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        s0 s0Var422222 = o1Var4.w;
                                                                                        o1.m(s0Var422222);
                                                                                        s0Var422222.x.b(e, "Error reading entries from local database");
                                                                                        o.v = true;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    } catch (SQLiteException e13) {
                                                                                        e = e13;
                                                                                        sQLiteDatabase = F;
                                                                                        i3 = 5;
                                                                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                                                                            sQLiteDatabase.endTransaction();
                                                                                        }
                                                                                        s0 s0Var522222 = o1Var4.w;
                                                                                        o1.m(s0Var522222);
                                                                                        s0Var522222.x.b(e, "Error reading entries from local database");
                                                                                        o.v = true;
                                                                                        if (cursor2 != null) {
                                                                                            cursor2.close();
                                                                                        }
                                                                                        if (sQLiteDatabase == null) {
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        sQLiteDatabase.close();
                                                                                        i18 = i2 + 1;
                                                                                        i17 = i3;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        str9 = str;
                                                                                    }
                                                                                } else {
                                                                                    b0Var = b0Var2;
                                                                                    if (i20 == 1) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                q4Var = q4.CREATOR.createFromParcel(obtain);
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (SafeParcelReader$ParseException unused9) {
                                                                                            s0 s0Var7 = o1Var4.w;
                                                                                            o1.m(s0Var7);
                                                                                            s0Var7.x.a("Failed to load user property from local database");
                                                                                            obtain.recycle();
                                                                                            q4Var = null;
                                                                                        }
                                                                                        if (q4Var != null) {
                                                                                            arrayList.add(new l0(q4Var, str5, j2));
                                                                                        }
                                                                                    } else if (i20 == 2) {
                                                                                        obtain = Parcel.obtain();
                                                                                        try {
                                                                                            try {
                                                                                                obtain.unmarshall(blob, 0, blob.length);
                                                                                                obtain.setDataPosition(0);
                                                                                                fVar = f.CREATOR.createFromParcel(obtain);
                                                                                            } catch (SafeParcelReader$ParseException unused10) {
                                                                                                s0 s0Var8 = o1Var4.w;
                                                                                                o1.m(s0Var8);
                                                                                                s0Var8.x.a("Failed to load conditional user property from local database");
                                                                                                obtain.recycle();
                                                                                                fVar = null;
                                                                                            }
                                                                                            if (fVar != null) {
                                                                                                arrayList.add(new l0(fVar, str5, j2));
                                                                                            }
                                                                                        } finally {
                                                                                        }
                                                                                    } else if (i20 == 4) {
                                                                                        try {
                                                                                            obtain = Parcel.obtain();
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        obtain.unmarshall(blob, 0, blob.length);
                                                                                                        obtain.setDataPosition(0);
                                                                                                        vVar = v.CREATOR.createFromParcel(obtain);
                                                                                                    } catch (Throwable th6) {
                                                                                                        th = th6;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SafeParcelReader$ParseException unused11) {
                                                                                                    s0 s0Var9 = o1Var4.w;
                                                                                                    o1.m(s0Var9);
                                                                                                    s0Var9.x.a("Failed to load default event parameters from local database");
                                                                                                    obtain.recycle();
                                                                                                    vVar = null;
                                                                                                    if (vVar != null) {
                                                                                                    }
                                                                                                    i7 = 3;
                                                                                                    i5 = i7;
                                                                                                    str8 = str2;
                                                                                                    str7 = str3;
                                                                                                    query = cursor2;
                                                                                                    b0Var2 = b0Var;
                                                                                                    i4 = 4;
                                                                                                }
                                                                                            } catch (SafeParcelReader$ParseException unused12) {
                                                                                            } catch (Throwable th7) {
                                                                                                th = th7;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused13) {
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i19);
                                                                                            i19 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e14) {
                                                                                            e = e14;
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            s0 s0Var4222222 = o1Var4.w;
                                                                                            o1.m(s0Var4222222);
                                                                                            s0Var4222222.x.b(e, "Error reading entries from local database");
                                                                                            o.v = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            s0 s0Var5222222 = o1Var4.w;
                                                                                            o1.m(s0Var5222222);
                                                                                            s0Var5222222.x.b(e, "Error reading entries from local database");
                                                                                            o.v = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                        try {
                                                                                            if (vVar != null) {
                                                                                                arrayList.add(new l0(vVar, str5, j2));
                                                                                            }
                                                                                            i7 = 3;
                                                                                            i5 = i7;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            query = cursor2;
                                                                                            b0Var2 = b0Var;
                                                                                            i4 = 4;
                                                                                        } catch (SQLiteDatabaseLockedException unused14) {
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            SystemClock.sleep(i19);
                                                                                            i19 += 20;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteFullException e16) {
                                                                                            e = e16;
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            s0 s0Var42222222 = o1Var4.w;
                                                                                            o1.m(s0Var42222222);
                                                                                            s0Var42222222.x.b(e, "Error reading entries from local database");
                                                                                            o.v = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        } catch (SQLiteException e17) {
                                                                                            e = e17;
                                                                                            sQLiteDatabase = F;
                                                                                            i3 = 5;
                                                                                            if (sQLiteDatabase != null) {
                                                                                            }
                                                                                            s0 s0Var52222222 = o1Var4.w;
                                                                                            o1.m(s0Var52222222);
                                                                                            s0Var52222222.x.b(e, "Error reading entries from local database");
                                                                                            o.v = true;
                                                                                            if (cursor2 != null) {
                                                                                            }
                                                                                            if (sQLiteDatabase == null) {
                                                                                            }
                                                                                            sQLiteDatabase.close();
                                                                                            i18 = i2 + 1;
                                                                                            i17 = i3;
                                                                                            str8 = str2;
                                                                                            str7 = str3;
                                                                                            str9 = str;
                                                                                        }
                                                                                    } else {
                                                                                        i7 = 3;
                                                                                        if (i20 == 3) {
                                                                                            s0 s0Var10 = o1Var4.w;
                                                                                            o1.m(s0Var10);
                                                                                            s0Var10.F.a("Skipping app launch break");
                                                                                        } else {
                                                                                            s0 s0Var11 = o1Var4.w;
                                                                                            o1.m(s0Var11);
                                                                                            s0Var11.x.a("Unknown record type in local database");
                                                                                        }
                                                                                        i5 = i7;
                                                                                        str8 = str2;
                                                                                        str7 = str3;
                                                                                        query = cursor2;
                                                                                        b0Var2 = b0Var;
                                                                                        i4 = 4;
                                                                                    }
                                                                                }
                                                                                i7 = 3;
                                                                                i5 = i7;
                                                                                str8 = str2;
                                                                                str7 = str3;
                                                                                query = cursor2;
                                                                                b0Var2 = b0Var;
                                                                                i4 = 4;
                                                                            } catch (SQLiteDatabaseLockedException unused15) {
                                                                                cursor2 = query;
                                                                            } catch (SQLiteFullException e18) {
                                                                                e = e18;
                                                                                cursor2 = query;
                                                                            } catch (SQLiteException e19) {
                                                                                e = e19;
                                                                                cursor2 = query;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused16) {
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = F;
                                                                            i3 = 5;
                                                                            SystemClock.sleep(i19);
                                                                            i19 += 20;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i18 = i2 + 1;
                                                                            i17 = i3;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        } catch (SQLiteFullException e20) {
                                                                            e = e20;
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = F;
                                                                            i3 = 5;
                                                                            s0 s0Var422222222 = o1Var4.w;
                                                                            o1.m(s0Var422222222);
                                                                            s0Var422222222.x.b(e, "Error reading entries from local database");
                                                                            o.v = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i18 = i2 + 1;
                                                                            i17 = i3;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        } catch (SQLiteException e22) {
                                                                            e = e22;
                                                                            cursor2 = query;
                                                                            str3 = str7;
                                                                            sQLiteDatabase = F;
                                                                            i3 = 5;
                                                                            if (sQLiteDatabase != null) {
                                                                            }
                                                                            s0 s0Var522222222 = o1Var4.w;
                                                                            o1.m(s0Var522222222);
                                                                            s0Var522222222.x.b(e, "Error reading entries from local database");
                                                                            o.v = true;
                                                                            if (cursor2 != null) {
                                                                            }
                                                                            if (sQLiteDatabase == null) {
                                                                            }
                                                                            sQLiteDatabase.close();
                                                                            i18 = i2 + 1;
                                                                            i17 = i3;
                                                                            str8 = str2;
                                                                            str7 = str3;
                                                                            str9 = str;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused17) {
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    } catch (SQLiteFullException e23) {
                                                                        e = e23;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    } catch (SQLiteException e24) {
                                                                        e = e24;
                                                                        cursor2 = query;
                                                                        str2 = str8;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursor2 = query;
                                                                    str2 = str8;
                                                                    str3 = str7;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                cursor2 = query;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused19) {
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        } catch (SQLiteFullException e27) {
                                                            e = e27;
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        } catch (SQLiteException e28) {
                                                            e = e28;
                                                            cursor2 = query;
                                                            str2 = str8;
                                                            str3 = str7;
                                                        }
                                                    }
                                                    cursor2 = query;
                                                    str2 = str8;
                                                    str3 = str7;
                                                    i = 0;
                                                    sQLiteDatabase = F;
                                                } catch (SQLiteDatabaseLockedException unused20) {
                                                    str3 = str7;
                                                    sQLiteDatabase = F;
                                                    str2 = str8;
                                                    i3 = i6;
                                                    cursor2 = null;
                                                    SystemClock.sleep(i19);
                                                    i19 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                                try {
                                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j5)}) < arrayList.size()) {
                                                        s0 s0Var12 = o1Var4.w;
                                                        o1.m(s0Var12);
                                                        s0Var12.x.a("Fewer entries removed from local database than expected");
                                                    }
                                                    sQLiteDatabase.setTransactionSuccessful();
                                                    sQLiteDatabase.endTransaction();
                                                    cursor2.close();
                                                    sQLiteDatabase.close();
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    i3 = 5;
                                                    SystemClock.sleep(i19);
                                                    i19 += 20;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    i3 = 5;
                                                    s0 s0Var4222222222 = o1Var4.w;
                                                    o1.m(s0Var4222222222);
                                                    s0Var4222222222.x.b(e, "Error reading entries from local database");
                                                    o.v = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    i3 = 5;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    s0 s0Var5222222222 = o1Var4.w;
                                                    o1.m(s0Var5222222222);
                                                    s0Var5222222222.x.b(e, "Error reading entries from local database");
                                                    o.v = true;
                                                    if (cursor2 != null) {
                                                    }
                                                    if (sQLiteDatabase == null) {
                                                    }
                                                    sQLiteDatabase.close();
                                                    i18 = i2 + 1;
                                                    i17 = i3;
                                                    str8 = str2;
                                                    str7 = str3;
                                                    str9 = str;
                                                }
                                            } catch (SQLiteFullException e32) {
                                                e = e32;
                                                str3 = str7;
                                                sQLiteDatabase = F;
                                                str2 = str8;
                                                i3 = 5;
                                                cursor2 = null;
                                                s0 s0Var42222222222 = o1Var4.w;
                                                o1.m(s0Var42222222222);
                                                s0Var42222222222.x.b(e, "Error reading entries from local database");
                                                o.v = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i18 = i2 + 1;
                                                i17 = i3;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            } catch (SQLiteException e33) {
                                                e = e33;
                                                str3 = str7;
                                                sQLiteDatabase = F;
                                                str2 = str8;
                                                i3 = 5;
                                                cursor2 = null;
                                                if (sQLiteDatabase != null) {
                                                }
                                                s0 s0Var52222222222 = o1Var4.w;
                                                o1.m(s0Var52222222222);
                                                s0Var52222222222.x.b(e, "Error reading entries from local database");
                                                o.v = true;
                                                if (cursor2 != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i18 = i2 + 1;
                                                i17 = i3;
                                                str8 = str2;
                                                str7 = str3;
                                                str9 = str;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused22) {
                                            str = str9;
                                        } catch (SQLiteFullException e34) {
                                            e = e34;
                                            str = str9;
                                        } catch (SQLiteException e35) {
                                            e = e35;
                                            str = str9;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        i2 = i18;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    str = str9;
                                    i2 = i18;
                                    str3 = str7;
                                    sQLiteDatabase = F;
                                    i3 = 5;
                                    str2 = str8;
                                    cursor3 = null;
                                }
                            }
                        } catch (SQLiteDatabaseLockedException unused23) {
                            str = str9;
                            i2 = i18;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteFullException e36) {
                            e = e36;
                            str = str9;
                            i2 = i18;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (SQLiteException e37) {
                            e = e37;
                            str = str9;
                            i2 = i18;
                            str2 = str8;
                            str3 = str7;
                            i3 = 5;
                            sQLiteDatabase = null;
                        } catch (Throwable th11) {
                            th = th11;
                            sQLiteDatabase = null;
                        }
                    }
                    i = 0;
                    s0 s0Var13 = o1Var4.w;
                    o1.m(s0Var13);
                    s0Var13.A.a("Failed to read events from database in reasonable time");
                    arrayList = null;
                } else {
                    context = context3;
                    s0Var = s0Var3;
                    i = 0;
                }
                if (arrayList == null) {
                    arrayList2.addAll(arrayList);
                    i8 = arrayList.size();
                } else {
                    i8 = i;
                }
                if (aVar2 != null && i8 < i15) {
                    arrayList2.add(new l0(aVar2, v4Var2.t, v4Var2.A));
                }
                String str10 = null;
                boolean J = hVar.J(null, c0.O0);
                size = arrayList2.size();
                i9 = i;
                while (i9 < size) {
                    l0 l0Var = (l0) arrayList2.get(i9);
                    d21.a aVar5 = l0Var.a;
                    b0 b0Var3 = c0.b1;
                    if (hVar.J(str10, b0Var3)) {
                        String str11 = l0Var.b;
                        if (!TextUtils.isEmpty(str11)) {
                            v4Var2 = new v4(v4Var2.r, v4Var2.s, str11, l0Var.c, v4Var2.u, v4Var2.v, v4Var2.w, v4Var2.x, v4Var2.y, v4Var2.z, v4Var2.B, v4Var2.C, v4Var2.D, v4Var2.E, v4Var2.F, v4Var2.G, v4Var2.H, v4Var2.I, v4Var2.J, v4Var2.K, v4Var2.L, v4Var2.M, v4Var2.N, v4Var2.O, v4Var2.P, v4Var2.Q, v4Var2.R, v4Var2.S, v4Var2.T, v4Var2.U, v4Var2.V);
                        }
                    }
                    if (aVar5 instanceof w) {
                        if (J) {
                            try {
                                aVar4.getClass();
                                long currentTimeMillis2 = System.currentTimeMillis();
                                try {
                                    aVar4.getClass();
                                    j4 = currentTimeMillis2;
                                    j3 = SystemClock.elapsedRealtime();
                                } catch (RemoteException e38) {
                                    e = e38;
                                    j4 = currentTimeMillis2;
                                    j3 = 0;
                                    o1Var2 = o1Var;
                                    context2 = context;
                                    s0Var2 = s0Var;
                                    i10 = i8;
                                    o1.m(s0Var2);
                                    s0Var2.x.b(e, "Failed to send event to the service");
                                    if (J) {
                                    }
                                    context = context2;
                                    str6 = null;
                                    i9++;
                                    o1Var = o1Var2;
                                    str10 = str6;
                                    i8 = i10;
                                    s0Var = s0Var2;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                j3 = 0;
                                j4 = 0;
                            }
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        try {
                            try {
                                f0Var.r((w) aVar5, v4Var2);
                            } catch (RemoteException e40) {
                                e = e40;
                                o1Var2 = o1Var;
                                context2 = context;
                                s0Var2 = s0Var;
                                i10 = i8;
                                o1.m(s0Var2);
                                s0Var2.x.b(e, "Failed to send event to the service");
                                if (J) {
                                    if (a5.s.v == null) {
                                    }
                                    a5.s sVar2 = a5.s.v;
                                    aVar4.getClass();
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    aVar4.getClass();
                                    sVar2.J(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis3);
                                }
                                context = context2;
                                str6 = null;
                                i9++;
                                o1Var = o1Var2;
                                str10 = str6;
                                i8 = i10;
                                s0Var = s0Var2;
                            }
                        } catch (RemoteException e42) {
                            e = e42;
                        }
                        if (J) {
                            o1.m(s0Var);
                            s0Var2 = s0Var;
                            try {
                                s0Var2.F.a("Logging telemetry for logEvent from database");
                                if (a5.s.v == null) {
                                    try {
                                        o1Var2 = o1Var;
                                        context2 = context;
                                        try {
                                            a5.s.v = new a5.s(context2, o1Var2);
                                        } catch (RemoteException e43) {
                                            e = e43;
                                            i10 = i8;
                                            o1.m(s0Var2);
                                            s0Var2.x.b(e, "Failed to send event to the service");
                                            if (J && j4 != 0) {
                                                if (a5.s.v == null) {
                                                    a5.s.v = new a5.s(context2, o1Var2);
                                                }
                                                a5.s sVar22 = a5.s.v;
                                                aVar4.getClass();
                                                long currentTimeMillis32 = System.currentTimeMillis();
                                                aVar4.getClass();
                                                sVar22.J(13, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis32);
                                            }
                                            context = context2;
                                            str6 = null;
                                            i9++;
                                            o1Var = o1Var2;
                                            str10 = str6;
                                            i8 = i10;
                                            s0Var = s0Var2;
                                        }
                                    } catch (RemoteException e44) {
                                        e = e44;
                                        o1Var2 = o1Var;
                                        context2 = context;
                                        i10 = i8;
                                        o1.m(s0Var2);
                                        s0Var2.x.b(e, "Failed to send event to the service");
                                        if (J) {
                                        }
                                        context = context2;
                                        str6 = null;
                                        i9++;
                                        o1Var = o1Var2;
                                        str10 = str6;
                                        i8 = i10;
                                        s0Var = s0Var2;
                                    }
                                } else {
                                    o1Var2 = o1Var;
                                    context2 = context;
                                }
                                sVar = a5.s.v;
                                aVar4.getClass();
                                currentTimeMillis = System.currentTimeMillis();
                                aVar4.getClass();
                                i10 = i8;
                            } catch (RemoteException e45) {
                                e = e45;
                                i10 = i8;
                                o1Var2 = o1Var;
                                context2 = context;
                            }
                            try {
                                sVar.J(0, (int) (SystemClock.elapsedRealtime() - j3), j4, currentTimeMillis);
                            } catch (RemoteException e46) {
                                e = e46;
                                o1.m(s0Var2);
                                s0Var2.x.b(e, "Failed to send event to the service");
                                if (J) {
                                }
                                context = context2;
                                str6 = null;
                                i9++;
                                o1Var = o1Var2;
                                str10 = str6;
                                i8 = i10;
                                s0Var = s0Var2;
                            }
                            context = context2;
                        } else {
                            o1Var2 = o1Var;
                            s0Var2 = s0Var;
                            i10 = i8;
                        }
                    } else {
                        o1Var2 = o1Var;
                        s0Var2 = s0Var;
                        i10 = i8;
                        if (aVar5 instanceof q4) {
                            try {
                                f0Var.x((q4) aVar5, v4Var2);
                            } catch (RemoteException e47) {
                                o1.m(s0Var2);
                                s0Var2.x.b(e47, "Failed to send user property to the service");
                            }
                        } else if (aVar5 instanceof f) {
                            try {
                                f0Var.j((f) aVar5, v4Var2);
                            } catch (RemoteException e48) {
                                o1.m(s0Var2);
                                s0Var2.x.b(e48, "Failed to send conditional user property to the service");
                            }
                        } else {
                            str6 = null;
                            if (hVar.J(null, b0Var3) && (aVar5 instanceof v)) {
                                try {
                                    f0Var.z(((v) aVar5).C(), v4Var2);
                                } catch (RemoteException e49) {
                                    o1.m(s0Var2);
                                    s0Var2.x.b(e49, "Failed to send default event parameters to the service");
                                }
                            } else {
                                o1.m(s0Var2);
                                s0Var2.x.a("Discarding data. Unrecognized parcel type.");
                            }
                            i9++;
                            o1Var = o1Var2;
                            str10 = str6;
                            i8 = i10;
                            s0Var = s0Var2;
                        }
                    }
                    str6 = null;
                    i9++;
                    o1Var = o1Var2;
                    str10 = str6;
                    i8 = i10;
                    s0Var = s0Var2;
                }
                i13 = i16 + 1;
                aVar2 = aVar;
                s0Var3 = s0Var;
                o1Var3 = o1Var;
                aVar3 = aVar4;
                context3 = context;
                i12 = i8;
            }
            i = 0;
            arrayList = null;
            if (arrayList == null) {
            }
            if (aVar2 != null) {
                arrayList2.add(new l0(aVar2, v4Var2.t, v4Var2.A));
            }
            String str102 = null;
            boolean J2 = hVar.J(null, c0.O0);
            size = arrayList2.size();
            i9 = i;
            while (i9 < size) {
            }
            i13 = i16 + 1;
            aVar2 = aVar;
            s0Var3 = s0Var;
            o1Var3 = o1Var;
            aVar3 = aVar4;
            context3 = context;
            i12 = i8;
        }
    }

    public final void S(f fVar) {
        boolean G;
        z();
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1Var.getClass();
        m0 o = o1Var.o();
        o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) o).s;
        o1.k(o1Var2.z);
        byte[] e0 = t4.e0(fVar);
        if (e0.length > 131072) {
            s0 s0Var = o1Var2.w;
            o1.m(s0Var);
            s0Var.y.a("Conditional user property too long for local database. Sending directly to service");
            G = false;
        } else {
            G = o.G(2, e0);
        }
        N(new j3(this, P(true), G, new f(fVar)));
    }
}
