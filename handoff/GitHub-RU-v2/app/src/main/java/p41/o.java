package p41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final Class a;
    public final Class b;

    public o(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static o a(Class cls) {
        return new o(n.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.b.equals(oVar.b)) {
            return this.a.equals(oVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == n.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
