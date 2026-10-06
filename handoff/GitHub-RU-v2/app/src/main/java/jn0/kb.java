package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kb {
    public String a;

    public kb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb) && k71.k.b(this.a, ((kb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Owner(id=", this.a, ")");
    }
}
