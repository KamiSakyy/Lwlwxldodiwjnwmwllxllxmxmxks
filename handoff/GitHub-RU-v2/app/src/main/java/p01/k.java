package p01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public boolean a;
    public boolean b;

    public k(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b == kVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RepositoryCreateIssueInformation(isRepositoryInOrganization=" + this.a + ", areIssueTypesAvailable=" + this.b + ")";
    }
}
