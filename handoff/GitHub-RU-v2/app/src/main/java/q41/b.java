package q41;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import d9.m;
import d9.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements h, u11.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ b(d51.d dVar, Iterable iterable, m11.j jVar, long j) {
        this.r = 2;
        this.s = dVar;
        this.v = iterable;
        this.u = jVar;
        this.t = j;
    }

    @Override // q41.h
    public ScheduledFuture a(final kk.a aVar) {
        switch (this.r) {
            case 0:
                g gVar = (g) this.s;
                Runnable runnable = (Runnable) this.v;
                return gVar.s.schedule(new e(gVar, runnable, aVar, 1), this.t, (TimeUnit) this.u);
            default:
                final g gVar2 = (g) this.s;
                final Callable callable = (Callable) this.v;
                final int i = 0;
                return gVar2.s.schedule(new Callable() { // from class: q41.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i) {
                            case 0:
                                return ((g) gVar2).r.submit((Runnable) new b9.f(14, (Callable) callable, (kk.a) aVar));
                            default:
                                w8.c cVar = (w8.c) gVar2;
                                ArrayList arrayList = (ArrayList) callable;
                                String str = (String) aVar;
                                WorkDatabase workDatabase = cVar.e;
                                v z = workDatabase.z();
                                z.getClass();
                                k71.k.g(str, "id");
                                arrayList.addAll((List) m71.a.L(z.a, true, false, new m(str, 12)));
                                return workDatabase.y().e(str);
                        }
                    }
                }, this.t, (TimeUnit) this.u);
        }
    }

    @Override // u11.a
    public Object j() {
        d51.d dVar = (d51.d) this.s;
        Iterable iterable = (Iterable) this.v;
        m11.j jVar = (m11.j) this.u;
        t11.i iVar = (t11.i) ((t11.d) dVar.c);
        iVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + t11.i.F(iterable);
            SQLiteDatabase f = iVar.f();
            f.beginTransaction();
            try {
                f.compileStatement(str).execute();
                Cursor rawQuery = f.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        iVar.A(rawQuery.getInt(0), p11.c.w, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                f.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                f.setTransactionSuccessful();
            } finally {
                f.endTransaction();
            }
        }
        iVar.r(new t11.f(((v11.a) dVar.g).b() + this.t, jVar));
        return null;
    }

    public /* synthetic */ b(g gVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.r = i;
        this.s = gVar;
        this.v = obj;
        this.t = j;
        this.u = timeUnit;
    }
}
