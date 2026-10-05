package ci0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final ji0.f b;

    public e(String str, ji0.f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationItemShowcase(__typename=" + this.a + ", itemShowcaseFragment=" + this.b + ")";
    }
}
