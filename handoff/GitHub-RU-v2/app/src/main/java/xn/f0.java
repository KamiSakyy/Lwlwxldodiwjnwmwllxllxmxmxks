package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public String a;

    public f0(String str) {
        k71.k.g(str, "description");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && k71.k.b(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ChatMessageInterruptedStreamErrorDescription(description=", this.a, ")");
    }
}
