package l01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public ArrayList a;
    public x01.i b;

    public x0(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.a.equals(x0Var.a) && this.b.equals(x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleProjectsPaged(projects=" + this.a + ", page=" + this.b + ")";
    }
}
