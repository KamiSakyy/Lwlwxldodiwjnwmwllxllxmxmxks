package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e4 {
    public final String a;
    public final p01.m b;
    public final x01.i c;

    public e4(String str, p01.m mVar, x01.i iVar) {
        this.a = str;
        this.b = mVar;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return k71.k.b(this.a, e4Var.a) && k71.k.b(this.b, e4Var.b) && k71.k.b(this.c, e4Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "RepositoryIssuesPaged(repositoryName=" + this.a + ", repositoryIssues=" + this.b + ", page=" + this.c + ")";
    }

    public e4(Object... a) {
    }
}
