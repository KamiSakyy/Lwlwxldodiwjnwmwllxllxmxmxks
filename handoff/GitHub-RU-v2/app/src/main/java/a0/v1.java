package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class v1 implements u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f278a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f279b;

    public v1(Object obj, Object obj2) {
        this.f278a = obj;
        this.f279b = obj2;
    }

    @Override // a0.u1
    public final Object a() {
        return this.f278a;
    }

    @Override // a0.u1
    public final Object c() {
        return this.f279b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return k71.k.b(this.f278a, u1Var.a()) && k71.k.b(this.f279b, u1Var.c());
    }

    public final int hashCode() {
        Object obj = this.f278a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f279b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
