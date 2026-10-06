package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i1 implements l1 {
    public String a;

    public i1(String str) {
        k71.k.g(str, "repoId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && k71.k.b(this.a, ((i1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // yz0.l1
    public final String j() {
        return null;
    }

    public final String toString() {
        return f1.e.z("NewFile(content=null, repoId=", this.a, ")");
    }
}
