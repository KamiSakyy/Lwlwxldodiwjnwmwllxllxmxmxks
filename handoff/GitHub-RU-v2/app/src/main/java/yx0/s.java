package yx0;

import iy0.e1;

/* loaded from: /home/user/work/p/classes4.dex */
public class s {
    public String a;
    public e1 b;

    public s(String str, e1 e1Var) {
        this.a = str;
        this.b = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnProjectV2Item(__typename=" + this.a + ", projectV2ViewItemFragment=" + this.b + ")";
    }
}
