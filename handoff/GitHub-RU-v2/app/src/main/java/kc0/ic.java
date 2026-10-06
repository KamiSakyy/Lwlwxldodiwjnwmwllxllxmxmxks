package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ic {
    public final String a;
    public final gn0.qw b;

    public ic(String str, gn0.qw qwVar) {
        this.a = str;
        this.b = qwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return k71.k.b(this.a, icVar.a) && this.b == icVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnterpriseSupportContact(link=" + this.a + ", linkType=" + this.b + ")";
    }
}
