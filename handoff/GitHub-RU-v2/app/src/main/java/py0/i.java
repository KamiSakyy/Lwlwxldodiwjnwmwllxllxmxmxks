package py0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final String a;
    public final ry0.b b;

    public i(String str, ry0.b bVar) {
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnRepository(__typename=" + this.a + ", repositoryCreateIssueInformationFragment=" + this.b + ")";
    }
}
