package c21;

import java.util.Arrays;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 {
    public final String a;
    public final String b;
    public final boolean c;

    public d0(String str, boolean z) {
        u.d(str);
        this.a = str;
        u.d("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return u.j(this.a, d0Var.a) && u.j(this.b, d0Var.b) && u.j(null, null) && this.c == d0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        u.g(null);
        throw null;
    }
}
