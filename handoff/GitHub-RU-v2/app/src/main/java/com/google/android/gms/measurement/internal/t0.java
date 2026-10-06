package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public final /* synthetic */ int a = 0;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public t0(long j, Bundle bundle, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }

    public static t0 c(w wVar) {
        String str = wVar.r;
        String str2 = wVar.t;
        return new t0(wVar.u, wVar.s.C(), str, str2);
    }

    public int a(u81.n nVar, long j) {
        TimeZone timeZone = r81.g.a;
        ArrayList arrayList = nVar.q;
        int i = 0;
        while (i < arrayList.size()) {
            u81.k kVar = (Reference) arrayList.get(i);
            if (kVar.get() != null) {
                i++;
            } else {
                String str = "A connection to " + nVar.c.a.h + " was leaked. Did you forget to close a response body?";
                a91.e eVar = a91.e.a;
                a91.e.a.k(kVar.a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    nVar.r = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.gms.internal.measurement.b3 b(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        Object th = null;
        Cursor cursor;
        com.google.android.gms.internal.measurement.b3 b3Var2;
        long j;
        Cursor cursor2;
        Pair pair;
        Object obj;
        Pair pair2;
        String s = b3Var.s();
        List p = b3Var.p();
        d dVar = (d) this.e;
        o4 o4Var = dVar.t;
        o4 o4Var2 = dVar.t;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) dVar).s;
        o4Var.j0();
        com.google.android.gms.internal.measurement.e3 H = w0.H(b3Var, "_eid");
        Long l = (Long) (H == null ? null : w0.O(H));
        if (l != null) {
            if (s.equals("_ep")) {
                o4Var.j0();
                com.google.android.gms.internal.measurement.e3 H2 = w0.H(b3Var, "_en");
                String str2 = (String) (H2 == null ? null : w0.O(H2));
                if (TextUtils.isEmpty(str2)) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.y.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((com.google.android.gms.internal.measurement.b3) this.c) == null || ((Long) this.d) == null || l.longValue() != ((Long) this.d).longValue()) {
                    o oVar = o4Var.t;
                    o4.U(oVar);
                    o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                    oVar.z();
                    oVar.A();
                    try {
                        cursor2 = oVar.o0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    b3Var2 = null;
                                    try {
                                        try {
                                            Pair create = Pair.create((com.google.android.gms.internal.measurement.b3) ((com.google.android.gms.internal.measurement.a3) w0.m0(com.google.android.gms.internal.measurement.b3.z(), cursor2.getBlob(0))).e(), Long.valueOf(cursor2.getLong(1)));
                                            cursor2.close();
                                            pair2 = create;
                                        } catch (SQLiteException e) {
                                            e = e;
                                            j = 0;
                                            s0 s0Var2 = o1Var2.w;
                                            o1.m(s0Var2);
                                            s0Var2.x.b(e, "Error selecting main event");
                                        }
                                    } catch (IOException e2) {
                                        s0 s0Var3 = o1Var2.w;
                                        o1.m(s0Var3);
                                        j = 0;
                                        try {
                                            s0Var3.x.d("Failed to merge main event. appId, eventId", s0.H(str), l, e2);
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            s0 s0Var22 = o1Var2.w;
                                            o1.m(s0Var22);
                                            s0Var22.x.b(e, "Error selecting main event");
                                        }
                                        cursor2.close();
                                        pair = b3Var2;
                                        if (pair != 0) {
                                        }
                                        s0 s0Var4 = o1Var.w;
                                        o1.m(s0Var4);
                                        s0Var4.y.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return b3Var2;
                                    }
                                } else {
                                    s0 s0Var5 = o1Var2.w;
                                    o1.m(s0Var5);
                                    s0Var5.F.a("Main event not found");
                                    cursor2.close();
                                    pair2 = null;
                                    b3Var2 = null;
                                }
                                j = 0;
                                pair = pair2;
                            } catch (SQLiteException e4) {
                                e = e4;
                                b3Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        b3Var2 = null;
                        j = 0;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        s0 s0Var42 = o1Var.w;
                        o1.m(s0Var42);
                        s0Var42.y.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return b3Var2;
                    }
                    this.c = (com.google.android.gms.internal.measurement.b3) obj;
                    this.b = ((Long) pair.second).longValue();
                    o4Var2.j0();
                    this.d = (Long) w0.I((com.google.android.gms.internal.measurement.b3) this.c, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.b - 1;
                this.b = j2;
                if (j2 <= j) {
                    o oVar2 = o4Var2.t;
                    o4.U(oVar2);
                    o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar2).s;
                    oVar2.z();
                    s0 s0Var6 = o1Var3.w;
                    o1.m(s0Var6);
                    s0Var6.F.b(str, "Clearing complex main event info. appId");
                    try {
                        oVar2.o0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        s0 s0Var7 = o1Var3.w;
                        o1.m(s0Var7);
                        s0Var7.x.b(e6, "Error clearing complex main event");
                    }
                } else {
                    o oVar3 = o4Var2.t;
                    o4.U(oVar3);
                    oVar3.Q(str, l, this.b, (com.google.android.gms.internal.measurement.b3) this.c);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.e3 e3Var : ((com.google.android.gms.internal.measurement.b3) this.c).p()) {
                    o4Var2.j0();
                    if (w0.H(b3Var, e3Var.q()) == null) {
                        arrayList.add(e3Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0 s0Var8 = o1Var.w;
                    o1.m(s0Var8);
                    s0Var8.y.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(p);
                    p = arrayList;
                }
                s = str2;
            } else {
                this.d = l;
                this.c = b3Var;
                o4Var.j0();
                com.google.android.gms.internal.measurement.e3 H3 = w0.H(b3Var, "_epc");
                Object O = H3 == null ? null : w0.O(H3);
                long longValue = ((Long) (O != null ? O : 0L)).longValue();
                this.b = longValue;
                if (longValue <= 0) {
                    s0 s0Var9 = o1Var.w;
                    o1.m(s0Var9);
                    s0Var9.y.b(s, "Complex event with zero extra param count. eventName");
                } else {
                    o oVar4 = o4Var.t;
                    o4.U(oVar4);
                    oVar4.Q(str, l, this.b, b3Var);
                }
            }
        }
        com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) b3Var.i();
        a3Var.b();
        ((com.google.android.gms.internal.measurement.b3) a3Var.s).F(s);
        a3Var.b();
        ((com.google.android.gms.internal.measurement.b3) a3Var.s).D();
        a3Var.b();
        ((com.google.android.gms.internal.measurement.b3) a3Var.s).C(p);
        return (com.google.android.gms.internal.measurement.b3) a3Var.e();
    }

    public w d() {
        return new w((String) this.c, new v(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String str = (String) this.d;
                String obj = ((Bundle) this.e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.c;
                StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
                f1.e.x(sb, "origin=", str, ",name=", str2);
                return com.github.rudroid.copilot.h1.p(sb, ",params=", obj);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t0(d dVar) {
        this.e = dVar;
    }

    public t0(t81.e eVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        k71.k.g(eVar, "taskRunner");
        k71.k.g(timeUnit, "timeUnit");
        this.b = timeUnit.toNanos(5L);
        this.c = eVar.d();
        this.d = new g91.e(this, com.github.rudroid.copilot.h1.p(new StringBuilder(), r81.g.b, " ConnectionPool connection closer"));
        this.e = new ConcurrentLinkedQueue();
    }
}
