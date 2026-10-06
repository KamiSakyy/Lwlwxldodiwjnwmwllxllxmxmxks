package yi;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements k, l {
    public int a;
    public int b;

    public c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return f4.h(this.a, this.b, "AliveProjectColumnValueUpdate(columnId=", ", itemId=", ")");
    }
}
