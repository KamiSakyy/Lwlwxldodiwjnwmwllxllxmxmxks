package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements l1 {
    public String a;
    public String b;

    public j1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return k71.k.b(this.a, j1Var.a) && k71.k.b(this.b, j1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // yz0.l1
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return x.i.g("TextFileContent(content=", this.a, ", repoId=", this.b, ")");
    }
}
