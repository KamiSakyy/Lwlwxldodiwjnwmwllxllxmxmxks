package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bt {
    public String a;

    public bt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt) && k71.k.b(this.a, ((bt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Submodule(gitUrl=", this.a, ")");
    }
}
