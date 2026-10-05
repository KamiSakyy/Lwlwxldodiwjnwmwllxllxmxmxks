package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lt {
    public final String a;
    public final String b;

    public lt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return k71.k.b(this.a, ltVar.a) && k71.k.b(this.b, ltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Deployment(id=", this.a, ", __typename=", this.b, ")");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}
