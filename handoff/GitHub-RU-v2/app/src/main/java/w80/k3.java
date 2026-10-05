package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 implements aa.h0 {
    public final String a;
    public final String b;

    public k3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return k71.k.b(this.a, k3Var.a) && k71.k.b(this.b, k3Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return x.i.g("RepositoryReadmeFragment(contentHTML=", this.a, ", path=", this.b, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class u<T1,T2,T3,T4> {
        public u() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x<T1,T2,T3,T4> {
        public x() {
        }
    }
}
