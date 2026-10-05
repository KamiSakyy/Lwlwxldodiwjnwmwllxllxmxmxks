package v41;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ d51.d d;
    public final /* synthetic */ l e;

    public j(l lVar, long j, Throwable th, Thread thread, d51.d dVar) {
        this.e = lVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        b51.d dVar;
        String str;
        long j = this.a;
        long j2 = j / 1000;
        l lVar = this.e;
        String d = lVar.d();
        if (d == null) {
            return t.q.k((Object) null);
        }
        v2.t tVar = lVar.c;
        tVar.getClass();
        try {
            b51.d dVar2 = (b51.d) tVar.t;
            String str2 = (String) tVar.s;
            dVar2.getClass();
            new File((File) dVar2.c, str2).createNewFile();
        } catch (IOException unused) {
        }
        b51.d dVar3 = lVar.m;
        dVar3.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        dVar3.h(this.b, this.c, "crash", new x41.c(d, j2, x61.s.r), true);
        try {
            dVar = lVar.g;
            str = ".ae" + j;
            dVar.getClass();
        } catch (IOException unused2) {
        }
        if (!new File((File) dVar.c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        d51.d dVar4 = this.d;
        lVar.b(false, dVar4, false);
        lVar.c(new e().a, Boolean.FALSE);
        return !lVar.b.a() ? t.q.k((Object) null) : ((w21.g) ((AtomicReference) dVar4.i).get()).a.k(lVar.e.a, new s21.a(this, d));
    }
}
