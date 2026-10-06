package h91;

import c30.o0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n0 extends o {
    public static final a0 v;
    public a0 s;
    public o t;
    public LinkedHashMap u;

    static {
        String str = a0.s;
        v = o0.b("/", false);
    }

    public n0(a0 a0Var, o oVar, LinkedHashMap linkedHashMap) {
        this.s = a0Var;
        this.t = oVar;
        this.u = linkedHashMap;
    }

    @Override // h91.o
    public final void A(a0 a0Var) {
        k71.k.g(a0Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // h91.o
    public final List K(a0 a0Var) {
        a0 a0Var2 = v;
        a0Var2.getClass();
        i91.j jVar = (i91.j) this.u.get(i91.c.b(a0Var2, a0Var, true));
        if (jVar != null) {
            return x61.m.F0(jVar.q);
        }
        throw new IOException("not a directory: " + a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // h91.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g4.f N(a0 a0Var) {
        Long valueOf;
        long j;
        Long l;
        Long valueOf2;
        Long l2;
        Long l3;
        Long valueOf3;
        Throwable th;
        Throwable th2;
        i91.j jVar;
        k71.k.g(a0Var, "path");
        a0 a0Var2 = v;
        a0Var2.getClass();
        i91.j jVar2 = (i91.j) this.u.get(i91.c.b(a0Var2, a0Var, true));
        if (jVar2 == null) {
            return null;
        }
        long j2 = jVar2.h;
        if (j2 != -1) {
            v O = this.t.O(this.s);
            try {
                e0 c = b.c(O.m(j2));
                try {
                    jVar = i91.b.g(c, jVar2);
                    k71.k.d(jVar);
                    try {
                        c.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c.close();
                    } catch (Throwable th5) {
                        sy.u.a(th4, th5);
                    }
                    th2 = th4;
                    jVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (O != null) {
                    try {
                        O.close();
                    } catch (Throwable th7) {
                        sy.u.a(th, th7);
                    }
                }
                jVar2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                O.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            th = th;
            jVar2 = jVar;
            if (th != null) {
                throw th;
            }
        }
        boolean z = jVar2.b;
        boolean z2 = !z;
        Long valueOf4 = z ? null : Long.valueOf(jVar2.f);
        Long l4 = jVar2.m;
        if (l4 != null) {
            valueOf = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        } else {
            valueOf = jVar2.p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l5 = jVar2.k;
        if (l5 != null) {
            j = 11644473600000L;
            valueOf2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            j = 11644473600000L;
            if (jVar2.n == null) {
                int i = jVar2.j;
                if (i != -1) {
                    int i2 = jVar2.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        valueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l = null;
                l2 = jVar2.l;
                if (l2 == null) {
                    valueOf3 = Long.valueOf((l2.longValue() / 10000) - j);
                } else {
                    if (jVar2.o == null) {
                        l3 = null;
                        return new g4.f(z2, z, (a0) null, valueOf4, valueOf, l, l3);
                    }
                    valueOf3 = Long.valueOf(r0.intValue() * 1000);
                }
                l3 = valueOf3;
                return new g4.f(z2, z, (a0) null, valueOf4, valueOf, l, l3);
            }
            valueOf2 = Long.valueOf(r3.intValue() * 1000);
        }
        l = valueOf2;
        l2 = jVar2.l;
        if (l2 == null) {
        }
        l3 = valueOf3;
        return new g4.f(z2, z, (a0) null, valueOf4, valueOf, l, l3);
    }

    @Override // h91.o
    public final v O(a0 a0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // h91.o
    public final v W(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // h91.o
    public final i0 b0(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // h91.o
    public final k0 e0(a0 a0Var) {
        Throwable th;
        e0 e0Var;
        k71.k.g(a0Var, "file");
        a0 a0Var2 = v;
        a0Var2.getClass();
        i91.j jVar = (i91.j) this.u.get(i91.c.b(a0Var2, a0Var, true));
        if (jVar == null) {
            throw new FileNotFoundException("no such file: " + a0Var);
        }
        long j = jVar.f;
        v O = this.t.O(this.s);
        try {
            e0Var = b.c(O.m(jVar.h));
            try {
                O.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (O != null) {
                try {
                    O.close();
                } catch (Throwable th4) {
                    sy.u.a(th3, th4);
                }
            }
            th = th3;
            e0Var = null;
        }
        if (th != null) {
            throw th;
        }
        k71.k.g(e0Var, "<this>");
        i91.b.g(e0Var, null);
        if (jVar.g == 0) {
            return new i91.g(e0Var, j, true);
        }
        return new i91.g(new t(b.c(new i91.g(e0Var, jVar.e, true)), new Inflater(true)), j, false);
    }

    @Override // h91.o
    public final i0 f(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // h91.o
    public final void m(a0 a0Var, a0 a0Var2) {
        k71.k.g(a0Var, "source");
        k71.k.g(a0Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // h91.o
    public final void t(a0 a0Var) {
        k71.k.g(a0Var, "dir");
        throw new IOException("zip file systems are read-only");
    }
}
