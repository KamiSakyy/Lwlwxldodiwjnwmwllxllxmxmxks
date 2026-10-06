package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final u f207a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f208b;

    public p2(u uVar, a0 a0Var) {
        this.f207a = uVar;
        this.f208b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.f207a, p2Var.f207a) && k71.k.b(this.f208b, p2Var.f208b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f208b.hashCode() + (this.f207a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f207a + ", easing=" + this.f208b + ", arcMode=ArcMode(value=0))";
    }
}
