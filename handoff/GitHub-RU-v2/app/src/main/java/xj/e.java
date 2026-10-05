package xj;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import t71.q;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final d Companion = new d();
    public static final String e = q.r("\n            ALTER TABLE filter_bars ADD COLUMN timestamp INTEGER NOT NULL DEFAULT '" + System.currentTimeMillis() + "'\n        ");
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public e(long j, String str, String str2, String str3) {
        k.g(str, "id");
        k.g(str3, "metadata");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && this.d == eVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.d) + h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("FilterBarEntry(id=", this.a, ", filter=", this.b, ", metadata=");
        o.append(this.c);
        o.append(", timestamp=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }

    public /* synthetic */ e(int i, String str, String str2, String str3) {
        this(System.currentTimeMillis(), str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }
}
