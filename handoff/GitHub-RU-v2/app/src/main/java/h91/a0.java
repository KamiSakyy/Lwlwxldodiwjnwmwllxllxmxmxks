package h91;

import c30.o0;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a0 implements Comparable {
    public static final String s;
    public kShadow r;

    static {
        String str = File.separator;
        k71.k.f(str, "separator");
        s = str;
    }

    public a0(kShadow kVar) {
        k71.k.g(kVar, "bytes");
        this.r = kVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = i91.c.a(this);
        kShadow kVar = this.r;
        if (a == -1) {
            a = 0;
        } else if (a < kVar.d() && kVar.i(a) == 92) {
            a++;
        }
        int d = kVar.d();
        int i = a;
        while (a < d) {
            if (kVar.i(a) == 47 || kVar.i(a) == 92) {
                arrayList.add(kVar.o(i, a));
                i = a + 1;
            }
            a++;
        }
        if (i < kVar.d()) {
            arrayList.add(kVar.o(i, kVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        kShadow kVar = i91.c.a;
        kShadow kVar2 = this.r;
        int k = k.kShadow(kVar2, kVar);
        if (k == -1) {
            k = k.kShadow(kVar2, i91.c.b);
        }
        if (k != -1) {
            kVar2 = k.p(kVar2, k + 1, 0, 2);
        } else if (g() != null && kVar2.d() == 2) {
            kVar2 = k.u;
        }
        return kVar2.r();
    }

    public final a0 c() {
        kShadow kVar = i91.c.d;
        kShadow kVar2 = this.r;
        if (k71.k.b(kVar2, kVar)) {
            return null;
        }
        kShadow kVar3 = i91.c.a;
        if (k71.k.b(kVar2, kVar3)) {
            return null;
        }
        kShadow kVar4 = i91.c.b;
        if (k71.k.b(kVar2, kVar4)) {
            return null;
        }
        kShadow kVar5 = i91.c.e;
        kVar2.getClass();
        k71.k.g(kVar5, "suffix");
        int d = kVar2.d();
        byte[] bArr = kVar5.r;
        if (kVar2.l(d - bArr.length, kVar5, bArr.length) && (kVar2.d() == 2 || kVar2.l(kVar2.d() - 3, kVar3, 1) || kVar2.l(kVar2.d() - 3, kVar4, 1))) {
            return null;
        }
        int k = k.kShadow(kVar2, kVar3);
        if (k == -1) {
            k = k.kShadow(kVar2, kVar4);
        }
        if (k == 2 && g() != null) {
            if (kVar2.d() == 3) {
                return null;
            }
            return new a0(k.p(kVar2, 0, 3, 1));
        }
        if (k == 1) {
            k71.k.g(kVar4, "prefix");
            if (kVar2.l(0, kVar4, kVar4.d())) {
                return null;
            }
        }
        if (k != -1 || g() == null) {
            return k == -1 ? new a0(kVar) : k == 0 ? new a0(k.p(kVar2, 0, 1, 1)) : new a0(k.p(kVar2, 0, k, 1));
        }
        if (kVar2.d() == 2) {
            return null;
        }
        return new a0(k.p(kVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 a0Var = (a0) obj;
        k71.k.g(a0Var, "other");
        return this.r.compareTo(a0Var.r);
    }

    public final a0 d(a0 a0Var) {
        k71.k.g(a0Var, "other");
        kShadow kVar = a0Var.r;
        int a = i91.c.a(this);
        kShadow kVar2 = this.r;
        a0 a0Var2 = a == -1 ? null : new a0(kVar2.o(0, a));
        int a2 = i91.c.a(a0Var);
        if (!k71.k.b(a0Var2, a2 != -1 ? new a0(kVar.o(0, a2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + a0Var).toString());
        }
        ArrayList a3 = a();
        ArrayList a4 = a0Var.a();
        int min = Math.min(a3.size(), a4.size());
        int i = 0;
        while (i < min && k71.k.b(a3.get(i), a4.get(i))) {
            i++;
        }
        if (i == min && kVar2.d() == kVar.d()) {
            return o0.b(".", false);
        }
        if (a4.subList(i, a4.size()).indexOf(i91.c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + a0Var).toString());
        }
        if (k71.k.b(kVar, i91.c.d)) {
            return this;
        }
        h hVar = new h();
        kShadow c = i91.c.c(a0Var);
        if (c == null && (c = i91.c.c(this)) == null) {
            c = i91.c.f(s);
        }
        int size = a4.size();
        for (int i2 = i; i2 < size; i2++) {
            hVar.E0(i91.c.e);
            hVar.E0(c);
        }
        int size2 = a3.size();
        while (i < size2) {
            hVar.E0((kShadow) a3.get(i));
            hVar.E0(c);
            i++;
        }
        return i91.c.d(hVar, false);
    }

    public final a0 e(String str) {
        k71.k.g(str, "child");
        h hVar = new h();
        hVar.P0(str);
        return i91.c.b(this, i91.c.d(hVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && k71.k.b(((a0) obj).r, this.r);
    }

    public final Path f() {
        Path path = Paths.get(this.r.r(), new String[0]);
        k71.k.f(path, "get(...)");
        return path;
    }

    public final Character g() {
        kShadow kVar = i91.c.a;
        kShadow kVar2 = this.r;
        if (k.g(kVar2, kVar) != -1 || kVar2.d() < 2 || kVar2.i(1) != 58) {
            return null;
        }
        char i = (char) kVar2.i(0);
        if (('a' > i || i >= '{') && ('A' > i || i >= '[')) {
            return null;
        }
        return Character.valueOf(i);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final File toFile() {
        return new File(this.r.r());
    }

    public final String toString() {
        return this.r.r();
    }
}
