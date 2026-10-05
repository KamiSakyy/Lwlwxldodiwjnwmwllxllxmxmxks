package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c4 {
    public final Context a;
    public final j41.d b;

    public c4(Context context, j41.d dVar) {
        this.a = context;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        j41.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c4) {
            c4 c4Var = (c4) obj;
            j41.d dVar2 = c4Var.b;
            if (this.a.equals(c4Var.a) && ((dVar = this.b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        j41.d dVar = this.b;
        return (hashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + valueOf.length() + 1);
        f1.e.x(sb, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a<T1,T2,T3,T4> {
        public a() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g<T1,T2,T3,T4> {
        public g() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f<T1,T2,T3,T4> {
        public f() {
        }
    }
}
