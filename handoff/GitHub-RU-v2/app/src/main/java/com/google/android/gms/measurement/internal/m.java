package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public final Object a;
    public long b;
    public final Object c;

    public m(o oVar, String str) {
        this.c = oVar;
        c21.u.d(str);
        this.a = str;
        this.b = -1L;
    }

    public void a(long j, long j2) {
        ((r2.c) this.a).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((r2.c) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List b() {
        ArrayList arrayList;
        o oVar = (o) this.c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.a;
        Cursor cursor = null;
        try {
            try {
                cursor = oVar.o0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.b)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) w0.m0(com.google.android.gms.internal.measurement.b3.z(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            a3Var.b();
                            ((com.google.android.gms.internal.measurement.b3) a3Var.s).F(string);
                            long j3 = cursor.getLong(2);
                            a3Var.b();
                            ((com.google.android.gms.internal.measurement.b3) a3Var.s).G(j3);
                            arrayList2.add(new l(j, j2, z, (com.google.android.gms.internal.measurement.b3) a3Var.e()));
                        } catch (IOException e) {
                            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                            o1.m(s0Var);
                            s0Var.x.c("Data loss. Failed to merge raw event. appId", s0.H(str), e);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s).w;
                o1.m(s0Var2);
                s0Var2.x.c("Data loss. Error querying raw events batch. appId", s0.H(str), e2);
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public m(o oVar, String str, long j) {
        this.c = oVar;
        c21.u.d(str);
        this.a = str;
        this.b = oVar.k0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public m(int i) {
        switch (i) {
            case 3:
                r2.b bVar = r2.b.r;
                this.a = new r2.c();
                this.c = new r2.c();
                break;
            default:
                bz0.c cVar = new bz0.c(1, null, 8);
                ma.l lVar = ma.l.r;
                this.b = 10000L;
                this.a = cVar;
                this.c = lVar;
                break;
        }
    }

    public m(Parcel parcel) {
        k71.k.g(parcel, "parcel");
        byte[] bArr = new byte[parcel.readInt()];
        this.c = bArr;
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        k71.k.d(readString);
        this.a = readString;
        this.b = parcel.readLong();
    }

    public m(Object... a) {
    }
}
