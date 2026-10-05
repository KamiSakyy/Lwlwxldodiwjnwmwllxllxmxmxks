package q51;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ c s;

    public /* synthetic */ b(c cVar, int i) {
        this.r = i;
        this.s = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        r51.a F;
        r51.a g;
        switch (this.r) {
            case 0:
                this.s.a();
                return;
            case 1:
                this.s.a();
                return;
            default:
                c cVar = this.s;
                Object obj = c.m;
                synchronized (obj) {
                    try {
                        k41.g gVar = cVar.a;
                        gVar.a();
                        x1 k = x1.k(gVar.a);
                        try {
                            F = cVar.c.F();
                            if (k != null) {
                                k.H();
                            }
                        } catch (Throwable th) {
                            if (k != null) {
                                k.H();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i = F.b;
                    if (!(i == 5)) {
                        if (!(i == 3)) {
                            if (cVar.d.a(F)) {
                                g = cVar.b(F);
                                synchronized (obj) {
                                    try {
                                        k41.g gVar2 = cVar.a;
                                        gVar2.a();
                                        x1 k2 = x1.k(gVar2.a);
                                        try {
                                            cVar.c.v(g);
                                            if (k2 != null) {
                                                k2.H();
                                            }
                                        } catch (Throwable th2) {
                                            if (k2 != null) {
                                                k2.H();
                                            }
                                            throw th2;
                                        }
                                    } finally {
                                    }
                                }
                                synchronized (cVar) {
                                    try {
                                        if (cVar.k.size() != 0 && !TextUtils.equals(F.a, g.a)) {
                                            Iterator it = cVar.k.iterator();
                                            if (it.hasNext()) {
                                                if (it.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                throw null;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                if (g.b == 4) {
                                    String str = g.a;
                                    synchronized (cVar) {
                                        cVar.j = str;
                                    }
                                }
                                int i2 = g.b;
                                if (i2 == 5) {
                                    cVar.h(new FirebaseInstallationsException());
                                    return;
                                } else if (i2 == 2 || i2 == 1) {
                                    cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.i(g);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    g = cVar.g(F);
                    synchronized (obj) {
                    }
                } catch (FirebaseInstallationsException e) {
                    cVar.h(e);
                    return;
                }
                break;
        }
    }
}
