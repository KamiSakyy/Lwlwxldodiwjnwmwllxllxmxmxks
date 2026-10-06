package v41;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final Context a;
    public final s b;
    public final v2.t c;
    public final long d;
    public v2.t e;
    public v2.t f;
    public boolean g;
    public l h;
    public final v i;
    public final b51.d j;
    public final r41.a k;
    public final r41.a l;
    public final i m;
    public final s41.b n;
    public final s21.a o;
    public final w41.c p;

    public p(k41.g gVar, v vVar, s41.b bVar, s sVar, r41.a aVar, r41.a aVar2, b51.d dVar, i iVar, s21.a aVar3, w41.c cVar) {
        this.b = sVar;
        gVar.a();
        this.a = gVar.a;
        this.i = vVar;
        this.n = bVar;
        this.k = aVar;
        this.l = aVar2;
        this.j = dVar;
        this.m = iVar;
        this.o = aVar3;
        this.p = cVar;
        this.d = System.currentTimeMillis();
        this.c = new v2.t(5);
    }

    public final void a(d51.d dVar) {
        File file;
        w41.c.a();
        w41.c.a();
        v2.t tVar = this.e;
        tVar.getClass();
        try {
            b51.d dVar2 = (b51.d) tVar.t;
            String str = (String) tVar.s;
            dVar2.getClass();
            new File((File) dVar2.c, str).createNewFile();
        } catch (IOException unused) {
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                try {
                    this.k.c(new o(this));
                    this.h.f();
                } catch (Exception unused2) {
                    w41.c.a();
                    v2.t tVar2 = this.e;
                    b51.d dVar3 = (b51.d) tVar2.t;
                    String str2 = (String) tVar2.s;
                    dVar3.getClass();
                    file = new File((File) dVar3.c, str2);
                }
                if (!dVar.c().b.a) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                l lVar = this.h;
                lVar.getClass();
                w41.c.a();
                rShadow rVar = lVar.n;
                if (!(rVar != null && rVar.e.get())) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    try {
                        lVar.b(true, dVar, true);
                        Log.isLoggable("FirebaseCrashlytics", 2);
                    } catch (Exception unused3) {
                    }
                }
                this.h.g(((w21.g) ((AtomicReference) dVar.i).get()).a);
                v2.t tVar3 = this.e;
                b51.d dVar4 = (b51.d) tVar3.t;
                String str3 = (String) tVar3.s;
                dVar4.getClass();
                file = new File((File) dVar4.c, str3);
                file.delete();
            } finally {
                w41.c.a();
                try {
                    v2.t tVar4 = this.e;
                    b51.d dVar5 = (b51.d) tVar4.t;
                    String str4 = (String) tVar4.s;
                    dVar5.getClass();
                    new File((File) dVar5.c, str4).delete();
                } catch (Exception unused4) {
                }
            }
        } catch (Exception unused5) {
        }
    }
}
