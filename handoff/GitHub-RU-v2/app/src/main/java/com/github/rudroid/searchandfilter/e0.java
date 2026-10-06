package com.github.rudroid.searchandfilter;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public static final a Companion = new a();
    public static final e0 c = new e0("", b.u);
    public String a;
    public b b;

    public static final class a {
        public static e0 a(String str) {
            return str != null ? new e0(str, b.s) : new e0("", b.s);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b r;
        public static final b s;
        public static final b t;
        public static final b u;
        public static final /* synthetic */ b[] v;

        static {
            b bVar = new b("FilterChange", 0);
            r = bVar;
            b bVar2 = new b("QueryChange", 1);
            s = bVar2;
            b bVar3 = new b("FilterAndQueryChange", 2);
            t = bVar3;
            b bVar4 = new b("Initial", 3);
            u = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            v = bVarArr;
            v8.l0.t(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    public e0(String str, b bVar) {
        k71.k.g(str, "query");
        this.a = str;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && this.b == e0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FullQuery(query=" + this.a + ", sourceEvent=" + this.b + ")";
    }
}
