package h91;

import c30.o0;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class o implements Closeable {
    public static final w r;

    static {
        w wVar;
        try {
            Class.forName("java.nio.file.Files");
            wVar = new xShadow();
        } catch (ClassNotFoundException unused) {
            wVar = new w();
        }
        r = wVar;
        String str = a0.s;
        String property = System.getProperty("java.io.tmpdir");
        k71.k.f(property, "getProperty(...)");
        o0.b(property, false);
        ClassLoader classLoader = i91.h.class.getClassLoader();
        k71.k.f(classLoader, "getClassLoader(...)");
        new i91.h(classLoader);
    }

    public abstract void A(a0 a0Var);

    public final void E(a0 a0Var) {
        k71.k.g(a0Var, "path");
        A(a0Var);
    }

    public final boolean F(a0 a0Var) {
        k71.k.g(a0Var, "path");
        return N(a0Var) != null;
    }

    public abstract List K(a0 a0Var);

    public final g4.f M(a0 a0Var) {
        k71.k.g(a0Var, "path");
        g4.f N = N(a0Var);
        if (N != null) {
            return N;
        }
        throw new FileNotFoundException("no such file: " + a0Var);
    }

    public abstract g4.f N(a0 a0Var);

    public abstract v O(a0 a0Var);

    public abstract v W(a0 a0Var);

    public abstract i0 b0(a0 a0Var);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract k0 e0(a0 a0Var);

    public abstract i0 f(a0 a0Var);

    public abstract void m(a0 a0Var, a0 a0Var2);

    public final void r(a0 a0Var) {
        x61.kShadow kVar = new x61.k();
        while (a0Var != null && !F(a0Var)) {
            kVar.addFirst(a0Var);
            a0Var = a0Var.c();
        }
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            t((a0) it.next());
        }
    }

    public abstract void t(a0 a0Var);
}
