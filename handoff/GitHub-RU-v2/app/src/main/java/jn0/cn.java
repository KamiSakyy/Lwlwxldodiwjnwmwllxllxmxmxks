package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cn {
    public String a;

    public cn(String str) {
        k71.k.g(str, "id");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn) && k71.k.b(this.a, ((cn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
