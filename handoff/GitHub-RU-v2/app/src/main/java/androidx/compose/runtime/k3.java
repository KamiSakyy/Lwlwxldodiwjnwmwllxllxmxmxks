package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class k3 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1710a;

    public k3(Object obj) {
        this.f1710a = obj;
    }

    @Override // androidx.compose.runtime.m3
    public final Object a(v1 v1Var) {
        return this.f1710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3) && k71.k.b(this.f1710a, ((k3) obj).f1710a);
    }

    public final int hashCode() {
        Object obj = this.f1710a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f1710a + ')';
    }
}
