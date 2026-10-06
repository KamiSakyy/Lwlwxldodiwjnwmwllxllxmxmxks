package androidx.lifecycle;

import java.lang.reflect.Method;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f2834a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2835b;

    public d(Method method, int i) {
        this.f2834a = i;
        this.f2835b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2834a == dVar.f2834a && this.f2835b.getName().equals(dVar.f2835b.getName());
    }

    public final int hashCode() {
        return this.f2835b.getName().hashCode() + (this.f2834a * 31);
    }
}
