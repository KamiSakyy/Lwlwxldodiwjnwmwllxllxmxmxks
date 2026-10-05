package w61;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final d r;
    public static final /* synthetic */ d[] s;

    static {
        d dVar = new d("WARNING", 0);
        r = dVar;
        d[] dVarArr = {dVar, new d("ERROR", 1), new d("HIDDEN", 2)};
        s = dVarArr;
        l0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) s.clone();
    }
}
