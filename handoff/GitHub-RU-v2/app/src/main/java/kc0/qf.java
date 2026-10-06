package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qf {
    public String a;
    public bn0.e b;

    public qf(String str, bn0.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return k71.k.b(this.a, qfVar.a) && k71.k.b(this.b, qfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
