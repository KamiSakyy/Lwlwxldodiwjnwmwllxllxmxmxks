package pb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public rb0.a b;

    public d(String str, rb0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnRepository(__typename=" + this.a + ", repositoryCreateIssueInformationFragment=" + this.b + ")";
    }
}
