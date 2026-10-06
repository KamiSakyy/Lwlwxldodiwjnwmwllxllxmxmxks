package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final j71.c f1598a;

    public e0(j71.c cVar) {
        this.f1598a = cVar;
    }

    @Override // androidx.compose.runtime.m3
    public final Object a(v1 v1Var) {
        return this.f1598a.k(v1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && k71.k.b(this.f1598a, ((e0) obj).f1598a);
    }

    public final int hashCode() {
        return this.f1598a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f1598a + ')';
    }
}
