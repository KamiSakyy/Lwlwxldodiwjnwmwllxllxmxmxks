package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mv {
    public final String a;

    public mv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv) && k71.k.b(this.a, ((mv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Submodule(gitUrl=", this.a, ")");
    }
}
