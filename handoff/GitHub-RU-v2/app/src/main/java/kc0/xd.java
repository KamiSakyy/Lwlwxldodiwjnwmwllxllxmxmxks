package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xd {
    public String a;

    public xd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd) && k71.k.b(this.a, ((xd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("File(name=", this.a, ")");
    }
}
