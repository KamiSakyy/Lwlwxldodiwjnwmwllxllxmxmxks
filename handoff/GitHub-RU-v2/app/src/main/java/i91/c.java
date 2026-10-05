package i91;

import h91.a0;
import java.util.ArrayList;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c {
    public static final h91.k a;
    public static final h91.k b;
    public static final h91.k c;
    public static final h91.k d;
    public static final h91.k e;

    static {
        h91.k kVar = h91.k.u;
        a = c30.d.b("/");
        b = c30.d.b("\\");
        c = c30.d.b("/\\");
        d = c30.d.b(".");
        e = c30.d.b("..");
    }

    public static final int a(a0 a0Var) {
        h91.k kVar = a0Var.r;
        if (kVar.d() != 0) {
            if (kVar.i(0) != 47) {
                if (kVar.i(0) == 92) {
                    if (kVar.d() > 2 && kVar.i(1) == 92) {
                        h91.k kVar2 = b;
                        k71.k.g(kVar2, "other");
                        int f = kVar.f(2, kVar2.h());
                        return f == -1 ? kVar.d() : f;
                    }
                } else if (kVar.d() > 2 && kVar.i(1) == 58 && kVar.i(2) == 92) {
                    char i = (char) kVar.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' <= i && i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final a0 b(a0 a0Var, a0 a0Var2, boolean z) {
        k71.k.g(a0Var2, "child");
        if (a(a0Var2) != -1 || a0Var2.g() != null) {
            return a0Var2;
        }
        h91.k c2 = c(a0Var);
        if (c2 == null && (c2 = c(a0Var2)) == null) {
            c2 = f(a0.s);
        }
        h91.h hVar = new h91.h();
        hVar.E0(a0Var.r);
        if (hVar.s > 0) {
            hVar.E0(c2);
        }
        hVar.E0(a0Var2.r);
        return d(hVar, z);
    }

    public static final h91.k c(a0 a0Var) {
        h91.k kVar = a0Var.r;
        h91.k kVar2 = a;
        if (h91.k.g(kVar, kVar2) != -1) {
            return kVar2;
        }
        h91.k kVar3 = a0Var.r;
        h91.k kVar4 = b;
        if (h91.k.g(kVar3, kVar4) != -1) {
            return kVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[EDGE_INSN: B:68:0x0110->B:69:0x0110 BREAK  A[LOOP:1: B:20:0x00ab->B:36:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final a0 d(h91.h hVar, boolean z) {
        h91.k kVar;
        long j;
        char F;
        boolean L;
        h91.k kVar2;
        int size;
        int i;
        h91.k v;
        h91.h hVar2 = new h91.h();
        h91.k kVar3 = null;
        int i2 = 0;
        while (true) {
            if (!hVar.A0(0L, a)) {
                kVar = b;
                if (!hVar.A0(0L, kVar)) {
                    break;
                }
            }
            byte readByte = hVar.readByte();
            if (kVar3 == null) {
                kVar3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && k71.k.b(kVar3, kVar);
        h91.k kVar4 = c;
        if (z2) {
            k71.k.d(kVar3);
            hVar2.E0(kVar3);
            hVar2.E0(kVar3);
        } else if (i2 > 0) {
            k71.k.d(kVar3);
            hVar2.E0(kVar3);
        } else {
            long q = hVar.q(kVar4);
            if (kVar3 == null) {
                kVar3 = q == -1 ? f(a0.s) : e(hVar.F(q));
            }
            if (k71.k.b(kVar3, kVar) && hVar.s >= 2) {
                j = -1;
                if (hVar.F(1L) == 58 && (('a' <= (F = (char) hVar.F(0L)) && F < '{') || ('A' <= F && F < '['))) {
                    if (q == 2) {
                        hVar2.I0(hVar, 3L);
                    } else {
                        hVar2.I0(hVar, 2L);
                    }
                }
                boolean z3 = hVar2.s <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    L = hVar.L();
                    kVar2 = d;
                    if (!L) {
                        break;
                    }
                    long q2 = hVar.q(kVar4);
                    if (q2 == j) {
                        v = hVar.v(hVar.s);
                    } else {
                        v = hVar.v(q2);
                        hVar.readByte();
                    }
                    h91.k kVar5 = e;
                    if (k71.k.b(v, kVar5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || k71.k.b(m.e0(arrayList), kVar5)))) {
                                arrayList.add(v);
                            } else if (!z2 || arrayList.size() != 1) {
                                m.q0(arrayList);
                            }
                        }
                    } else if (!k71.k.b(v, kVar2) && !k71.k.b(v, h91.k.u)) {
                        arrayList.add(v);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        hVar2.E0(kVar3);
                    }
                    hVar2.E0((h91.k) arrayList.get(i));
                }
                if (hVar2.s == 0) {
                    hVar2.E0(kVar2);
                }
                return new a0(hVar2.v(hVar2.s));
            }
        }
        j = -1;
        if (hVar2.s <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            L = hVar.L();
            kVar2 = d;
            if (!L) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (hVar2.s == 0) {
        }
        return new a0(hVar2.v(hVar2.s));
    }

    public static final h91.k e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(no.a.k("not a directory separator: ", b2));
    }

    public static final h91.k f(String str) {
        if (k71.k.b(str, "/")) {
            return a;
        }
        if (k71.k.b(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(f1.e.g("not a directory separator: ", str));
    }
}
