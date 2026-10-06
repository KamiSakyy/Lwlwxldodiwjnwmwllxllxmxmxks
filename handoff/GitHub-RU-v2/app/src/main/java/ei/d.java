package ei;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    public static final /* synthetic */ d[] x;
    public boolean r;

    static {
        d dVar = new d(0, "DISABLED", false);
        s = dVar;
        d dVar2 = new d(1, "DEV", false);
        t = dVar2;
        d dVar3 = new d(2, "STAFF", false);
        u = dVar3;
        d dVar4 = new d(3, "BETA", false);
        v = dVar4;
        d dVar5 = new d(4, "PRODUCTION", true);
        w = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        x = dVarArr;
        l0.t(dVarArr);
    }

    public d(int i, String str, boolean z) {
        this.r = z;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) x.clone();
    }
}
