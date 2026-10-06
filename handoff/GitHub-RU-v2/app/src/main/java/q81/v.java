package q81;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public final class vShadow {
    public static final /* synthetic */ vShadow[] A;
    public static final b s;
    public static final vShadow t;
    public static final vShadow u;
    public static final vShadow v;
    public static final vShadow w;
    public static final vShadow x;
    public static final vShadow y;
    public static final vShadow z;
    public String r;

    static {
        vShadow vVar = new vShadow("HTTP_1_0", 0, "http/1.0");
        t = vVar;
        vShadow vVar2 = new vShadow("HTTP_1_1", 1, "http/1.1");
        u = vVar2;
        vShadow vVar3 = new vShadow("SPDY_3", 2, "spdy/3.1");
        v = vVar3;
        vShadow vVar4 = new vShadow("HTTP_2", 3, "h2");
        w = vVar4;
        vShadow vVar5 = new vShadow("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        x = vVar5;
        vShadow vVar6 = new vShadow("QUIC", 5, "quic");
        y = vVar6;
        vShadow vVar7 = new vShadow("HTTP_3", 6, "h3");
        z = vVar7;
        vShadow[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7};
        A = vVarArr;
        l0.t(vVarArr);
        s = new b();
    }

    public Object v(String str, int i, String str2) {
        this.r = str2;
    }

    public static v valueOf(String str) {
        return (vShadow) Enum.valueOf(vShadow.class, str);
    }

    public static vShadow[] values() {
        return (vShadow[]) A.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.r;
    }
}
