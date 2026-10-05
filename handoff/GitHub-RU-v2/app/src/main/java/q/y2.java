package q;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30772a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30773b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30774c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f30775d;

    public q81.i a() {
        return new q81.i(this.f30772a, this.f30773b, (String[]) this.f30774c, (String[]) this.f30775d);
    }

    public void b(String... strArr) {
        k71.k.g(strArr, "cipherSuites");
        if (!this.f30772a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        k71.k.f(copyOf, "copyOf(...)");
        this.f30774c = (String[]) copyOf;
    }

    public void c(q81.h... hVarArr) {
        k71.k.g(hVarArr, "cipherSuites");
        if (!this.f30772a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(hVarArr.length);
        for (q81.h hVar : hVarArr) {
            arrayList.add(hVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        k71.k.g(strArr, "tlsVersions");
        if (!this.f30772a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        k71.k.f(copyOf, "copyOf(...)");
        this.f30775d = (String[]) copyOf;
    }

    public void e(q81.e0... e0VarArr) {
        if (!this.f30772a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(e0VarArr.length);
        for (q81.e0 e0Var : e0VarArr) {
            arrayList.add(e0Var.r);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
