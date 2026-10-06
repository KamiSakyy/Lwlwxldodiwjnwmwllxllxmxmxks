package r81;

import h91.h;
import h91.j;
import h91.k0;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k71.k;
import q81.a0;
import q81.n;
import q81.o;
import q81.u;
import t71.p;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class g {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        k.d(timeZone);
        a = timeZone;
        b = p.b0(p.a0(u.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(o oVar, o oVar2) {
        k.g(oVar, "<this>");
        k.g(oVar2, "other");
        return k.b(oVar.d, oVar2.d) && oVar.e == oVar2.e && k.b(oVar.a, oVar2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        k.g(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalStateException(str.concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str.concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str.concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        k.g(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!k.b(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        k.g(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(a0 a0Var) {
        String a2 = a0Var.w.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = e.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(j jVar, Charset charset) {
        k.g(jVar, "<this>");
        k.g(charset, "default");
        int Z = jVar.Z(e.b);
        if (Z == -1) {
            return charset;
        }
        if (Z == 0) {
            return t71.a.a;
        }
        if (Z == 1) {
            return t71.a.b;
        }
        if (Z == 2) {
            Charset charset2 = t71.a.a;
            Charset charset3 = t71.a.d;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            k.f(forName, "forName(...)");
            t71.a.d = forName;
            return forName;
        }
        if (Z == 3) {
            return t71.a.c;
        }
        if (Z != 4) {
            throw new AssertionError();
        }
        Charset charset4 = t71.a.a;
        Charset charset5 = t71.a.e;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        k.f(forName2, "forName(...)");
        t71.a.e = forName2;
        return forName2;
    }

    public static final boolean g(k0 k0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        k.g(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c = k0Var.b().e() ? k0Var.b().c() - nanoTime : Long.MAX_VALUE;
        k0Var.b().d(Math.min(c, timeUnit.toNanos(i)) + nanoTime);
        try {
            h hVar = new h();
            while (k0Var.U(hVar, 8192L) != -1) {
                hVar.r();
            }
            if (c == Long.MAX_VALUE) {
                k0Var.b().a();
                return true;
            }
            k0Var.b().d(nanoTime + c);
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                k0Var.b().a();
                return false;
            }
            k0Var.b().d(nanoTime + c);
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                k0Var.b().a();
            } else {
                k0Var.b().d(nanoTime + c);
            }
            throw th;
        }
    }

    public static final n h(List list) {
        ia.d dVar = new ia.d(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x81.c cVar = (x81.c) it.next();
            dVar.b(cVar.a.r(), cVar.b.r());
        }
        return dVar.e();
    }

    public static final String i(o oVar, boolean z) {
        k.g(oVar, "<this>");
        int i = oVar.e;
        String str = oVar.d;
        if (p.I(str, ":", false)) {
            str = no.a.i(']', "[", str);
        }
        if (!z) {
            String str2 = oVar.a;
            k.g(str2, "scheme");
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final List j(List list) {
        k.g(list, "<this>");
        if (list.isEmpty()) {
            return r.r;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            k.f(singletonList, "singletonList(...)");
            return singletonList;
        }
        Object[] array = list.toArray();
        k.f(array, "toArray(...)");
        List unmodifiableList = Collections.unmodifiableList(l.r(array));
        k.f(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return r.r;
        }
        if (objArr.length == 1) {
            List singletonList = Collections.singletonList(objArr[0]);
            k.f(singletonList, "singletonList(...)");
            return singletonList;
        }
        List unmodifiableList = Collections.unmodifiableList(l.r((Object[]) objArr.clone()));
        k.f(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    public static Object b;
}
