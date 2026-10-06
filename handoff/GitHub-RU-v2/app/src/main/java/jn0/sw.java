package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sw {
    public uw a;

    public sw(uw uwVar) {
        this.a = uwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw) && k71.k.b(this.a, ((sw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(watchers=" + this.a + ")";
    }
}
