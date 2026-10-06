package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gn {
    public dn a;

    public gn(dn dnVar) {
        this.a = dnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn) && k71.k.b(this.a, ((gn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(mentionableUsers=" + this.a + ")";
    }
}
