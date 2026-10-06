package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kk {
    public hk a;

    public kk(hk hkVar) {
        this.a = hkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kk) && k71.k.b(this.a, ((kk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(mentionableUsers=" + this.a + ")";
    }
}
