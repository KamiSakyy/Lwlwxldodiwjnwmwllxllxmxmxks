package i91;

import c30.o0;
import f0.b2;
import h91.a0;
import h91.i0Shadow;
import h91.k0;
import h91.o;
import h91.v;
import h91.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import w61.p;
import x61.m;
import x61.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h extends o {
    public static final a0 v;
    public ClassLoader s;
    public o t;
    public p u;

    static {
        String str = a0.s;
        v = o0.b("/", false);
    }

    public h(ClassLoader classLoader) {
        w wVar = o.r;
        k71.k.g(wVar, "systemFileSystem");
        this.s = classLoader;
        this.t = wVar;
        this.u = sy.w.t(new b2(20, this));
    }

    @Override // h91.o
    public final void A(a0 a0Var) {
        k71.k.g(a0Var, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // h91.o
    public final List K(a0 a0Var) {
        a0 a0Var2 = v;
        a0Var2.getClass();
        String r = c.b(a0Var2, a0Var, true).d(a0Var2).r.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (w61.k kVar : (List) this.u.getValue()) {
            o oVar = (o) kVar.r;
            a0 a0Var3 = (a0) kVar.s;
            try {
                List K = oVar.K(a0Var3.e(r));
                ArrayList arrayList = new ArrayList();
                for (Object obj : K) {
                    if (e50.e.b((a0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    a0 a0Var4 = (a0) obj2;
                    k71.k.g(a0Var4, "<this>");
                    String replace = t71.p.a0(a0Var4.r.r(), a0Var3.r.r()).replace('\\', '/');
                    k71.k.f(replace, "replace(...)");
                    arrayList2.add(a0Var2.e(replace));
                }
                m.J(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return m.F0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + a0Var);
    }

    @Override // h91.o
    public final g4.f N(a0 a0Var) {
        k71.k.g(a0Var, "path");
        if (!e50.e.b(a0Var)) {
            return null;
        }
        a0 a0Var2 = v;
        a0Var2.getClass();
        String r = c.b(a0Var2, a0Var, true).d(a0Var2).r.r();
        for (w61.k kVar : (List) this.u.getValue()) {
            g4.f N = ((o) kVar.r).N(((a0) kVar.s).e(r));
            if (N != null) {
                return N;
            }
        }
        return null;
    }

    @Override // h91.o
    public final v O(a0 a0Var) {
        if (!e50.e.b(a0Var)) {
            throw new FileNotFoundException("file not found: " + a0Var);
        }
        a0 a0Var2 = v;
        a0Var2.getClass();
        String r = c.b(a0Var2, a0Var, true).d(a0Var2).r.r();
        for (w61.k kVar : (List) this.u.getValue()) {
            try {
                return ((o) kVar.r).O(((a0) kVar.s).e(r));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + a0Var);
    }

    @Override // h91.o
    public final v W(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException("resources are not writable");
    }

    @Override // h91.o
    public final i0 b0(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // h91.o
    public final k0 e0(a0 a0Var) {
        k71.k.g(a0Var, "file");
        if (!e50.e.b(a0Var)) {
            throw new FileNotFoundException("file not found: " + a0Var);
        }
        a0 a0Var2 = v;
        a0Var2.getClass();
        URL resource = this.s.getResource(c.b(a0Var2, a0Var, false).d(a0Var2).r.r());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + a0Var);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        k71.k.f(inputStream, "getInputStream(...)");
        return h91.b.g(inputStream);
    }

    @Override // h91.o
    public final i0 f(a0 a0Var) {
        k71.k.g(a0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // h91.o
    public final void m(a0 a0Var, a0 a0Var2) {
        k71.k.g(a0Var, "source");
        k71.k.g(a0Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // h91.o
    public final void t(a0 a0Var) {
        k71.k.g(a0Var, "dir");
        throw new IOException(this + " is read-only");
    }
}
