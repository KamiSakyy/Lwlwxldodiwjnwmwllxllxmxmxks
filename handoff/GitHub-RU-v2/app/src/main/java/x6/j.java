package x6;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f33839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33840b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33841c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33842d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f33843e;

    public j(l0 l0Var, boolean z10, Object obj, boolean z11, boolean z12) {
        if (!l0Var.f33869a && z10) {
            throw new IllegalArgumentException((l0Var.b() + " does not allow nullable values").toString());
        }
        if (!z10 && z11 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + l0Var.b() + " has null value but is not nullable.").toString());
        }
        this.f33839a = l0Var;
        this.f33840b = z10;
        this.f33843e = obj;
        this.f33841c = z11 || z12;
        this.f33842d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            Object obj2 = jVar.f33843e;
            if (this.f33840b != jVar.f33840b || this.f33841c != jVar.f33841c || !k71.k.b(this.f33839a, jVar.f33839a)) {
                return false;
            }
            Object obj3 = this.f33843e;
            if (obj3 != null) {
                return k71.k.b(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f33839a.hashCode() * 31) + (this.f33840b ? 1 : 0)) * 31) + (this.f33841c ? 1 : 0)) * 31;
        Object obj = this.f33843e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k71.x.a(j.class).c());
        sb2.append(" Type: " + this.f33839a);
        sb2.append(" Nullable: " + this.f33840b);
        if (this.f33841c) {
            sb2.append(" DefaultValue: " + this.f33843e);
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }
}
