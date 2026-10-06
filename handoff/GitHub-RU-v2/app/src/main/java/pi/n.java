package pi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements p {
    public final String a;

    public n(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && k71.k.b(this.a, ((n) obj).a);
    }

    @Override // pi.p
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Text(text=", this.a, ")");
    }
}
