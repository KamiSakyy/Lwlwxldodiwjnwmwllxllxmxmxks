package t11;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements d, u11.b, c {
    public static final j11.c w = new j11.c("proto");
    public k r;
    public v11.a s;
    public v11.a t;
    public a u;
    public v61.a v;

    public i(v11.a aVar, v11.a aVar2, a aVar3, k kVar, v61.a aVar4) {
        this.r = kVar;
        this.s = aVar;
        this.t = aVar2;
        this.u = aVar3;
        this.v = aVar4;
    }

    public static String F(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object K(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long m(SQLiteDatabase sQLiteDatabase, m11.j jVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.a, String.valueOf(w11.a.a(jVar.c))));
        byte[] bArr = jVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public final void A(long j, p11.c cVar, String str) {
        r(new s11.f(j, str, cVar));
    }

    public final Object E(u11.a aVar) {
        SQLiteDatabase f = f();
        v11.a aVar2 = this.t;
        long b = aVar2.b();
        while (true) {
            try {
                f.beginTransaction();
                try {
                    Object j = aVar.j();
                    f.setTransactionSuccessful();
                    return j;
                } finally {
                    f.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar2.b() >= this.u.c + b) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    public final SQLiteDatabase f() {
        k kVar = this.r;
        Objects.requireNonNull(kVar);
        v11.a aVar = this.t;
        long b = aVar.b();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.b() >= this.u.c + b) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object r(g gVar) {
        SQLiteDatabase f = f();
        f.beginTransaction();
        try {
            Object apply = gVar.apply(f);
            f.setTransactionSuccessful();
            return apply;
        } finally {
            f.endTransaction();
        }
    }

    public final ArrayList t(SQLiteDatabase sQLiteDatabase, m11.j jVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long m = m(sQLiteDatabase, jVar);
        if (m == null) {
            return arrayList;
        }
        K(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{m.toString()}, null, null, null, String.valueOf(i)), new r11.b(this, (Object) arrayList, jVar, 2));
        return arrayList;
    }
}
