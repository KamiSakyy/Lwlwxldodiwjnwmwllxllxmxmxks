package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ss {
    public vs a;

    public ss(vs vsVar) {
        this.a = vsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss) && k71.k.b(this.a, ((ss) obj).a);
    }

    public final int hashCode() {
        vs vsVar = this.a;
        if (vsVar == null) {
            return 0;
        }
        return vsVar.hashCode();
    }

    public final String toString() {
        return "Tagger(user=" + this.a + ")";
    }
}
