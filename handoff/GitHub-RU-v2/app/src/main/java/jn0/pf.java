package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pf {
    public String a;

    public pf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf) && k71.k.b(this.a, ((pf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("File(name=", this.a, ")");
    }
}
