package s51;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q51.i;
import w80.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public i a;
    public long b;
    public int c;

    public d() {
        if (a0.v == null) {
            Pattern pattern = i.c;
            a0.v = new a0(8);
        }
        a0 a0Var = a0.v;
        if (i.d == null) {
            i.d = new i(a0Var);
        }
        this.a = i.d;
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            this.a.a.getClass();
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.c);
                this.a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
            } else {
                min = d;
            }
            this.a.a.getClass();
            this.b = System.currentTimeMillis() + min;
        }
        return;
    }
    public Object f(Object p1, Object p2) { return null; }
    public Object f(Object p1, int p2) { return null; }
}
