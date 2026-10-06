package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pj {
    public boolean a;
    public String b;

    public pj(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj)) {
            return false;
        }
        pj pjVar = (pj) obj;
        return this.a == pjVar.a && k71.k.b(this.b, pjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("Copilot(success=", ", message=", this.b, ")", this.a);
    }
}
