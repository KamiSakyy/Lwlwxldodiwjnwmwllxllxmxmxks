package bm;

import a0.s0;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final String a;
    public final String b;
    public final String c;
    public final Object d;

    public t(String str, String str2, String str3, Parcelable parcelable) {
        k71.k.g(str, "text");
        k71.k.g(str2, "name");
        k71.k.g(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c) && k71.k.b(this.d, tVar.d);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        Object obj = this.d;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("Token(text=", this.a, ", name=", this.b, ", value=");
        o.append(this.c);
        o.append(", richContext=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public static final Object g = null;
}
