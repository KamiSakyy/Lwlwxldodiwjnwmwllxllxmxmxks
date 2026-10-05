package w9;

import android.os.SystemClock;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final k f33466a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static j9.f f33467b;

    @Override // w9.h
    public boolean a() {
        boolean z10;
        synchronized (g.f33455a) {
            try {
                int i = g.f33457c;
                g.f33457c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > g.f33458d + 30000) {
                    g.f33457c = 0;
                    g.f33458d = SystemClock.uptimeMillis();
                    String[] list = g.f33456b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    g.f33459e = list.length < 800;
                }
                z10 = g.f33459e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    @Override // w9.h
    public boolean b(s9.h hVar) {
        k41.b bVar = hVar.f31778a;
        if ((bVar instanceof s9.a ? ((s9.a) bVar).f31765a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        k41.b bVar2 = hVar.f31779b;
        return (bVar2 instanceof s9.a ? ((s9.a) bVar2).f31765a : Integer.MAX_VALUE) > 100;
    }
}
