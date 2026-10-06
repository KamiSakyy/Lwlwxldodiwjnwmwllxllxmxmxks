package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ul {
    public ll a;

    public ul(ll llVar) {
        this.a = llVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul) && k71.k.b(this.a, ((ul) obj).a);
    }

    public final int hashCode() {
        ll llVar = this.a;
        if (llVar == null) {
            return 0;
        }
        return llVar.hashCode();
    }

    public final String toString() {
        return "OnPullRequest(mentionableItems=" + this.a + ")";
    }
}
