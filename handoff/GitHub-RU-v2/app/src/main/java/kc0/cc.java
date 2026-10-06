package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cc implements aaShadow.m0 {
    public final dc a;

    public cc(dc dcVar) {
        this.a = dcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc) && k71.k.b(this.a, ((cc) obj).a);
    }

    public final int hashCode() {
        dc dcVar = this.a;
        if (dcVar == null) {
            return 0;
        }
        return dcVar.hashCode();
    }

    public final String toString() {
        return "Data(enablePullRequestAutoMerge=" + this.a + ")";
    }
}
