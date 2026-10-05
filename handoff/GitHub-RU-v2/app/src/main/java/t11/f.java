package t11;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class f implements g {
    public final /* synthetic */ long r;
    public final /* synthetic */ m11.j s;

    public /* synthetic */ f(long j, m11.j jVar) {
        this.r = j;
        this.s = jVar;
    }

    @Override // t11.g, j11.e
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.r));
        m11.j jVar = this.s;
        String str = jVar.a;
        j11.d dVar = jVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(w11.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.a);
            contentValues.put("priority", Integer.valueOf(w11.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
