package q81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class v {
    public static final /* synthetic */ v[] A;
    public static final b s;
    public static final v t;
    public static final v u;
    public static final v v;
    public static final v w;
    public static final v x;
    public static final v y;
    public static final v z;
    public final String r;

    static {
        v vVar = new v("HTTP_1_0", 0, "http/1.0");
        t = vVar;
        v vVar2 = new v("HTTP_1_1", 1, "http/1.1");
        u = vVar2;
        v vVar3 = new v("SPDY_3", 2, "spdy/3.1");
        v = vVar3;
        v vVar4 = new v("HTTP_2", 3, "h2");
        w = vVar4;
        v vVar5 = new v("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        x = vVar5;
        v vVar6 = new v("QUIC", 5, "quic");
        y = vVar6;
        v vVar7 = new v("HTTP_3", 6, "h3");
        z = vVar7;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7};
        A = vVarArr;
        l0.t(vVarArr);
        s = new b();
    }

    public v(String str, int i, String str2) {
        this.r = str2;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) A.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.r;
    }
}
