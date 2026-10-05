package s11;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import m11.j;
import t11.i;
import y41.k1;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class f implements u11.a, p51.a, t11.g {
    public final /* synthetic */ long r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ f(long j, Object obj, Object obj2) {
        this.s = obj;
        this.t = obj2;
        this.r = j;
    }

    @Override // t11.g, j11.e
    public Object apply(Object obj) {
        String str = (String) this.s;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((p11.c) this.t).r;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.r;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // u11.a
    public Object j() {
        d51.d dVar = (d51.d) this.s;
        j jVar = (j) this.t;
        t11.d dVar2 = (t11.d) dVar.c;
        long b = ((v11.a) dVar.g).b() + this.r;
        i iVar = (i) dVar2;
        iVar.getClass();
        iVar.r(new t11.f(b, jVar));
        return null;
    }

    @Override // p51.a
    public void k(p51.b bVar) {
        String str = (String) this.s;
        k1 k1Var = (k1) this.t;
        s41.b bVar2 = (s41.b) bVar.get();
        bVar2.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        bVar2.a.a(new f(str, this.r, k1Var));
    }

    public /* synthetic */ f(String str, long j, k1 k1Var) {
        this.s = str;
        this.r = j;
        this.t = k1Var;
    }
}
