package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 implements l1 {
    public final String a;
    public final String b;

    public h1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b);
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
        return x.i.g("MarkdownFileContent(content=", this.a, ", repoId=", this.b, ")");
    }
    public static final Object i = null;
}
