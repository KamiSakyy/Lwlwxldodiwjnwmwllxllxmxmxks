package r11;

import a71.h;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c71.j;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m11.m;
import org.json.JSONException;
import org.json.JSONObject;
import t.q;
import t00.z1;
import t11.g;
import v71.a0Shadow;
import v71.b0;
import v71.w;
import v8.l;
import w21.f;
import w21.o;
import w51.r;
import w51.s;
import x3.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements u11.a, g, i, w21.a, f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(h hVar, a0Shadow a0Var, j71.e eVar) {
        this.r = 4;
        this.u = hVar;
        this.t = a0Var;
        this.s = (j) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // t11.g, j11.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        p11.c cVar;
        int i = this.r;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        p11.c cVar2 = p11.c.u;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.s;
        Object obj3 = this.t;
        int i7 = 0;
        t11.i iVar = (t11.i) this.u;
        switch (i) {
            case 1:
                m11.i iVar2 = (m11.i) obj2;
                m mVar = iVar2.c;
                String str = iVar2.a;
                m11.j jVar = (m11.j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = iVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                t11.a aVar = iVar.u;
                if (simpleQueryForLong >= aVar.a) {
                    iVar.A(1L, cVar2, str);
                    return -1L;
                }
                Long m = t11.i.m(sQLiteDatabase, jVar);
                if (m != null) {
                    insert = m.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.a);
                    contentValues.put("priority", Integer.valueOf(w11.a.a(jVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = aVar.e;
                byte[] bArr2 = mVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar2.e));
                contentValues2.put("payload_encoding", mVar.a.a);
                contentValues2.put("code", iVar2.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar2.g);
                contentValues2.put("pseudonymous_id", iVar2.h);
                contentValues2.put("experiment_ids_clear_blob", iVar2.i);
                contentValues2.put("experiment_ids_encrypted_blob", iVar2.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i8);
                    for (int i9 = 1; i9 <= ceil; i9++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar2.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                m11.j jVar2 = (m11.j) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    m11.h hVar = new m11.h();
                    hVar.i = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.b = string;
                    hVar.g = Long.valueOf(cursor2.getLong(i5));
                    hVar.h = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar.f = new m(string2 == null ? t11.i.w : new j11.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        j11.c cVar3 = string3 == null ? t11.i.w : new j11.c(string3);
                        Cursor query = iVar.f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i12 += blob.length;
                            }
                            byte[] bArr3 = new byte[i12];
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i13);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                                    i14 += bArr4.length;
                                    i13++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            hVar.f = new m(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.d = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        hVar.e = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        hVar.c = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        hVar.j = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        hVar.k = cursor2.getBlob(11);
                    }
                    arrayList.add(new t11.b(j, jVar2, hVar.c()));
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                r rVar = (r) obj2;
                ArrayList arrayList4 = (ArrayList) rVar.u;
                Cursor cursor3 = (Cursor) obj;
                iVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i15 = cursor3.getInt(1);
                    p11.c cVar4 = p11.c.s;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            cVar4 = p11.c.t;
                        } else if (i15 == 2) {
                            cVar = cVar2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new p11.d(j2, cVar));
                            i7 = 0;
                            i2 = 5;
                            i3 = 4;
                            i4 = 3;
                        } else if (i15 == i4) {
                            cVar4 = p11.c.v;
                        } else if (i15 == i3) {
                            cVar4 = p11.c.w;
                        } else if (i15 == i2) {
                            cVar4 = p11.c.x;
                        } else if (i15 == 6) {
                            cVar4 = p11.c.y;
                        } else {
                            a.a.i(Integer.valueOf(i15), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    cVar = cVar4;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new p11.d(j22, cVar));
                    i7 = 0;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = p11.e.c;
                    new ArrayList();
                    arrayList4.add(new p11.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long b = iVar.s.b();
                SQLiteDatabase f = iVar.f();
                f.beginTransaction();
                try {
                    Cursor rawQuery = f.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        p11.g gVar = new p11.g(rawQuery.getLong(0), b);
                        rawQuery.close();
                        f.setTransactionSuccessful();
                        f.endTransaction();
                        rVar.t = gVar;
                        rVar.v = new p11.b(new p11.f(iVar.f().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar.f().compileStatement("PRAGMA page_count").simpleQueryForLong(), t11.a.f.a));
                        rVar.s = (String) iVar.v.get();
                        return new p11.a((p11.g) rVar.t, Collections.unmodifiableList(arrayList4), (p11.b) rVar.v, (String) rVar.s);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    f.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // w21.a
    public Object c(o oVar) {
        w21.g gVar = (w21.g) this.u;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.t;
        s21.a aVar = (s21.a) this.s;
        if (oVar.j()) {
            gVar.c(oVar.h());
        } else if (oVar.g() != null) {
            gVar.b(oVar.g());
        } else if (atomicBoolean.getAndSet(true)) {
            ((o) ((s21.a) aVar.s).s).o(null);
        }
        return q.k((Object) null);
    }

    @Override // w21.f
    public o f(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.u;
        String str2 = (String) this.t;
        s sVar = (s) this.s;
        String str3 = (String) obj;
        n51.h d = FirebaseMessaging.d(firebaseMessaging.b);
        String e = firebaseMessaging.e();
        String b = firebaseMessaging.h.b();
        synchronized (d) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = s.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str3);
                jSONObject.put("appVersion", b);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e2) {
                e2.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = d.a.edit();
                edit.putString(n51.h.b(e, str2), str);
                edit.commit();
            }
        }
        if (sVar == null || !str3.equals(sVar.a)) {
            k41.g gVar = firebaseMessaging.a;
            gVar.a();
            if ("[DEFAULT]".equals(gVar.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    gVar.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str3);
                new w51.j(firebaseMessaging.b).b(intent);
            }
        }
        return q.k(str3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c71.j, j71.e] */
    public Object i(x3.h hVar) {
        switch (this.r) {
            case 4:
                h hVar2 = (h) this.u;
                a0Shadow a0Var = (a0Shadow) this.t;
                j71.e r2 = (j71.e) ((j) this.s);
                androidx.fragment.app.s sVar = new androidx.fragment.app.s(24, hVar2.w0(w.s));
                l lVar = l.r;
                x3.m mVar = hVar.c;
                if (mVar != null) {
                    mVar.a(sVar, lVar);
                }
                return b0.z(b0.c(hVar2), (h) null, a0Var, new z1((j71.e) r2, hVar, (a71.c) null), 1);
            default:
                Executor executor = (Executor) this.u;
                String str = (String) this.t;
                j71.a aVar = (j71.a) this.s;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                v8.q qVar = new v8.q(atomicBoolean, 0);
                l lVar2 = l.r;
                x3.m mVar2 = hVar.c;
                if (mVar2 != null) {
                    mVar2.a(qVar, lVar2);
                }
                executor.execute(new v8.r(atomicBoolean, hVar, aVar, 0));
                return str;
        }
    }

    @Override // u11.a
    public Object j() {
        c cVar = (c) this.u;
        m11.j jVar = (m11.j) this.t;
        m11.i iVar = (m11.i) this.s;
        t11.i iVar2 = (t11.i) cVar.d;
        iVar2.getClass();
        j11.d dVar = jVar.c;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(dVar);
        }
        ((Long) iVar2.r(new b(iVar2, (Object) iVar, jVar, 1))).getClass();
        cVar.a.H(jVar, 1, false);
        return null;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.r = i;
        this.u = obj;
        this.t = obj2;
        this.s = obj3;
    }

    public /* synthetic */ b(t11.i iVar, Object obj, m11.j jVar, int i) {
        this.r = i;
        this.u = iVar;
        this.s = obj;
        this.t = jVar;
    }
}
