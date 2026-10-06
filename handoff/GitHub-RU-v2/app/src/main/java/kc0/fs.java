package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fs implements aaShadow.m0 {
    public final hs a;

    public fs(hs hsVar) {
        this.a = hsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs) && k71.k.b(this.a, ((fs) obj).a);
    }

    public final int hashCode() {
        hs hsVar = this.a;
        if (hsVar == null) {
            return 0;
        }
        return hsVar.hashCode();
    }

    public final String toString() {
        return "Data(reopenIssue=" + this.a + ")";
    }
}
