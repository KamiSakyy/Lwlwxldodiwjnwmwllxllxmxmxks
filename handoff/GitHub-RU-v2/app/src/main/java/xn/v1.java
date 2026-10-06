package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v1 extends w1Shadow {
    public final String a;

    public v1(String str) {
        k71.k.g(str, "value");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1) && k71.k.b(this.a, ((v1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("StringValue(value=", this.a, ")");
    }
}
